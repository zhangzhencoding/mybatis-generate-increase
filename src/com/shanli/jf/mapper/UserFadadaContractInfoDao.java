package com.shanli.jf.mapper;

import com.shanli.jf.model.UserFadadaContractInfo;
import com.shanli.jf.model.UserFadadaContractInfoQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFadadaContractInfoDao {
    int countByExample(UserFadadaContractInfoQuery example);

    int deleteByExample(UserFadadaContractInfoQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserFadadaContractInfo record);

    int insertSelective(UserFadadaContractInfo record);

    List<UserFadadaContractInfo> selectByExample(UserFadadaContractInfoQuery example);

    UserFadadaContractInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserFadadaContractInfo record, @Param("example") UserFadadaContractInfoQuery example);

    int updateByExample(@Param("record") UserFadadaContractInfo record, @Param("example") UserFadadaContractInfoQuery example);

    int updateByPrimaryKeySelective(UserFadadaContractInfo record);

    int updateByPrimaryKey(UserFadadaContractInfo record);
}