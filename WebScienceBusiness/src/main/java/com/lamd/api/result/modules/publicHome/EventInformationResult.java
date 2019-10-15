package com.lamd.api.result.modules.publicHome;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

@ApiModel(value = "EventInformationResult", description = "报警信息")
public class EventInformationResult implements Serializable {
    @ApiModelProperty(value = "终端id")
    private String event_teId;
    @ApiModelProperty(value = "名称")
    private String terminal_name;
    @ApiModelProperty(value = "报警终端id")
    private int event_id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "报警时间")
    private Date event_time;
    @ApiModelProperty(value = "报警传感器码")
    private String event_seId;
    @ApiModelProperty(value = "报警处理状态（0/已处理 1/未处理）")
    private int event_state;
    @ApiModelProperty(value = "报警类型")
    private String event_type;
    @ApiModelProperty(value = "报警传感器类型")
    private String sensor_type;
    @ApiModelProperty(value = "报警传感器名称")
    private String sensor_name;
    @ApiModelProperty(value = "县级以下")
    private String area_name;
    @ApiModelProperty(value = "省")
    private String province_name;
    @ApiModelProperty(value = "市")
    private String city_name;
    @ApiModelProperty(value = "间隔名称")
    private String interval_name;

    public String getEvent_teId() {
        return event_teId;
    }

    public void setEvent_teId(String event_teId) {
        this.event_teId = event_teId;
    }

    public String getTerminal_name() {
        return terminal_name;
    }

    public void setTerminal_name(String terminal_name) {
        this.terminal_name = terminal_name;
    }

    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }

    public Date getEvent_time() {
        return event_time;
    }

    public void setEvent_time(Date event_time) {
        this.event_time = event_time;
    }

    public String getEvent_seId() {
        return event_seId;
    }

    public void setEvent_seId(String event_seId) {
        this.event_seId = event_seId;
    }

    public int getEvent_state() {
        return event_state;
    }

    public void setEvent_state(int event_state) {
        this.event_state = event_state;
    }

    public String getEvent_type() {
        return event_type;
    }

    public void setEvent_type(String event_type) {
        this.event_type = event_type;
    }

    public String getSensor_type() {
        return sensor_type;
    }

    public void setSensor_type(String sensor_type) {
        this.sensor_type = sensor_type;
    }

    public String getSensor_name() {
        return sensor_name;
    }

    public void setSensor_name(String sensor_name) {
        this.sensor_name = sensor_name;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }

    public String getProvince_name() {
        return province_name;
    }

    public void setProvince_name(String province_name) {
        this.province_name = province_name;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getInterval_name() {
        return interval_name;
    }

    public void setInterval_name(String interval_name) {
        this.interval_name = interval_name;
    }
}
