package com.shanli.jf.mapper;

import com.shanli.jf.model.UserContactsConverse;
import com.shanli.jf.model.UserContactsConverseQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserContactsConverseDao {
    int countByExample(UserContactsConverseQuery example);

    int deleteByExample(UserContactsConverseQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserContactsConverse record);

    int insertSelective(UserContactsConverse record);

    List<UserContactsConverse> selectByExample(UserContactsConverseQuery example);

    UserContactsConverse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserContactsConverse record, @Param("example") UserContactsConverseQuery example);

    int updateByExample(@Param("record") UserContactsConverse record, @Param("example") UserContactsConverseQuery example);

    int updateByPrimaryKeySelective(UserContactsConverse record);

    int updateByPrimaryKey(UserContactsConverse record);
}