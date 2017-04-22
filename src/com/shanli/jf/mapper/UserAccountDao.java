package com.shanli.jf.mapper;

import com.shanli.jf.model.UserAccount;
import com.shanli.jf.model.UserAccountQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAccountDao {
    int countByExample(UserAccountQuery example);

    int deleteByExample(UserAccountQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserAccount record);

    int insertSelective(UserAccount record);

    List<UserAccount> selectByExample(UserAccountQuery example);

    UserAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserAccount record, @Param("example") UserAccountQuery example);

    int updateByExample(@Param("record") UserAccount record, @Param("example") UserAccountQuery example);

    int updateByPrimaryKeySelective(UserAccount record);

    int updateByPrimaryKey(UserAccount record);
}