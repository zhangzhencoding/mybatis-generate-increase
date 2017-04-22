package com.shanli.jf.mapper;

import com.shanli.jf.model.LoanProductInfo;
import com.shanli.jf.model.LoanProductInfoQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanProductInfoDao {
    int countByExample(LoanProductInfoQuery example);

    int deleteByExample(LoanProductInfoQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(LoanProductInfo record);

    int insertSelective(LoanProductInfo record);

    List<LoanProductInfo> selectByExample(LoanProductInfoQuery example);

    LoanProductInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LoanProductInfo record, @Param("example") LoanProductInfoQuery example);

    int updateByExample(@Param("record") LoanProductInfo record, @Param("example") LoanProductInfoQuery example);

    int updateByPrimaryKeySelective(LoanProductInfo record);

    int updateByPrimaryKey(LoanProductInfo record);
}