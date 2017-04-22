package com.shanli.jf.mapper;

import com.shanli.jf.model.UserOperationInfolog;
import com.shanli.jf.model.UserOperationInfologQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserOperationInfologDao {
    int countByExample(UserOperationInfologQuery example);

    int deleteByExample(UserOperationInfologQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserOperationInfolog record);

    int insertSelective(UserOperationInfolog record);

    List<UserOperationInfolog> selectByExample(UserOperationInfologQuery example);

    UserOperationInfolog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserOperationInfolog record, @Param("example") UserOperationInfologQuery example);

    int updateByExample(@Param("record") UserOperationInfolog record, @Param("example") UserOperationInfologQuery example);

    int updateByPrimaryKeySelective(UserOperationInfolog record);

    int updateByPrimaryKey(UserOperationInfolog record);
}