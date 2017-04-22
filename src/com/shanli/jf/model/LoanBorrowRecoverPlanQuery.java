package com.shanli.jf.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LoanBorrowRecoverPlanQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public LoanBorrowRecoverPlanQuery() {
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

        public Criteria andPrincipalReceveWaitIsNull() {
            addCriterion("principal_receve_wait is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalReceveWaitIsNotNull() {
            addCriterion("principal_receve_wait is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalReceveWaitEqualTo(BigDecimal value) {
            addCriterion("principal_receve_wait =", value, "principalReceveWait");
            return (Criteria) this;
        }

        public Criteria andPrincipalReceveWaitNotEqualTo(BigDecimal value) {
            addCriterion("principal_receve_wait <>", value, "principalReceveWait");
            return (Criteria) this;
        }

        public Criteria andPrincipalReceveWaitGreaterThan(BigDecimal value) {
            addCriterion("principal_receve_wait >", value, "principalReceveWait");
            return (Criteria) this;
        }

        public Criteria andPrincipalReceveWaitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("principal_receve_wait >=", value, "principalReceveWait");
            return (Criteria) this;
        }

        public Criteria andPrincipalReceveWaitLessThan(BigDecimal value) {
            addCriterion("principal_receve_wait <", value, "principalReceveWait");
            return (Criteria) this;
        }

        public Criteria andPrincipalReceveWaitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("principal_receve_wait <=", value, "principalReceveWait");
            return (Criteria) this;
        }

        public Criteria andPrincipalReceveWaitIn(List<BigDecimal> values) {
            addCriterion("principal_receve_wait in", values, "principalReceveWait");
            return (Criteria) this;
        }

        public Criteria andPrincipalReceveWaitNotIn(List<BigDecimal> values) {
            addCriterion("principal_receve_wait not in", values, "principalReceveWait");
            return (Criteria) this;
        }

        public Criteria andPrincipalReceveWaitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("principal_receve_wait between", value1, value2, "principalReceveWait");
            return (Criteria) this;
        }

        public Criteria andPrincipalReceveWaitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("principal_receve_wait not between", value1, value2, "principalReceveWait");
            return (Criteria) this;
        }

        public Criteria andInterestReceiveWaitIsNull() {
            addCriterion("interest_receive_wait is null");
            return (Criteria) this;
        }

        public Criteria andInterestReceiveWaitIsNotNull() {
            addCriterion("interest_receive_wait is not null");
            return (Criteria) this;
        }

        public Criteria andInterestReceiveWaitEqualTo(BigDecimal value) {
            addCriterion("interest_receive_wait =", value, "interestReceiveWait");
            return (Criteria) this;
        }

        public Criteria andInterestReceiveWaitNotEqualTo(BigDecimal value) {
            addCriterion("interest_receive_wait <>", value, "interestReceiveWait");
            return (Criteria) this;
        }

        public Criteria andInterestReceiveWaitGreaterThan(BigDecimal value) {
            addCriterion("interest_receive_wait >", value, "interestReceiveWait");
            return (Criteria) this;
        }

        public Criteria andInterestReceiveWaitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_receive_wait >=", value, "interestReceiveWait");
            return (Criteria) this;
        }

        public Criteria andInterestReceiveWaitLessThan(BigDecimal value) {
            addCriterion("interest_receive_wait <", value, "interestReceiveWait");
            return (Criteria) this;
        }

        public Criteria andInterestReceiveWaitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_receive_wait <=", value, "interestReceiveWait");
            return (Criteria) this;
        }

        public Criteria andInterestReceiveWaitIn(List<BigDecimal> values) {
            addCriterion("interest_receive_wait in", values, "interestReceiveWait");
            return (Criteria) this;
        }

        public Criteria andInterestReceiveWaitNotIn(List<BigDecimal> values) {
            addCriterion("interest_receive_wait not in", values, "interestReceiveWait");
            return (Criteria) this;
        }

        public Criteria andInterestReceiveWaitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_receive_wait between", value1, value2, "interestReceiveWait");
            return (Criteria) this;
        }

        public Criteria andInterestReceiveWaitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_receive_wait not between", value1, value2, "interestReceiveWait");
            return (Criteria) this;
        }

        public Criteria andReceiveCapitalWaitIsNull() {
            addCriterion("receive_capital_wait is null");
            return (Criteria) this;
        }

        public Criteria andReceiveCapitalWaitIsNotNull() {
            addCriterion("receive_capital_wait is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveCapitalWaitEqualTo(BigDecimal value) {
            addCriterion("receive_capital_wait =", value, "receiveCapitalWait");
            return (Criteria) this;
        }

        public Criteria andReceiveCapitalWaitNotEqualTo(BigDecimal value) {
            addCriterion("receive_capital_wait <>", value, "receiveCapitalWait");
            return (Criteria) this;
        }

        public Criteria andReceiveCapitalWaitGreaterThan(BigDecimal value) {
            addCriterion("receive_capital_wait >", value, "receiveCapitalWait");
            return (Criteria) this;
        }

        public Criteria andReceiveCapitalWaitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("receive_capital_wait >=", value, "receiveCapitalWait");
            return (Criteria) this;
        }

        public Criteria andReceiveCapitalWaitLessThan(BigDecimal value) {
            addCriterion("receive_capital_wait <", value, "receiveCapitalWait");
            return (Criteria) this;
        }

        public Criteria andReceiveCapitalWaitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("receive_capital_wait <=", value, "receiveCapitalWait");
            return (Criteria) this;
        }

        public Criteria andReceiveCapitalWaitIn(List<BigDecimal> values) {
            addCriterion("receive_capital_wait in", values, "receiveCapitalWait");
            return (Criteria) this;
        }

        public Criteria andReceiveCapitalWaitNotIn(List<BigDecimal> values) {
            addCriterion("receive_capital_wait not in", values, "receiveCapitalWait");
            return (Criteria) this;
        }

        public Criteria andReceiveCapitalWaitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receive_capital_wait between", value1, value2, "receiveCapitalWait");
            return (Criteria) this;
        }

        public Criteria andReceiveCapitalWaitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receive_capital_wait not between", value1, value2, "receiveCapitalWait");
            return (Criteria) this;
        }

        public Criteria andRemainCapitalIsNull() {
            addCriterion("remain_capital is null");
            return (Criteria) this;
        }

        public Criteria andRemainCapitalIsNotNull() {
            addCriterion("remain_capital is not null");
            return (Criteria) this;
        }

        public Criteria andRemainCapitalEqualTo(BigDecimal value) {
            addCriterion("remain_capital =", value, "remainCapital");
            return (Criteria) this;
        }

        public Criteria andRemainCapitalNotEqualTo(BigDecimal value) {
            addCriterion("remain_capital <>", value, "remainCapital");
            return (Criteria) this;
        }

        public Criteria andRemainCapitalGreaterThan(BigDecimal value) {
            addCriterion("remain_capital >", value, "remainCapital");
            return (Criteria) this;
        }

        public Criteria andRemainCapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("remain_capital >=", value, "remainCapital");
            return (Criteria) this;
        }

        public Criteria andRemainCapitalLessThan(BigDecimal value) {
            addCriterion("remain_capital <", value, "remainCapital");
            return (Criteria) this;
        }

        public Criteria andRemainCapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("remain_capital <=", value, "remainCapital");
            return (Criteria) this;
        }

        public Criteria andRemainCapitalIn(List<BigDecimal> values) {
            addCriterion("remain_capital in", values, "remainCapital");
            return (Criteria) this;
        }

        public Criteria andRemainCapitalNotIn(List<BigDecimal> values) {
            addCriterion("remain_capital not in", values, "remainCapital");
            return (Criteria) this;
        }

        public Criteria andRemainCapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remain_capital between", value1, value2, "remainCapital");
            return (Criteria) this;
        }

        public Criteria andRemainCapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remain_capital not between", value1, value2, "remainCapital");
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

        public Criteria andBorrowLoanIdIsNull() {
            addCriterion("borrow_loan_id is null");
            return (Criteria) this;
        }

        public Criteria andBorrowLoanIdIsNotNull() {
            addCriterion("borrow_loan_id is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowLoanIdEqualTo(Integer value) {
            addCriterion("borrow_loan_id =", value, "borrowLoanId");
            return (Criteria) this;
        }

        public Criteria andBorrowLoanIdNotEqualTo(Integer value) {
            addCriterion("borrow_loan_id <>", value, "borrowLoanId");
            return (Criteria) this;
        }

        public Criteria andBorrowLoanIdGreaterThan(Integer value) {
            addCriterion("borrow_loan_id >", value, "borrowLoanId");
            return (Criteria) this;
        }

        public Criteria andBorrowLoanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_loan_id >=", value, "borrowLoanId");
            return (Criteria) this;
        }

        public Criteria andBorrowLoanIdLessThan(Integer value) {
            addCriterion("borrow_loan_id <", value, "borrowLoanId");
            return (Criteria) this;
        }

        public Criteria andBorrowLoanIdLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_loan_id <=", value, "borrowLoanId");
            return (Criteria) this;
        }

        public Criteria andBorrowLoanIdIn(List<Integer> values) {
            addCriterion("borrow_loan_id in", values, "borrowLoanId");
            return (Criteria) this;
        }

        public Criteria andBorrowLoanIdNotIn(List<Integer> values) {
            addCriterion("borrow_loan_id not in", values, "borrowLoanId");
            return (Criteria) this;
        }

        public Criteria andBorrowLoanIdBetween(Integer value1, Integer value2) {
            addCriterion("borrow_loan_id between", value1, value2, "borrowLoanId");
            return (Criteria) this;
        }

        public Criteria andBorrowLoanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_loan_id not between", value1, value2, "borrowLoanId");
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

        public Criteria andRemainInterestIsNull() {
            addCriterion("remain_interest is null");
            return (Criteria) this;
        }

        public Criteria andRemainInterestIsNotNull() {
            addCriterion("remain_interest is not null");
            return (Criteria) this;
        }

        public Criteria andRemainInterestEqualTo(BigDecimal value) {
            addCriterion("remain_interest =", value, "remainInterest");
            return (Criteria) this;
        }

        public Criteria andRemainInterestNotEqualTo(BigDecimal value) {
            addCriterion("remain_interest <>", value, "remainInterest");
            return (Criteria) this;
        }

        public Criteria andRemainInterestGreaterThan(BigDecimal value) {
            addCriterion("remain_interest >", value, "remainInterest");
            return (Criteria) this;
        }

        public Criteria andRemainInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("remain_interest >=", value, "remainInterest");
            return (Criteria) this;
        }

        public Criteria andRemainInterestLessThan(BigDecimal value) {
            addCriterion("remain_interest <", value, "remainInterest");
            return (Criteria) this;
        }

        public Criteria andRemainInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("remain_interest <=", value, "remainInterest");
            return (Criteria) this;
        }

        public Criteria andRemainInterestIn(List<BigDecimal> values) {
            addCriterion("remain_interest in", values, "remainInterest");
            return (Criteria) this;
        }

        public Criteria andRemainInterestNotIn(List<BigDecimal> values) {
            addCriterion("remain_interest not in", values, "remainInterest");
            return (Criteria) this;
        }

        public Criteria andRemainInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remain_interest between", value1, value2, "remainInterest");
            return (Criteria) this;
        }

        public Criteria andRemainInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remain_interest not between", value1, value2, "remainInterest");
            return (Criteria) this;
        }

        public Criteria andRemainCountAllIsNull() {
            addCriterion("remain_count_all is null");
            return (Criteria) this;
        }

        public Criteria andRemainCountAllIsNotNull() {
            addCriterion("remain_count_all is not null");
            return (Criteria) this;
        }

        public Criteria andRemainCountAllEqualTo(BigDecimal value) {
            addCriterion("remain_count_all =", value, "remainCountAll");
            return (Criteria) this;
        }

        public Criteria andRemainCountAllNotEqualTo(BigDecimal value) {
            addCriterion("remain_count_all <>", value, "remainCountAll");
            return (Criteria) this;
        }

        public Criteria andRemainCountAllGreaterThan(BigDecimal value) {
            addCriterion("remain_count_all >", value, "remainCountAll");
            return (Criteria) this;
        }

        public Criteria andRemainCountAllGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("remain_count_all >=", value, "remainCountAll");
            return (Criteria) this;
        }

        public Criteria andRemainCountAllLessThan(BigDecimal value) {
            addCriterion("remain_count_all <", value, "remainCountAll");
            return (Criteria) this;
        }

        public Criteria andRemainCountAllLessThanOrEqualTo(BigDecimal value) {
            addCriterion("remain_count_all <=", value, "remainCountAll");
            return (Criteria) this;
        }

        public Criteria andRemainCountAllIn(List<BigDecimal> values) {
            addCriterion("remain_count_all in", values, "remainCountAll");
            return (Criteria) this;
        }

        public Criteria andRemainCountAllNotIn(List<BigDecimal> values) {
            addCriterion("remain_count_all not in", values, "remainCountAll");
            return (Criteria) this;
        }

        public Criteria andRemainCountAllBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remain_count_all between", value1, value2, "remainCountAll");
            return (Criteria) this;
        }

        public Criteria andRemainCountAllNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remain_count_all not between", value1, value2, "remainCountAll");
            return (Criteria) this;
        }

        public Criteria andReceveInterestYesIsNull() {
            addCriterion("receve_interest_yes is null");
            return (Criteria) this;
        }

        public Criteria andReceveInterestYesIsNotNull() {
            addCriterion("receve_interest_yes is not null");
            return (Criteria) this;
        }

        public Criteria andReceveInterestYesEqualTo(BigDecimal value) {
            addCriterion("receve_interest_yes =", value, "receveInterestYes");
            return (Criteria) this;
        }

        public Criteria andReceveInterestYesNotEqualTo(BigDecimal value) {
            addCriterion("receve_interest_yes <>", value, "receveInterestYes");
            return (Criteria) this;
        }

        public Criteria andReceveInterestYesGreaterThan(BigDecimal value) {
            addCriterion("receve_interest_yes >", value, "receveInterestYes");
            return (Criteria) this;
        }

        public Criteria andReceveInterestYesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("receve_interest_yes >=", value, "receveInterestYes");
            return (Criteria) this;
        }

        public Criteria andReceveInterestYesLessThan(BigDecimal value) {
            addCriterion("receve_interest_yes <", value, "receveInterestYes");
            return (Criteria) this;
        }

        public Criteria andReceveInterestYesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("receve_interest_yes <=", value, "receveInterestYes");
            return (Criteria) this;
        }

        public Criteria andReceveInterestYesIn(List<BigDecimal> values) {
            addCriterion("receve_interest_yes in", values, "receveInterestYes");
            return (Criteria) this;
        }

        public Criteria andReceveInterestYesNotIn(List<BigDecimal> values) {
            addCriterion("receve_interest_yes not in", values, "receveInterestYes");
            return (Criteria) this;
        }

        public Criteria andReceveInterestYesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receve_interest_yes between", value1, value2, "receveInterestYes");
            return (Criteria) this;
        }

        public Criteria andReceveInterestYesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receve_interest_yes not between", value1, value2, "receveInterestYes");
            return (Criteria) this;
        }

        public Criteria andReceveCaptialYesIsNull() {
            addCriterion("receve_captial_yes is null");
            return (Criteria) this;
        }

        public Criteria andReceveCaptialYesIsNotNull() {
            addCriterion("receve_captial_yes is not null");
            return (Criteria) this;
        }

        public Criteria andReceveCaptialYesEqualTo(BigDecimal value) {
            addCriterion("receve_captial_yes =", value, "receveCaptialYes");
            return (Criteria) this;
        }

        public Criteria andReceveCaptialYesNotEqualTo(BigDecimal value) {
            addCriterion("receve_captial_yes <>", value, "receveCaptialYes");
            return (Criteria) this;
        }

        public Criteria andReceveCaptialYesGreaterThan(BigDecimal value) {
            addCriterion("receve_captial_yes >", value, "receveCaptialYes");
            return (Criteria) this;
        }

        public Criteria andReceveCaptialYesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("receve_captial_yes >=", value, "receveCaptialYes");
            return (Criteria) this;
        }

        public Criteria andReceveCaptialYesLessThan(BigDecimal value) {
            addCriterion("receve_captial_yes <", value, "receveCaptialYes");
            return (Criteria) this;
        }

        public Criteria andReceveCaptialYesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("receve_captial_yes <=", value, "receveCaptialYes");
            return (Criteria) this;
        }

        public Criteria andReceveCaptialYesIn(List<BigDecimal> values) {
            addCriterion("receve_captial_yes in", values, "receveCaptialYes");
            return (Criteria) this;
        }

        public Criteria andReceveCaptialYesNotIn(List<BigDecimal> values) {
            addCriterion("receve_captial_yes not in", values, "receveCaptialYes");
            return (Criteria) this;
        }

        public Criteria andReceveCaptialYesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receve_captial_yes between", value1, value2, "receveCaptialYes");
            return (Criteria) this;
        }

        public Criteria andReceveCaptialYesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receve_captial_yes not between", value1, value2, "receveCaptialYes");
            return (Criteria) this;
        }

        public Criteria andReceveAmountYesIsNull() {
            addCriterion("receve_amount_yes is null");
            return (Criteria) this;
        }

        public Criteria andReceveAmountYesIsNotNull() {
            addCriterion("receve_amount_yes is not null");
            return (Criteria) this;
        }

        public Criteria andReceveAmountYesEqualTo(BigDecimal value) {
            addCriterion("receve_amount_yes =", value, "receveAmountYes");
            return (Criteria) this;
        }

        public Criteria andReceveAmountYesNotEqualTo(BigDecimal value) {
            addCriterion("receve_amount_yes <>", value, "receveAmountYes");
            return (Criteria) this;
        }

        public Criteria andReceveAmountYesGreaterThan(BigDecimal value) {
            addCriterion("receve_amount_yes >", value, "receveAmountYes");
            return (Criteria) this;
        }

        public Criteria andReceveAmountYesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("receve_amount_yes >=", value, "receveAmountYes");
            return (Criteria) this;
        }

        public Criteria andReceveAmountYesLessThan(BigDecimal value) {
            addCriterion("receve_amount_yes <", value, "receveAmountYes");
            return (Criteria) this;
        }

        public Criteria andReceveAmountYesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("receve_amount_yes <=", value, "receveAmountYes");
            return (Criteria) this;
        }

        public Criteria andReceveAmountYesIn(List<BigDecimal> values) {
            addCriterion("receve_amount_yes in", values, "receveAmountYes");
            return (Criteria) this;
        }

        public Criteria andReceveAmountYesNotIn(List<BigDecimal> values) {
            addCriterion("receve_amount_yes not in", values, "receveAmountYes");
            return (Criteria) this;
        }

        public Criteria andReceveAmountYesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receve_amount_yes between", value1, value2, "receveAmountYes");
            return (Criteria) this;
        }

        public Criteria andReceveAmountYesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receve_amount_yes not between", value1, value2, "receveAmountYes");
            return (Criteria) this;
        }

        public Criteria andRecoverTimeIsNull() {
            addCriterion("recover_time is null");
            return (Criteria) this;
        }

        public Criteria andRecoverTimeIsNotNull() {
            addCriterion("recover_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecoverTimeEqualTo(Date value) {
            addCriterionForJDBCDate("recover_time =", value, "recoverTime");
            return (Criteria) this;
        }

        public Criteria andRecoverTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("recover_time <>", value, "recoverTime");
            return (Criteria) this;
        }

        public Criteria andRecoverTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("recover_time >", value, "recoverTime");
            return (Criteria) this;
        }

        public Criteria andRecoverTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("recover_time >=", value, "recoverTime");
            return (Criteria) this;
        }

        public Criteria andRecoverTimeLessThan(Date value) {
            addCriterionForJDBCDate("recover_time <", value, "recoverTime");
            return (Criteria) this;
        }

        public Criteria andRecoverTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("recover_time <=", value, "recoverTime");
            return (Criteria) this;
        }

        public Criteria andRecoverTimeIn(List<Date> values) {
            addCriterionForJDBCDate("recover_time in", values, "recoverTime");
            return (Criteria) this;
        }

        public Criteria andRecoverTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("recover_time not in", values, "recoverTime");
            return (Criteria) this;
        }

        public Criteria andRecoverTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("recover_time between", value1, value2, "recoverTime");
            return (Criteria) this;
        }

        public Criteria andRecoverTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("recover_time not between", value1, value2, "recoverTime");
            return (Criteria) this;
        }

        public Criteria andActualRecoverTimeIsNull() {
            addCriterion("actual_recover_time is null");
            return (Criteria) this;
        }

        public Criteria andActualRecoverTimeIsNotNull() {
            addCriterion("actual_recover_time is not null");
            return (Criteria) this;
        }

        public Criteria andActualRecoverTimeEqualTo(Date value) {
            addCriterionForJDBCDate("actual_recover_time =", value, "actualRecoverTime");
            return (Criteria) this;
        }

        public Criteria andActualRecoverTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("actual_recover_time <>", value, "actualRecoverTime");
            return (Criteria) this;
        }

        public Criteria andActualRecoverTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("actual_recover_time >", value, "actualRecoverTime");
            return (Criteria) this;
        }

        public Criteria andActualRecoverTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("actual_recover_time >=", value, "actualRecoverTime");
            return (Criteria) this;
        }

        public Criteria andActualRecoverTimeLessThan(Date value) {
            addCriterionForJDBCDate("actual_recover_time <", value, "actualRecoverTime");
            return (Criteria) this;
        }

        public Criteria andActualRecoverTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("actual_recover_time <=", value, "actualRecoverTime");
            return (Criteria) this;
        }

        public Criteria andActualRecoverTimeIn(List<Date> values) {
            addCriterionForJDBCDate("actual_recover_time in", values, "actualRecoverTime");
            return (Criteria) this;
        }

        public Criteria andActualRecoverTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("actual_recover_time not in", values, "actualRecoverTime");
            return (Criteria) this;
        }

        public Criteria andActualRecoverTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("actual_recover_time between", value1, value2, "actualRecoverTime");
            return (Criteria) this;
        }

        public Criteria andActualRecoverTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("actual_recover_time not between", value1, value2, "actualRecoverTime");
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