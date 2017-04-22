package com.shanli.jf.mapper;

import com.shanli.jf.model.SysMenu;
import com.shanli.jf.model.SysMenuQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMenuDao {
    int countByExample(SysMenuQuery example);

    int deleteByExample(SysMenuQuery example);

    int deleteByPrimaryKey(Integer menuId);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    List<SysMenu> selectByExample(SysMenuQuery example);

    SysMenu selectByPrimaryKey(Integer menuId);

    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuQuery example);

    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuQuery example);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);
}