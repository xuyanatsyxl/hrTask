package org.infotechdept.hr.task.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.infotechdept.hr.task.model.AdcShiftGroupEmpl;
import org.infotechdept.hr.task.model.AdcShiftGroupEmplExample;

public interface AdcShiftGroupEmplMapper {
    int countByExample(AdcShiftGroupEmplExample example);

    int deleteByExample(AdcShiftGroupEmplExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(AdcShiftGroupEmpl record);

    int insertSelective(AdcShiftGroupEmpl record);

    List<AdcShiftGroupEmpl> selectByExample(AdcShiftGroupEmplExample example);

    AdcShiftGroupEmpl selectByPrimaryKey(Integer oid);

    int updateByExampleSelective(@Param("record") AdcShiftGroupEmpl record, @Param("example") AdcShiftGroupEmplExample example);

    int updateByExample(@Param("record") AdcShiftGroupEmpl record, @Param("example") AdcShiftGroupEmplExample example);

    int updateByPrimaryKeySelective(AdcShiftGroupEmpl record);

    int updateByPrimaryKey(AdcShiftGroupEmpl record);
}