package org.infotechdept.hr.task.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.infotechdept.hr.task.model.AdcShiftRecordLogs;
import org.infotechdept.hr.task.model.AdcShiftRecordLogsExample;

public interface AdcShiftRecordLogsMapper {
    int countByExample(AdcShiftRecordLogsExample example);

    int deleteByExample(AdcShiftRecordLogsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdcShiftRecordLogs record);

    int insertSelective(AdcShiftRecordLogs record);

    List<AdcShiftRecordLogs> selectByExample(AdcShiftRecordLogsExample example);

    AdcShiftRecordLogs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdcShiftRecordLogs record, @Param("example") AdcShiftRecordLogsExample example);

    int updateByExample(@Param("record") AdcShiftRecordLogs record, @Param("example") AdcShiftRecordLogsExample example);

    int updateByPrimaryKeySelective(AdcShiftRecordLogs record);

    int updateByPrimaryKey(AdcShiftRecordLogs record);
}