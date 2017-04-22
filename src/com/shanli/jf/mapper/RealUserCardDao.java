package com.shanli.jf.mapper;

import com.shanli.jf.model.RealUserCard;
import com.shanli.jf.model.RealUserCardQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RealUserCardDao {
    int countByExample(RealUserCardQuery example);

    int deleteByExample(RealUserCardQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(RealUserCard record);

    int insertSelective(RealUserCard record);

    List<RealUserCard> selectByExample(RealUserCardQuery example);

    RealUserCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RealUserCard record, @Param("example") RealUserCardQuery example);

    int updateByExample(@Param("record") RealUserCard record, @Param("example") RealUserCardQuery example);

    int updateByPrimaryKeySelective(RealUserCard record);

    int updateByPrimaryKey(RealUserCard record);
}