package com.lamd.api.result.modules.publicHome;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "PublicHomeResult", description = "警告数据")
public class EventDataResult implements Serializable {
    @ApiModelProperty(value = "警告总数")
    private int total;
    @ApiModelProperty(value = "已经处理总数")
    private int alr;
    @ApiModelProperty(value = "未处理警告总数")
    private int noy;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getAlr() {
        return alr;
    }

    public void setAlr(int alr) {
        this.alr = alr;
    }

    public int getNoy() {
        return noy;
    }

    public void setNoy(int noy) {
        this.noy = noy;
    }
}
