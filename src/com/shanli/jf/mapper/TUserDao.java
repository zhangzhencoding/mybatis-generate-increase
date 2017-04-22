package com.shanli.jf.mapper;

import com.shanli.jf.model.TUser;
import com.shanli.jf.model.TUserQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserDao {
    int countByExample(TUserQuery example);

    int deleteByExample(TUserQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);

    List<TUser> selectByExample(TUserQuery example);

    TUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserQuery example);

    int updateByExample(@Param("record") TUser record, @Param("example") TUserQuery example);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}