package org.infotechdept.hr.task.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.infotechdept.hr.task.model.AdcShiftBasic;
import org.infotechdept.hr.task.model.AdcShiftBasicExample;

public interface AdcShiftBasicMapper {
    int countByExample(AdcShiftBasicExample example);

    int deleteByExample(AdcShiftBasicExample example);

    int deleteByPrimaryKey(String shiftId);

    int insert(AdcShiftBasic record);

    int insertSelective(AdcShiftBasic record);

    List<AdcShiftBasic> selectByExample(AdcShiftBasicExample example);

    AdcShiftBasic selectByPrimaryKey(String shiftId);

    int updateByExampleSelective(@Param("record") AdcShiftBasic record, @Param("example") AdcShiftBasicExample example);

    int updateByExample(@Param("record") AdcShiftBasic record, @Param("example") AdcShiftBasicExample example);

    int updateByPrimaryKeySelective(AdcShiftBasic record);

    int updateByPrimaryKey(AdcShiftBasic record);
}