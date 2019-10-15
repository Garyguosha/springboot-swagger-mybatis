package com.lamd.api.service.modules.webHome;

import com.lamd.api.io.modules.webHome.EventInformationIO;
import com.lamd.api.io.modules.webHome.UserIdIO;
import com.lamd.api.result.modules.publicHome.EventInformationResult;

import java.util.List;

public interface EventinformationService  {
    List<EventInformationResult> selEventTerOneHunder(UserIdIO userIdIO);
}
