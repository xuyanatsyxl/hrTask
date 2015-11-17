package org.infotechdept.hr.task.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.infotechdept.hr.task.model.AdcAttendType;
import org.infotechdept.hr.task.model.AdcAttendTypeExample;

public interface AdcAttendTypeMapper {
    int countByExample(AdcAttendTypeExample example);

    int deleteByExample(AdcAttendTypeExample example);

    int deleteByPrimaryKey(String typeId);

    int insert(AdcAttendType record);

    int insertSelective(AdcAttendType record);

    List<AdcAttendType> selectByExample(AdcAttendTypeExample example);

    AdcAttendType selectByPrimaryKey(String typeId);

    int updateByExampleSelective(@Param("record") AdcAttendType record, @Param("example") AdcAttendTypeExample example);

    int updateByExample(@Param("record") AdcAttendType record, @Param("example") AdcAttendTypeExample example);

    int updateByPrimaryKeySelective(AdcAttendType record);

    int updateByPrimaryKey(AdcAttendType record);
}