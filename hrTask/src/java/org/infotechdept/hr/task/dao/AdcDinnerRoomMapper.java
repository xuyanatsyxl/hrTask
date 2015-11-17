package org.infotechdept.hr.task.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.infotechdept.hr.task.model.AdcDinnerRoom;
import org.infotechdept.hr.task.model.AdcDinnerRoomExample;

public interface AdcDinnerRoomMapper {
    int countByExample(AdcDinnerRoomExample example);

    int deleteByExample(AdcDinnerRoomExample example);

    int deleteByPrimaryKey(String roomId);

    int insert(AdcDinnerRoom record);

    int insertSelective(AdcDinnerRoom record);

    List<AdcDinnerRoom> selectByExample(AdcDinnerRoomExample example);

    AdcDinnerRoom selectByPrimaryKey(String roomId);

    int updateByExampleSelective(@Param("record") AdcDinnerRoom record, @Param("example") AdcDinnerRoomExample example);

    int updateByExample(@Param("record") AdcDinnerRoom record, @Param("example") AdcDinnerRoomExample example);

    int updateByPrimaryKeySelective(AdcDinnerRoom record);

    int updateByPrimaryKey(AdcDinnerRoom record);
}