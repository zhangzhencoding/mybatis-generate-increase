package com.shanli.jf.mapper;

import com.shanli.jf.model.SysFeatured;
import com.shanli.jf.model.SysFeaturedQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFeaturedDao {
    int countByExample(SysFeaturedQuery example);

    int deleteByExample(SysFeaturedQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(SysFeatured record);

    int insertSelective(SysFeatured record);

    List<SysFeatured> selectByExample(SysFeaturedQuery example);

    SysFeatured selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysFeatured record, @Param("example") SysFeaturedQuery example);

    int updateByExample(@Param("record") SysFeatured record, @Param("example") SysFeaturedQuery example);

    int updateByPrimaryKeySelective(SysFeatured record);

    int updateByPrimaryKey(SysFeatured record);
}