package com.shanli.jf.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoanOverdueInfoQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public LoanOverdueInfoQuery() {
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

        public Criteria andDataDateIsNull() {
            addCriterion("data_date is null");
            return (Criteria) this;
        }

        public Criteria andDataDateIsNotNull() {
            addCriterion("data_date is not null");
            return (Criteria) this;
        }

        public Criteria andDataDateEqualTo(String value) {
            addCriterion("data_date =", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateNotEqualTo(String value) {
            addCriterion("data_date <>", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateGreaterThan(String value) {
            addCriterion("data_date >", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateGreaterThanOrEqualTo(String value) {
            addCriterion("data_date >=", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateLessThan(String value) {
            addCriterion("data_date <", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateLessThanOrEqualTo(String value) {
            addCriterion("data_date <=", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateLike(String value) {
            addCriterion("data_date like", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateNotLike(String value) {
            addCriterion("data_date not like", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateIn(List<String> values) {
            addCriterion("data_date in", values, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateNotIn(List<String> values) {
            addCriterion("data_date not in", values, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateBetween(String value1, String value2) {
            addCriterion("data_date between", value1, value2, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateNotBetween(String value1, String value2) {
            addCriterion("data_date not between", value1, value2, "dataDate");
            return (Criteria) this;
        }

        public Criteria andOverdueIdIsNull() {
            addCriterion("overdue_id is null");
            return (Criteria) this;
        }

        public Criteria andOverdueIdIsNotNull() {
            addCriterion("overdue_id is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueIdEqualTo(String value) {
            addCriterion("overdue_id =", value, "overdueId");
            return (Criteria) this;
        }

        public Criteria andOverdueIdNotEqualTo(String value) {
            addCriterion("overdue_id <>", value, "overdueId");
            return (Criteria) this;
        }

        public Criteria andOverdueIdGreaterThan(String value) {
            addCriterion("overdue_id >", value, "overdueId");
            return (Criteria) this;
        }

        public Criteria andOverdueIdGreaterThanOrEqualTo(String value) {
            addCriterion("overdue_id >=", value, "overdueId");
            return (Criteria) this;
        }

        public Criteria andOverdueIdLessThan(String value) {
            addCriterion("overdue_id <", value, "overdueId");
            return (Criteria) this;
        }

        public Criteria andOverdueIdLessThanOrEqualTo(String value) {
            addCriterion("overdue_id <=", value, "overdueId");
            return (Criteria) this;
        }

        public Criteria andOverdueIdLike(String value) {
            addCriterion("overdue_id like", value, "overdueId");
            return (Criteria) this;
        }

        public Criteria andOverdueIdNotLike(String value) {
            addCriterion("overdue_id not like", value, "overdueId");
            return (Criteria) this;
        }

        public Criteria andOverdueIdIn(List<String> values) {
            addCriterion("overdue_id in", values, "overdueId");
            return (Criteria) this;
        }

        public Criteria andOverdueIdNotIn(List<String> values) {
            addCriterion("overdue_id not in", values, "overdueId");
            return (Criteria) this;
        }

        public Criteria andOverdueIdBetween(String value1, String value2) {
            addCriterion("overdue_id between", value1, value2, "overdueId");
            return (Criteria) this;
        }

        public Criteria andOverdueIdNotBetween(String value1, String value2) {
            addCriterion("overdue_id not between", value1, value2, "overdueId");
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

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("product_id not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("product_id not between", value1, value2, "productId");
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

        public Criteria andPeriodIsNull() {
            addCriterion("period is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("period is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(Integer value) {
            addCriterion("period =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(Integer value) {
            addCriterion("period <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(Integer value) {
            addCriterion("period >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("period >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(Integer value) {
            addCriterion("period <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("period <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<Integer> values) {
            addCriterion("period in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<Integer> values) {
            addCriterion("period not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(Integer value1, Integer value2) {
            addCriterion("period between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("period not between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andBorrowRecoverIdIsNull() {
            addCriterion("borrow_recover_id is null");
            return (Criteria) this;
        }

        public Criteria andBorrowRecoverIdIsNotNull() {
            addCriterion("borrow_recover_id is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowRecoverIdEqualTo(Integer value) {
            addCriterion("borrow_recover_id =", value, "borrowRecoverId");
            return (Criteria) this;
        }

        public Criteria andBorrowRecoverIdNotEqualTo(Integer value) {
            addCriterion("borrow_recover_id <>", value, "borrowRecoverId");
            return (Criteria) this;
        }

        public Criteria andBorrowRecoverIdGreaterThan(Integer value) {
            addCriterion("borrow_recover_id >", value, "borrowRecoverId");
            return (Criteria) this;
        }

        public Criteria andBorrowRecoverIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_recover_id >=", value, "borrowRecoverId");
            return (Criteria) this;
        }

        public Criteria andBorrowRecoverIdLessThan(Integer value) {
            addCriterion("borrow_recover_id <", value, "borrowRecoverId");
            return (Criteria) this;
        }

        public Criteria andBorrowRecoverIdLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_recover_id <=", value, "borrowRecoverId");
            return (Criteria) this;
        }

        public Criteria andBorrowRecoverIdIn(List<Integer> values) {
            addCriterion("borrow_recover_id in", values, "borrowRecoverId");
            return (Criteria) this;
        }

        public Criteria andBorrowRecoverIdNotIn(List<Integer> values) {
            addCriterion("borrow_recover_id not in", values, "borrowRecoverId");
            return (Criteria) this;
        }

        public Criteria andBorrowRecoverIdBetween(Integer value1, Integer value2) {
            addCriterion("borrow_recover_id between", value1, value2, "borrowRecoverId");
            return (Criteria) this;
        }

        public Criteria andBorrowRecoverIdNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_recover_id not between", value1, value2, "borrowRecoverId");
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

        public Criteria andOverdueInterestIsNull() {
            addCriterion("overdue_interest is null");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestIsNotNull() {
            addCriterion("overdue_interest is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestEqualTo(BigDecimal value) {
            addCriterion("overdue_interest =", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestNotEqualTo(BigDecimal value) {
            addCriterion("overdue_interest <>", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestGreaterThan(BigDecimal value) {
            addCriterion("overdue_interest >", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_interest >=", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestLessThan(BigDecimal value) {
            addCriterion("overdue_interest <", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_interest <=", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestIn(List<BigDecimal> values) {
            addCriterion("overdue_interest in", values, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestNotIn(List<BigDecimal> values) {
            addCriterion("overdue_interest not in", values, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_interest between", value1, value2, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_interest not between", value1, value2, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueCaptialIsNull() {
            addCriterion("overdue_captial is null");
            return (Criteria) this;
        }

        public Criteria andOverdueCaptialIsNotNull() {
            addCriterion("overdue_captial is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueCaptialEqualTo(BigDecimal value) {
            addCriterion("overdue_captial =", value, "overdueCaptial");
            return (Criteria) this;
        }

        public Criteria andOverdueCaptialNotEqualTo(BigDecimal value) {
            addCriterion("overdue_captial <>", value, "overdueCaptial");
            return (Criteria) this;
        }

        public Criteria andOverdueCaptialGreaterThan(BigDecimal value) {
            addCriterion("overdue_captial >", value, "overdueCaptial");
            return (Criteria) this;
        }

        public Criteria andOverdueCaptialGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_captial >=", value, "overdueCaptial");
            return (Criteria) this;
        }

        public Criteria andOverdueCaptialLessThan(BigDecimal value) {
            addCriterion("overdue_captial <", value, "overdueCaptial");
            return (Criteria) this;
        }

        public Criteria andOverdueCaptialLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_captial <=", value, "overdueCaptial");
            return (Criteria) this;
        }

        public Criteria andOverdueCaptialIn(List<BigDecimal> values) {
            addCriterion("overdue_captial in", values, "overdueCaptial");
            return (Criteria) this;
        }

        public Criteria andOverdueCaptialNotIn(List<BigDecimal> values) {
            addCriterion("overdue_captial not in", values, "overdueCaptial");
            return (Criteria) this;
        }

        public Criteria andOverdueCaptialBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_captial between", value1, value2, "overdueCaptial");
            return (Criteria) this;
        }

        public Criteria andOverdueCaptialNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_captial not between", value1, value2, "overdueCaptial");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountIsNull() {
            addCriterion("overdue_amount is null");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountIsNotNull() {
            addCriterion("overdue_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountEqualTo(BigDecimal value) {
            addCriterion("overdue_amount =", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountNotEqualTo(BigDecimal value) {
            addCriterion("overdue_amount <>", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountGreaterThan(BigDecimal value) {
            addCriterion("overdue_amount >", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_amount >=", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountLessThan(BigDecimal value) {
            addCriterion("overdue_amount <", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_amount <=", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountIn(List<BigDecimal> values) {
            addCriterion("overdue_amount in", values, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountNotIn(List<BigDecimal> values) {
            addCriterion("overdue_amount not in", values, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_amount between", value1, value2, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_amount not between", value1, value2, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueSerFeeIsNull() {
            addCriterion("overdue_ser_fee is null");
            return (Criteria) this;
        }

        public Criteria andOverdueSerFeeIsNotNull() {
            addCriterion("overdue_ser_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueSerFeeEqualTo(BigDecimal value) {
            addCriterion("overdue_ser_fee =", value, "overdueSerFee");
            return (Criteria) this;
        }

        public Criteria andOverdueSerFeeNotEqualTo(BigDecimal value) {
            addCriterion("overdue_ser_fee <>", value, "overdueSerFee");
            return (Criteria) this;
        }

        public Criteria andOverdueSerFeeGreaterThan(BigDecimal value) {
            addCriterion("overdue_ser_fee >", value, "overdueSerFee");
            return (Criteria) this;
        }

        public Criteria andOverdueSerFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_ser_fee >=", value, "overdueSerFee");
            return (Criteria) this;
        }

        public Criteria andOverdueSerFeeLessThan(BigDecimal value) {
            addCriterion("overdue_ser_fee <", value, "overdueSerFee");
            return (Criteria) this;
        }

        public Criteria andOverdueSerFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_ser_fee <=", value, "overdueSerFee");
            return (Criteria) this;
        }

        public Criteria andOverdueSerFeeIn(List<BigDecimal> values) {
            addCriterion("overdue_ser_fee in", values, "overdueSerFee");
            return (Criteria) this;
        }

        public Criteria andOverdueSerFeeNotIn(List<BigDecimal> values) {
            addCriterion("overdue_ser_fee not in", values, "overdueSerFee");
            return (Criteria) this;
        }

        public Criteria andOverdueSerFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_ser_fee between", value1, value2, "overdueSerFee");
            return (Criteria) this;
        }

        public Criteria andOverdueSerFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_ser_fee not between", value1, value2, "overdueSerFee");
            return (Criteria) this;
        }

        public Criteria andOverduePerFeeIsNull() {
            addCriterion("overdue_per_fee is null");
            return (Criteria) this;
        }

        public Criteria andOverduePerFeeIsNotNull() {
            addCriterion("overdue_per_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOverduePerFeeEqualTo(BigDecimal value) {
            addCriterion("overdue_per_fee =", value, "overduePerFee");
            return (Criteria) this;
        }

        public Criteria andOverduePerFeeNotEqualTo(BigDecimal value) {
            addCriterion("overdue_per_fee <>", value, "overduePerFee");
            return (Criteria) this;
        }

        public Criteria andOverduePerFeeGreaterThan(BigDecimal value) {
            addCriterion("overdue_per_fee >", value, "overduePerFee");
            return (Criteria) this;
        }

        public Criteria andOverduePerFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_per_fee >=", value, "overduePerFee");
            return (Criteria) this;
        }

        public Criteria andOverduePerFeeLessThan(BigDecimal value) {
            addCriterion("overdue_per_fee <", value, "overduePerFee");
            return (Criteria) this;
        }

        public Criteria andOverduePerFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_per_fee <=", value, "overduePerFee");
            return (Criteria) this;
        }

        public Criteria andOverduePerFeeIn(List<BigDecimal> values) {
            addCriterion("overdue_per_fee in", values, "overduePerFee");
            return (Criteria) this;
        }

        public Criteria andOverduePerFeeNotIn(List<BigDecimal> values) {
            addCriterion("overdue_per_fee not in", values, "overduePerFee");
            return (Criteria) this;
        }

        public Criteria andOverduePerFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_per_fee between", value1, value2, "overduePerFee");
            return (Criteria) this;
        }

        public Criteria andOverduePerFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_per_fee not between", value1, value2, "overduePerFee");
            return (Criteria) this;
        }

        public Criteria andOverdueFeeIsNull() {
            addCriterion("overdue_fee is null");
            return (Criteria) this;
        }

        public Criteria andOverdueFeeIsNotNull() {
            addCriterion("overdue_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueFeeEqualTo(BigDecimal value) {
            addCriterion("overdue_fee =", value, "overdueFee");
            return (Criteria) this;
        }

        public Criteria andOverdueFeeNotEqualTo(BigDecimal value) {
            addCriterion("overdue_fee <>", value, "overdueFee");
            return (Criteria) this;
        }

        public Criteria andOverdueFeeGreaterThan(BigDecimal value) {
            addCriterion("overdue_fee >", value, "overdueFee");
            return (Criteria) this;
        }

        public Criteria andOverdueFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_fee >=", value, "overdueFee");
            return (Criteria) this;
        }

        public Criteria andOverdueFeeLessThan(BigDecimal value) {
            addCriterion("overdue_fee <", value, "overdueFee");
            return (Criteria) this;
        }

        public Criteria andOverdueFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_fee <=", value, "overdueFee");
            return (Criteria) this;
        }

        public Criteria andOverdueFeeIn(List<BigDecimal> values) {
            addCriterion("overdue_fee in", values, "overdueFee");
            return (Criteria) this;
        }

        public Criteria andOverdueFeeNotIn(List<BigDecimal> values) {
            addCriterion("overdue_fee not in", values, "overdueFee");
            return (Criteria) this;
        }

        public Criteria andOverdueFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_fee between", value1, value2, "overdueFee");
            return (Criteria) this;
        }

        public Criteria andOverdueFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_fee not between", value1, value2, "overdueFee");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountTotalIsNull() {
            addCriterion("overdue_amount_total is null");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountTotalIsNotNull() {
            addCriterion("overdue_amount_total is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountTotalEqualTo(BigDecimal value) {
            addCriterion("overdue_amount_total =", value, "overdueAmountTotal");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountTotalNotEqualTo(BigDecimal value) {
            addCriterion("overdue_amount_total <>", value, "overdueAmountTotal");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountTotalGreaterThan(BigDecimal value) {
            addCriterion("overdue_amount_total >", value, "overdueAmountTotal");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_amount_total >=", value, "overdueAmountTotal");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountTotalLessThan(BigDecimal value) {
            addCriterion("overdue_amount_total <", value, "overdueAmountTotal");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overdue_amount_total <=", value, "overdueAmountTotal");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountTotalIn(List<BigDecimal> values) {
            addCriterion("overdue_amount_total in", values, "overdueAmountTotal");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountTotalNotIn(List<BigDecimal> values) {
            addCriterion("overdue_amount_total not in", values, "overdueAmountTotal");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_amount_total between", value1, value2, "overdueAmountTotal");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdue_amount_total not between", value1, value2, "overdueAmountTotal");
            return (Criteria) this;
        }

        public Criteria andOverdueDateIsNull() {
            addCriterion("overdue_date is null");
            return (Criteria) this;
        }

        public Criteria andOverdueDateIsNotNull() {
            addCriterion("overdue_date is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueDateEqualTo(String value) {
            addCriterion("overdue_date =", value, "overdueDate");
            return (Criteria) this;
        }

        public Criteria andOverdueDateNotEqualTo(String value) {
            addCriterion("overdue_date <>", value, "overdueDate");
            return (Criteria) this;
        }

        public Criteria andOverdueDateGreaterThan(String value) {
            addCriterion("overdue_date >", value, "overdueDate");
            return (Criteria) this;
        }

        public Criteria andOverdueDateGreaterThanOrEqualTo(String value) {
            addCriterion("overdue_date >=", value, "overdueDate");
            return (Criteria) this;
        }

        public Criteria andOverdueDateLessThan(String value) {
            addCriterion("overdue_date <", value, "overdueDate");
            return (Criteria) this;
        }

        public Criteria andOverdueDateLessThanOrEqualTo(String value) {
            addCriterion("overdue_date <=", value, "overdueDate");
            return (Criteria) this;
        }

        public Criteria andOverdueDateLike(String value) {
            addCriterion("overdue_date like", value, "overdueDate");
            return (Criteria) this;
        }

        public Criteria andOverdueDateNotLike(String value) {
            addCriterion("overdue_date not like", value, "overdueDate");
            return (Criteria) this;
        }

        public Criteria andOverdueDateIn(List<String> values) {
            addCriterion("overdue_date in", values, "overdueDate");
            return (Criteria) this;
        }

        public Criteria andOverdueDateNotIn(List<String> values) {
            addCriterion("overdue_date not in", values, "overdueDate");
            return (Criteria) this;
        }

        public Criteria andOverdueDateBetween(String value1, String value2) {
            addCriterion("overdue_date between", value1, value2, "overdueDate");
            return (Criteria) this;
        }

        public Criteria andOverdueDateNotBetween(String value1, String value2) {
            addCriterion("overdue_date not between", value1, value2, "overdueDate");
            return (Criteria) this;
        }

        public Criteria andOverdueDateNumIsNull() {
            addCriterion("overdue_date_num is null");
            return (Criteria) this;
        }

        public Criteria andOverdueDateNumIsNotNull() {
            addCriterion("overdue_date_num is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueDateNumEqualTo(Integer value) {
            addCriterion("overdue_date_num =", value, "overdueDateNum");
            return (Criteria) this;
        }

        public Criteria andOverdueDateNumNotEqualTo(Integer value) {
            addCriterion("overdue_date_num <>", value, "overdueDateNum");
            return (Criteria) this;
        }

        public Criteria andOverdueDateNumGreaterThan(Integer value) {
            addCriterion("overdue_date_num >", value, "overdueDateNum");
            return (Criteria) this;
        }

        public Criteria andOverdueDateNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("overdue_date_num >=", value, "overdueDateNum");
            return (Criteria) this;
        }

        public Criteria andOverdueDateNumLessThan(Integer value) {
            addCriterion("overdue_date_num <", value, "overdueDateNum");
            return (Criteria) this;
        }

        public Criteria andOverdueDateNumLessThanOrEqualTo(Integer value) {
            addCriterion("overdue_date_num <=", value, "overdueDateNum");
            return (Criteria) this;
        }

        public Criteria andOverdueDateNumIn(List<Integer> values) {
            addCriterion("overdue_date_num in", values, "overdueDateNum");
            return (Criteria) this;
        }

        public Criteria andOverdueDateNumNotIn(List<Integer> values) {
            addCriterion("overdue_date_num not in", values, "overdueDateNum");
            return (Criteria) this;
        }

        public Criteria andOverdueDateNumBetween(Integer value1, Integer value2) {
            addCriterion("overdue_date_num between", value1, value2, "overdueDateNum");
            return (Criteria) this;
        }

        public Criteria andOverdueDateNumNotBetween(Integer value1, Integer value2) {
            addCriterion("overdue_date_num not between", value1, value2, "overdueDateNum");
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