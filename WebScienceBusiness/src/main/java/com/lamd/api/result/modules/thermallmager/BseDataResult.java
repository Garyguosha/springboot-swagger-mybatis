package com.lamd.api.result.modules.thermallmager;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class BseDataResult implements Serializable {

    @ApiModelProperty(value = "时间")
    private String time;

    @ApiModelProperty(value = "温度1")
    private int a;

    @ApiModelProperty(value = "温度2")
    private int b;

    @ApiModelProperty(value = "温度3")
    private int c;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
