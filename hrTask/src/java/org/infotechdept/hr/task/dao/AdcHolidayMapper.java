package org.infotechdept.hr.task.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.infotechdept.hr.task.model.AdcHoliday;
import org.infotechdept.hr.task.model.AdcHolidayExample;

public interface AdcHolidayMapper {
    int countByExample(AdcHolidayExample example);

    int deleteByExample(AdcHolidayExample example);

    int deleteByPrimaryKey(String hCode);

    int insert(AdcHoliday record);

    int insertSelective(AdcHoliday record);

    List<AdcHoliday> selectByExample(AdcHolidayExample example);

    AdcHoliday selectByPrimaryKey(String hCode);

    int updateByExampleSelective(@Param("record") AdcHoliday record, @Param("example") AdcHolidayExample example);

    int updateByExample(@Param("record") AdcHoliday record, @Param("example") AdcHolidayExample example);

    int updateByPrimaryKeySelective(AdcHoliday record);

    int updateByPrimaryKey(AdcHoliday record);
}