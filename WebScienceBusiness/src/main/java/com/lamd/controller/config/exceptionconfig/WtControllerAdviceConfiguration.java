package com.lamd.controller.config.exceptionconfig;

import com.lamd.api.exception.AppRuntimeException;
import com.lamd.controller.config.result.ApiResult;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2017/3/14 0014.
 * 控制器扩展处理
 */
@RestControllerAdvice("com.lamd.controller")
public class WtControllerAdviceConfiguration {

    @ExceptionHandler(value = Exception.class)
    public ApiResult handleException(HttpServletRequest request, HttpServletResponse response, Exception exception) {
        if (exception instanceof AppRuntimeException) {
            //  业务异常
            return ApiResult.fail(exception.getLocalizedMessage());
        } else if (exception instanceof MethodArgumentNotValidException) {
            //  Hibernate Validator 异常(入参校验异常)
            List<ObjectError> objectErrorList = ((MethodArgumentNotValidException) exception).getBindingResult().getAllErrors();
            if (CollectionUtils.isEmpty(objectErrorList)) {
                return ApiResult.fail(objectErrorList.get(0).getDefaultMessage());
            }
        } else if (exception instanceof RuntimeException) {
            //  系统异常
//            return ApiResult.fail("发生错误，请联系管理员或稍候再试");
        }
        exception.printStackTrace();
        return ApiResult.fail("发生错误，请联系管理员或稍候再试");
    }



}
