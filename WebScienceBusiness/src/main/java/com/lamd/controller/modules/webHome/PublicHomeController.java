package com.lamd.controller.modules.webHome;

import com.lamd.api.io.modules.webHome.UserIdIO;
import com.lamd.api.service.modules.webHome.PublicHomeService;
import com.lamd.controller.config.result.ApiResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.lamd.api.result.modules.publicHome.*;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@Api(value = "eventController", description = "首页公共信息（终端数量，警告同统计数，坐标）")
@RequestMapping(value = "/publicHome")
public class PublicHomeController {

    @Autowired
    private PublicHomeService publicHomeService;

    @ApiOperation(value = "终端数量",notes = "终端总数，连接和未连接",response = TerminalDataResult.class)
    @PostMapping(value = "/selTerminal")
    @ResponseBody
    public ApiResult selCountTerminal(@RequestBody UserIdIO userIdIO){
        return ApiResult.success(publicHomeService.selCountTerminal(userIdIO));
    }

    @ApiOperation(value = "警告数量",notes = "警告总数，处理和未处理",response = EventDataResult.class)
    @PostMapping(value = "/selNUmbleEvent")
    @ResponseBody
    public ApiResult selNumbleEvent(@RequestBody UserIdIO userIdIO){
        return ApiResult.success(publicHomeService.selNumbleEvent(userIdIO));
    }

    @ApiOperation(value = "地图坐标",notes = "地图坐标",response = TerminalResult.class)
    @PostMapping(value = "/selTerminalAll")
    @ResponseBody
    public ApiResult selTerminalAll(@RequestBody UserIdIO userIdIO){
        return ApiResult.success(publicHomeService.selTerminalAll(userIdIO));
    }

    @ApiOperation(value = "30天每天的报警个数",notes = "30天每天的报警个数",response = TerminalStatisticsResult.class)
    @PostMapping(value = "/terminalStatistics")
    @ResponseBody
    public ApiResult terminalStatistics(@RequestBody UserIdIO userIdIO){
        return ApiResult.success(publicHomeService.TerminalStatistics(userIdIO));
    }

    @ApiOperation(value = "故障率统计",notes = "故障率统计",response = FailureRateStatisticsResult.class)
    @PostMapping(value = "/failureRateStatistics")
    @ResponseBody
    public ApiResult failureRateStatistics(@RequestBody UserIdIO userIdIO){
        return ApiResult.success(publicHomeService.failureRateStatistic(userIdIO));
    }



}
