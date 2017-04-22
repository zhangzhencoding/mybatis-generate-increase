package com.shanli.jf.mapper;

import com.shanli.jf.model.TbPictures;
import com.shanli.jf.model.TbPicturesQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPicturesDao {
    int countByExample(TbPicturesQuery example);

    int deleteByExample(TbPicturesQuery example);

    int deleteByPrimaryKey(String picturesId);

    int insert(TbPictures record);

    int insertSelective(TbPictures record);

    List<TbPictures> selectByExample(TbPicturesQuery example);

    TbPictures selectByPrimaryKey(String picturesId);

    int updateByExampleSelective(@Param("record") TbPictures record, @Param("example") TbPicturesQuery example);

    int updateByExample(@Param("record") TbPictures record, @Param("example") TbPicturesQuery example);

    int updateByPrimaryKeySelective(TbPictures record);

    int updateByPrimaryKey(TbPictures record);
}