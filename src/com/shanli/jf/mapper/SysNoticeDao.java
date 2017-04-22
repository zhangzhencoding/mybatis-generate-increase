package com.shanli.jf.mapper;

import com.shanli.jf.model.SysNotice;
import com.shanli.jf.model.SysNoticeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysNoticeDao {
    int countByExample(SysNoticeQuery example);

    int deleteByExample(SysNoticeQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(SysNotice record);

    int insertSelective(SysNotice record);

    List<SysNotice> selectByExample(SysNoticeQuery example);

    SysNotice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysNotice record, @Param("example") SysNoticeQuery example);

    int updateByExample(@Param("record") SysNotice record, @Param("example") SysNoticeQuery example);

    int updateByPrimaryKeySelective(SysNotice record);

    int updateByPrimaryKey(SysNotice record);
}