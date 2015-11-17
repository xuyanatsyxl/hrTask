package org.infotechdept.hr.task.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.infotechdept.hr.task.model.AdcShiftPatternDetail;
import org.infotechdept.hr.task.model.AdcShiftPatternDetailExample;
import org.infotechdept.hr.task.model.AdcShiftPatternDetailKey;

public interface AdcShiftPatternDetailMapper {
    int countByExample(AdcShiftPatternDetailExample example);

    int deleteByExample(AdcShiftPatternDetailExample example);

    int deleteByPrimaryKey(AdcShiftPatternDetailKey key);

    int insert(AdcShiftPatternDetail record);

    int insertSelective(AdcShiftPatternDetail record);

    List<AdcShiftPatternDetail> selectByExample(AdcShiftPatternDetailExample example);

    AdcShiftPatternDetail selectByPrimaryKey(AdcShiftPatternDetailKey key);

    int updateByExampleSelective(@Param("record") AdcShiftPatternDetail record, @Param("example") AdcShiftPatternDetailExample example);

    int updateByExample(@Param("record") AdcShiftPatternDetail record, @Param("example") AdcShiftPatternDetailExample example);

    int updateByPrimaryKeySelective(AdcShiftPatternDetail record);

    int updateByPrimaryKey(AdcShiftPatternDetail record);
}