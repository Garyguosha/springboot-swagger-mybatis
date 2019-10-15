package com.lamd.api.io.modules.auth;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@ApiModel(value = "登陆密码和用户", description = "请求参数类")
public class UserIO implements Serializable {
    @NotBlank(message = "用户名不能为空")
    @ApiModelProperty(value = "用户名",example = "master")
    private String user;

    @NotBlank(message = "密码不能为空")
    @ApiModelProperty(value = "密码",example = "123456")
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
