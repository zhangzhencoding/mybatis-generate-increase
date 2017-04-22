package com.shanli.jf.mapper;

import com.shanli.jf.model.SysCodeConfigInfo;
import com.shanli.jf.model.SysCodeConfigInfoQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCodeConfigInfoDao {
    int countByExample(SysCodeConfigInfoQuery example);

    int deleteByExample(SysCodeConfigInfoQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysCodeConfigInfo record);

    int insertSelective(SysCodeConfigInfo record);

    List<SysCodeConfigInfo> selectByExample(SysCodeConfigInfoQuery example);

    SysCodeConfigInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysCodeConfigInfo record, @Param("example") SysCodeConfigInfoQuery example);

    int updateByExample(@Param("record") SysCodeConfigInfo record, @Param("example") SysCodeConfigInfoQuery example);

    int updateByPrimaryKeySelective(SysCodeConfigInfo record);

    int updateByPrimaryKey(SysCodeConfigInfo record);
}