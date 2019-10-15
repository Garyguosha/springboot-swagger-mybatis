package com.lamd.api.service.modules.thermallmager;

import com.lamd.api.io.modules.thermallmager.BseIO;
import com.lamd.api.io.modules.thermallmager.SensorTypeIO;
import com.lamd.api.result.modules.thermallmager.BseResult;

public interface BseService {

     BseResult findBseUrl(BseIO bseIO);

     String findSensorType(SensorTypeIO typeIO);

}
