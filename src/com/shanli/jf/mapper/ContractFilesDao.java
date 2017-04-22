package com.shanli.jf.mapper;

import com.shanli.jf.model.ContractFiles;
import com.shanli.jf.model.ContractFilesQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractFilesDao {
    int countByExample(ContractFilesQuery example);

    int deleteByExample(ContractFilesQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(ContractFiles record);

    int insertSelective(ContractFiles record);

    List<ContractFiles> selectByExample(ContractFilesQuery example);

    ContractFiles selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ContractFiles record, @Param("example") ContractFilesQuery example);

    int updateByExample(@Param("record") ContractFiles record, @Param("example") ContractFilesQuery example);

    int updateByPrimaryKeySelective(ContractFiles record);

    int updateByPrimaryKey(ContractFiles record);
}