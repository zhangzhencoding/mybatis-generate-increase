package com.shanli.jf.mapper;

import com.shanli.jf.model.BankDictionaries;
import com.shanli.jf.model.BankDictionariesQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankDictionariesDao {
    int countByExample(BankDictionariesQuery example);

    int deleteByExample(BankDictionariesQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BankDictionaries record);

    int insertSelective(BankDictionaries record);

    List<BankDictionaries> selectByExample(BankDictionariesQuery example);

    BankDictionaries selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BankDictionaries record, @Param("example") BankDictionariesQuery example);

    int updateByExample(@Param("record") BankDictionaries record, @Param("example") BankDictionariesQuery example);

    int updateByPrimaryKeySelective(BankDictionaries record);

    int updateByPrimaryKey(BankDictionaries record);
}