package com.shanli.jf.mapper;

import com.shanli.jf.model.sys_pay_log;
import com.shanli.jf.model.sys_pay_logQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sys_pay_logDao {
    int countByExample(sys_pay_logQuery example);

    int deleteByExample(sys_pay_logQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(sys_pay_log record);

    int insertSelective(sys_pay_log record);

    List<sys_pay_log> selectByExample(sys_pay_logQuery example);

    sys_pay_log selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") sys_pay_log record, @Param("example") sys_pay_logQuery example);

    int updateByExample(@Param("record") sys_pay_log record, @Param("example") sys_pay_logQuery example);

    int updateByPrimaryKeySelective(sys_pay_log record);

    int updateByPrimaryKey(sys_pay_log record);
}