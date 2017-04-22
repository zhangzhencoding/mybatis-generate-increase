package com.shanli.jf.mapper;

import com.shanli.jf.model.Sequence;
import com.shanli.jf.model.SequenceQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SequenceDao {
    int countByExample(SequenceQuery example);

    int deleteByExample(SequenceQuery example);

    int deleteByPrimaryKey(String name);

    int insert(Sequence record);

    int insertSelective(Sequence record);

    List<Sequence> selectByExample(SequenceQuery example);

    Sequence selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") Sequence record, @Param("example") SequenceQuery example);

    int updateByExample(@Param("record") Sequence record, @Param("example") SequenceQuery example);

    int updateByPrimaryKeySelective(Sequence record);

    int updateByPrimaryKey(Sequence record);
}