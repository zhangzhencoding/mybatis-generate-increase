package com.shanli.jf.mapper;

import com.shanli.jf.model.Test;
import com.shanli.jf.model.TestQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestDao {
    int countByExample(TestQuery example);

    int deleteByExample(TestQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Test record);

    int insertSelective(Test record);

    List<Test> selectByExample(TestQuery example);

    Test selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestQuery example);

    int updateByExample(@Param("record") Test record, @Param("example") TestQuery example);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}