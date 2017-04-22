package com.shanli.jf.mapper;

import com.shanli.jf.model.SysDictionaries;
import com.shanli.jf.model.SysDictionariesQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDictionariesDao {
    int countByExample(SysDictionariesQuery example);

    int deleteByExample(SysDictionariesQuery example);

    int deleteByPrimaryKey(String zdId);

    int insert(SysDictionaries record);

    int insertSelective(SysDictionaries record);

    List<SysDictionaries> selectByExample(SysDictionariesQuery example);

    SysDictionaries selectByPrimaryKey(String zdId);

    int updateByExampleSelective(@Param("record") SysDictionaries record, @Param("example") SysDictionariesQuery example);

    int updateByExample(@Param("record") SysDictionaries record, @Param("example") SysDictionariesQuery example);

    int updateByPrimaryKeySelective(SysDictionaries record);

    int updateByPrimaryKey(SysDictionaries record);
}