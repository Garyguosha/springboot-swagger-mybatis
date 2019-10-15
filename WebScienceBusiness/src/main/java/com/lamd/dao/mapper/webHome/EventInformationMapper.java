package com.lamd.dao.mapper.webHome;

import com.lamd.api.io.modules.webHome.EventInformationIO;
import com.lamd.api.io.modules.webHome.UserIdIO;
import com.lamd.api.result.modules.publicHome.EventInformationResult;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface EventInformationMapper {
    List<EventInformationResult> selEventTerOneHunder(UserIdIO userIdIO);
}
