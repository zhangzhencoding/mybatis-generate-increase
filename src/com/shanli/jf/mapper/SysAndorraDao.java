package com.shanli.jf.mapper;

import com.shanli.jf.model.SysAndorra;
import com.shanli.jf.model.SysAndorraQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAndorraDao {
    int countByExample(SysAndorraQuery example);

    int deleteByExample(SysAndorraQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(SysAndorra record);

    int insertSelective(SysAndorra record);

    List<SysAndorra> selectByExample(SysAndorraQuery example);

    SysAndorra selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysAndorra record, @Param("example") SysAndorraQuery example);

    int updateByExample(@Param("record") SysAndorra record, @Param("example") SysAndorraQuery example);

    int updateByPrimaryKeySelective(SysAndorra record);

    int updateByPrimaryKey(SysAndorra record);
}