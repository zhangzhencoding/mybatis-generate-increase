package com.shanli.jf.mapper;

import com.shanli.jf.model.UserContactsInfo;
import com.shanli.jf.model.UserContactsInfoQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserContactsInfoDao {
    int countByExample(UserContactsInfoQuery example);

    int deleteByExample(UserContactsInfoQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserContactsInfo record);

    int insertSelective(UserContactsInfo record);

    List<UserContactsInfo> selectByExample(UserContactsInfoQuery example);

    UserContactsInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserContactsInfo record, @Param("example") UserContactsInfoQuery example);

    int updateByExample(@Param("record") UserContactsInfo record, @Param("example") UserContactsInfoQuery example);

    int updateByPrimaryKeySelective(UserContactsInfo record);

    int updateByPrimaryKey(UserContactsInfo record);
}