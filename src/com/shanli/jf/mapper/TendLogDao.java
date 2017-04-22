package com.shanli.jf.mapper;

import com.shanli.jf.model.TendLog;
import com.shanli.jf.model.TendLogQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TendLogDao {
    int countByExample(TendLogQuery example);

    int deleteByExample(TendLogQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(TendLog record);

    int insertSelective(TendLog record);

    List<TendLog> selectByExample(TendLogQuery example);

    TendLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TendLog record, @Param("example") TendLogQuery example);

    int updateByExample(@Param("record") TendLog record, @Param("example") TendLogQuery example);

    int updateByPrimaryKeySelective(TendLog record);

    int updateByPrimaryKey(TendLog record);
}