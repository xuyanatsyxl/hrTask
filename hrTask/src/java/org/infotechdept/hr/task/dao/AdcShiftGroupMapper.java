package org.infotechdept.hr.task.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.infotechdept.hr.task.model.AdcShiftGroup;
import org.infotechdept.hr.task.model.AdcShiftGroupExample;

public interface AdcShiftGroupMapper {
    int countByExample(AdcShiftGroupExample example);

    int deleteByExample(AdcShiftGroupExample example);

    int deleteByPrimaryKey(String groupId);

    int insert(AdcShiftGroup record);

    int insertSelective(AdcShiftGroup record);

    List<AdcShiftGroup> selectByExample(AdcShiftGroupExample example);

    AdcShiftGroup selectByPrimaryKey(String groupId);

    int updateByExampleSelective(@Param("record") AdcShiftGroup record, @Param("example") AdcShiftGroupExample example);

    int updateByExample(@Param("record") AdcShiftGroup record, @Param("example") AdcShiftGroupExample example);

    int updateByPrimaryKeySelective(AdcShiftGroup record);

    int updateByPrimaryKey(AdcShiftGroup record);
}