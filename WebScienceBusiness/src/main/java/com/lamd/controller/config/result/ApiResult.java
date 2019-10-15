package com.lamd.controller.config.result;

import java.io.Serializable;
import com.lamd.commin.Constants.Constant;

public class ApiResult<T> implements Serializable {

    private String code;
    private String msg;
    private T data;

    public ApiResult(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ApiResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ApiResult() {
        this.code = Constant.kCode_Fail;
        this.msg = "";
    }

    //返回成功
    public static ApiResult success() {
        return successMsg("请求成功");
    }
    public static ApiResult successMsg(String msg) {
        ApiResult ApiResult = new ApiResult(Constant.kCode_Success, msg, null);
        return ApiResult;
    }

    public static ApiResult success(Object data) {
        return new ApiResult(Constant.kCode_Success,"",data);
    }

    public static ApiResult success(Object data,String msg) {
        return new ApiResult(Constant.kCode_Success, msg, data);
    }

    //返回失败
    public static ApiResult fail() {
        return fail("请求失败");
    }
    public static ApiResult fail(String msg) {
        return new ApiResult(Constant.kCode_Fail, msg);
    }

    public static ApiResult fail(String code, String msg){
        return new ApiResult(code, msg);
    }

    //登陆超时
    public static ApiResult sessionError() {
        ApiResult ApiResult = new ApiResult(Constant.kCode_SessionError, "登陆超时");
        return ApiResult;
    }

    //请求数据为空
    public static ApiResult sessionNull() {
        ApiResult ApiResult = new ApiResult(Constant.kCode_NULL, "请求数据为空");
        return ApiResult;
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

    public Object getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
