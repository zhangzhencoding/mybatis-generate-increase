package com.shanli.jf.mapper;

import com.shanli.jf.model.LoanBorrowFiles;
import com.shanli.jf.model.LoanBorrowFilesQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanBorrowFilesDao {
    int countByExample(LoanBorrowFilesQuery example);

    int deleteByExample(LoanBorrowFilesQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(LoanBorrowFiles record);

    int insertSelective(LoanBorrowFiles record);

    List<LoanBorrowFiles> selectByExample(LoanBorrowFilesQuery example);

    LoanBorrowFiles selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LoanBorrowFiles record, @Param("example") LoanBorrowFilesQuery example);

    int updateByExample(@Param("record") LoanBorrowFiles record, @Param("example") LoanBorrowFilesQuery example);

    int updateByPrimaryKeySelective(LoanBorrowFiles record);

    int updateByPrimaryKey(LoanBorrowFiles record);
}