package com.lamd.api.io.modules.webHome;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel(value = "红外测温阵列", description = "请求参数类")
public class UserIdIO implements Serializable {
    @NotBlank(message = "用户id不能为空")
    @ApiModelProperty(value = "用户唯一Id",example = "1")
    private int userid;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
