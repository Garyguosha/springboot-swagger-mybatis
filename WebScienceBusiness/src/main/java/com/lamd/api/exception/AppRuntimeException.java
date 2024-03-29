package com.lamd.api.exception;
import  com.lamd.commin.Constants.Constant;
/**
 * Created by weitong on 17/3/24.
 * 运行异常
 */
public class AppRuntimeException extends RuntimeException {

    private String code;
    private String msg;

    public AppRuntimeException() {
        this.code = Constant.kCode_Fail;
        this.msg = "";
    }

    public AppRuntimeException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public AppRuntimeException(String message) {
        this.code = Constant.kCode_Fail;
        this.msg = message;
    }

    @Override
    public String getLocalizedMessage() {
        return msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
