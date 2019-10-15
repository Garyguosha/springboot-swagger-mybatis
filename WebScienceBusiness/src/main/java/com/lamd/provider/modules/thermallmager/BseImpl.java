package com.lamd.provider.modules.thermallmager;

import com.lamd.api.exception.AppRuntimeException;
import com.lamd.api.io.modules.thermallmager.BseIO;
import com.lamd.api.io.modules.thermallmager.SensorTypeIO;
import com.lamd.api.result.modules.thermallmager.BseResult;
import com.lamd.api.service.modules.thermallmager.BseService;
import com.lamd.dao.entity.thermallmager.BseModel;
import com.lamd.dao.mapper.therllmager.BseMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.List;

@Service
@EnableCaching
public class BseImpl implements BseService {

    private static final Logger logger = LoggerFactory.getLogger(ThermalArray2Color.class);

    @Autowired
    private BseMapper bseMapper;
    @Autowired
    private ThermalArray2Color ther2Co;

    public BseResult findBseUrl(BseIO bseIO) {
        //获取768个温度值
            BseModel list = bseMapper.selBse(bseIO);

            BseResult bseResult = new BseResult();

            if(list == null) {
                return null;
            }

       try {
           List<String> stringList =new ArrayList(Arrays.asList(list.getBsedata_data().split("#")));
        //   int[] rgbvalue = calculationMap.calculation(stringList);
           List<RGBModel> rgbvalue = ther2Co.calculation(stringList);
           int[] rgb =new int[rgbvalue.size()];
           BufferedImage bufImage = new BufferedImage(32, 24,BufferedImage.TYPE_INT_RGB);

           int bn=0;

           for (int h=0;h < 24; h++) {
               for (int w = 0; w < 32; w++) {
               //    Color color = new Color(rgbvalue[bn],rgbvalue[bn],rgbvalue[bn]);
               //   System.out.println(rgbvalue.get(bn).getR()+" "+rgbvalue.get(bn).getG()+" "+rgbvalue.get(bn).getB() );
                   Color color = new Color(rgbvalue.get(bn).getR(),rgbvalue.get(bn).getG(),rgbvalue.get(bn).getB());
                   rgb[bn] = color.getRGB();
                   bufImage.setRGB(w, h, rgb[bn]);
                   bn++;
               }
           }
           //E:/LANDA-TECHNOLOGY/nginx-1.14.1/html/
           File outputfile = new File(ther2Co.getImagepath()+list.getBsedata_teId()+list.getBsedata_seId()+".png");
           ImageIO.write(bufImage, "png", outputfile);
           bseResult.setSeId(list.getBsedata_seId());
           bseResult.setTeId(list.getBsedata_teId());
           bseResult.setUrl(list.getBsedata_teId()+list.getBsedata_seId());

       } catch (IOException e) {
           logger.info("图片转换错："+getClass().getName());
           throw  new AppRuntimeException("图片转换错误");
       }

        return bseResult;
    }

    public String findSensorType(SensorTypeIO typeIO) {
        return bseMapper.findSensorType(typeIO);
    }

}
