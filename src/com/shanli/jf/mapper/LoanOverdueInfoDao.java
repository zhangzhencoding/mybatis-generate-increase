package com.shanli.jf.mapper;

import com.shanli.jf.model.LoanOverdueInfo;
import com.shanli.jf.model.LoanOverdueInfoQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanOverdueInfoDao {
    int countByExample(LoanOverdueInfoQuery example);

    int deleteByExample(LoanOverdueInfoQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(LoanOverdueInfo record);

    int insertSelective(LoanOverdueInfo record);

    List<LoanOverdueInfo> selectByExample(LoanOverdueInfoQuery example);

    LoanOverdueInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LoanOverdueInfo record, @Param("example") LoanOverdueInfoQuery example);

    int updateByExample(@Param("record") LoanOverdueInfo record, @Param("example") LoanOverdueInfoQuery example);

    int updateByPrimaryKeySelective(LoanOverdueInfo record);

    int updateByPrimaryKey(LoanOverdueInfo record);
}