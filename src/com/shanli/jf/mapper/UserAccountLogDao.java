package com.shanli.jf.mapper;

import com.shanli.jf.model.UserAccountLog;
import com.shanli.jf.model.UserAccountLogQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAccountLogDao {
    int countByExample(UserAccountLogQuery example);

    int deleteByExample(UserAccountLogQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserAccountLog record);

    int insertSelective(UserAccountLog record);

    List<UserAccountLog> selectByExample(UserAccountLogQuery example);

    UserAccountLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserAccountLog record, @Param("example") UserAccountLogQuery example);

    int updateByExample(@Param("record") UserAccountLog record, @Param("example") UserAccountLogQuery example);

    int updateByPrimaryKeySelective(UserAccountLog record);

    int updateByPrimaryKey(UserAccountLog record);
}