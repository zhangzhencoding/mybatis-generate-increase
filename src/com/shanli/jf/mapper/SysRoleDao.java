package com.shanli.jf.mapper;

import com.shanli.jf.model.SysRole;
import com.shanli.jf.model.SysRoleQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleDao {
    int countByExample(SysRoleQuery example);

    int deleteByExample(SysRoleQuery example);

    int deleteByPrimaryKey(String roleId);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExample(SysRoleQuery example);

    SysRole selectByPrimaryKey(String roleId);

    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleQuery example);

    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleQuery example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}