package com.lamd.api.io.modules.thermallmager;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@ApiModel(value = "获取传感器类型", description = "获取传感器类型")
public class BseIO implements Serializable{
    @NotBlank(message = "终端Id不能为空")
    @ApiModelProperty(value = "终端唯一Id",example = "043C04410646164A")
    private String teId;

    @NotBlank(message = "传感器Id不能为空")
    @ApiModelProperty(value = "终端下唯一的传感器Id",example = "0135")
    private String seId;

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
}