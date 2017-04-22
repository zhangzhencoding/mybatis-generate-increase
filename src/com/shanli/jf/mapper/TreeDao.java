package com.shanli.jf.mapper;

import com.shanli.jf.model.Tree;
import com.shanli.jf.model.TreeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TreeDao {
    int countByExample(TreeQuery example);

    int deleteByExample(TreeQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tree record);

    int insertSelective(Tree record);

    List<Tree> selectByExample(TreeQuery example);

    Tree selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tree record, @Param("example") TreeQuery example);

    int updateByExample(@Param("record") Tree record, @Param("example") TreeQuery example);

    int updateByPrimaryKeySelective(Tree record);

    int updateByPrimaryKey(Tree record);
}