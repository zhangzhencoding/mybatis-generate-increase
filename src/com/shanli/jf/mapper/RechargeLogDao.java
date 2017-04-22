package com.shanli.jf.mapper;

import com.shanli.jf.model.RechargeLog;
import com.shanli.jf.model.RechargeLogQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RechargeLogDao {
    int countByExample(RechargeLogQuery example);

    int deleteByExample(RechargeLogQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(RechargeLog record);

    int insertSelective(RechargeLog record);

    List<RechargeLog> selectByExample(RechargeLogQuery example);

    RechargeLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RechargeLog record, @Param("example") RechargeLogQuery example);

    int updateByExample(@Param("record") RechargeLog record, @Param("example") RechargeLogQuery example);

    int updateByPrimaryKeySelective(RechargeLog record);

    int updateByPrimaryKey(RechargeLog record);
}