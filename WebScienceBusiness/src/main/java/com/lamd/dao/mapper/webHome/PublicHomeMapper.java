package com.lamd.dao.mapper.webHome;

import com.lamd.api.io.modules.webHome.UserIdIO;
import com.lamd.api.result.modules.publicHome.*;
import com.lamd.dao.entity.webHome.TerminalStatisticsModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PublicHomeMapper {
    //查询终端的在线  未在线  终端总数
    TerminalDataResult selCountTerminal(UserIdIO userIdIO);
    //擦寻警告处理和未处理总数
    EventDataResult selNumbleEvent(UserIdIO userIdIO);
    //查询所有终端信息
    List<TerminalResult> selTerminalAll(UserIdIO userIdIO);
    //查询30天内的每天警告信息
    List<TerminalStatisticsResult> selTerEveryDaySum(UserIdIO userIdIO);
    //故障率统计
    List<FailureRateStatisticsResult> failureRateStatisticsMapper(UserIdIO userIdIO);
}
