package com.lamd.dao.mapper.therllmager;

import com.lamd.api.io.modules.thermallmager.BseIO;
import com.lamd.api.io.modules.thermallmager.SensorTypeIO;
import com.lamd.api.result.modules.thermallmager.BseResult;
import com.lamd.dao.entity.thermallmager.BseModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface BseMapper {
   //  找一个终端下的红外测温阵列传感器
//    List<BseModel> selBse(BseIO bseIO);
      BseModel selBse(BseIO bseIO);

      //查找传感器类型
      String findSensorType(SensorTypeIO typeIO);

}
