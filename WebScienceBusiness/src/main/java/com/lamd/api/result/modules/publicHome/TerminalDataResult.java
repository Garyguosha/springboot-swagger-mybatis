package com.lamd.api.result.modules.publicHome;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "TerminalResult", description = "终端数据")
public class TerminalDataResult implements Serializable {
    @ApiModelProperty(value = "终端总数")
    private int total;
    @ApiModelProperty(value = "已连接总数")
    private int con;
    @ApiModelProperty(value = "断开总数")
    private int ncon;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public int getNcon() {
        return ncon;
    }

    public void setNcon(int ncon) {
        this.ncon = ncon;
    }
}
