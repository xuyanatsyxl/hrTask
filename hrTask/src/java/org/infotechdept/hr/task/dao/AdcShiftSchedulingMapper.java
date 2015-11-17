package org.infotechdept.hr.task.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.infotechdept.hr.task.model.AdcShiftScheduling;
import org.infotechdept.hr.task.model.AdcShiftSchedulingExample;

public interface AdcShiftSchedulingMapper {
    int countByExample(AdcShiftSchedulingExample example);

    int deleteByExample(AdcShiftSchedulingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdcShiftScheduling record);

    int insertSelective(AdcShiftScheduling record);

    List<AdcShiftScheduling> selectByExample(AdcShiftSchedulingExample example);

    AdcShiftScheduling selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdcShiftScheduling record, @Param("example") AdcShiftSchedulingExample example);

    int updateByExample(@Param("record") AdcShiftScheduling record, @Param("example") AdcShiftSchedulingExample example);

    int updateByPrimaryKeySelective(AdcShiftScheduling record);

    int updateByPrimaryKey(AdcShiftScheduling record);
}