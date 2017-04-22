package com.shanli.jf.mapper;

import com.shanli.jf.model.SysUserQx;
import com.shanli.jf.model.SysUserQxQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserQxDao {
    int countByExample(SysUserQxQuery example);

    int deleteByExample(SysUserQxQuery example);

    int deleteByPrimaryKey(String uId);

    int insert(SysUserQx record);

    int insertSelective(SysUserQx record);

    List<SysUserQx> selectByExample(SysUserQxQuery example);

    SysUserQx selectByPrimaryKey(String uId);

    int updateByExampleSelective(@Param("record") SysUserQx record, @Param("example") SysUserQxQuery example);

    int updateByExample(@Param("record") SysUserQx record, @Param("example") SysUserQxQuery example);

    int updateByPrimaryKeySelective(SysUserQx record);

    int updateByPrimaryKey(SysUserQx record);
}