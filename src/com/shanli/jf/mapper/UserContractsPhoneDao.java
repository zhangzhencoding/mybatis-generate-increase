package com.shanli.jf.mapper;

import com.shanli.jf.model.UserContractsPhone;
import com.shanli.jf.model.UserContractsPhoneQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserContractsPhoneDao {
    int countByExample(UserContractsPhoneQuery example);

    int deleteByExample(UserContractsPhoneQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserContractsPhone record);

    int insertSelective(UserContractsPhone record);

    List<UserContractsPhone> selectByExample(UserContractsPhoneQuery example);

    UserContractsPhone selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserContractsPhone record, @Param("example") UserContractsPhoneQuery example);

    int updateByExample(@Param("record") UserContractsPhone record, @Param("example") UserContractsPhoneQuery example);

    int updateByPrimaryKeySelective(UserContractsPhone record);

    int updateByPrimaryKey(UserContractsPhone record);
}