package com.lamd.controller.modules.auth;

import com.lamd.api.io.modules.auth.UserIO;
import com.lamd.api.result.modules.auth.UserResult;
import com.lamd.api.service.modules.auth.UserService;
import com.lamd.controller.config.result.ApiResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@Api(value = "loginController", description = "登陆信息处理")
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private UserService userservice;

    @ApiOperation(value = "查找用户",notes = "根据用户名和密码查询",response = UserResult.class)
    @PostMapping(value = "/finduser")
    @ResponseBody
    public ApiResult selUser(@RequestBody UserIO userIO){
        int result = userservice.selUser(userIO);
        if (result == -1){
            return ApiResult.sessionNull();
        }

        return ApiResult.success(result);
    }
}
