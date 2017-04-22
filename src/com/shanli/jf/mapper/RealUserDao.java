package com.shanli.jf.mapper;

import com.shanli.jf.model.RealUser;
import com.shanli.jf.model.RealUserQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RealUserDao {
    int countByExample(RealUserQuery example);

    int deleteByExample(RealUserQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(RealUser record);

    int insertSelective(RealUser record);

    List<RealUser> selectByExample(RealUserQuery example);

    RealUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RealUser record, @Param("example") RealUserQuery example);

    int updateByExample(@Param("record") RealUser record, @Param("example") RealUserQuery example);

    int updateByPrimaryKeySelective(RealUser record);

    int updateByPrimaryKey(RealUser record);
}