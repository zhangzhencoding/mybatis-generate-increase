package com.shanli.jf.mapper;

import com.shanli.jf.model.ChannelInfo;
import com.shanli.jf.model.ChannelInfoQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChannelInfoDao {
    int countByExample(ChannelInfoQuery example);

    int deleteByExample(ChannelInfoQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChannelInfo record);

    int insertSelective(ChannelInfo record);

    List<ChannelInfo> selectByExample(ChannelInfoQuery example);

    ChannelInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChannelInfo record, @Param("example") ChannelInfoQuery example);

    int updateByExample(@Param("record") ChannelInfo record, @Param("example") ChannelInfoQuery example);

    int updateByPrimaryKeySelective(ChannelInfo record);

    int updateByPrimaryKey(ChannelInfo record);
}