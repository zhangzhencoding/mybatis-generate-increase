package com.shanli.jf.mapper;

import com.shanli.jf.model.LoanBorrow;
import com.shanli.jf.model.LoanBorrowQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanBorrowDao {
    int countByExample(LoanBorrowQuery example);

    int deleteByExample(LoanBorrowQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(LoanBorrow record);

    int insertSelective(LoanBorrow record);

    List<LoanBorrow> selectByExample(LoanBorrowQuery example);

    LoanBorrow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LoanBorrow record, @Param("example") LoanBorrowQuery example);

    int updateByExample(@Param("record") LoanBorrow record, @Param("example") LoanBorrowQuery example);

    int updateByPrimaryKeySelective(LoanBorrow record);

    int updateByPrimaryKey(LoanBorrow record);
}