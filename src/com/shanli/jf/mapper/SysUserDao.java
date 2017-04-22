package com.shanli.jf.mapper;

import com.shanli.jf.model.SysUser;
import com.shanli.jf.model.SysUserQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserDao {
    int countByExample(SysUserQuery example);

    int deleteByExample(SysUserQuery example);

    int deleteByPrimaryKey(String userId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserQuery example);

    SysUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserQuery example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserQuery example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}