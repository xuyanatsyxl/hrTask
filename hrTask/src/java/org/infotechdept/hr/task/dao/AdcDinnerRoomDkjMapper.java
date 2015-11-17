package org.infotechdept.hr.task.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.infotechdept.hr.task.model.AdcDinnerRoomDkj;
import org.infotechdept.hr.task.model.AdcDinnerRoomDkjExample;

public interface AdcDinnerRoomDkjMapper {
    int countByExample(AdcDinnerRoomDkjExample example);

    int deleteByExample(AdcDinnerRoomDkjExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdcDinnerRoomDkj record);

    int insertSelective(AdcDinnerRoomDkj record);

    List<AdcDinnerRoomDkj> selectByExample(AdcDinnerRoomDkjExample example);

    AdcDinnerRoomDkj selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdcDinnerRoomDkj record, @Param("example") AdcDinnerRoomDkjExample example);

    int updateByExample(@Param("record") AdcDinnerRoomDkj record, @Param("example") AdcDinnerRoomDkjExample example);

    int updateByPrimaryKeySelective(AdcDinnerRoomDkj record);

    int updateByPrimaryKey(AdcDinnerRoomDkj record);
}