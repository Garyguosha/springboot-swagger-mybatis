package com.lamd.controller.modules.thermallmager;

import com.lamd.api.io.modules.thermallmager.BseIO;
import com.lamd.api.io.modules.thermallmager.SensorTypeIO;
import com.lamd.api.result.modules.thermallmager.BseResult;
import com.lamd.api.service.modules.thermallmager.BseService;
import com.lamd.controller.config.result.ApiResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;


@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@Api(value = "BseController", description = "红外测温阵列")
@RequestMapping(value = "/bse")
public class BseController {

    @Autowired
    private BseService bseService;

    @ApiOperation(value = "获取图片",notes = "根据teId和seId获取红外测温阵列的热成像图片",response = BseResult.class)
    @PostMapping(value = "/image")
    @ResponseBody
    public ApiResult findUrl(@RequestBody BseIO bseIO) {
        Calendar cal = Calendar.getInstance();
        BseResult result = bseService.findBseUrl(bseIO);

        if (result == null) {
            return ApiResult.sessionNull();
        }
        return ApiResult.success(result);
    }

    @ApiOperation(value = "获取传感器类型",notes = "根据teId和seId获取传感器类型",response = String.class)
    @PostMapping(value = "/sensortype")
    @ResponseBody
    public ApiResult findSensorType(@RequestBody SensorTypeIO typeIO) {
        return ApiResult.success(bseService.findSensorType(typeIO));
    }

}
