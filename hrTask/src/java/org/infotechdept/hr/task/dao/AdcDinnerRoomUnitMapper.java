package org.infotechdept.hr.task.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.infotechdept.hr.task.model.AdcDinnerRoomUnit;
import org.infotechdept.hr.task.model.AdcDinnerRoomUnitExample;

public interface AdcDinnerRoomUnitMapper {
    int countByExample(AdcDinnerRoomUnitExample example);

    int deleteByExample(AdcDinnerRoomUnitExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdcDinnerRoomUnit record);

    int insertSelective(AdcDinnerRoomUnit record);

    List<AdcDinnerRoomUnit> selectByExample(AdcDinnerRoomUnitExample example);

    AdcDinnerRoomUnit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdcDinnerRoomUnit record, @Param("example") AdcDinnerRoomUnitExample example);

    int updateByExample(@Param("record") AdcDinnerRoomUnit record, @Param("example") AdcDinnerRoomUnitExample example);

    int updateByPrimaryKeySelective(AdcDinnerRoomUnit record);

    int updateByPrimaryKey(AdcDinnerRoomUnit record);
}