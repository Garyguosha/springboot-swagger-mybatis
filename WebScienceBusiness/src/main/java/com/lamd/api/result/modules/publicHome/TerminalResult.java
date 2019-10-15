package com.lamd.api.result.modules.publicHome;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "TerminalResult", description = "终端所有信息")
public class TerminalResult {
  @ApiModelProperty(value = "终端id")
  private String terminal_teId;
  @ApiModelProperty(value = "名称")
  private String terminal_name;
  @ApiModelProperty(value = "连接状态")
  private long terminal_state;
  @ApiModelProperty(value = "纬度")
  private double terminal_latitude;
  @ApiModelProperty(value = "经度")
  private double terminal_longitude;
  @ApiModelProperty(value = "该终端警告未处理个数")
  private int e_count;
  @ApiModelProperty(value = "该终端传感器个数")
  private int s_count;
  @ApiModelProperty(value = "该终端间隔个数")
  private int i_count;

  public String getTerminal_teId() {
    return terminal_teId;
  }

  public void setTerminal_teId(String terminal_teId) {
    this.terminal_teId = terminal_teId;
  }

  public String getTerminal_name() {
    return terminal_name;
  }

  public void setTerminal_name(String terminal_name) {
    this.terminal_name = terminal_name;
  }

  public long getTerminal_state() {
    return terminal_state;
  }

  public void setTerminal_state(long terminal_state) {
    this.terminal_state = terminal_state;
  }

  public double getTerminal_latitude() {
    return terminal_latitude;
  }

  public void setTerminal_latitude(double terminal_latitude) {
    this.terminal_latitude = terminal_latitude;
  }

  public double getTerminal_longitude() {
    return terminal_longitude;
  }

  public void setTerminal_longitude(double terminal_longitude) {
    this.terminal_longitude = terminal_longitude;
  }

  public int getE_count() {
    return e_count;
  }

  public void setE_count(int e_count) {
    this.e_count = e_count;
  }

  public int getS_count() {
    return s_count;
  }

  public void setS_count(int s_count) {
    this.s_count = s_count;
  }

  public int getI_count() {
    return i_count;
  }

  public void setI_count(int i_count) {
    this.i_count = i_count;
  }
}
