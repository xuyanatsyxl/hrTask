package org.infotechdept.hr.task.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.infotechdept.hr.task.model.AdcShiftStaffer;
import org.infotechdept.hr.task.model.AdcShiftStafferExample;

public interface AdcShiftStafferMapper {
    int countByExample(AdcShiftStafferExample example);

    int deleteByExample(AdcShiftStafferExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdcShiftStaffer record);

    int insertSelective(AdcShiftStaffer record);

    List<AdcShiftStaffer> selectByExample(AdcShiftStafferExample example);

    AdcShiftStaffer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdcShiftStaffer record, @Param("example") AdcShiftStafferExample example);

    int updateByExample(@Param("record") AdcShiftStaffer record, @Param("example") AdcShiftStafferExample example);

    int updateByPrimaryKeySelective(AdcShiftStaffer record);

    int updateByPrimaryKey(AdcShiftStaffer record);
}