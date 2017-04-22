package com.shanli.jf.mapper;

import com.shanli.jf.model.UserStatus;
import com.shanli.jf.model.UserStatusQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserStatusDao {
    int countByExample(UserStatusQuery example);

    int deleteByExample(UserStatusQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserStatus record);

    int insertSelective(UserStatus record);

    List<UserStatus> selectByExample(UserStatusQuery example);

    UserStatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserStatus record, @Param("example") UserStatusQuery example);

    int updateByExample(@Param("record") UserStatus record, @Param("example") UserStatusQuery example);

    int updateByPrimaryKeySelective(UserStatus record);

    int updateByPrimaryKey(UserStatus record);
}