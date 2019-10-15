package com.lamd.api.result.modules.publicHome;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

@ApiModel(value = "TerminalStatisticsResult", description = "终端每天在线个数")
public class TerminalStatisticsResult implements Serializable {

    @ApiModelProperty(value = "报警总个数")
    private int e_count;

    @JsonFormat(pattern = "MM-dd", timezone = "GMT+8")
    @ApiModelProperty(value = "每天的时间")
    private Date everyday_time;

    public int getE_count() {
        return e_count;
    }

    public void setE_count(int e_count) {
        this.e_count = e_count;
    }

    public Date getEveryday_time() {
        return everyday_time;
    }

    public void setEveryday_time(Date everyday_time) {
        this.everyday_time = everyday_time;
    }
}
