package com.shanli.jf.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoanProductInfoQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public LoanProductInfoQuery() {
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

        public Criteria andMinBorrowAmountIsNull() {
            addCriterion("min_borrow_amount is null");
            return (Criteria) this;
        }

        public Criteria andMinBorrowAmountIsNotNull() {
            addCriterion("min_borrow_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMinBorrowAmountEqualTo(Integer value) {
            addCriterion("min_borrow_amount =", value, "minBorrowAmount");
            return (Criteria) this;
        }

        public Criteria andMinBorrowAmountNotEqualTo(Integer value) {
            addCriterion("min_borrow_amount <>", value, "minBorrowAmount");
            return (Criteria) this;
        }

        public Criteria andMinBorrowAmountGreaterThan(Integer value) {
            addCriterion("min_borrow_amount >", value, "minBorrowAmount");
            return (Criteria) this;
        }

        public Criteria andMinBorrowAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_borrow_amount >=", value, "minBorrowAmount");
            return (Criteria) this;
        }

        public Criteria andMinBorrowAmountLessThan(Integer value) {
            addCriterion("min_borrow_amount <", value, "minBorrowAmount");
            return (Criteria) this;
        }

        public Criteria andMinBorrowAmountLessThanOrEqualTo(Integer value) {
            addCriterion("min_borrow_amount <=", value, "minBorrowAmount");
            return (Criteria) this;
        }

        public Criteria andMinBorrowAmountIn(List<Integer> values) {
            addCriterion("min_borrow_amount in", values, "minBorrowAmount");
            return (Criteria) this;
        }

        public Criteria andMinBorrowAmountNotIn(List<Integer> values) {
            addCriterion("min_borrow_amount not in", values, "minBorrowAmount");
            return (Criteria) this;
        }

        public Criteria andMinBorrowAmountBetween(Integer value1, Integer value2) {
            addCriterion("min_borrow_amount between", value1, value2, "minBorrowAmount");
            return (Criteria) this;
        }

        public Criteria andMinBorrowAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("min_borrow_amount not between", value1, value2, "minBorrowAmount");
            return (Criteria) this;
        }

        public Criteria andMaxBorrowAmountIsNull() {
            addCriterion("max_borrow_amount is null");
            return (Criteria) this;
        }

        public Criteria andMaxBorrowAmountIsNotNull() {
            addCriterion("max_borrow_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMaxBorrowAmountEqualTo(Integer value) {
            addCriterion("max_borrow_amount =", value, "maxBorrowAmount");
            return (Criteria) this;
        }

        public Criteria andMaxBorrowAmountNotEqualTo(Integer value) {
            addCriterion("max_borrow_amount <>", value, "maxBorrowAmount");
            return (Criteria) this;
        }

        public Criteria andMaxBorrowAmountGreaterThan(Integer value) {
            addCriterion("max_borrow_amount >", value, "maxBorrowAmount");
            return (Criteria) this;
        }

        public Criteria andMaxBorrowAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_borrow_amount >=", value, "maxBorrowAmount");
            return (Criteria) this;
        }

        public Criteria andMaxBorrowAmountLessThan(Integer value) {
            addCriterion("max_borrow_amount <", value, "maxBorrowAmount");
            return (Criteria) this;
        }

        public Criteria andMaxBorrowAmountLessThanOrEqualTo(Integer value) {
            addCriterion("max_borrow_amount <=", value, "maxBorrowAmount");
            return (Criteria) this;
        }

        public Criteria andMaxBorrowAmountIn(List<Integer> values) {
            addCriterion("max_borrow_amount in", values, "maxBorrowAmount");
            return (Criteria) this;
        }

        public Criteria andMaxBorrowAmountNotIn(List<Integer> values) {
            addCriterion("max_borrow_amount not in", values, "maxBorrowAmount");
            return (Criteria) this;
        }

        public Criteria andMaxBorrowAmountBetween(Integer value1, Integer value2) {
            addCriterion("max_borrow_amount between", value1, value2, "maxBorrowAmount");
            return (Criteria) this;
        }

        public Criteria andMaxBorrowAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("max_borrow_amount not between", value1, value2, "maxBorrowAmount");
            return (Criteria) this;
        }

        public Criteria andRateTypeIsNull() {
            addCriterion("rate_type is null");
            return (Criteria) this;
        }

        public Criteria andRateTypeIsNotNull() {
            addCriterion("rate_type is not null");
            return (Criteria) this;
        }

        public Criteria andRateTypeEqualTo(String value) {
            addCriterion("rate_type =", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotEqualTo(String value) {
            addCriterion("rate_type <>", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeGreaterThan(String value) {
            addCriterion("rate_type >", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("rate_type >=", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeLessThan(String value) {
            addCriterion("rate_type <", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeLessThanOrEqualTo(String value) {
            addCriterion("rate_type <=", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeLike(String value) {
            addCriterion("rate_type like", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotLike(String value) {
            addCriterion("rate_type not like", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeIn(List<String> values) {
            addCriterion("rate_type in", values, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotIn(List<String> values) {
            addCriterion("rate_type not in", values, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeBetween(String value1, String value2) {
            addCriterion("rate_type between", value1, value2, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotBetween(String value1, String value2) {
            addCriterion("rate_type not between", value1, value2, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andDurationTypeIsNull() {
            addCriterion("duration_type is null");
            return (Criteria) this;
        }

        public Criteria andDurationTypeIsNotNull() {
            addCriterion("duration_type is not null");
            return (Criteria) this;
        }

        public Criteria andDurationTypeEqualTo(String value) {
            addCriterion("duration_type =", value, "durationType");
            return (Criteria) this;
        }

        public Criteria andDurationTypeNotEqualTo(String value) {
            addCriterion("duration_type <>", value, "durationType");
            return (Criteria) this;
        }

        public Criteria andDurationTypeGreaterThan(String value) {
            addCriterion("duration_type >", value, "durationType");
            return (Criteria) this;
        }

        public Criteria andDurationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("duration_type >=", value, "durationType");
            return (Criteria) this;
        }

        public Criteria andDurationTypeLessThan(String value) {
            addCriterion("duration_type <", value, "durationType");
            return (Criteria) this;
        }

        public Criteria andDurationTypeLessThanOrEqualTo(String value) {
            addCriterion("duration_type <=", value, "durationType");
            return (Criteria) this;
        }

        public Criteria andDurationTypeLike(String value) {
            addCriterion("duration_type like", value, "durationType");
            return (Criteria) this;
        }

        public Criteria andDurationTypeNotLike(String value) {
            addCriterion("duration_type not like", value, "durationType");
            return (Criteria) this;
        }

        public Criteria andDurationTypeIn(List<String> values) {
            addCriterion("duration_type in", values, "durationType");
            return (Criteria) this;
        }

        public Criteria andDurationTypeNotIn(List<String> values) {
            addCriterion("duration_type not in", values, "durationType");
            return (Criteria) this;
        }

        public Criteria andDurationTypeBetween(String value1, String value2) {
            addCriterion("duration_type between", value1, value2, "durationType");
            return (Criteria) this;
        }

        public Criteria andDurationTypeNotBetween(String value1, String value2) {
            addCriterion("duration_type not between", value1, value2, "durationType");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Integer value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Integer value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Integer value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Integer value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Integer value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Integer> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Integer> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Integer value1, Integer value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIsNull() {
            addCriterion("repayment_type is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIsNotNull() {
            addCriterion("repayment_type is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeEqualTo(String value) {
            addCriterion("repayment_type =", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeNotEqualTo(String value) {
            addCriterion("repayment_type <>", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeGreaterThan(String value) {
            addCriterion("repayment_type >", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_type >=", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeLessThan(String value) {
            addCriterion("repayment_type <", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeLessThanOrEqualTo(String value) {
            addCriterion("repayment_type <=", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeLike(String value) {
            addCriterion("repayment_type like", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeNotLike(String value) {
            addCriterion("repayment_type not like", value, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIn(List<String> values) {
            addCriterion("repayment_type in", values, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeNotIn(List<String> values) {
            addCriterion("repayment_type not in", values, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeBetween(String value1, String value2) {
            addCriterion("repayment_type between", value1, value2, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeNotBetween(String value1, String value2) {
            addCriterion("repayment_type not between", value1, value2, "repaymentType");
            return (Criteria) this;
        }

        public Criteria andCalcRiskTypeIsNull() {
            addCriterion("calc_risk_type is null");
            return (Criteria) this;
        }

        public Criteria andCalcRiskTypeIsNotNull() {
            addCriterion("calc_risk_type is not null");
            return (Criteria) this;
        }

        public Criteria andCalcRiskTypeEqualTo(String value) {
            addCriterion("calc_risk_type =", value, "calcRiskType");
            return (Criteria) this;
        }

        public Criteria andCalcRiskTypeNotEqualTo(String value) {
            addCriterion("calc_risk_type <>", value, "calcRiskType");
            return (Criteria) this;
        }

        public Criteria andCalcRiskTypeGreaterThan(String value) {
            addCriterion("calc_risk_type >", value, "calcRiskType");
            return (Criteria) this;
        }

        public Criteria andCalcRiskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("calc_risk_type >=", value, "calcRiskType");
            return (Criteria) this;
        }

        public Criteria andCalcRiskTypeLessThan(String value) {
            addCriterion("calc_risk_type <", value, "calcRiskType");
            return (Criteria) this;
        }

        public Criteria andCalcRiskTypeLessThanOrEqualTo(String value) {
            addCriterion("calc_risk_type <=", value, "calcRiskType");
            return (Criteria) this;
        }

        public Criteria andCalcRiskTypeLike(String value) {
            addCriterion("calc_risk_type like", value, "calcRiskType");
            return (Criteria) this;
        }

        public Criteria andCalcRiskTypeNotLike(String value) {
            addCriterion("calc_risk_type not like", value, "calcRiskType");
            return (Criteria) this;
        }

        public Criteria andCalcRiskTypeIn(List<String> values) {
            addCriterion("calc_risk_type in", values, "calcRiskType");
            return (Criteria) this;
        }

        public Criteria andCalcRiskTypeNotIn(List<String> values) {
            addCriterion("calc_risk_type not in", values, "calcRiskType");
            return (Criteria) this;
        }

        public Criteria andCalcRiskTypeBetween(String value1, String value2) {
            addCriterion("calc_risk_type between", value1, value2, "calcRiskType");
            return (Criteria) this;
        }

        public Criteria andCalcRiskTypeNotBetween(String value1, String value2) {
            addCriterion("calc_risk_type not between", value1, value2, "calcRiskType");
            return (Criteria) this;
        }

        public Criteria andRiskMoneyIsNull() {
            addCriterion("risk_money is null");
            return (Criteria) this;
        }

        public Criteria andRiskMoneyIsNotNull() {
            addCriterion("risk_money is not null");
            return (Criteria) this;
        }

        public Criteria andRiskMoneyEqualTo(BigDecimal value) {
            addCriterion("risk_money =", value, "riskMoney");
            return (Criteria) this;
        }

        public Criteria andRiskMoneyNotEqualTo(BigDecimal value) {
            addCriterion("risk_money <>", value, "riskMoney");
            return (Criteria) this;
        }

        public Criteria andRiskMoneyGreaterThan(BigDecimal value) {
            addCriterion("risk_money >", value, "riskMoney");
            return (Criteria) this;
        }

        public Criteria andRiskMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("risk_money >=", value, "riskMoney");
            return (Criteria) this;
        }

        public Criteria andRiskMoneyLessThan(BigDecimal value) {
            addCriterion("risk_money <", value, "riskMoney");
            return (Criteria) this;
        }

        public Criteria andRiskMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("risk_money <=", value, "riskMoney");
            return (Criteria) this;
        }

        public Criteria andRiskMoneyIn(List<BigDecimal> values) {
            addCriterion("risk_money in", values, "riskMoney");
            return (Criteria) this;
        }

        public Criteria andRiskMoneyNotIn(List<BigDecimal> values) {
            addCriterion("risk_money not in", values, "riskMoney");
            return (Criteria) this;
        }

        public Criteria andRiskMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("risk_money between", value1, value2, "riskMoney");
            return (Criteria) this;
        }

        public Criteria andRiskMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("risk_money not between", value1, value2, "riskMoney");
            return (Criteria) this;
        }

        public Criteria andCalcBorfeeTypeIsNull() {
            addCriterion("calc_borfee_type is null");
            return (Criteria) this;
        }

        public Criteria andCalcBorfeeTypeIsNotNull() {
            addCriterion("calc_borfee_type is not null");
            return (Criteria) this;
        }

        public Criteria andCalcBorfeeTypeEqualTo(String value) {
            addCriterion("calc_borfee_type =", value, "calcBorfeeType");
            return (Criteria) this;
        }

        public Criteria andCalcBorfeeTypeNotEqualTo(String value) {
            addCriterion("calc_borfee_type <>", value, "calcBorfeeType");
            return (Criteria) this;
        }

        public Criteria andCalcBorfeeTypeGreaterThan(String value) {
            addCriterion("calc_borfee_type >", value, "calcBorfeeType");
            return (Criteria) this;
        }

        public Criteria andCalcBorfeeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("calc_borfee_type >=", value, "calcBorfeeType");
            return (Criteria) this;
        }

        public Criteria andCalcBorfeeTypeLessThan(String value) {
            addCriterion("calc_borfee_type <", value, "calcBorfeeType");
            return (Criteria) this;
        }

        public Criteria andCalcBorfeeTypeLessThanOrEqualTo(String value) {
            addCriterion("calc_borfee_type <=", value, "calcBorfeeType");
            return (Criteria) this;
        }

        public Criteria andCalcBorfeeTypeLike(String value) {
            addCriterion("calc_borfee_type like", value, "calcBorfeeType");
            return (Criteria) this;
        }

        public Criteria andCalcBorfeeTypeNotLike(String value) {
            addCriterion("calc_borfee_type not like", value, "calcBorfeeType");
            return (Criteria) this;
        }

        public Criteria andCalcBorfeeTypeIn(List<String> values) {
            addCriterion("calc_borfee_type in", values, "calcBorfeeType");
            return (Criteria) this;
        }

        public Criteria andCalcBorfeeTypeNotIn(List<String> values) {
            addCriterion("calc_borfee_type not in", values, "calcBorfeeType");
            return (Criteria) this;
        }

        public Criteria andCalcBorfeeTypeBetween(String value1, String value2) {
            addCriterion("calc_borfee_type between", value1, value2, "calcBorfeeType");
            return (Criteria) this;
        }

        public Criteria andCalcBorfeeTypeNotBetween(String value1, String value2) {
            addCriterion("calc_borfee_type not between", value1, value2, "calcBorfeeType");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeIsNull() {
            addCriterion("borrow_fee is null");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeIsNotNull() {
            addCriterion("borrow_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeEqualTo(BigDecimal value) {
            addCriterion("borrow_fee =", value, "borrowFee");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeNotEqualTo(BigDecimal value) {
            addCriterion("borrow_fee <>", value, "borrowFee");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeGreaterThan(BigDecimal value) {
            addCriterion("borrow_fee >", value, "borrowFee");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("borrow_fee >=", value, "borrowFee");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeLessThan(BigDecimal value) {
            addCriterion("borrow_fee <", value, "borrowFee");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("borrow_fee <=", value, "borrowFee");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeIn(List<BigDecimal> values) {
            addCriterion("borrow_fee in", values, "borrowFee");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeNotIn(List<BigDecimal> values) {
            addCriterion("borrow_fee not in", values, "borrowFee");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrow_fee between", value1, value2, "borrowFee");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrow_fee not between", value1, value2, "borrowFee");
            return (Criteria) this;
        }

        public Criteria andBorrowFeePaytypeIsNull() {
            addCriterion("borrow_fee_paytype is null");
            return (Criteria) this;
        }

        public Criteria andBorrowFeePaytypeIsNotNull() {
            addCriterion("borrow_fee_paytype is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowFeePaytypeEqualTo(String value) {
            addCriterion("borrow_fee_paytype =", value, "borrowFeePaytype");
            return (Criteria) this;
        }

        public Criteria andBorrowFeePaytypeNotEqualTo(String value) {
            addCriterion("borrow_fee_paytype <>", value, "borrowFeePaytype");
            return (Criteria) this;
        }

        public Criteria andBorrowFeePaytypeGreaterThan(String value) {
            addCriterion("borrow_fee_paytype >", value, "borrowFeePaytype");
            return (Criteria) this;
        }

        public Criteria andBorrowFeePaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_fee_paytype >=", value, "borrowFeePaytype");
            return (Criteria) this;
        }

        public Criteria andBorrowFeePaytypeLessThan(String value) {
            addCriterion("borrow_fee_paytype <", value, "borrowFeePaytype");
            return (Criteria) this;
        }

        public Criteria andBorrowFeePaytypeLessThanOrEqualTo(String value) {
            addCriterion("borrow_fee_paytype <=", value, "borrowFeePaytype");
            return (Criteria) this;
        }

        public Criteria andBorrowFeePaytypeLike(String value) {
            addCriterion("borrow_fee_paytype like", value, "borrowFeePaytype");
            return (Criteria) this;
        }

        public Criteria andBorrowFeePaytypeNotLike(String value) {
            addCriterion("borrow_fee_paytype not like", value, "borrowFeePaytype");
            return (Criteria) this;
        }

        public Criteria andBorrowFeePaytypeIn(List<String> values) {
            addCriterion("borrow_fee_paytype in", values, "borrowFeePaytype");
            return (Criteria) this;
        }

        public Criteria andBorrowFeePaytypeNotIn(List<String> values) {
            addCriterion("borrow_fee_paytype not in", values, "borrowFeePaytype");
            return (Criteria) this;
        }

        public Criteria andBorrowFeePaytypeBetween(String value1, String value2) {
            addCriterion("borrow_fee_paytype between", value1, value2, "borrowFeePaytype");
            return (Criteria) this;
        }

        public Criteria andBorrowFeePaytypeNotBetween(String value1, String value2) {
            addCriterion("borrow_fee_paytype not between", value1, value2, "borrowFeePaytype");
            return (Criteria) this;
        }

        public Criteria andCalcSerfeeTypeIsNull() {
            addCriterion("calc_serfee_type is null");
            return (Criteria) this;
        }

        public Criteria andCalcSerfeeTypeIsNotNull() {
            addCriterion("calc_serfee_type is not null");
            return (Criteria) this;
        }

        public Criteria andCalcSerfeeTypeEqualTo(String value) {
            addCriterion("calc_serfee_type =", value, "calcSerfeeType");
            return (Criteria) this;
        }

        public Criteria andCalcSerfeeTypeNotEqualTo(String value) {
            addCriterion("calc_serfee_type <>", value, "calcSerfeeType");
            return (Criteria) this;
        }

        public Criteria andCalcSerfeeTypeGreaterThan(String value) {
            addCriterion("calc_serfee_type >", value, "calcSerfeeType");
            return (Criteria) this;
        }

        public Criteria andCalcSerfeeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("calc_serfee_type >=", value, "calcSerfeeType");
            return (Criteria) this;
        }

        public Criteria andCalcSerfeeTypeLessThan(String value) {
            addCriterion("calc_serfee_type <", value, "calcSerfeeType");
            return (Criteria) this;
        }

        public Criteria andCalcSerfeeTypeLessThanOrEqualTo(String value) {
            addCriterion("calc_serfee_type <=", value, "calcSerfeeType");
            return (Criteria) this;
        }

        public Criteria andCalcSerfeeTypeLike(String value) {
            addCriterion("calc_serfee_type like", value, "calcSerfeeType");
            return (Criteria) this;
        }

        public Criteria andCalcSerfeeTypeNotLike(String value) {
            addCriterion("calc_serfee_type not like", value, "calcSerfeeType");
            return (Criteria) this;
        }

        public Criteria andCalcSerfeeTypeIn(List<String> values) {
            addCriterion("calc_serfee_type in", values, "calcSerfeeType");
            return (Criteria) this;
        }

        public Criteria andCalcSerfeeTypeNotIn(List<String> values) {
            addCriterion("calc_serfee_type not in", values, "calcSerfeeType");
            return (Criteria) this;
        }

        public Criteria andCalcSerfeeTypeBetween(String value1, String value2) {
            addCriterion("calc_serfee_type between", value1, value2, "calcSerfeeType");
            return (Criteria) this;
        }

        public Criteria andCalcSerfeeTypeNotBetween(String value1, String value2) {
            addCriterion("calc_serfee_type not between", value1, value2, "calcSerfeeType");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIsNull() {
            addCriterion("service_fee is null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIsNotNull() {
            addCriterion("service_fee is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeEqualTo(BigDecimal value) {
            addCriterion("service_fee =", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotEqualTo(BigDecimal value) {
            addCriterion("service_fee <>", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeGreaterThan(BigDecimal value) {
            addCriterion("service_fee >", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("service_fee >=", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeLessThan(BigDecimal value) {
            addCriterion("service_fee <", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("service_fee <=", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIn(List<BigDecimal> values) {
            addCriterion("service_fee in", values, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotIn(List<BigDecimal> values) {
            addCriterion("service_fee not in", values, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_fee between", value1, value2, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_fee not between", value1, value2, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeePaytypeIsNull() {
            addCriterion("service_fee_paytype is null");
            return (Criteria) this;
        }

        public Criteria andServiceFeePaytypeIsNotNull() {
            addCriterion("service_fee_paytype is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFeePaytypeEqualTo(String value) {
            addCriterion("service_fee_paytype =", value, "serviceFeePaytype");
            return (Criteria) this;
        }

        public Criteria andServiceFeePaytypeNotEqualTo(String value) {
            addCriterion("service_fee_paytype <>", value, "serviceFeePaytype");
            return (Criteria) this;
        }

        public Criteria andServiceFeePaytypeGreaterThan(String value) {
            addCriterion("service_fee_paytype >", value, "serviceFeePaytype");
            return (Criteria) this;
        }

        public Criteria andServiceFeePaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("service_fee_paytype >=", value, "serviceFeePaytype");
            return (Criteria) this;
        }

        public Criteria andServiceFeePaytypeLessThan(String value) {
            addCriterion("service_fee_paytype <", value, "serviceFeePaytype");
            return (Criteria) this;
        }

        public Criteria andServiceFeePaytypeLessThanOrEqualTo(String value) {
            addCriterion("service_fee_paytype <=", value, "serviceFeePaytype");
            return (Criteria) this;
        }

        public Criteria andServiceFeePaytypeLike(String value) {
            addCriterion("service_fee_paytype like", value, "serviceFeePaytype");
            return (Criteria) this;
        }

        public Criteria andServiceFeePaytypeNotLike(String value) {
            addCriterion("service_fee_paytype not like", value, "serviceFeePaytype");
            return (Criteria) this;
        }

        public Criteria andServiceFeePaytypeIn(List<String> values) {
            addCriterion("service_fee_paytype in", values, "serviceFeePaytype");
            return (Criteria) this;
        }

        public Criteria andServiceFeePaytypeNotIn(List<String> values) {
            addCriterion("service_fee_paytype not in", values, "serviceFeePaytype");
            return (Criteria) this;
        }

        public Criteria andServiceFeePaytypeBetween(String value1, String value2) {
            addCriterion("service_fee_paytype between", value1, value2, "serviceFeePaytype");
            return (Criteria) this;
        }

        public Criteria andServiceFeePaytypeNotBetween(String value1, String value2) {
            addCriterion("service_fee_paytype not between", value1, value2, "serviceFeePaytype");
            return (Criteria) this;
        }

        public Criteria andExpiredRateTypeIsNull() {
            addCriterion("expired_rate_type is null");
            return (Criteria) this;
        }

        public Criteria andExpiredRateTypeIsNotNull() {
            addCriterion("expired_rate_type is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredRateTypeEqualTo(String value) {
            addCriterion("expired_rate_type =", value, "expiredRateType");
            return (Criteria) this;
        }

        public Criteria andExpiredRateTypeNotEqualTo(String value) {
            addCriterion("expired_rate_type <>", value, "expiredRateType");
            return (Criteria) this;
        }

        public Criteria andExpiredRateTypeGreaterThan(String value) {
            addCriterion("expired_rate_type >", value, "expiredRateType");
            return (Criteria) this;
        }

        public Criteria andExpiredRateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("expired_rate_type >=", value, "expiredRateType");
            return (Criteria) this;
        }

        public Criteria andExpiredRateTypeLessThan(String value) {
            addCriterion("expired_rate_type <", value, "expiredRateType");
            return (Criteria) this;
        }

        public Criteria andExpiredRateTypeLessThanOrEqualTo(String value) {
            addCriterion("expired_rate_type <=", value, "expiredRateType");
            return (Criteria) this;
        }

        public Criteria andExpiredRateTypeLike(String value) {
            addCriterion("expired_rate_type like", value, "expiredRateType");
            return (Criteria) this;
        }

        public Criteria andExpiredRateTypeNotLike(String value) {
            addCriterion("expired_rate_type not like", value, "expiredRateType");
            return (Criteria) this;
        }

        public Criteria andExpiredRateTypeIn(List<String> values) {
            addCriterion("expired_rate_type in", values, "expiredRateType");
            return (Criteria) this;
        }

        public Criteria andExpiredRateTypeNotIn(List<String> values) {
            addCriterion("expired_rate_type not in", values, "expiredRateType");
            return (Criteria) this;
        }

        public Criteria andExpiredRateTypeBetween(String value1, String value2) {
            addCriterion("expired_rate_type between", value1, value2, "expiredRateType");
            return (Criteria) this;
        }

        public Criteria andExpiredRateTypeNotBetween(String value1, String value2) {
            addCriterion("expired_rate_type not between", value1, value2, "expiredRateType");
            return (Criteria) this;
        }

        public Criteria andExpiredRateIsNull() {
            addCriterion("expired_rate is null");
            return (Criteria) this;
        }

        public Criteria andExpiredRateIsNotNull() {
            addCriterion("expired_rate is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredRateEqualTo(BigDecimal value) {
            addCriterion("expired_rate =", value, "expiredRate");
            return (Criteria) this;
        }

        public Criteria andExpiredRateNotEqualTo(BigDecimal value) {
            addCriterion("expired_rate <>", value, "expiredRate");
            return (Criteria) this;
        }

        public Criteria andExpiredRateGreaterThan(BigDecimal value) {
            addCriterion("expired_rate >", value, "expiredRate");
            return (Criteria) this;
        }

        public Criteria andExpiredRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("expired_rate >=", value, "expiredRate");
            return (Criteria) this;
        }

        public Criteria andExpiredRateLessThan(BigDecimal value) {
            addCriterion("expired_rate <", value, "expiredRate");
            return (Criteria) this;
        }

        public Criteria andExpiredRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("expired_rate <=", value, "expiredRate");
            return (Criteria) this;
        }

        public Criteria andExpiredRateIn(List<BigDecimal> values) {
            addCriterion("expired_rate in", values, "expiredRate");
            return (Criteria) this;
        }

        public Criteria andExpiredRateNotIn(List<BigDecimal> values) {
            addCriterion("expired_rate not in", values, "expiredRate");
            return (Criteria) this;
        }

        public Criteria andExpiredRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expired_rate between", value1, value2, "expiredRate");
            return (Criteria) this;
        }

        public Criteria andExpiredRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expired_rate not between", value1, value2, "expiredRate");
            return (Criteria) this;
        }

        public Criteria andEalryFeeTypeIsNull() {
            addCriterion("ealry_fee_type is null");
            return (Criteria) this;
        }

        public Criteria andEalryFeeTypeIsNotNull() {
            addCriterion("ealry_fee_type is not null");
            return (Criteria) this;
        }

        public Criteria andEalryFeeTypeEqualTo(String value) {
            addCriterion("ealry_fee_type =", value, "ealryFeeType");
            return (Criteria) this;
        }

        public Criteria andEalryFeeTypeNotEqualTo(String value) {
            addCriterion("ealry_fee_type <>", value, "ealryFeeType");
            return (Criteria) this;
        }

        public Criteria andEalryFeeTypeGreaterThan(String value) {
            addCriterion("ealry_fee_type >", value, "ealryFeeType");
            return (Criteria) this;
        }

        public Criteria andEalryFeeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ealry_fee_type >=", value, "ealryFeeType");
            return (Criteria) this;
        }

        public Criteria andEalryFeeTypeLessThan(String value) {
            addCriterion("ealry_fee_type <", value, "ealryFeeType");
            return (Criteria) this;
        }

        public Criteria andEalryFeeTypeLessThanOrEqualTo(String value) {
            addCriterion("ealry_fee_type <=", value, "ealryFeeType");
            return (Criteria) this;
        }

        public Criteria andEalryFeeTypeLike(String value) {
            addCriterion("ealry_fee_type like", value, "ealryFeeType");
            return (Criteria) this;
        }

        public Criteria andEalryFeeTypeNotLike(String value) {
            addCriterion("ealry_fee_type not like", value, "ealryFeeType");
            return (Criteria) this;
        }

        public Criteria andEalryFeeTypeIn(List<String> values) {
            addCriterion("ealry_fee_type in", values, "ealryFeeType");
            return (Criteria) this;
        }

        public Criteria andEalryFeeTypeNotIn(List<String> values) {
            addCriterion("ealry_fee_type not in", values, "ealryFeeType");
            return (Criteria) this;
        }

        public Criteria andEalryFeeTypeBetween(String value1, String value2) {
            addCriterion("ealry_fee_type between", value1, value2, "ealryFeeType");
            return (Criteria) this;
        }

        public Criteria andEalryFeeTypeNotBetween(String value1, String value2) {
            addCriterion("ealry_fee_type not between", value1, value2, "ealryFeeType");
            return (Criteria) this;
        }

        public Criteria andEalryFeeRateIsNull() {
            addCriterion("ealry_fee_rate is null");
            return (Criteria) this;
        }

        public Criteria andEalryFeeRateIsNotNull() {
            addCriterion("ealry_fee_rate is not null");
            return (Criteria) this;
        }

        public Criteria andEalryFeeRateEqualTo(BigDecimal value) {
            addCriterion("ealry_fee_rate =", value, "ealryFeeRate");
            return (Criteria) this;
        }

        public Criteria andEalryFeeRateNotEqualTo(BigDecimal value) {
            addCriterion("ealry_fee_rate <>", value, "ealryFeeRate");
            return (Criteria) this;
        }

        public Criteria andEalryFeeRateGreaterThan(BigDecimal value) {
            addCriterion("ealry_fee_rate >", value, "ealryFeeRate");
            return (Criteria) this;
        }

        public Criteria andEalryFeeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ealry_fee_rate >=", value, "ealryFeeRate");
            return (Criteria) this;
        }

        public Criteria andEalryFeeRateLessThan(BigDecimal value) {
            addCriterion("ealry_fee_rate <", value, "ealryFeeRate");
            return (Criteria) this;
        }

        public Criteria andEalryFeeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ealry_fee_rate <=", value, "ealryFeeRate");
            return (Criteria) this;
        }

        public Criteria andEalryFeeRateIn(List<BigDecimal> values) {
            addCriterion("ealry_fee_rate in", values, "ealryFeeRate");
            return (Criteria) this;
        }

        public Criteria andEalryFeeRateNotIn(List<BigDecimal> values) {
            addCriterion("ealry_fee_rate not in", values, "ealryFeeRate");
            return (Criteria) this;
        }

        public Criteria andEalryFeeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ealry_fee_rate between", value1, value2, "ealryFeeRate");
            return (Criteria) this;
        }

        public Criteria andEalryFeeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ealry_fee_rate not between", value1, value2, "ealryFeeRate");
            return (Criteria) this;
        }

        public Criteria andEalryChargeTypeIsNull() {
            addCriterion("ealry_charge_type is null");
            return (Criteria) this;
        }

        public Criteria andEalryChargeTypeIsNotNull() {
            addCriterion("ealry_charge_type is not null");
            return (Criteria) this;
        }

        public Criteria andEalryChargeTypeEqualTo(String value) {
            addCriterion("ealry_charge_type =", value, "ealryChargeType");
            return (Criteria) this;
        }

        public Criteria andEalryChargeTypeNotEqualTo(String value) {
            addCriterion("ealry_charge_type <>", value, "ealryChargeType");
            return (Criteria) this;
        }

        public Criteria andEalryChargeTypeGreaterThan(String value) {
            addCriterion("ealry_charge_type >", value, "ealryChargeType");
            return (Criteria) this;
        }

        public Criteria andEalryChargeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ealry_charge_type >=", value, "ealryChargeType");
            return (Criteria) this;
        }

        public Criteria andEalryChargeTypeLessThan(String value) {
            addCriterion("ealry_charge_type <", value, "ealryChargeType");
            return (Criteria) this;
        }

        public Criteria andEalryChargeTypeLessThanOrEqualTo(String value) {
            addCriterion("ealry_charge_type <=", value, "ealryChargeType");
            return (Criteria) this;
        }

        public Criteria andEalryChargeTypeLike(String value) {
            addCriterion("ealry_charge_type like", value, "ealryChargeType");
            return (Criteria) this;
        }

        public Criteria andEalryChargeTypeNotLike(String value) {
            addCriterion("ealry_charge_type not like", value, "ealryChargeType");
            return (Criteria) this;
        }

        public Criteria andEalryChargeTypeIn(List<String> values) {
            addCriterion("ealry_charge_type in", values, "ealryChargeType");
            return (Criteria) this;
        }

        public Criteria andEalryChargeTypeNotIn(List<String> values) {
            addCriterion("ealry_charge_type not in", values, "ealryChargeType");
            return (Criteria) this;
        }

        public Criteria andEalryChargeTypeBetween(String value1, String value2) {
            addCriterion("ealry_charge_type between", value1, value2, "ealryChargeType");
            return (Criteria) this;
        }

        public Criteria andEalryChargeTypeNotBetween(String value1, String value2) {
            addCriterion("ealry_charge_type not between", value1, value2, "ealryChargeType");
            return (Criteria) this;
        }

        public Criteria andEalryChargeRateIsNull() {
            addCriterion("ealry_charge_rate is null");
            return (Criteria) this;
        }

        public Criteria andEalryChargeRateIsNotNull() {
            addCriterion("ealry_charge_rate is not null");
            return (Criteria) this;
        }

        public Criteria andEalryChargeRateEqualTo(BigDecimal value) {
            addCriterion("ealry_charge_rate =", value, "ealryChargeRate");
            return (Criteria) this;
        }

        public Criteria andEalryChargeRateNotEqualTo(BigDecimal value) {
            addCriterion("ealry_charge_rate <>", value, "ealryChargeRate");
            return (Criteria) this;
        }

        public Criteria andEalryChargeRateGreaterThan(BigDecimal value) {
            addCriterion("ealry_charge_rate >", value, "ealryChargeRate");
            return (Criteria) this;
        }

        public Criteria andEalryChargeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ealry_charge_rate >=", value, "ealryChargeRate");
            return (Criteria) this;
        }

        public Criteria andEalryChargeRateLessThan(BigDecimal value) {
            addCriterion("ealry_charge_rate <", value, "ealryChargeRate");
            return (Criteria) this;
        }

        public Criteria andEalryChargeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ealry_charge_rate <=", value, "ealryChargeRate");
            return (Criteria) this;
        }

        public Criteria andEalryChargeRateIn(List<BigDecimal> values) {
            addCriterion("ealry_charge_rate in", values, "ealryChargeRate");
            return (Criteria) this;
        }

        public Criteria andEalryChargeRateNotIn(List<BigDecimal> values) {
            addCriterion("ealry_charge_rate not in", values, "ealryChargeRate");
            return (Criteria) this;
        }

        public Criteria andEalryChargeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ealry_charge_rate between", value1, value2, "ealryChargeRate");
            return (Criteria) this;
        }

        public Criteria andEalryChargeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ealry_charge_rate not between", value1, value2, "ealryChargeRate");
            return (Criteria) this;
        }

        public Criteria andRepaymentSequenceIsNull() {
            addCriterion("repayment_sequence is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentSequenceIsNotNull() {
            addCriterion("repayment_sequence is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentSequenceEqualTo(String value) {
            addCriterion("repayment_sequence =", value, "repaymentSequence");
            return (Criteria) this;
        }

        public Criteria andRepaymentSequenceNotEqualTo(String value) {
            addCriterion("repayment_sequence <>", value, "repaymentSequence");
            return (Criteria) this;
        }

        public Criteria andRepaymentSequenceGreaterThan(String value) {
            addCriterion("repayment_sequence >", value, "repaymentSequence");
            return (Criteria) this;
        }

        public Criteria andRepaymentSequenceGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_sequence >=", value, "repaymentSequence");
            return (Criteria) this;
        }

        public Criteria andRepaymentSequenceLessThan(String value) {
            addCriterion("repayment_sequence <", value, "repaymentSequence");
            return (Criteria) this;
        }

        public Criteria andRepaymentSequenceLessThanOrEqualTo(String value) {
            addCriterion("repayment_sequence <=", value, "repaymentSequence");
            return (Criteria) this;
        }

        public Criteria andRepaymentSequenceLike(String value) {
            addCriterion("repayment_sequence like", value, "repaymentSequence");
            return (Criteria) this;
        }

        public Criteria andRepaymentSequenceNotLike(String value) {
            addCriterion("repayment_sequence not like", value, "repaymentSequence");
            return (Criteria) this;
        }

        public Criteria andRepaymentSequenceIn(List<String> values) {
            addCriterion("repayment_sequence in", values, "repaymentSequence");
            return (Criteria) this;
        }

        public Criteria andRepaymentSequenceNotIn(List<String> values) {
            addCriterion("repayment_sequence not in", values, "repaymentSequence");
            return (Criteria) this;
        }

        public Criteria andRepaymentSequenceBetween(String value1, String value2) {
            addCriterion("repayment_sequence between", value1, value2, "repaymentSequence");
            return (Criteria) this;
        }

        public Criteria andRepaymentSequenceNotBetween(String value1, String value2) {
            addCriterion("repayment_sequence not between", value1, value2, "repaymentSequence");
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