package com.lamd.api.result.modules.auth;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "UserResult", description = "用户id")
public class UserResult implements Serializable {

    @ApiModelProperty(value = "用户唯一id")
    private int userid;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
