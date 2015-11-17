package org.infotechdept.hr.task.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.infotechdept.hr.task.model.AdcShiftApply;
import org.infotechdept.hr.task.model.AdcShiftApplyExample;

public interface AdcShiftApplyMapper {
    int countByExample(AdcShiftApplyExample example);

    int deleteByExample(AdcShiftApplyExample example);

    int deleteByPrimaryKey(Long applyId);

    int insert(AdcShiftApply record);

    int insertSelective(AdcShiftApply record);

    List<AdcShiftApply> selectByExample(AdcShiftApplyExample example);

    AdcShiftApply selectByPrimaryKey(Long applyId);

    int updateByExampleSelective(@Param("record") AdcShiftApply record, @Param("example") AdcShiftApplyExample example);

    int updateByExample(@Param("record") AdcShiftApply record, @Param("example") AdcShiftApplyExample example);

    int updateByPrimaryKeySelective(AdcShiftApply record);

    int updateByPrimaryKey(AdcShiftApply record);
}