package com.shanli.jf.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RealUserCardQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public RealUserCardQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andToAccNameIsNull() {
            addCriterion("to_acc_name is null");
            return (Criteria) this;
        }

        public Criteria andToAccNameIsNotNull() {
            addCriterion("to_acc_name is not null");
            return (Criteria) this;
        }

        public Criteria andToAccNameEqualTo(String value) {
            addCriterion("to_acc_name =", value, "toAccName");
            return (Criteria) this;
        }

        public Criteria andToAccNameNotEqualTo(String value) {
            addCriterion("to_acc_name <>", value, "toAccName");
            return (Criteria) this;
        }

        public Criteria andToAccNameGreaterThan(String value) {
            addCriterion("to_acc_name >", value, "toAccName");
            return (Criteria) this;
        }

        public Criteria andToAccNameGreaterThanOrEqualTo(String value) {
            addCriterion("to_acc_name >=", value, "toAccName");
            return (Criteria) this;
        }

        public Criteria andToAccNameLessThan(String value) {
            addCriterion("to_acc_name <", value, "toAccName");
            return (Criteria) this;
        }

        public Criteria andToAccNameLessThanOrEqualTo(String value) {
            addCriterion("to_acc_name <=", value, "toAccName");
            return (Criteria) this;
        }

        public Criteria andToAccNameLike(String value) {
            addCriterion("to_acc_name like", value, "toAccName");
            return (Criteria) this;
        }

        public Criteria andToAccNameNotLike(String value) {
            addCriterion("to_acc_name not like", value, "toAccName");
            return (Criteria) this;
        }

        public Criteria andToAccNameIn(List<String> values) {
            addCriterion("to_acc_name in", values, "toAccName");
            return (Criteria) this;
        }

        public Criteria andToAccNameNotIn(List<String> values) {
            addCriterion("to_acc_name not in", values, "toAccName");
            return (Criteria) this;
        }

        public Criteria andToAccNameBetween(String value1, String value2) {
            addCriterion("to_acc_name between", value1, value2, "toAccName");
            return (Criteria) this;
        }

        public Criteria andToAccNameNotBetween(String value1, String value2) {
            addCriterion("to_acc_name not between", value1, value2, "toAccName");
            return (Criteria) this;
        }

        public Criteria andToAccNoIsNull() {
            addCriterion("to_acc_no is null");
            return (Criteria) this;
        }

        public Criteria andToAccNoIsNotNull() {
            addCriterion("to_acc_no is not null");
            return (Criteria) this;
        }

        public Criteria andToAccNoEqualTo(String value) {
            addCriterion("to_acc_no =", value, "toAccNo");
            return (Criteria) this;
        }

        public Criteria andToAccNoNotEqualTo(String value) {
            addCriterion("to_acc_no <>", value, "toAccNo");
            return (Criteria) this;
        }

        public Criteria andToAccNoGreaterThan(String value) {
            addCriterion("to_acc_no >", value, "toAccNo");
            return (Criteria) this;
        }

        public Criteria andToAccNoGreaterThanOrEqualTo(String value) {
            addCriterion("to_acc_no >=", value, "toAccNo");
            return (Criteria) this;
        }

        public Criteria andToAccNoLessThan(String value) {
            addCriterion("to_acc_no <", value, "toAccNo");
            return (Criteria) this;
        }

        public Criteria andToAccNoLessThanOrEqualTo(String value) {
            addCriterion("to_acc_no <=", value, "toAccNo");
            return (Criteria) this;
        }

        public Criteria andToAccNoLike(String value) {
            addCriterion("to_acc_no like", value, "toAccNo");
            return (Criteria) this;
        }

        public Criteria andToAccNoNotLike(String value) {
            addCriterion("to_acc_no not like", value, "toAccNo");
            return (Criteria) this;
        }

        public Criteria andToAccNoIn(List<String> values) {
            addCriterion("to_acc_no in", values, "toAccNo");
            return (Criteria) this;
        }

        public Criteria andToAccNoNotIn(List<String> values) {
            addCriterion("to_acc_no not in", values, "toAccNo");
            return (Criteria) this;
        }

        public Criteria andToAccNoBetween(String value1, String value2) {
            addCriterion("to_acc_no between", value1, value2, "toAccNo");
            return (Criteria) this;
        }

        public Criteria andToAccNoNotBetween(String value1, String value2) {
            addCriterion("to_acc_no not between", value1, value2, "toAccNo");
            return (Criteria) this;
        }

        public Criteria andToBankNameIsNull() {
            addCriterion("to_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andToBankNameIsNotNull() {
            addCriterion("to_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andToBankNameEqualTo(String value) {
            addCriterion("to_bank_name =", value, "toBankName");
            return (Criteria) this;
        }

        public Criteria andToBankNameNotEqualTo(String value) {
            addCriterion("to_bank_name <>", value, "toBankName");
            return (Criteria) this;
        }

        public Criteria andToBankNameGreaterThan(String value) {
            addCriterion("to_bank_name >", value, "toBankName");
            return (Criteria) this;
        }

        public Criteria andToBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("to_bank_name >=", value, "toBankName");
            return (Criteria) this;
        }

        public Criteria andToBankNameLessThan(String value) {
            addCriterion("to_bank_name <", value, "toBankName");
            return (Criteria) this;
        }

        public Criteria andToBankNameLessThanOrEqualTo(String value) {
            addCriterion("to_bank_name <=", value, "toBankName");
            return (Criteria) this;
        }

        public Criteria andToBankNameLike(String value) {
            addCriterion("to_bank_name like", value, "toBankName");
            return (Criteria) this;
        }

        public Criteria andToBankNameNotLike(String value) {
            addCriterion("to_bank_name not like", value, "toBankName");
            return (Criteria) this;
        }

        public Criteria andToBankNameIn(List<String> values) {
            addCriterion("to_bank_name in", values, "toBankName");
            return (Criteria) this;
        }

        public Criteria andToBankNameNotIn(List<String> values) {
            addCriterion("to_bank_name not in", values, "toBankName");
            return (Criteria) this;
        }

        public Criteria andToBankNameBetween(String value1, String value2) {
            addCriterion("to_bank_name between", value1, value2, "toBankName");
            return (Criteria) this;
        }

        public Criteria andToBankNameNotBetween(String value1, String value2) {
            addCriterion("to_bank_name not between", value1, value2, "toBankName");
            return (Criteria) this;
        }

        public Criteria andToProNameIsNull() {
            addCriterion("to_pro_name is null");
            return (Criteria) this;
        }

        public Criteria andToProNameIsNotNull() {
            addCriterion("to_pro_name is not null");
            return (Criteria) this;
        }

        public Criteria andToProNameEqualTo(String value) {
            addCriterion("to_pro_name =", value, "toProName");
            return (Criteria) this;
        }

        public Criteria andToProNameNotEqualTo(String value) {
            addCriterion("to_pro_name <>", value, "toProName");
            return (Criteria) this;
        }

        public Criteria andToProNameGreaterThan(String value) {
            addCriterion("to_pro_name >", value, "toProName");
            return (Criteria) this;
        }

        public Criteria andToProNameGreaterThanOrEqualTo(String value) {
            addCriterion("to_pro_name >=", value, "toProName");
            return (Criteria) this;
        }

        public Criteria andToProNameLessThan(String value) {
            addCriterion("to_pro_name <", value, "toProName");
            return (Criteria) this;
        }

        public Criteria andToProNameLessThanOrEqualTo(String value) {
            addCriterion("to_pro_name <=", value, "toProName");
            return (Criteria) this;
        }

        public Criteria andToProNameLike(String value) {
            addCriterion("to_pro_name like", value, "toProName");
            return (Criteria) this;
        }

        public Criteria andToProNameNotLike(String value) {
            addCriterion("to_pro_name not like", value, "toProName");
            return (Criteria) this;
        }

        public Criteria andToProNameIn(List<String> values) {
            addCriterion("to_pro_name in", values, "toProName");
            return (Criteria) this;
        }

        public Criteria andToProNameNotIn(List<String> values) {
            addCriterion("to_pro_name not in", values, "toProName");
            return (Criteria) this;
        }

        public Criteria andToProNameBetween(String value1, String value2) {
            addCriterion("to_pro_name between", value1, value2, "toProName");
            return (Criteria) this;
        }

        public Criteria andToProNameNotBetween(String value1, String value2) {
            addCriterion("to_pro_name not between", value1, value2, "toProName");
            return (Criteria) this;
        }

        public Criteria andToCityNameIsNull() {
            addCriterion("to_city_name is null");
            return (Criteria) this;
        }

        public Criteria andToCityNameIsNotNull() {
            addCriterion("to_city_name is not null");
            return (Criteria) this;
        }

        public Criteria andToCityNameEqualTo(String value) {
            addCriterion("to_city_name =", value, "toCityName");
            return (Criteria) this;
        }

        public Criteria andToCityNameNotEqualTo(String value) {
            addCriterion("to_city_name <>", value, "toCityName");
            return (Criteria) this;
        }

        public Criteria andToCityNameGreaterThan(String value) {
            addCriterion("to_city_name >", value, "toCityName");
            return (Criteria) this;
        }

        public Criteria andToCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("to_city_name >=", value, "toCityName");
            return (Criteria) this;
        }

        public Criteria andToCityNameLessThan(String value) {
            addCriterion("to_city_name <", value, "toCityName");
            return (Criteria) this;
        }

        public Criteria andToCityNameLessThanOrEqualTo(String value) {
            addCriterion("to_city_name <=", value, "toCityName");
            return (Criteria) this;
        }

        public Criteria andToCityNameLike(String value) {
            addCriterion("to_city_name like", value, "toCityName");
            return (Criteria) this;
        }

        public Criteria andToCityNameNotLike(String value) {
            addCriterion("to_city_name not like", value, "toCityName");
            return (Criteria) this;
        }

        public Criteria andToCityNameIn(List<String> values) {
            addCriterion("to_city_name in", values, "toCityName");
            return (Criteria) this;
        }

        public Criteria andToCityNameNotIn(List<String> values) {
            addCriterion("to_city_name not in", values, "toCityName");
            return (Criteria) this;
        }

        public Criteria andToCityNameBetween(String value1, String value2) {
            addCriterion("to_city_name between", value1, value2, "toCityName");
            return (Criteria) this;
        }

        public Criteria andToCityNameNotBetween(String value1, String value2) {
            addCriterion("to_city_name not between", value1, value2, "toCityName");
            return (Criteria) this;
        }

        public Criteria andToAccDeptIsNull() {
            addCriterion("to_acc_dept is null");
            return (Criteria) this;
        }

        public Criteria andToAccDeptIsNotNull() {
            addCriterion("to_acc_dept is not null");
            return (Criteria) this;
        }

        public Criteria andToAccDeptEqualTo(String value) {
            addCriterion("to_acc_dept =", value, "toAccDept");
            return (Criteria) this;
        }

        public Criteria andToAccDeptNotEqualTo(String value) {
            addCriterion("to_acc_dept <>", value, "toAccDept");
            return (Criteria) this;
        }

        public Criteria andToAccDeptGreaterThan(String value) {
            addCriterion("to_acc_dept >", value, "toAccDept");
            return (Criteria) this;
        }

        public Criteria andToAccDeptGreaterThanOrEqualTo(String value) {
            addCriterion("to_acc_dept >=", value, "toAccDept");
            return (Criteria) this;
        }

        public Criteria andToAccDeptLessThan(String value) {
            addCriterion("to_acc_dept <", value, "toAccDept");
            return (Criteria) this;
        }

        public Criteria andToAccDeptLessThanOrEqualTo(String value) {
            addCriterion("to_acc_dept <=", value, "toAccDept");
            return (Criteria) this;
        }

        public Criteria andToAccDeptLike(String value) {
            addCriterion("to_acc_dept like", value, "toAccDept");
            return (Criteria) this;
        }

        public Criteria andToAccDeptNotLike(String value) {
            addCriterion("to_acc_dept not like", value, "toAccDept");
            return (Criteria) this;
        }

        public Criteria andToAccDeptIn(List<String> values) {
            addCriterion("to_acc_dept in", values, "toAccDept");
            return (Criteria) this;
        }

        public Criteria andToAccDeptNotIn(List<String> values) {
            addCriterion("to_acc_dept not in", values, "toAccDept");
            return (Criteria) this;
        }

        public Criteria andToAccDeptBetween(String value1, String value2) {
            addCriterion("to_acc_dept between", value1, value2, "toAccDept");
            return (Criteria) this;
        }

        public Criteria andToAccDeptNotBetween(String value1, String value2) {
            addCriterion("to_acc_dept not between", value1, value2, "toAccDept");
            return (Criteria) this;
        }

        public Criteria andTransSummaryIsNull() {
            addCriterion("trans_summary is null");
            return (Criteria) this;
        }

        public Criteria andTransSummaryIsNotNull() {
            addCriterion("trans_summary is not null");
            return (Criteria) this;
        }

        public Criteria andTransSummaryEqualTo(String value) {
            addCriterion("trans_summary =", value, "transSummary");
            return (Criteria) this;
        }

        public Criteria andTransSummaryNotEqualTo(String value) {
            addCriterion("trans_summary <>", value, "transSummary");
            return (Criteria) this;
        }

        public Criteria andTransSummaryGreaterThan(String value) {
            addCriterion("trans_summary >", value, "transSummary");
            return (Criteria) this;
        }

        public Criteria andTransSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("trans_summary >=", value, "transSummary");
            return (Criteria) this;
        }

        public Criteria andTransSummaryLessThan(String value) {
            addCriterion("trans_summary <", value, "transSummary");
            return (Criteria) this;
        }

        public Criteria andTransSummaryLessThanOrEqualTo(String value) {
            addCriterion("trans_summary <=", value, "transSummary");
            return (Criteria) this;
        }

        public Criteria andTransSummaryLike(String value) {
            addCriterion("trans_summary like", value, "transSummary");
            return (Criteria) this;
        }

        public Criteria andTransSummaryNotLike(String value) {
            addCriterion("trans_summary not like", value, "transSummary");
            return (Criteria) this;
        }

        public Criteria andTransSummaryIn(List<String> values) {
            addCriterion("trans_summary in", values, "transSummary");
            return (Criteria) this;
        }

        public Criteria andTransSummaryNotIn(List<String> values) {
            addCriterion("trans_summary not in", values, "transSummary");
            return (Criteria) this;
        }

        public Criteria andTransSummaryBetween(String value1, String value2) {
            addCriterion("trans_summary between", value1, value2, "transSummary");
            return (Criteria) this;
        }

        public Criteria andTransSummaryNotBetween(String value1, String value2) {
            addCriterion("trans_summary not between", value1, value2, "transSummary");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTimeCardIsNull() {
            addCriterion("time_card is null");
            return (Criteria) this;
        }

        public Criteria andTimeCardIsNotNull() {
            addCriterion("time_card is not null");
            return (Criteria) this;
        }

        public Criteria andTimeCardEqualTo(Date value) {
            addCriterion("time_card =", value, "timeCard");
            return (Criteria) this;
        }

        public Criteria andTimeCardNotEqualTo(Date value) {
            addCriterion("time_card <>", value, "timeCard");
            return (Criteria) this;
        }

        public Criteria andTimeCardGreaterThan(Date value) {
            addCriterion("time_card >", value, "timeCard");
            return (Criteria) this;
        }

        public Criteria andTimeCardGreaterThanOrEqualTo(Date value) {
            addCriterion("time_card >=", value, "timeCard");
            return (Criteria) this;
        }

        public Criteria andTimeCardLessThan(Date value) {
            addCriterion("time_card <", value, "timeCard");
            return (Criteria) this;
        }

        public Criteria andTimeCardLessThanOrEqualTo(Date value) {
            addCriterion("time_card <=", value, "timeCard");
            return (Criteria) this;
        }

        public Criteria andTimeCardIn(List<Date> values) {
            addCriterion("time_card in", values, "timeCard");
            return (Criteria) this;
        }

        public Criteria andTimeCardNotIn(List<Date> values) {
            addCriterion("time_card not in", values, "timeCard");
            return (Criteria) this;
        }

        public Criteria andTimeCardBetween(Date value1, Date value2) {
            addCriterion("time_card between", value1, value2, "timeCard");
            return (Criteria) this;
        }

        public Criteria andTimeCardNotBetween(Date value1, Date value2) {
            addCriterion("time_card not between", value1, value2, "timeCard");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andBindIdIsNull() {
            addCriterion("bind_id is null");
            return (Criteria) this;
        }

        public Criteria andBindIdIsNotNull() {
            addCriterion("bind_id is not null");
            return (Criteria) this;
        }

        public Criteria andBindIdEqualTo(String value) {
            addCriterion("bind_id =", value, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdNotEqualTo(String value) {
            addCriterion("bind_id <>", value, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdGreaterThan(String value) {
            addCriterion("bind_id >", value, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdGreaterThanOrEqualTo(String value) {
            addCriterion("bind_id >=", value, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdLessThan(String value) {
            addCriterion("bind_id <", value, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdLessThanOrEqualTo(String value) {
            addCriterion("bind_id <=", value, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdLike(String value) {
            addCriterion("bind_id like", value, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdNotLike(String value) {
            addCriterion("bind_id not like", value, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdIn(List<String> values) {
            addCriterion("bind_id in", values, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdNotIn(List<String> values) {
            addCriterion("bind_id not in", values, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdBetween(String value1, String value2) {
            addCriterion("bind_id between", value1, value2, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdNotBetween(String value1, String value2) {
            addCriterion("bind_id not between", value1, value2, "bindId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(Integer value) {
            addCriterion("is_default =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(Integer value) {
            addCriterion("is_default <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(Integer value) {
            addCriterion("is_default >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_default >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(Integer value) {
            addCriterion("is_default <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(Integer value) {
            addCriterion("is_default <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<Integer> values) {
            addCriterion("is_default in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<Integer> values) {
            addCriterion("is_default not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(Integer value1, Integer value2) {
            addCriterion("is_default between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(Integer value1, Integer value2) {
            addCriterion("is_default not between", value1, value2, "isDefault");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}