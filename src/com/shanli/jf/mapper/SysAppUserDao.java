package com.shanli.jf.mapper;

import com.shanli.jf.model.SysAppUser;
import com.shanli.jf.model.SysAppUserQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAppUserDao {
    int countByExample(SysAppUserQuery example);

    int deleteByExample(SysAppUserQuery example);

    int deleteByPrimaryKey(String userId);

    int insert(SysAppUser record);

    int insertSelective(SysAppUser record);

    List<SysAppUser> selectByExample(SysAppUserQuery example);

    SysAppUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") SysAppUser record, @Param("example") SysAppUserQuery example);

    int updateByExample(@Param("record") SysAppUser record, @Param("example") SysAppUserQuery example);

    int updateByPrimaryKeySelective(SysAppUser record);

    int updateByPrimaryKey(SysAppUser record);
}