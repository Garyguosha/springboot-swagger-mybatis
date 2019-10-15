package com.lamd.api.result.modules.thermallmager;

import com.lamd.dao.entity.thermallmager.BseModel;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

public class BseResult<T> implements Serializable {

    @ApiModelProperty(value = "终端唯一Id")
    private String teId;

    @ApiModelProperty(value = "终端下唯一的传感器Id")
    private String seId;

    @ApiModelProperty(value = "图片路径")
    private String url;

//    @ApiModelProperty(value = "温度1")
//    private int a;
//
//    @ApiModelProperty(value = "温度2")
//    private int b;
//
//    @ApiModelProperty(value = "温度3")
//    private int c;

//    @ApiModelProperty(value = "历史数据")
//    private  List<BseData> list;

    public String getTeId() {
        return teId;
    }

    public void setTeId(String teId) {
        this.teId = teId;
    }

    public String getSeId() {
        return seId;
    }

    public void setSeId(String seId) {
        this.seId = seId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

//    public int getA() {
//        return a;
//    }
//
//    public void setA(int a) {
//        this.a = a;
//    }
//
//    public int getB() {
//        return b;
//    }
//
//    public void setB(int b) {
//        this.b = b;
//    }
//
//    public int getC() {
//        return c;
//    }
//
//    public void setC(int c) {
//        this.c = c;
//    }

//    public List<BseData> getList() {
//        return list;
//    }
//
//    public void setList(List<BseData> list) {
//        this.list = list;
//    }
}
