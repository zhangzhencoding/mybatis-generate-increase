package com.shanli.jf.mapper;

import com.shanli.jf.model.Code;
import com.shanli.jf.model.CodeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodeDao {
    int countByExample(CodeQuery example);

    int deleteByExample(CodeQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Code record);

    int insertSelective(Code record);

    List<Code> selectByExample(CodeQuery example);

    Code selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Code record, @Param("example") CodeQuery example);

    int updateByExample(@Param("record") Code record, @Param("example") CodeQuery example);

    int updateByPrimaryKeySelective(Code record);

    int updateByPrimaryKey(Code record);
}