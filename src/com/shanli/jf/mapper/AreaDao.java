package com.shanli.jf.mapper;

import com.shanli.jf.model.Area;
import com.shanli.jf.model.AreaQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaDao {
    int countByExample(AreaQuery example);

    int deleteByExample(AreaQuery example);

    int deleteByPrimaryKey(Short id);

    int insert(Area record);

    int insertSelective(Area record);

    List<Area> selectByExample(AreaQuery example);

    Area selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") Area record, @Param("example") AreaQuery example);

    int updateByExample(@Param("record") Area record, @Param("example") AreaQuery example);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}