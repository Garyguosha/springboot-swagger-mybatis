package com.lamd.provider.modules.webHome;

import com.lamd.api.io.modules.auth.UserIO;
import com.lamd.api.io.modules.webHome.EventInformationIO;
import com.lamd.api.io.modules.webHome.UserIdIO;
import com.lamd.api.result.modules.publicHome.EventInformationResult;
import com.lamd.api.service.modules.webHome.EventinformationService;
import com.lamd.dao.mapper.webHome.EventInformationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@EnableCaching
public class EventInformationImpl implements EventinformationService {
    @Autowired
    private EventInformationMapper evInMapper;

    @Override
    public List<EventInformationResult> selEventTerOneHunder(UserIdIO userIdIO) {
        return evInMapper.selEventTerOneHunder(userIdIO);
    }
}
