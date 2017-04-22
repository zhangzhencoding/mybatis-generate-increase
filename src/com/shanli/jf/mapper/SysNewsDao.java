package com.shanli.jf.mapper;

import com.shanli.jf.model.SysNews;
import com.shanli.jf.model.SysNewsQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysNewsDao {
    int countByExample(SysNewsQuery example);

    int deleteByExample(SysNewsQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(SysNews record);

    int insertSelective(SysNews record);

    List<SysNews> selectByExampleWithBLOBs(SysNewsQuery example);

    List<SysNews> selectByExample(SysNewsQuery example);

    SysNews selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysNews record, @Param("example") SysNewsQuery example);

    int updateByExampleWithBLOBs(@Param("record") SysNews record, @Param("example") SysNewsQuery example);

    int updateByExample(@Param("record") SysNews record, @Param("example") SysNewsQuery example);

    int updateByPrimaryKeySelective(SysNews record);

    int updateByPrimaryKeyWithBLOBs(SysNews record);

    int updateByPrimaryKey(SysNews record);
}