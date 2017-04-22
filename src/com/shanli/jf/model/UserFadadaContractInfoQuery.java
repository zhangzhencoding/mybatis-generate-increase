package com.shanli.jf.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserFadadaContractInfoQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public UserFadadaContractInfoQuery() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andLoanBorrowIdIsNull() {
            addCriterion("loan_borrow_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanBorrowIdIsNotNull() {
            addCriterion("loan_borrow_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanBorrowIdEqualTo(Integer value) {
            addCriterion("loan_borrow_id =", value, "loanBorrowId");
            return (Criteria) this;
        }

        public Criteria andLoanBorrowIdNotEqualTo(Integer value) {
            addCriterion("loan_borrow_id <>", value, "loanBorrowId");
            return (Criteria) this;
        }

        public Criteria andLoanBorrowIdGreaterThan(Integer value) {
            addCriterion("loan_borrow_id >", value, "loanBorrowId");
            return (Criteria) this;
        }

        public Criteria andLoanBorrowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_borrow_id >=", value, "loanBorrowId");
            return (Criteria) this;
        }

        public Criteria andLoanBorrowIdLessThan(Integer value) {
            addCriterion("loan_borrow_id <", value, "loanBorrowId");
            return (Criteria) this;
        }

        public Criteria andLoanBorrowIdLessThanOrEqualTo(Integer value) {
            addCriterion("loan_borrow_id <=", value, "loanBorrowId");
            return (Criteria) this;
        }

        public Criteria andLoanBorrowIdIn(List<Integer> values) {
            addCriterion("loan_borrow_id in", values, "loanBorrowId");
            return (Criteria) this;
        }

        public Criteria andLoanBorrowIdNotIn(List<Integer> values) {
            addCriterion("loan_borrow_id not in", values, "loanBorrowId");
            return (Criteria) this;
        }

        public Criteria andLoanBorrowIdBetween(Integer value1, Integer value2) {
            addCriterion("loan_borrow_id between", value1, value2, "loanBorrowId");
            return (Criteria) this;
        }

        public Criteria andLoanBorrowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_borrow_id not between", value1, value2, "loanBorrowId");
            return (Criteria) this;
        }

        public Criteria andConNumIsNull() {
            addCriterion("con_num is null");
            return (Criteria) this;
        }

        public Criteria andConNumIsNotNull() {
            addCriterion("con_num is not null");
            return (Criteria) this;
        }

        public Criteria andConNumEqualTo(String value) {
            addCriterion("con_num =", value, "conNum");
            return (Criteria) this;
        }

        public Criteria andConNumNotEqualTo(String value) {
            addCriterion("con_num <>", value, "conNum");
            return (Criteria) this;
        }

        public Criteria andConNumGreaterThan(String value) {
            addCriterion("con_num >", value, "conNum");
            return (Criteria) this;
        }

        public Criteria andConNumGreaterThanOrEqualTo(String value) {
            addCriterion("con_num >=", value, "conNum");
            return (Criteria) this;
        }

        public Criteria andConNumLessThan(String value) {
            addCriterion("con_num <", value, "conNum");
            return (Criteria) this;
        }

        public Criteria andConNumLessThanOrEqualTo(String value) {
            addCriterion("con_num <=", value, "conNum");
            return (Criteria) this;
        }

        public Criteria andConNumLike(String value) {
            addCriterion("con_num like", value, "conNum");
            return (Criteria) this;
        }

        public Criteria andConNumNotLike(String value) {
            addCriterion("con_num not like", value, "conNum");
            return (Criteria) this;
        }

        public Criteria andConNumIn(List<String> values) {
            addCriterion("con_num in", values, "conNum");
            return (Criteria) this;
        }

        public Criteria andConNumNotIn(List<String> values) {
            addCriterion("con_num not in", values, "conNum");
            return (Criteria) this;
        }

        public Criteria andConNumBetween(String value1, String value2) {
            addCriterion("con_num between", value1, value2, "conNum");
            return (Criteria) this;
        }

        public Criteria andConNumNotBetween(String value1, String value2) {
            addCriterion("con_num not between", value1, value2, "conNum");
            return (Criteria) this;
        }

        public Criteria andConTitleIsNull() {
            addCriterion("con_title is null");
            return (Criteria) this;
        }

        public Criteria andConTitleIsNotNull() {
            addCriterion("con_title is not null");
            return (Criteria) this;
        }

        public Criteria andConTitleEqualTo(String value) {
            addCriterion("con_title =", value, "conTitle");
            return (Criteria) this;
        }

        public Criteria andConTitleNotEqualTo(String value) {
            addCriterion("con_title <>", value, "conTitle");
            return (Criteria) this;
        }

        public Criteria andConTitleGreaterThan(String value) {
            addCriterion("con_title >", value, "conTitle");
            return (Criteria) this;
        }

        public Criteria andConTitleGreaterThanOrEqualTo(String value) {
            addCriterion("con_title >=", value, "conTitle");
            return (Criteria) this;
        }

        public Criteria andConTitleLessThan(String value) {
            addCriterion("con_title <", value, "conTitle");
            return (Criteria) this;
        }

        public Criteria andConTitleLessThanOrEqualTo(String value) {
            addCriterion("con_title <=", value, "conTitle");
            return (Criteria) this;
        }

        public Criteria andConTitleLike(String value) {
            addCriterion("con_title like", value, "conTitle");
            return (Criteria) this;
        }

        public Criteria andConTitleNotLike(String value) {
            addCriterion("con_title not like", value, "conTitle");
            return (Criteria) this;
        }

        public Criteria andConTitleIn(List<String> values) {
            addCriterion("con_title in", values, "conTitle");
            return (Criteria) this;
        }

        public Criteria andConTitleNotIn(List<String> values) {
            addCriterion("con_title not in", values, "conTitle");
            return (Criteria) this;
        }

        public Criteria andConTitleBetween(String value1, String value2) {
            addCriterion("con_title between", value1, value2, "conTitle");
            return (Criteria) this;
        }

        public Criteria andConTitleNotBetween(String value1, String value2) {
            addCriterion("con_title not between", value1, value2, "conTitle");
            return (Criteria) this;
        }

        public Criteria andConAddrIsNull() {
            addCriterion("con_addr is null");
            return (Criteria) this;
        }

        public Criteria andConAddrIsNotNull() {
            addCriterion("con_addr is not null");
            return (Criteria) this;
        }

        public Criteria andConAddrEqualTo(String value) {
            addCriterion("con_addr =", value, "conAddr");
            return (Criteria) this;
        }

        public Criteria andConAddrNotEqualTo(String value) {
            addCriterion("con_addr <>", value, "conAddr");
            return (Criteria) this;
        }

        public Criteria andConAddrGreaterThan(String value) {
            addCriterion("con_addr >", value, "conAddr");
            return (Criteria) this;
        }

        public Criteria andConAddrGreaterThanOrEqualTo(String value) {
            addCriterion("con_addr >=", value, "conAddr");
            return (Criteria) this;
        }

        public Criteria andConAddrLessThan(String value) {
            addCriterion("con_addr <", value, "conAddr");
            return (Criteria) this;
        }

        public Criteria andConAddrLessThanOrEqualTo(String value) {
            addCriterion("con_addr <=", value, "conAddr");
            return (Criteria) this;
        }

        public Criteria andConAddrLike(String value) {
            addCriterion("con_addr like", value, "conAddr");
            return (Criteria) this;
        }

        public Criteria andConAddrNotLike(String value) {
            addCriterion("con_addr not like", value, "conAddr");
            return (Criteria) this;
        }

        public Criteria andConAddrIn(List<String> values) {
            addCriterion("con_addr in", values, "conAddr");
            return (Criteria) this;
        }

        public Criteria andConAddrNotIn(List<String> values) {
            addCriterion("con_addr not in", values, "conAddr");
            return (Criteria) this;
        }

        public Criteria andConAddrBetween(String value1, String value2) {
            addCriterion("con_addr between", value1, value2, "conAddr");
            return (Criteria) this;
        }

        public Criteria andConAddrNotBetween(String value1, String value2) {
            addCriterion("con_addr not between", value1, value2, "conAddr");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeIsNull() {
            addCriterion("effective_time is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeIsNotNull() {
            addCriterion("effective_time is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeEqualTo(Date value) {
            addCriterionForJDBCDate("effective_time =", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("effective_time <>", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("effective_time >", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("effective_time >=", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeLessThan(Date value) {
            addCriterionForJDBCDate("effective_time <", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("effective_time <=", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeIn(List<Date> values) {
            addCriterionForJDBCDate("effective_time in", values, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("effective_time not in", values, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("effective_time between", value1, value2, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("effective_time not between", value1, value2, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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