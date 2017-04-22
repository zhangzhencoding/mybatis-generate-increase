package com.shanli.jf.mapper;

import com.shanli.jf.model.Banner;
import com.shanli.jf.model.BannerQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BannerDao {
    int countByExample(BannerQuery example);

    int deleteByExample(BannerQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Banner record);

    int insertSelective(Banner record);

    List<Banner> selectByExample(BannerQuery example);

    Banner selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Banner record, @Param("example") BannerQuery example);

    int updateByExample(@Param("record") Banner record, @Param("example") BannerQuery example);

    int updateByPrimaryKeySelective(Banner record);

    int updateByPrimaryKey(Banner record);
}