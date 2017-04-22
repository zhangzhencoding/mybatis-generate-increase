package com.shanli.jf.mapper;

import com.shanli.jf.model.LoanProduct;
import com.shanli.jf.model.LoanProductQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanProductDao {
    int countByExample(LoanProductQuery example);

    int deleteByExample(LoanProductQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(LoanProduct record);

    int insertSelective(LoanProduct record);

    List<LoanProduct> selectByExample(LoanProductQuery example);

    LoanProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LoanProduct record, @Param("example") LoanProductQuery example);

    int updateByExample(@Param("record") LoanProduct record, @Param("example") LoanProductQuery example);

    int updateByPrimaryKeySelective(LoanProduct record);

    int updateByPrimaryKey(LoanProduct record);
}