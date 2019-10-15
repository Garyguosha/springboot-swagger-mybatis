package com.lamd.provider.modules.thermallmager;

import com.lamd.api.exception.AppRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Component
@Scope("prototype")
@PropertySource("classpath:publicapplication.properties")
public class ThermalArray2Color {
    private static final Logger logger = LoggerFactory.getLogger(ThermalArray2Color.class);
    @Value("${image_path}")
    private String imagepath;
    private int min; //最小值
    private int max; //最大值
    private double k; // 斜率
    private double b; //位移

    public List<RGBModel> calculation(List<String> list) {

        if (list.size() != 768){
            logger.info(getClass().getName()+" 不满足768图像值:"+list.size());
            throw new AppRuntimeException("不满足768图像值:"+list.size());
        }
        List<RGBModel> rgbvalue = new ArrayList<RGBModel>();
        this.min = Integer.parseInt(Collections.min(list));
        this.max = Integer.parseInt(Collections.max(list));
        int interval = this.max -this.min;

        this.k = new BigDecimal(1024 / ((double) interval)).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        this.b = -(this.k * this.min);

        //变量值
        int offavle;

        try {
            //求出RGB值
            for (int i = 0;i < list.size();i++) {
                offavle =(int) Math.floor(Integer.parseInt(list.get(i)) * this.k + this.b);
                RGBModel rgbModel = new RGBModel();
                if (offavle <= 255) {
                    rgbModel.setR((int) Math.floor(Math.pow(offavle,3)/Math.pow(255,2)));
                    rgbModel.setG(0);
                    rgbModel.setB((int) Math.floor(Math.pow(offavle,3)/Math.pow(255,2)));
                }
                else if (offavle <= 511) {
                    rgbModel.setR(255);
                    rgbModel.setG(0);
                    if ((255-Math.floor(Math.pow(offavle-255,2)/255)) < 0) {
                        rgbModel.setB(0);
                    } else {
                        rgbModel.setB((int) (255-Math.floor(Math.pow(offavle-255,2)/255)));
                    }

                } else if (offavle <= 1023) {
                    rgbModel.setR(255);
                    rgbModel.setG((int) Math.floor(((offavle-512)/2)));
                    rgbModel.setB(0);
                } else {
                    rgbModel.setR(255);
                    rgbModel.setG(255);
                    rgbModel.setB(0);
                }
                rgbvalue.add(rgbModel);

            }
        }catch (Exception e){
            logger.info(getClass().getName()+" 图片的RGB值转换错误",e.getMessage());
            throw  new AppRuntimeException("在转换RGB值时出现错误");
        }

        return  rgbvalue;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }
}

