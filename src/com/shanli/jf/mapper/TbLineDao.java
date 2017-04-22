package com.shanli.jf.mapper;

import com.shanli.jf.model.TbLine;
import com.shanli.jf.model.TbLineQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbLineDao {
    int countByExample(TbLineQuery example);

    int deleteByExample(TbLineQuery example);

    int deleteByPrimaryKey(String lineId);

    int insert(TbLine record);

    int insertSelective(TbLine record);

    List<TbLine> selectByExample(TbLineQuery example);

    TbLine selectByPrimaryKey(String lineId);

    int updateByExampleSelective(@Param("record") TbLine record, @Param("example") TbLineQuery example);

    int updateByExample(@Param("record") TbLine record, @Param("example") TbLineQuery example);

    int updateByPrimaryKeySelective(TbLine record);

    int updateByPrimaryKey(TbLine record);
}