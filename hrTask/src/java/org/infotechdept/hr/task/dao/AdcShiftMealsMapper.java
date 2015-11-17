package org.infotechdept.hr.task.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.infotechdept.hr.task.model.AdcShiftMeals;
import org.infotechdept.hr.task.model.AdcShiftMealsExample;

public interface AdcShiftMealsMapper {
    int countByExample(AdcShiftMealsExample example);

    int deleteByExample(AdcShiftMealsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdcShiftMeals record);

    int insertSelective(AdcShiftMeals record);

    List<AdcShiftMeals> selectByExample(AdcShiftMealsExample example);

    AdcShiftMeals selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdcShiftMeals record, @Param("example") AdcShiftMealsExample example);

    int updateByExample(@Param("record") AdcShiftMeals record, @Param("example") AdcShiftMealsExample example);

    int updateByPrimaryKeySelective(AdcShiftMeals record);

    int updateByPrimaryKey(AdcShiftMeals record);
}