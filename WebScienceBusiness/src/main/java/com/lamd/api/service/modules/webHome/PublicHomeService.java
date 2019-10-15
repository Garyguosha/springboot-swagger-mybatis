package com.lamd.api.service.modules.webHome;

import com.lamd.api.io.modules.webHome.UserIdIO;
import com.lamd.api.result.modules.publicHome.*;

import java.util.List;

public interface PublicHomeService {
    TerminalDataResult selCountTerminal(UserIdIO userIdIO);
    EventDataResult selNumbleEvent(UserIdIO userIdIO);
    List<TerminalResult> selTerminalAll(UserIdIO userIdIO);
    List<TerminalStatisticsResult> TerminalStatistics(UserIdIO userIdIO);
    List<FailureRateStatisticsResult> failureRateStatistic(UserIdIO userIdIO);

}
