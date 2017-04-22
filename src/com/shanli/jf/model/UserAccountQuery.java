package com.shanli.jf.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserAccountQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public UserAccountQuery() {
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

        public Criteria andFreeCashIsNull() {
            addCriterion("free_cash is null");
            return (Criteria) this;
        }

        public Criteria andFreeCashIsNotNull() {
            addCriterion("free_cash is not null");
            return (Criteria) this;
        }

        public Criteria andFreeCashEqualTo(BigDecimal value) {
            addCriterion("free_cash =", value, "freeCash");
            return (Criteria) this;
        }

        public Criteria andFreeCashNotEqualTo(BigDecimal value) {
            addCriterion("free_cash <>", value, "freeCash");
            return (Criteria) this;
        }

        public Criteria andFreeCashGreaterThan(BigDecimal value) {
            addCriterion("free_cash >", value, "freeCash");
            return (Criteria) this;
        }

        public Criteria andFreeCashGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("free_cash >=", value, "freeCash");
            return (Criteria) this;
        }

        public Criteria andFreeCashLessThan(BigDecimal value) {
            addCriterion("free_cash <", value, "freeCash");
            return (Criteria) this;
        }

        public Criteria andFreeCashLessThanOrEqualTo(BigDecimal value) {
            addCriterion("free_cash <=", value, "freeCash");
            return (Criteria) this;
        }

        public Criteria andFreeCashIn(List<BigDecimal> values) {
            addCriterion("free_cash in", values, "freeCash");
            return (Criteria) this;
        }

        public Criteria andFreeCashNotIn(List<BigDecimal> values) {
            addCriterion("free_cash not in", values, "freeCash");
            return (Criteria) this;
        }

        public Criteria andFreeCashBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("free_cash between", value1, value2, "freeCash");
            return (Criteria) this;
        }

        public Criteria andFreeCashNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("free_cash not between", value1, value2, "freeCash");
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

        public Criteria andAvailableCreditIsNull() {
            addCriterion("available_credit is null");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditIsNotNull() {
            addCriterion("available_credit is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditEqualTo(BigDecimal value) {
            addCriterion("available_credit =", value, "availableCredit");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditNotEqualTo(BigDecimal value) {
            addCriterion("available_credit <>", value, "availableCredit");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditGreaterThan(BigDecimal value) {
            addCriterion("available_credit >", value, "availableCredit");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("available_credit >=", value, "availableCredit");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditLessThan(BigDecimal value) {
            addCriterion("available_credit <", value, "availableCredit");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditLessThanOrEqualTo(BigDecimal value) {
            addCriterion("available_credit <=", value, "availableCredit");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditIn(List<BigDecimal> values) {
            addCriterion("available_credit in", values, "availableCredit");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditNotIn(List<BigDecimal> values) {
            addCriterion("available_credit not in", values, "availableCredit");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_credit between", value1, value2, "availableCredit");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_credit not between", value1, value2, "availableCredit");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountIsNull() {
            addCriterion("frozen_amount is null");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountIsNotNull() {
            addCriterion("frozen_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountEqualTo(BigDecimal value) {
            addCriterion("frozen_amount =", value, "frozenAmount");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountNotEqualTo(BigDecimal value) {
            addCriterion("frozen_amount <>", value, "frozenAmount");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountGreaterThan(BigDecimal value) {
            addCriterion("frozen_amount >", value, "frozenAmount");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("frozen_amount >=", value, "frozenAmount");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountLessThan(BigDecimal value) {
            addCriterion("frozen_amount <", value, "frozenAmount");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("frozen_amount <=", value, "frozenAmount");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountIn(List<BigDecimal> values) {
            addCriterion("frozen_amount in", values, "frozenAmount");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountNotIn(List<BigDecimal> values) {
            addCriterion("frozen_amount not in", values, "frozenAmount");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frozen_amount between", value1, value2, "frozenAmount");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frozen_amount not between", value1, value2, "frozenAmount");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andTendAmountIsNull() {
            addCriterion("tend_amount is null");
            return (Criteria) this;
        }

        public Criteria andTendAmountIsNotNull() {
            addCriterion("tend_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTendAmountEqualTo(BigDecimal value) {
            addCriterion("tend_amount =", value, "tendAmount");
            return (Criteria) this;
        }

        public Criteria andTendAmountNotEqualTo(BigDecimal value) {
            addCriterion("tend_amount <>", value, "tendAmount");
            return (Criteria) this;
        }

        public Criteria andTendAmountGreaterThan(BigDecimal value) {
            addCriterion("tend_amount >", value, "tendAmount");
            return (Criteria) this;
        }

        public Criteria andTendAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tend_amount >=", value, "tendAmount");
            return (Criteria) this;
        }

        public Criteria andTendAmountLessThan(BigDecimal value) {
            addCriterion("tend_amount <", value, "tendAmount");
            return (Criteria) this;
        }

        public Criteria andTendAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tend_amount <=", value, "tendAmount");
            return (Criteria) this;
        }

        public Criteria andTendAmountIn(List<BigDecimal> values) {
            addCriterion("tend_amount in", values, "tendAmount");
            return (Criteria) this;
        }

        public Criteria andTendAmountNotIn(List<BigDecimal> values) {
            addCriterion("tend_amount not in", values, "tendAmount");
            return (Criteria) this;
        }

        public Criteria andTendAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tend_amount between", value1, value2, "tendAmount");
            return (Criteria) this;
        }

        public Criteria andTendAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tend_amount not between", value1, value2, "tendAmount");
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

        public Criteria andProfitWaitIsNull() {
            addCriterion("profit_wait is null");
            return (Criteria) this;
        }

        public Criteria andProfitWaitIsNotNull() {
            addCriterion("profit_wait is not null");
            return (Criteria) this;
        }

        public Criteria andProfitWaitEqualTo(BigDecimal value) {
            addCriterion("profit_wait =", value, "profitWait");
            return (Criteria) this;
        }

        public Criteria andProfitWaitNotEqualTo(BigDecimal value) {
            addCriterion("profit_wait <>", value, "profitWait");
            return (Criteria) this;
        }

        public Criteria andProfitWaitGreaterThan(BigDecimal value) {
            addCriterion("profit_wait >", value, "profitWait");
            return (Criteria) this;
        }

        public Criteria andProfitWaitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_wait >=", value, "profitWait");
            return (Criteria) this;
        }

        public Criteria andProfitWaitLessThan(BigDecimal value) {
            addCriterion("profit_wait <", value, "profitWait");
            return (Criteria) this;
        }

        public Criteria andProfitWaitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_wait <=", value, "profitWait");
            return (Criteria) this;
        }

        public Criteria andProfitWaitIn(List<BigDecimal> values) {
            addCriterion("profit_wait in", values, "profitWait");
            return (Criteria) this;
        }

        public Criteria andProfitWaitNotIn(List<BigDecimal> values) {
            addCriterion("profit_wait not in", values, "profitWait");
            return (Criteria) this;
        }

        public Criteria andProfitWaitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_wait between", value1, value2, "profitWait");
            return (Criteria) this;
        }

        public Criteria andProfitWaitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_wait not between", value1, value2, "profitWait");
            return (Criteria) this;
        }

        public Criteria andProfitAllIsNull() {
            addCriterion("profit_all is null");
            return (Criteria) this;
        }

        public Criteria andProfitAllIsNotNull() {
            addCriterion("profit_all is not null");
            return (Criteria) this;
        }

        public Criteria andProfitAllEqualTo(BigDecimal value) {
            addCriterion("profit_all =", value, "profitAll");
            return (Criteria) this;
        }

        public Criteria andProfitAllNotEqualTo(BigDecimal value) {
            addCriterion("profit_all <>", value, "profitAll");
            return (Criteria) this;
        }

        public Criteria andProfitAllGreaterThan(BigDecimal value) {
            addCriterion("profit_all >", value, "profitAll");
            return (Criteria) this;
        }

        public Criteria andProfitAllGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_all >=", value, "profitAll");
            return (Criteria) this;
        }

        public Criteria andProfitAllLessThan(BigDecimal value) {
            addCriterion("profit_all <", value, "profitAll");
            return (Criteria) this;
        }

        public Criteria andProfitAllLessThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_all <=", value, "profitAll");
            return (Criteria) this;
        }

        public Criteria andProfitAllIn(List<BigDecimal> values) {
            addCriterion("profit_all in", values, "profitAll");
            return (Criteria) this;
        }

        public Criteria andProfitAllNotIn(List<BigDecimal> values) {
            addCriterion("profit_all not in", values, "profitAll");
            return (Criteria) this;
        }

        public Criteria andProfitAllBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_all between", value1, value2, "profitAll");
            return (Criteria) this;
        }

        public Criteria andProfitAllNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_all not between", value1, value2, "profitAll");
            return (Criteria) this;
        }

        public Criteria andTendReturnAmountIsNull() {
            addCriterion("tend_return_amount is null");
            return (Criteria) this;
        }

        public Criteria andTendReturnAmountIsNotNull() {
            addCriterion("tend_return_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTendReturnAmountEqualTo(BigDecimal value) {
            addCriterion("tend_return_amount =", value, "tendReturnAmount");
            return (Criteria) this;
        }

        public Criteria andTendReturnAmountNotEqualTo(BigDecimal value) {
            addCriterion("tend_return_amount <>", value, "tendReturnAmount");
            return (Criteria) this;
        }

        public Criteria andTendReturnAmountGreaterThan(BigDecimal value) {
            addCriterion("tend_return_amount >", value, "tendReturnAmount");
            return (Criteria) this;
        }

        public Criteria andTendReturnAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tend_return_amount >=", value, "tendReturnAmount");
            return (Criteria) this;
        }

        public Criteria andTendReturnAmountLessThan(BigDecimal value) {
            addCriterion("tend_return_amount <", value, "tendReturnAmount");
            return (Criteria) this;
        }

        public Criteria andTendReturnAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tend_return_amount <=", value, "tendReturnAmount");
            return (Criteria) this;
        }

        public Criteria andTendReturnAmountIn(List<BigDecimal> values) {
            addCriterion("tend_return_amount in", values, "tendReturnAmount");
            return (Criteria) this;
        }

        public Criteria andTendReturnAmountNotIn(List<BigDecimal> values) {
            addCriterion("tend_return_amount not in", values, "tendReturnAmount");
            return (Criteria) this;
        }

        public Criteria andTendReturnAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tend_return_amount between", value1, value2, "tendReturnAmount");
            return (Criteria) this;
        }

        public Criteria andTendReturnAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tend_return_amount not between", value1, value2, "tendReturnAmount");
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

        public Criteria andCashWaitIsNull() {
            addCriterion("cash_wait is null");
            return (Criteria) this;
        }

        public Criteria andCashWaitIsNotNull() {
            addCriterion("cash_wait is not null");
            return (Criteria) this;
        }

        public Criteria andCashWaitEqualTo(BigDecimal value) {
            addCriterion("cash_wait =", value, "cashWait");
            return (Criteria) this;
        }

        public Criteria andCashWaitNotEqualTo(BigDecimal value) {
            addCriterion("cash_wait <>", value, "cashWait");
            return (Criteria) this;
        }

        public Criteria andCashWaitGreaterThan(BigDecimal value) {
            addCriterion("cash_wait >", value, "cashWait");
            return (Criteria) this;
        }

        public Criteria andCashWaitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_wait >=", value, "cashWait");
            return (Criteria) this;
        }

        public Criteria andCashWaitLessThan(BigDecimal value) {
            addCriterion("cash_wait <", value, "cashWait");
            return (Criteria) this;
        }

        public Criteria andCashWaitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_wait <=", value, "cashWait");
            return (Criteria) this;
        }

        public Criteria andCashWaitIn(List<BigDecimal> values) {
            addCriterion("cash_wait in", values, "cashWait");
            return (Criteria) this;
        }

        public Criteria andCashWaitNotIn(List<BigDecimal> values) {
            addCriterion("cash_wait not in", values, "cashWait");
            return (Criteria) this;
        }

        public Criteria andCashWaitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_wait between", value1, value2, "cashWait");
            return (Criteria) this;
        }

        public Criteria andCashWaitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_wait not between", value1, value2, "cashWait");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
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

        public Criteria andDemandAmountIsNull() {
            addCriterion("demand_amount is null");
            return (Criteria) this;
        }

        public Criteria andDemandAmountIsNotNull() {
            addCriterion("demand_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDemandAmountEqualTo(BigDecimal value) {
            addCriterion("demand_amount =", value, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountNotEqualTo(BigDecimal value) {
            addCriterion("demand_amount <>", value, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountGreaterThan(BigDecimal value) {
            addCriterion("demand_amount >", value, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("demand_amount >=", value, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountLessThan(BigDecimal value) {
            addCriterion("demand_amount <", value, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("demand_amount <=", value, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountIn(List<BigDecimal> values) {
            addCriterion("demand_amount in", values, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountNotIn(List<BigDecimal> values) {
            addCriterion("demand_amount not in", values, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("demand_amount between", value1, value2, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("demand_amount not between", value1, value2, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountIsNull() {
            addCriterion("interest_amount is null");
            return (Criteria) this;
        }

        public Criteria andInterestAmountIsNotNull() {
            addCriterion("interest_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInterestAmountEqualTo(BigDecimal value) {
            addCriterion("interest_amount =", value, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountNotEqualTo(BigDecimal value) {
            addCriterion("interest_amount <>", value, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountGreaterThan(BigDecimal value) {
            addCriterion("interest_amount >", value, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_amount >=", value, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountLessThan(BigDecimal value) {
            addCriterion("interest_amount <", value, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_amount <=", value, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountIn(List<BigDecimal> values) {
            addCriterion("interest_amount in", values, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountNotIn(List<BigDecimal> values) {
            addCriterion("interest_amount not in", values, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_amount between", value1, value2, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_amount not between", value1, value2, "interestAmount");
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