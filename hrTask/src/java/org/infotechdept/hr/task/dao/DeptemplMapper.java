package org.infotechdept.hr.task.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.infotechdept.hr.task.model.Deptempl;
import org.infotechdept.hr.task.model.DeptemplExample;
import org.infotechdept.hr.task.model.DeptemplKey;

public interface DeptemplMapper {
    int countByExample(DeptemplExample example);

    int deleteByExample(DeptemplExample example);

    int deleteByPrimaryKey(DeptemplKey key);

    int insert(Deptempl record);

    int insertSelective(Deptempl record);

    List<Deptempl> selectByExample(DeptemplExample example);

    Deptempl selectByPrimaryKey(DeptemplKey key);

    int updateByExampleSelective(@Param("record") Deptempl record, @Param("example") DeptemplExample example);

    int updateByExample(@Param("record") Deptempl record, @Param("example") DeptemplExample example);

    int updateByPrimaryKeySelective(Deptempl record);

    int updateByPrimaryKey(Deptempl record);
}