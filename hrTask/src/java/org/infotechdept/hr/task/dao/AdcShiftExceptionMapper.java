package org.infotechdept.hr.task.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.infotechdept.hr.task.model.AdcShiftException;
import org.infotechdept.hr.task.model.AdcShiftExceptionExample;

public interface AdcShiftExceptionMapper {
    int countByExample(AdcShiftExceptionExample example);

    int deleteByExample(AdcShiftExceptionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdcShiftException record);

    int insertSelective(AdcShiftException record);

    List<AdcShiftException> selectByExample(AdcShiftExceptionExample example);

    AdcShiftException selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdcShiftException record, @Param("example") AdcShiftExceptionExample example);

    int updateByExample(@Param("record") AdcShiftException record, @Param("example") AdcShiftExceptionExample example);

    int updateByPrimaryKeySelective(AdcShiftException record);

    int updateByPrimaryKey(AdcShiftException record);
}