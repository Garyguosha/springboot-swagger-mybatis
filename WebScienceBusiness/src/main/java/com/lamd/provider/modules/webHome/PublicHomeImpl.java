package com.lamd.provider.modules.webHome;

import com.lamd.api.io.modules.webHome.UserIdIO;
import com.lamd.api.result.modules.publicHome.*;
import com.lamd.api.service.modules.webHome.PublicHomeService;
import com.lamd.dao.mapper.webHome.PublicHomeMapper;
import com.lamd.provider.modules.thermallmager.ThermalArray2Color;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
@EnableCaching
public class PublicHomeImpl implements PublicHomeService{
    private static final Logger logger = LoggerFactory.getLogger(ThermalArray2Color.class);

    @Autowired
    private PublicHomeMapper publicHomeMapper;

    public TerminalDataResult selCountTerminal(UserIdIO userIdIO) {
        return publicHomeMapper.selCountTerminal(userIdIO);
    }

    public EventDataResult selNumbleEvent(UserIdIO userIdIO) {
        return publicHomeMapper.selNumbleEvent(userIdIO);
    }

    public List<TerminalResult> selTerminalAll(UserIdIO userIdIO) {
        return publicHomeMapper.selTerminalAll(userIdIO);
    }

    public List<TerminalStatisticsResult> TerminalStatistics(UserIdIO userIdIO) {
        return publicHomeMapper.selTerEveryDaySum(userIdIO);
    }

    public List<FailureRateStatisticsResult> failureRateStatistic(UserIdIO userIdIO) {
        return publicHomeMapper.failureRateStatisticsMapper(userIdIO);
    }

}
