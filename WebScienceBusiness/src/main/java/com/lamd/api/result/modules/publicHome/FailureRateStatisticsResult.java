package com.lamd.api.result.modules.publicHome;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "FailureRateStatisticsResult", description = "故障率统计返回数据类型")
public class FailureRateStatisticsResult implements Serializable {
    @ApiModelProperty(value = "传感器类型")
    private String sensor_type;
    @ApiModelProperty(value = "传感器总个数")
    private int ev_countall;
    @ApiModelProperty(value = "该传感器报警总个数")
    private int ev_count;

    public String getSensor_type() {
        return sensor_type;
    }

    public void setSensor_type(String sensor_type) {
        this.sensor_type = sensor_type;
    }


    public int getEv_countall() {
        return ev_countall;
    }

    public void setEv_countall(int ev_countall) {
        this.ev_countall = ev_countall;
    }

    public int getEv_count() {
        return ev_count;
    }

    public void setEv_count(int ev_count) {
        this.ev_count = ev_count;
    }
}
