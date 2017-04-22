package com.shanli.jf.mapper;

import com.shanli.jf.model.ContractInfo;
import com.shanli.jf.model.ContractInfoQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractInfoDao {
    int countByExample(ContractInfoQuery example);

    int deleteByExample(ContractInfoQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(ContractInfo record);

    int insertSelective(ContractInfo record);

    List<ContractInfo> selectByExampleWithBLOBs(ContractInfoQuery example);

    List<ContractInfo> selectByExample(ContractInfoQuery example);

    ContractInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ContractInfo record, @Param("example") ContractInfoQuery example);

    int updateByExampleWithBLOBs(@Param("record") ContractInfo record, @Param("example") ContractInfoQuery example);

    int updateByExample(@Param("record") ContractInfo record, @Param("example") ContractInfoQuery example);

    int updateByPrimaryKeySelective(ContractInfo record);

    int updateByPrimaryKeyWithBLOBs(ContractInfo record);

    int updateByPrimaryKey(ContractInfo record);
}