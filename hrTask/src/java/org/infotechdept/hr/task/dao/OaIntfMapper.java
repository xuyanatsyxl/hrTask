package org.infotechdept.hr.task.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.infotechdept.hr.task.model.OaIntf;
import org.infotechdept.hr.task.model.OaIntfExample;

public interface OaIntfMapper {
    int countByExample(OaIntfExample example);

    int deleteByExample(OaIntfExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OaIntf record);

    int insertSelective(OaIntf record);

    List<OaIntf> selectByExample(OaIntfExample example);

    OaIntf selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OaIntf record, @Param("example") OaIntfExample example);

    int updateByExample(@Param("record") OaIntf record, @Param("example") OaIntfExample example);

    int updateByPrimaryKeySelective(OaIntf record);

    int updateByPrimaryKey(OaIntf record);
}