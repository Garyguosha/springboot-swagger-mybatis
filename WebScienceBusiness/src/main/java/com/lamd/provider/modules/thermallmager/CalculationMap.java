package com.lamd.provider.modules.thermallmager;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

@Configuration
@Scope("prototype")
public class CalculationMap {
    private int min; //最大值
    private int max; //最小值
    private int delta; //控制分母值 max-min
    private double k; // 斜率
    private double b; //位移

    public int[] calculation(List<String> list) {

        int[] rgbvalue = new int[list.size()];
        this.min = Integer.parseInt(Collections.min(list));
        this.max = Integer.parseInt(Collections.max(list));
        int interval = this.max -this.min;
        int pos = 0;
        int starIndex = 0;
        //控制分母大小，在最大值和最小值之间取差值，分母就是差值的整数
        this.delta = (int) Math.floor((interval)/1000+1)*1000;

        //y = k*x + b  求 k 和 b;
        this.k = new BigDecimal(255/((double)this.delta)).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        this.b = - (this.k * this.min);
        //将值映射到255和0之间，分组求出三项值 a b c;
        for (int i = 0;i < list.size();i++) {
            rgbvalue[i] = (int) (Integer.parseInt(list.get(i))*this.k + b);
            if (rgbvalue[i]<0) rgbvalue[0] = 0;
            if (rgbvalue[i]>255) rgbvalue[0] = 255;
        }
        return rgbvalue;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

}
