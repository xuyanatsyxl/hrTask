package org.infotechdept.hr.task.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.infotechdept.hr.task.model.Eadept;
import org.infotechdept.hr.task.model.EadeptExample;

public interface EadeptMapper {
    int countByExample(EadeptExample example);

    int deleteByExample(EadeptExample example);

    int deleteByPrimaryKey(Long deptid);

    int insert(Eadept record);

    int insertSelective(Eadept record);

    List<Eadept> selectByExample(EadeptExample example);

    Eadept selectByPrimaryKey(Long deptid);

    int updateByExampleSelective(@Param("record") Eadept record, @Param("example") EadeptExample example);

    int updateByExample(@Param("record") Eadept record, @Param("example") EadeptExample example);

    int updateByPrimaryKeySelective(Eadept record);

    int updateByPrimaryKey(Eadept record);
}