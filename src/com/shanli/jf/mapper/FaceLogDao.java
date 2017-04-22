package com.shanli.jf.mapper;

import com.shanli.jf.model.FaceLog;
import com.shanli.jf.model.FaceLogQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FaceLogDao {
    int countByExample(FaceLogQuery example);

    int deleteByExample(FaceLogQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FaceLog record);

    int insertSelective(FaceLog record);

    List<FaceLog> selectByExample(FaceLogQuery example);

    FaceLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FaceLog record, @Param("example") FaceLogQuery example);

    int updateByExample(@Param("record") FaceLog record, @Param("example") FaceLogQuery example);

    int updateByPrimaryKeySelective(FaceLog record);

    int updateByPrimaryKey(FaceLog record);
}