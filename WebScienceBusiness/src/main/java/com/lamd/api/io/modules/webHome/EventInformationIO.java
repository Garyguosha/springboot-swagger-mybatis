package com.lamd.api.io.modules.webHome;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

@ApiModel(value = "报警信息", description = "用户唯一 id和该用户的所有终端码")
public class EventInformationIO implements Serializable {

    @NotBlank(message = "用户id不能为空")
    @ApiModelProperty(value = "用户唯一Id",example = "1")
    private int userid;

    @NotBlank(message = "用户下所有的终端不可以为空")
    @ApiModelProperty(value = "终端码列表")
    private List<String> listEvIn;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public List<String> getListEvIn() {
        return listEvIn;
    }

    public void setListEvIn(List<String> listEvIn) {
        this.listEvIn = listEvIn;
    }
}
