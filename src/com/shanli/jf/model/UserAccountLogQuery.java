package com.shanli.jf.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserAccountLogQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public UserAccountLogQuery() {
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

        public Criteria andOperationAmountIsNull() {
            addCriterion("operation_amount is null");
            return (Criteria) this;
        }

        public Criteria andOperationAmountIsNotNull() {
            addCriterion("operation_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOperationAmountEqualTo(BigDecimal value) {
            addCriterion("operation_amount =", value, "operationAmount");
            return (Criteria) this;
        }

        public Criteria andOperationAmountNotEqualTo(BigDecimal value) {
            addCriterion("operation_amount <>", value, "operationAmount");
            return (Criteria) this;
        }

        public Criteria andOperationAmountGreaterThan(BigDecimal value) {
            addCriterion("operation_amount >", value, "operationAmount");
            return (Criteria) this;
        }

        public Criteria andOperationAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("operation_amount >=", value, "operationAmount");
            return (Criteria) this;
        }

        public Criteria andOperationAmountLessThan(BigDecimal value) {
            addCriterion("operation_amount <", value, "operationAmount");
            return (Criteria) this;
        }

        public Criteria andOperationAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("operation_amount <=", value, "operationAmount");
            return (Criteria) this;
        }

        public Criteria andOperationAmountIn(List<BigDecimal> values) {
            addCriterion("operation_amount in", values, "operationAmount");
            return (Criteria) this;
        }

        public Criteria andOperationAmountNotIn(List<BigDecimal> values) {
            addCriterion("operation_amount not in", values, "operationAmount");
            return (Criteria) this;
        }

        public Criteria andOperationAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("operation_amount between", value1, value2, "operationAmount");
            return (Criteria) this;
        }

        public Criteria andOperationAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("operation_amount not between", value1, value2, "operationAmount");
            return (Criteria) this;
        }

        public Criteria andOperationBeforeIsNull() {
            addCriterion("operation_before is null");
            return (Criteria) this;
        }

        public Criteria andOperationBeforeIsNotNull() {
            addCriterion("operation_before is not null");
            return (Criteria) this;
        }

        public Criteria andOperationBeforeEqualTo(BigDecimal value) {
            addCriterion("operation_before =", value, "operationBefore");
            return (Criteria) this;
        }

        public Criteria andOperationBeforeNotEqualTo(BigDecimal value) {
            addCriterion("operation_before <>", value, "operationBefore");
            return (Criteria) this;
        }

        public Criteria andOperationBeforeGreaterThan(BigDecimal value) {
            addCriterion("operation_before >", value, "operationBefore");
            return (Criteria) this;
        }

        public Criteria andOperationBeforeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("operation_before >=", value, "operationBefore");
            return (Criteria) this;
        }

        public Criteria andOperationBeforeLessThan(BigDecimal value) {
            addCriterion("operation_before <", value, "operationBefore");
            return (Criteria) this;
        }

        public Criteria andOperationBeforeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("operation_before <=", value, "operationBefore");
            return (Criteria) this;
        }

        public Criteria andOperationBeforeIn(List<BigDecimal> values) {
            addCriterion("operation_before in", values, "operationBefore");
            return (Criteria) this;
        }

        public Criteria andOperationBeforeNotIn(List<BigDecimal> values) {
            addCriterion("operation_before not in", values, "operationBefore");
            return (Criteria) this;
        }

        public Criteria andOperationBeforeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("operation_before between", value1, value2, "operationBefore");
            return (Criteria) this;
        }

        public Criteria andOperationBeforeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("operation_before not between", value1, value2, "operationBefore");
            return (Criteria) this;
        }

        public Criteria andOperationAfterIsNull() {
            addCriterion("operation_after is null");
            return (Criteria) this;
        }

        public Criteria andOperationAfterIsNotNull() {
            addCriterion("operation_after is not null");
            return (Criteria) this;
        }

        public Criteria andOperationAfterEqualTo(BigDecimal value) {
            addCriterion("operation_after =", value, "operationAfter");
            return (Criteria) this;
        }

        public Criteria andOperationAfterNotEqualTo(BigDecimal value) {
            addCriterion("operation_after <>", value, "operationAfter");
            return (Criteria) this;
        }

        public Criteria andOperationAfterGreaterThan(BigDecimal value) {
            addCriterion("operation_after >", value, "operationAfter");
            return (Criteria) this;
        }

        public Criteria andOperationAfterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("operation_after >=", value, "operationAfter");
            return (Criteria) this;
        }

        public Criteria andOperationAfterLessThan(BigDecimal value) {
            addCriterion("operation_after <", value, "operationAfter");
            return (Criteria) this;
        }

        public Criteria andOperationAfterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("operation_after <=", value, "operationAfter");
            return (Criteria) this;
        }

        public Criteria andOperationAfterIn(List<BigDecimal> values) {
            addCriterion("operation_after in", values, "operationAfter");
            return (Criteria) this;
        }

        public Criteria andOperationAfterNotIn(List<BigDecimal> values) {
            addCriterion("operation_after not in", values, "operationAfter");
            return (Criteria) this;
        }

        public Criteria andOperationAfterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("operation_after between", value1, value2, "operationAfter");
            return (Criteria) this;
        }

        public Criteria andOperationAfterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("operation_after not between", value1, value2, "operationAfter");
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

        public Criteria andBorrowNidIsNull() {
            addCriterion("borrow_nid is null");
            return (Criteria) this;
        }

        public Criteria andBorrowNidIsNotNull() {
            addCriterion("borrow_nid is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowNidEqualTo(String value) {
            addCriterion("borrow_nid =", value, "borrowNid");
            return (Criteria) this;
        }

        public Criteria andBorrowNidNotEqualTo(String value) {
            addCriterion("borrow_nid <>", value, "borrowNid");
            return (Criteria) this;
        }

        public Criteria andBorrowNidGreaterThan(String value) {
            addCriterion("borrow_nid >", value, "borrowNid");
            return (Criteria) this;
        }

        public Criteria andBorrowNidGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_nid >=", value, "borrowNid");
            return (Criteria) this;
        }

        public Criteria andBorrowNidLessThan(String value) {
            addCriterion("borrow_nid <", value, "borrowNid");
            return (Criteria) this;
        }

        public Criteria andBorrowNidLessThanOrEqualTo(String value) {
            addCriterion("borrow_nid <=", value, "borrowNid");
            return (Criteria) this;
        }

        public Criteria andBorrowNidLike(String value) {
            addCriterion("borrow_nid like", value, "borrowNid");
            return (Criteria) this;
        }

        public Criteria andBorrowNidNotLike(String value) {
            addCriterion("borrow_nid not like", value, "borrowNid");
            return (Criteria) this;
        }

        public Criteria andBorrowNidIn(List<String> values) {
            addCriterion("borrow_nid in", values, "borrowNid");
            return (Criteria) this;
        }

        public Criteria andBorrowNidNotIn(List<String> values) {
            addCriterion("borrow_nid not in", values, "borrowNid");
            return (Criteria) this;
        }

        public Criteria andBorrowNidBetween(String value1, String value2) {
            addCriterion("borrow_nid between", value1, value2, "borrowNid");
            return (Criteria) this;
        }

        public Criteria andBorrowNidNotBetween(String value1, String value2) {
            addCriterion("borrow_nid not between", value1, value2, "borrowNid");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andOperateUseIsNull() {
            addCriterion("operate_use is null");
            return (Criteria) this;
        }

        public Criteria andOperateUseIsNotNull() {
            addCriterion("operate_use is not null");
            return (Criteria) this;
        }

        public Criteria andOperateUseEqualTo(Integer value) {
            addCriterion("operate_use =", value, "operateUse");
            return (Criteria) this;
        }

        public Criteria andOperateUseNotEqualTo(Integer value) {
            addCriterion("operate_use <>", value, "operateUse");
            return (Criteria) this;
        }

        public Criteria andOperateUseGreaterThan(Integer value) {
            addCriterion("operate_use >", value, "operateUse");
            return (Criteria) this;
        }

        public Criteria andOperateUseGreaterThanOrEqualTo(Integer value) {
            addCriterion("operate_use >=", value, "operateUse");
            return (Criteria) this;
        }

        public Criteria andOperateUseLessThan(Integer value) {
            addCriterion("operate_use <", value, "operateUse");
            return (Criteria) this;
        }

        public Criteria andOperateUseLessThanOrEqualTo(Integer value) {
            addCriterion("operate_use <=", value, "operateUse");
            return (Criteria) this;
        }

        public Criteria andOperateUseIn(List<Integer> values) {
            addCriterion("operate_use in", values, "operateUse");
            return (Criteria) this;
        }

        public Criteria andOperateUseNotIn(List<Integer> values) {
            addCriterion("operate_use not in", values, "operateUse");
            return (Criteria) this;
        }

        public Criteria andOperateUseBetween(Integer value1, Integer value2) {
            addCriterion("operate_use between", value1, value2, "operateUse");
            return (Criteria) this;
        }

        public Criteria andOperateUseNotBetween(Integer value1, Integer value2) {
            addCriterion("operate_use not between", value1, value2, "operateUse");
            return (Criteria) this;
        }

        public Criteria andNidIsNull() {
            addCriterion("nid is null");
            return (Criteria) this;
        }

        public Criteria andNidIsNotNull() {
            addCriterion("nid is not null");
            return (Criteria) this;
        }

        public Criteria andNidEqualTo(String value) {
            addCriterion("nid =", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotEqualTo(String value) {
            addCriterion("nid <>", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThan(String value) {
            addCriterion("nid >", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThanOrEqualTo(String value) {
            addCriterion("nid >=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThan(String value) {
            addCriterion("nid <", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThanOrEqualTo(String value) {
            addCriterion("nid <=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLike(String value) {
            addCriterion("nid like", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotLike(String value) {
            addCriterion("nid not like", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidIn(List<String> values) {
            addCriterion("nid in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotIn(List<String> values) {
            addCriterion("nid not in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidBetween(String value1, String value2) {
            addCriterion("nid between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotBetween(String value1, String value2) {
            addCriterion("nid not between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountBeforeIsNull() {
            addCriterion("frozen_amount_before is null");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountBeforeIsNotNull() {
            addCriterion("frozen_amount_before is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountBeforeEqualTo(BigDecimal value) {
            addCriterion("frozen_amount_before =", value, "frozenAmountBefore");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountBeforeNotEqualTo(BigDecimal value) {
            addCriterion("frozen_amount_before <>", value, "frozenAmountBefore");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountBeforeGreaterThan(BigDecimal value) {
            addCriterion("frozen_amount_before >", value, "frozenAmountBefore");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountBeforeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("frozen_amount_before >=", value, "frozenAmountBefore");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountBeforeLessThan(BigDecimal value) {
            addCriterion("frozen_amount_before <", value, "frozenAmountBefore");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountBeforeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("frozen_amount_before <=", value, "frozenAmountBefore");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountBeforeIn(List<BigDecimal> values) {
            addCriterion("frozen_amount_before in", values, "frozenAmountBefore");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountBeforeNotIn(List<BigDecimal> values) {
            addCriterion("frozen_amount_before not in", values, "frozenAmountBefore");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountBeforeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frozen_amount_before between", value1, value2, "frozenAmountBefore");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountBeforeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frozen_amount_before not between", value1, value2, "frozenAmountBefore");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountAfterIsNull() {
            addCriterion("frozen_amount_after is null");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountAfterIsNotNull() {
            addCriterion("frozen_amount_after is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountAfterEqualTo(BigDecimal value) {
            addCriterion("frozen_amount_after =", value, "frozenAmountAfter");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountAfterNotEqualTo(BigDecimal value) {
            addCriterion("frozen_amount_after <>", value, "frozenAmountAfter");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountAfterGreaterThan(BigDecimal value) {
            addCriterion("frozen_amount_after >", value, "frozenAmountAfter");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountAfterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("frozen_amount_after >=", value, "frozenAmountAfter");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountAfterLessThan(BigDecimal value) {
            addCriterion("frozen_amount_after <", value, "frozenAmountAfter");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountAfterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("frozen_amount_after <=", value, "frozenAmountAfter");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountAfterIn(List<BigDecimal> values) {
            addCriterion("frozen_amount_after in", values, "frozenAmountAfter");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountAfterNotIn(List<BigDecimal> values) {
            addCriterion("frozen_amount_after not in", values, "frozenAmountAfter");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountAfterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frozen_amount_after between", value1, value2, "frozenAmountAfter");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountAfterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frozen_amount_after not between", value1, value2, "frozenAmountAfter");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountYesIsNull() {
            addCriterion("frozen_amount_yes is null");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountYesIsNotNull() {
            addCriterion("frozen_amount_yes is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountYesEqualTo(BigDecimal value) {
            addCriterion("frozen_amount_yes =", value, "frozenAmountYes");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountYesNotEqualTo(BigDecimal value) {
            addCriterion("frozen_amount_yes <>", value, "frozenAmountYes");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountYesGreaterThan(BigDecimal value) {
            addCriterion("frozen_amount_yes >", value, "frozenAmountYes");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountYesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("frozen_amount_yes >=", value, "frozenAmountYes");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountYesLessThan(BigDecimal value) {
            addCriterion("frozen_amount_yes <", value, "frozenAmountYes");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountYesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("frozen_amount_yes <=", value, "frozenAmountYes");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountYesIn(List<BigDecimal> values) {
            addCriterion("frozen_amount_yes in", values, "frozenAmountYes");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountYesNotIn(List<BigDecimal> values) {
            addCriterion("frozen_amount_yes not in", values, "frozenAmountYes");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountYesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frozen_amount_yes between", value1, value2, "frozenAmountYes");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountYesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frozen_amount_yes not between", value1, value2, "frozenAmountYes");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditYesIsNull() {
            addCriterion("available_credit_yes is null");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditYesIsNotNull() {
            addCriterion("available_credit_yes is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditYesEqualTo(BigDecimal value) {
            addCriterion("available_credit_yes =", value, "availableCreditYes");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditYesNotEqualTo(BigDecimal value) {
            addCriterion("available_credit_yes <>", value, "availableCreditYes");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditYesGreaterThan(BigDecimal value) {
            addCriterion("available_credit_yes >", value, "availableCreditYes");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditYesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("available_credit_yes >=", value, "availableCreditYes");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditYesLessThan(BigDecimal value) {
            addCriterion("available_credit_yes <", value, "availableCreditYes");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditYesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("available_credit_yes <=", value, "availableCreditYes");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditYesIn(List<BigDecimal> values) {
            addCriterion("available_credit_yes in", values, "availableCreditYes");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditYesNotIn(List<BigDecimal> values) {
            addCriterion("available_credit_yes not in", values, "availableCreditYes");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditYesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_credit_yes between", value1, value2, "availableCreditYes");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditYesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_credit_yes not between", value1, value2, "availableCreditYes");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditBeforeIsNull() {
            addCriterion("available_credit_before is null");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditBeforeIsNotNull() {
            addCriterion("available_credit_before is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditBeforeEqualTo(BigDecimal value) {
            addCriterion("available_credit_before =", value, "availableCreditBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditBeforeNotEqualTo(BigDecimal value) {
            addCriterion("available_credit_before <>", value, "availableCreditBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditBeforeGreaterThan(BigDecimal value) {
            addCriterion("available_credit_before >", value, "availableCreditBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditBeforeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("available_credit_before >=", value, "availableCreditBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditBeforeLessThan(BigDecimal value) {
            addCriterion("available_credit_before <", value, "availableCreditBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditBeforeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("available_credit_before <=", value, "availableCreditBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditBeforeIn(List<BigDecimal> values) {
            addCriterion("available_credit_before in", values, "availableCreditBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditBeforeNotIn(List<BigDecimal> values) {
            addCriterion("available_credit_before not in", values, "availableCreditBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditBeforeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_credit_before between", value1, value2, "availableCreditBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditBeforeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_credit_before not between", value1, value2, "availableCreditBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditAfterIsNull() {
            addCriterion("available_credit_after is null");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditAfterIsNotNull() {
            addCriterion("available_credit_after is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditAfterEqualTo(BigDecimal value) {
            addCriterion("available_credit_after =", value, "availableCreditAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditAfterNotEqualTo(BigDecimal value) {
            addCriterion("available_credit_after <>", value, "availableCreditAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditAfterGreaterThan(BigDecimal value) {
            addCriterion("available_credit_after >", value, "availableCreditAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditAfterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("available_credit_after >=", value, "availableCreditAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditAfterLessThan(BigDecimal value) {
            addCriterion("available_credit_after <", value, "availableCreditAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditAfterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("available_credit_after <=", value, "availableCreditAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditAfterIn(List<BigDecimal> values) {
            addCriterion("available_credit_after in", values, "availableCreditAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditAfterNotIn(List<BigDecimal> values) {
            addCriterion("available_credit_after not in", values, "availableCreditAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditAfterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_credit_after between", value1, value2, "availableCreditAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditAfterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_credit_after not between", value1, value2, "availableCreditAfter");
            return (Criteria) this;
        }

        public Criteria andCashWaitYesIsNull() {
            addCriterion("cash_wait_yes is null");
            return (Criteria) this;
        }

        public Criteria andCashWaitYesIsNotNull() {
            addCriterion("cash_wait_yes is not null");
            return (Criteria) this;
        }

        public Criteria andCashWaitYesEqualTo(BigDecimal value) {
            addCriterion("cash_wait_yes =", value, "cashWaitYes");
            return (Criteria) this;
        }

        public Criteria andCashWaitYesNotEqualTo(BigDecimal value) {
            addCriterion("cash_wait_yes <>", value, "cashWaitYes");
            return (Criteria) this;
        }

        public Criteria andCashWaitYesGreaterThan(BigDecimal value) {
            addCriterion("cash_wait_yes >", value, "cashWaitYes");
            return (Criteria) this;
        }

        public Criteria andCashWaitYesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_wait_yes >=", value, "cashWaitYes");
            return (Criteria) this;
        }

        public Criteria andCashWaitYesLessThan(BigDecimal value) {
            addCriterion("cash_wait_yes <", value, "cashWaitYes");
            return (Criteria) this;
        }

        public Criteria andCashWaitYesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_wait_yes <=", value, "cashWaitYes");
            return (Criteria) this;
        }

        public Criteria andCashWaitYesIn(List<BigDecimal> values) {
            addCriterion("cash_wait_yes in", values, "cashWaitYes");
            return (Criteria) this;
        }

        public Criteria andCashWaitYesNotIn(List<BigDecimal> values) {
            addCriterion("cash_wait_yes not in", values, "cashWaitYes");
            return (Criteria) this;
        }

        public Criteria andCashWaitYesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_wait_yes between", value1, value2, "cashWaitYes");
            return (Criteria) this;
        }

        public Criteria andCashWaitYesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_wait_yes not between", value1, value2, "cashWaitYes");
            return (Criteria) this;
        }

        public Criteria andCashWaitBeforeIsNull() {
            addCriterion("cash_wait_before is null");
            return (Criteria) this;
        }

        public Criteria andCashWaitBeforeIsNotNull() {
            addCriterion("cash_wait_before is not null");
            return (Criteria) this;
        }

        public Criteria andCashWaitBeforeEqualTo(BigDecimal value) {
            addCriterion("cash_wait_before =", value, "cashWaitBefore");
            return (Criteria) this;
        }

        public Criteria andCashWaitBeforeNotEqualTo(BigDecimal value) {
            addCriterion("cash_wait_before <>", value, "cashWaitBefore");
            return (Criteria) this;
        }

        public Criteria andCashWaitBeforeGreaterThan(BigDecimal value) {
            addCriterion("cash_wait_before >", value, "cashWaitBefore");
            return (Criteria) this;
        }

        public Criteria andCashWaitBeforeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_wait_before >=", value, "cashWaitBefore");
            return (Criteria) this;
        }

        public Criteria andCashWaitBeforeLessThan(BigDecimal value) {
            addCriterion("cash_wait_before <", value, "cashWaitBefore");
            return (Criteria) this;
        }

        public Criteria andCashWaitBeforeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_wait_before <=", value, "cashWaitBefore");
            return (Criteria) this;
        }

        public Criteria andCashWaitBeforeIn(List<BigDecimal> values) {
            addCriterion("cash_wait_before in", values, "cashWaitBefore");
            return (Criteria) this;
        }

        public Criteria andCashWaitBeforeNotIn(List<BigDecimal> values) {
            addCriterion("cash_wait_before not in", values, "cashWaitBefore");
            return (Criteria) this;
        }

        public Criteria andCashWaitBeforeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_wait_before between", value1, value2, "cashWaitBefore");
            return (Criteria) this;
        }

        public Criteria andCashWaitBeforeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_wait_before not between", value1, value2, "cashWaitBefore");
            return (Criteria) this;
        }

        public Criteria andCashWaitAfterIsNull() {
            addCriterion("cash_wait_after is null");
            return (Criteria) this;
        }

        public Criteria andCashWaitAfterIsNotNull() {
            addCriterion("cash_wait_after is not null");
            return (Criteria) this;
        }

        public Criteria andCashWaitAfterEqualTo(BigDecimal value) {
            addCriterion("cash_wait_after =", value, "cashWaitAfter");
            return (Criteria) this;
        }

        public Criteria andCashWaitAfterNotEqualTo(BigDecimal value) {
            addCriterion("cash_wait_after <>", value, "cashWaitAfter");
            return (Criteria) this;
        }

        public Criteria andCashWaitAfterGreaterThan(BigDecimal value) {
            addCriterion("cash_wait_after >", value, "cashWaitAfter");
            return (Criteria) this;
        }

        public Criteria andCashWaitAfterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_wait_after >=", value, "cashWaitAfter");
            return (Criteria) this;
        }

        public Criteria andCashWaitAfterLessThan(BigDecimal value) {
            addCriterion("cash_wait_after <", value, "cashWaitAfter");
            return (Criteria) this;
        }

        public Criteria andCashWaitAfterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_wait_after <=", value, "cashWaitAfter");
            return (Criteria) this;
        }

        public Criteria andCashWaitAfterIn(List<BigDecimal> values) {
            addCriterion("cash_wait_after in", values, "cashWaitAfter");
            return (Criteria) this;
        }

        public Criteria andCashWaitAfterNotIn(List<BigDecimal> values) {
            addCriterion("cash_wait_after not in", values, "cashWaitAfter");
            return (Criteria) this;
        }

        public Criteria andCashWaitAfterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_wait_after between", value1, value2, "cashWaitAfter");
            return (Criteria) this;
        }

        public Criteria andCashWaitAfterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_wait_after not between", value1, value2, "cashWaitAfter");
            return (Criteria) this;
        }

        public Criteria andProfitYesIsNull() {
            addCriterion("profit_yes is null");
            return (Criteria) this;
        }

        public Criteria andProfitYesIsNotNull() {
            addCriterion("profit_yes is not null");
            return (Criteria) this;
        }

        public Criteria andProfitYesEqualTo(BigDecimal value) {
            addCriterion("profit_yes =", value, "profitYes");
            return (Criteria) this;
        }

        public Criteria andProfitYesNotEqualTo(BigDecimal value) {
            addCriterion("profit_yes <>", value, "profitYes");
            return (Criteria) this;
        }

        public Criteria andProfitYesGreaterThan(BigDecimal value) {
            addCriterion("profit_yes >", value, "profitYes");
            return (Criteria) this;
        }

        public Criteria andProfitYesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_yes >=", value, "profitYes");
            return (Criteria) this;
        }

        public Criteria andProfitYesLessThan(BigDecimal value) {
            addCriterion("profit_yes <", value, "profitYes");
            return (Criteria) this;
        }

        public Criteria andProfitYesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_yes <=", value, "profitYes");
            return (Criteria) this;
        }

        public Criteria andProfitYesIn(List<BigDecimal> values) {
            addCriterion("profit_yes in", values, "profitYes");
            return (Criteria) this;
        }

        public Criteria andProfitYesNotIn(List<BigDecimal> values) {
            addCriterion("profit_yes not in", values, "profitYes");
            return (Criteria) this;
        }

        public Criteria andProfitYesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_yes between", value1, value2, "profitYes");
            return (Criteria) this;
        }

        public Criteria andProfitYesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_yes not between", value1, value2, "profitYes");
            return (Criteria) this;
        }

        public Criteria andProfitBeforeIsNull() {
            addCriterion("profit_before is null");
            return (Criteria) this;
        }

        public Criteria andProfitBeforeIsNotNull() {
            addCriterion("profit_before is not null");
            return (Criteria) this;
        }

        public Criteria andProfitBeforeEqualTo(BigDecimal value) {
            addCriterion("profit_before =", value, "profitBefore");
            return (Criteria) this;
        }

        public Criteria andProfitBeforeNotEqualTo(BigDecimal value) {
            addCriterion("profit_before <>", value, "profitBefore");
            return (Criteria) this;
        }

        public Criteria andProfitBeforeGreaterThan(BigDecimal value) {
            addCriterion("profit_before >", value, "profitBefore");
            return (Criteria) this;
        }

        public Criteria andProfitBeforeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_before >=", value, "profitBefore");
            return (Criteria) this;
        }

        public Criteria andProfitBeforeLessThan(BigDecimal value) {
            addCriterion("profit_before <", value, "profitBefore");
            return (Criteria) this;
        }

        public Criteria andProfitBeforeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_before <=", value, "profitBefore");
            return (Criteria) this;
        }

        public Criteria andProfitBeforeIn(List<BigDecimal> values) {
            addCriterion("profit_before in", values, "profitBefore");
            return (Criteria) this;
        }

        public Criteria andProfitBeforeNotIn(List<BigDecimal> values) {
            addCriterion("profit_before not in", values, "profitBefore");
            return (Criteria) this;
        }

        public Criteria andProfitBeforeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_before between", value1, value2, "profitBefore");
            return (Criteria) this;
        }

        public Criteria andProfitBeforeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_before not between", value1, value2, "profitBefore");
            return (Criteria) this;
        }

        public Criteria andProfitAfterIsNull() {
            addCriterion("profit_after is null");
            return (Criteria) this;
        }

        public Criteria andProfitAfterIsNotNull() {
            addCriterion("profit_after is not null");
            return (Criteria) this;
        }

        public Criteria andProfitAfterEqualTo(BigDecimal value) {
            addCriterion("profit_after =", value, "profitAfter");
            return (Criteria) this;
        }

        public Criteria andProfitAfterNotEqualTo(BigDecimal value) {
            addCriterion("profit_after <>", value, "profitAfter");
            return (Criteria) this;
        }

        public Criteria andProfitAfterGreaterThan(BigDecimal value) {
            addCriterion("profit_after >", value, "profitAfter");
            return (Criteria) this;
        }

        public Criteria andProfitAfterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_after >=", value, "profitAfter");
            return (Criteria) this;
        }

        public Criteria andProfitAfterLessThan(BigDecimal value) {
            addCriterion("profit_after <", value, "profitAfter");
            return (Criteria) this;
        }

        public Criteria andProfitAfterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_after <=", value, "profitAfter");
            return (Criteria) this;
        }

        public Criteria andProfitAfterIn(List<BigDecimal> values) {
            addCriterion("profit_after in", values, "profitAfter");
            return (Criteria) this;
        }

        public Criteria andProfitAfterNotIn(List<BigDecimal> values) {
            addCriterion("profit_after not in", values, "profitAfter");
            return (Criteria) this;
        }

        public Criteria andProfitAfterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_after between", value1, value2, "profitAfter");
            return (Criteria) this;
        }

        public Criteria andProfitAfterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_after not between", value1, value2, "profitAfter");
            return (Criteria) this;
        }

        public Criteria andDemandAmountYesIsNull() {
            addCriterion("demand_amount_yes is null");
            return (Criteria) this;
        }

        public Criteria andDemandAmountYesIsNotNull() {
            addCriterion("demand_amount_yes is not null");
            return (Criteria) this;
        }

        public Criteria andDemandAmountYesEqualTo(BigDecimal value) {
            addCriterion("demand_amount_yes =", value, "demandAmountYes");
            return (Criteria) this;
        }

        public Criteria andDemandAmountYesNotEqualTo(BigDecimal value) {
            addCriterion("demand_amount_yes <>", value, "demandAmountYes");
            return (Criteria) this;
        }

        public Criteria andDemandAmountYesGreaterThan(BigDecimal value) {
            addCriterion("demand_amount_yes >", value, "demandAmountYes");
            return (Criteria) this;
        }

        public Criteria andDemandAmountYesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("demand_amount_yes >=", value, "demandAmountYes");
            return (Criteria) this;
        }

        public Criteria andDemandAmountYesLessThan(BigDecimal value) {
            addCriterion("demand_amount_yes <", value, "demandAmountYes");
            return (Criteria) this;
        }

        public Criteria andDemandAmountYesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("demand_amount_yes <=", value, "demandAmountYes");
            return (Criteria) this;
        }

        public Criteria andDemandAmountYesIn(List<BigDecimal> values) {
            addCriterion("demand_amount_yes in", values, "demandAmountYes");
            return (Criteria) this;
        }

        public Criteria andDemandAmountYesNotIn(List<BigDecimal> values) {
            addCriterion("demand_amount_yes not in", values, "demandAmountYes");
            return (Criteria) this;
        }

        public Criteria andDemandAmountYesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("demand_amount_yes between", value1, value2, "demandAmountYes");
            return (Criteria) this;
        }

        public Criteria andDemandAmountYesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("demand_amount_yes not between", value1, value2, "demandAmountYes");
            return (Criteria) this;
        }

        public Criteria andDemandAmountBeforeIsNull() {
            addCriterion("demand_amount_before is null");
            return (Criteria) this;
        }

        public Criteria andDemandAmountBeforeIsNotNull() {
            addCriterion("demand_amount_before is not null");
            return (Criteria) this;
        }

        public Criteria andDemandAmountBeforeEqualTo(BigDecimal value) {
            addCriterion("demand_amount_before =", value, "demandAmountBefore");
            return (Criteria) this;
        }

        public Criteria andDemandAmountBeforeNotEqualTo(BigDecimal value) {
            addCriterion("demand_amount_before <>", value, "demandAmountBefore");
            return (Criteria) this;
        }

        public Criteria andDemandAmountBeforeGreaterThan(BigDecimal value) {
            addCriterion("demand_amount_before >", value, "demandAmountBefore");
            return (Criteria) this;
        }

        public Criteria andDemandAmountBeforeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("demand_amount_before >=", value, "demandAmountBefore");
            return (Criteria) this;
        }

        public Criteria andDemandAmountBeforeLessThan(BigDecimal value) {
            addCriterion("demand_amount_before <", value, "demandAmountBefore");
            return (Criteria) this;
        }

        public Criteria andDemandAmountBeforeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("demand_amount_before <=", value, "demandAmountBefore");
            return (Criteria) this;
        }

        public Criteria andDemandAmountBeforeIn(List<BigDecimal> values) {
            addCriterion("demand_amount_before in", values, "demandAmountBefore");
            return (Criteria) this;
        }

        public Criteria andDemandAmountBeforeNotIn(List<BigDecimal> values) {
            addCriterion("demand_amount_before not in", values, "demandAmountBefore");
            return (Criteria) this;
        }

        public Criteria andDemandAmountBeforeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("demand_amount_before between", value1, value2, "demandAmountBefore");
            return (Criteria) this;
        }

        public Criteria andDemandAmountBeforeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("demand_amount_before not between", value1, value2, "demandAmountBefore");
            return (Criteria) this;
        }

        public Criteria andDemandAmountAfterIsNull() {
            addCriterion("demand_amount_after is null");
            return (Criteria) this;
        }

        public Criteria andDemandAmountAfterIsNotNull() {
            addCriterion("demand_amount_after is not null");
            return (Criteria) this;
        }

        public Criteria andDemandAmountAfterEqualTo(BigDecimal value) {
            addCriterion("demand_amount_after =", value, "demandAmountAfter");
            return (Criteria) this;
        }

        public Criteria andDemandAmountAfterNotEqualTo(BigDecimal value) {
            addCriterion("demand_amount_after <>", value, "demandAmountAfter");
            return (Criteria) this;
        }

        public Criteria andDemandAmountAfterGreaterThan(BigDecimal value) {
            addCriterion("demand_amount_after >", value, "demandAmountAfter");
            return (Criteria) this;
        }

        public Criteria andDemandAmountAfterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("demand_amount_after >=", value, "demandAmountAfter");
            return (Criteria) this;
        }

        public Criteria andDemandAmountAfterLessThan(BigDecimal value) {
            addCriterion("demand_amount_after <", value, "demandAmountAfter");
            return (Criteria) this;
        }

        public Criteria andDemandAmountAfterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("demand_amount_after <=", value, "demandAmountAfter");
            return (Criteria) this;
        }

        public Criteria andDemandAmountAfterIn(List<BigDecimal> values) {
            addCriterion("demand_amount_after in", values, "demandAmountAfter");
            return (Criteria) this;
        }

        public Criteria andDemandAmountAfterNotIn(List<BigDecimal> values) {
            addCriterion("demand_amount_after not in", values, "demandAmountAfter");
            return (Criteria) this;
        }

        public Criteria andDemandAmountAfterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("demand_amount_after between", value1, value2, "demandAmountAfter");
            return (Criteria) this;
        }

        public Criteria andDemandAmountAfterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("demand_amount_after not between", value1, value2, "demandAmountAfter");
            return (Criteria) this;
        }

        public Criteria andInterestAmountYesIsNull() {
            addCriterion("interest_amount_yes is null");
            return (Criteria) this;
        }

        public Criteria andInterestAmountYesIsNotNull() {
            addCriterion("interest_amount_yes is not null");
            return (Criteria) this;
        }

        public Criteria andInterestAmountYesEqualTo(BigDecimal value) {
            addCriterion("interest_amount_yes =", value, "interestAmountYes");
            return (Criteria) this;
        }

        public Criteria andInterestAmountYesNotEqualTo(BigDecimal value) {
            addCriterion("interest_amount_yes <>", value, "interestAmountYes");
            return (Criteria) this;
        }

        public Criteria andInterestAmountYesGreaterThan(BigDecimal value) {
            addCriterion("interest_amount_yes >", value, "interestAmountYes");
            return (Criteria) this;
        }

        public Criteria andInterestAmountYesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_amount_yes >=", value, "interestAmountYes");
            return (Criteria) this;
        }

        public Criteria andInterestAmountYesLessThan(BigDecimal value) {
            addCriterion("interest_amount_yes <", value, "interestAmountYes");
            return (Criteria) this;
        }

        public Criteria andInterestAmountYesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_amount_yes <=", value, "interestAmountYes");
            return (Criteria) this;
        }

        public Criteria andInterestAmountYesIn(List<BigDecimal> values) {
            addCriterion("interest_amount_yes in", values, "interestAmountYes");
            return (Criteria) this;
        }

        public Criteria andInterestAmountYesNotIn(List<BigDecimal> values) {
            addCriterion("interest_amount_yes not in", values, "interestAmountYes");
            return (Criteria) this;
        }

        public Criteria andInterestAmountYesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_amount_yes between", value1, value2, "interestAmountYes");
            return (Criteria) this;
        }

        public Criteria andInterestAmountYesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_amount_yes not between", value1, value2, "interestAmountYes");
            return (Criteria) this;
        }

        public Criteria andInterestAmountBeforeIsNull() {
            addCriterion("interest_amount_before is null");
            return (Criteria) this;
        }

        public Criteria andInterestAmountBeforeIsNotNull() {
            addCriterion("interest_amount_before is not null");
            return (Criteria) this;
        }

        public Criteria andInterestAmountBeforeEqualTo(BigDecimal value) {
            addCriterion("interest_amount_before =", value, "interestAmountBefore");
            return (Criteria) this;
        }

        public Criteria andInterestAmountBeforeNotEqualTo(BigDecimal value) {
            addCriterion("interest_amount_before <>", value, "interestAmountBefore");
            return (Criteria) this;
        }

        public Criteria andInterestAmountBeforeGreaterThan(BigDecimal value) {
            addCriterion("interest_amount_before >", value, "interestAmountBefore");
            return (Criteria) this;
        }

        public Criteria andInterestAmountBeforeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_amount_before >=", value, "interestAmountBefore");
            return (Criteria) this;
        }

        public Criteria andInterestAmountBeforeLessThan(BigDecimal value) {
            addCriterion("interest_amount_before <", value, "interestAmountBefore");
            return (Criteria) this;
        }

        public Criteria andInterestAmountBeforeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_amount_before <=", value, "interestAmountBefore");
            return (Criteria) this;
        }

        public Criteria andInterestAmountBeforeIn(List<BigDecimal> values) {
            addCriterion("interest_amount_before in", values, "interestAmountBefore");
            return (Criteria) this;
        }

        public Criteria andInterestAmountBeforeNotIn(List<BigDecimal> values) {
            addCriterion("interest_amount_before not in", values, "interestAmountBefore");
            return (Criteria) this;
        }

        public Criteria andInterestAmountBeforeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_amount_before between", value1, value2, "interestAmountBefore");
            return (Criteria) this;
        }

        public Criteria andInterestAmountBeforeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_amount_before not between", value1, value2, "interestAmountBefore");
            return (Criteria) this;
        }

        public Criteria andInterestAmountAfterIsNull() {
            addCriterion("interest_amount_after is null");
            return (Criteria) this;
        }

        public Criteria andInterestAmountAfterIsNotNull() {
            addCriterion("interest_amount_after is not null");
            return (Criteria) this;
        }

        public Criteria andInterestAmountAfterEqualTo(BigDecimal value) {
            addCriterion("interest_amount_after =", value, "interestAmountAfter");
            return (Criteria) this;
        }

        public Criteria andInterestAmountAfterNotEqualTo(BigDecimal value) {
            addCriterion("interest_amount_after <>", value, "interestAmountAfter");
            return (Criteria) this;
        }

        public Criteria andInterestAmountAfterGreaterThan(BigDecimal value) {
            addCriterion("interest_amount_after >", value, "interestAmountAfter");
            return (Criteria) this;
        }

        public Criteria andInterestAmountAfterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_amount_after >=", value, "interestAmountAfter");
            return (Criteria) this;
        }

        public Criteria andInterestAmountAfterLessThan(BigDecimal value) {
            addCriterion("interest_amount_after <", value, "interestAmountAfter");
            return (Criteria) this;
        }

        public Criteria andInterestAmountAfterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_amount_after <=", value, "interestAmountAfter");
            return (Criteria) this;
        }

        public Criteria andInterestAmountAfterIn(List<BigDecimal> values) {
            addCriterion("interest_amount_after in", values, "interestAmountAfter");
            return (Criteria) this;
        }

        public Criteria andInterestAmountAfterNotIn(List<BigDecimal> values) {
            addCriterion("interest_amount_after not in", values, "interestAmountAfter");
            return (Criteria) this;
        }

        public Criteria andInterestAmountAfterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_amount_after between", value1, value2, "interestAmountAfter");
            return (Criteria) this;
        }

        public Criteria andInterestAmountAfterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_amount_after not between", value1, value2, "interestAmountAfter");
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