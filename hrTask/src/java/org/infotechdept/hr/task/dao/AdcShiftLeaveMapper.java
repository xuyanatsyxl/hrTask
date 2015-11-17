package org.infotechdept.hr.task.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.infotechdept.hr.task.model.AdcShiftLeave;
import org.infotechdept.hr.task.model.AdcShiftLeaveExample;

public interface AdcShiftLeaveMapper {
    int countByExample(AdcShiftLeaveExample example);

    int deleteByExample(AdcShiftLeaveExample example);

    int deleteByPrimaryKey(Long xid);

    int insert(AdcShiftLeave record);

    int insertSelective(AdcShiftLeave record);

    List<AdcShiftLeave> selectByExample(AdcShiftLeaveExample example);

    AdcShiftLeave selectByPrimaryKey(Long xid);

    int updateByExampleSelective(@Param("record") AdcShiftLeave record, @Param("example") AdcShiftLeaveExample example);

    int updateByExample(@Param("record") AdcShiftLeave record, @Param("example") AdcShiftLeaveExample example);

    int updateByPrimaryKeySelective(AdcShiftLeave record);

    int updateByPrimaryKey(AdcShiftLeave record);
}