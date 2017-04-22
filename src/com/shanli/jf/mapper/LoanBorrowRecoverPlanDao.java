package com.shanli.jf.mapper;

import com.shanli.jf.model.LoanBorrowRecoverPlan;
import com.shanli.jf.model.LoanBorrowRecoverPlanQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanBorrowRecoverPlanDao {
    int countByExample(LoanBorrowRecoverPlanQuery example);

    int deleteByExample(LoanBorrowRecoverPlanQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(LoanBorrowRecoverPlan record);

    int insertSelective(LoanBorrowRecoverPlan record);

    List<LoanBorrowRecoverPlan> selectByExample(LoanBorrowRecoverPlanQuery example);

    LoanBorrowRecoverPlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LoanBorrowRecoverPlan record, @Param("example") LoanBorrowRecoverPlanQuery example);

    int updateByExample(@Param("record") LoanBorrowRecoverPlan record, @Param("example") LoanBorrowRecoverPlanQuery example);

    int updateByPrimaryKeySelective(LoanBorrowRecoverPlan record);

    int updateByPrimaryKey(LoanBorrowRecoverPlan record);
}