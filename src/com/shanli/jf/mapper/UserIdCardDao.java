package com.shanli.jf.mapper;

import com.shanli.jf.model.UserIdCard;
import com.shanli.jf.model.UserIdCardQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserIdCardDao {
    int countByExample(UserIdCardQuery example);

    int deleteByExample(UserIdCardQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserIdCard record);

    int insertSelective(UserIdCard record);

    List<UserIdCard> selectByExample(UserIdCardQuery example);

    UserIdCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserIdCard record, @Param("example") UserIdCardQuery example);

    int updateByExample(@Param("record") UserIdCard record, @Param("example") UserIdCardQuery example);

    int updateByPrimaryKeySelective(UserIdCard record);

    int updateByPrimaryKey(UserIdCard record);
}