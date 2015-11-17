package org.infotechdept.hr.task.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.infotechdept.hr.task.model.AdcShiftRecord;
import org.infotechdept.hr.task.model.AdcShiftRecordExample;

public interface AdcShiftRecordMapper {
    int countByExample(AdcShiftRecordExample example);

    int deleteByExample(AdcShiftRecordExample example);

    int deleteByPrimaryKey(Long recId);

    int insert(AdcShiftRecord record);

    int insertSelective(AdcShiftRecord record);

    List<AdcShiftRecord> selectByExample(AdcShiftRecordExample example);

    AdcShiftRecord selectByPrimaryKey(Long recId);

    int updateByExampleSelective(@Param("record") AdcShiftRecord record, @Param("example") AdcShiftRecordExample example);

    int updateByExample(@Param("record") AdcShiftRecord record, @Param("example") AdcShiftRecordExample example);

    int updateByPrimaryKeySelective(AdcShiftRecord record);

    int updateByPrimaryKey(AdcShiftRecord record);
}