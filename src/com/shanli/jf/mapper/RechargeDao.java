package com.shanli.jf.mapper;

import com.shanli.jf.model.Recharge;
import com.shanli.jf.model.RechargeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RechargeDao {
    int countByExample(RechargeQuery example);

    int deleteByExample(RechargeQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Recharge record);

    int insertSelective(Recharge record);

    List<Recharge> selectByExample(RechargeQuery example);

    Recharge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Recharge record, @Param("example") RechargeQuery example);

    int updateByExample(@Param("record") Recharge record, @Param("example") RechargeQuery example);

    int updateByPrimaryKeySelective(Recharge record);

    int updateByPrimaryKey(Recharge record);
}