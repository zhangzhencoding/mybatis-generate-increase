package com.shanli.jf.mapper;

import com.shanli.jf.model.SysGlQx;
import com.shanli.jf.model.SysGlQxQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysGlQxDao {
    int countByExample(SysGlQxQuery example);

    int deleteByExample(SysGlQxQuery example);

    int deleteByPrimaryKey(String glId);

    int insert(SysGlQx record);

    int insertSelective(SysGlQx record);

    List<SysGlQx> selectByExample(SysGlQxQuery example);

    SysGlQx selectByPrimaryKey(String glId);

    int updateByExampleSelective(@Param("record") SysGlQx record, @Param("example") SysGlQxQuery example);

    int updateByExample(@Param("record") SysGlQx record, @Param("example") SysGlQxQuery example);

    int updateByPrimaryKeySelective(SysGlQx record);

    int updateByPrimaryKey(SysGlQx record);
}