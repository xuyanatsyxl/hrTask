package org.infotechdept.hr.task.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.infotechdept.hr.task.model.AdcShiftPattern;
import org.infotechdept.hr.task.model.AdcShiftPatternExample;

public interface AdcShiftPatternMapper {
    int countByExample(AdcShiftPatternExample example);

    int deleteByExample(AdcShiftPatternExample example);

    int deleteByPrimaryKey(String patternId);

    int insert(AdcShiftPattern record);

    int insertSelective(AdcShiftPattern record);

    List<AdcShiftPattern> selectByExample(AdcShiftPatternExample example);

    AdcShiftPattern selectByPrimaryKey(String patternId);

    int updateByExampleSelective(@Param("record") AdcShiftPattern record, @Param("example") AdcShiftPatternExample example);

    int updateByExample(@Param("record") AdcShiftPattern record, @Param("example") AdcShiftPatternExample example);

    int updateByPrimaryKeySelective(AdcShiftPattern record);

    int updateByPrimaryKey(AdcShiftPattern record);
}