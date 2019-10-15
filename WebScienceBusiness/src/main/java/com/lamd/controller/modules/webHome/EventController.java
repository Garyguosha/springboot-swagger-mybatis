package com.lamd.controller.modules.webHome;

import com.lamd.api.io.modules.webHome.EventInformationIO;
import com.lamd.api.io.modules.webHome.UserIdIO;
import com.lamd.api.result.modules.publicHome.EventInformationResult;
import com.lamd.api.service.modules.webHome.EventinformationService;
import com.lamd.controller.config.result.ApiResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@Api(value = "eventController", description = "警告信息处理")
@RequestMapping(value = "/eventhome")
public class EventController {

    @Autowired
    private EventinformationService evInSer;

    @ApiOperation(value = "最近告警信息",notes = "根据终端码获取异常信息（每个终端码最多100条异常显示）",response = EventInformationResult.class)
    @PostMapping(value = "/selTerminal")
    @ResponseBody
    public ApiResult selEventTerOneHunder(@RequestBody UserIdIO userIdIO){
        return ApiResult.success(evInSer.selEventTerOneHunder(userIdIO));
    }
}
