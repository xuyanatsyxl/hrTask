package org.infotechdept.hr.task.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.infotechdept.hr.task.model.AdcHolidayDetail;
import org.infotechdept.hr.task.model.AdcHolidayDetailExample;

public interface AdcHolidayDetailMapper {
    int countByExample(AdcHolidayDetailExample example);

    int deleteByExample(AdcHolidayDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdcHolidayDetail record);

    int insertSelective(AdcHolidayDetail record);

    List<AdcHolidayDetail> selectByExample(AdcHolidayDetailExample example);

    AdcHolidayDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdcHolidayDetail record, @Param("example") AdcHolidayDetailExample example);

    int updateByExample(@Param("record") AdcHolidayDetail record, @Param("example") AdcHolidayDetailExample example);

    int updateByPrimaryKeySelective(AdcHolidayDetail record);

    int updateByPrimaryKey(AdcHolidayDetail record);
}