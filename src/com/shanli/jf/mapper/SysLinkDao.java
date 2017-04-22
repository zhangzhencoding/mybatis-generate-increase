package com.shanli.jf.mapper;

import com.shanli.jf.model.SysLink;
import com.shanli.jf.model.SysLinkQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLinkDao {
    int countByExample(SysLinkQuery example);

    int deleteByExample(SysLinkQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(SysLink record);

    int insertSelective(SysLink record);

    List<SysLink> selectByExample(SysLinkQuery example);

    SysLink selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysLink record, @Param("example") SysLinkQuery example);

    int updateByExample(@Param("record") SysLink record, @Param("example") SysLinkQuery example);

    int updateByPrimaryKeySelective(SysLink record);

    int updateByPrimaryKey(SysLink record);
}