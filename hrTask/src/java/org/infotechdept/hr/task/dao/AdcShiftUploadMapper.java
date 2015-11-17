package org.infotechdept.hr.task.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.infotechdept.hr.task.model.AdcShiftUpload;
import org.infotechdept.hr.task.model.AdcShiftUploadExample;

public interface AdcShiftUploadMapper {
    int countByExample(AdcShiftUploadExample example);

    int deleteByExample(AdcShiftUploadExample example);

    int deleteByPrimaryKey(String upfileid);

    int insert(AdcShiftUpload record);

    int insertSelective(AdcShiftUpload record);

    List<AdcShiftUpload> selectByExample(AdcShiftUploadExample example);

    AdcShiftUpload selectByPrimaryKey(String upfileid);

    int updateByExampleSelective(@Param("record") AdcShiftUpload record, @Param("example") AdcShiftUploadExample example);

    int updateByExample(@Param("record") AdcShiftUpload record, @Param("example") AdcShiftUploadExample example);

    int updateByPrimaryKeySelective(AdcShiftUpload record);

    int updateByPrimaryKey(AdcShiftUpload record);
}