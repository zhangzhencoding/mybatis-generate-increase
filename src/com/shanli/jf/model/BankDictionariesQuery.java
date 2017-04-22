package com.shanli.jf.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankDictionariesQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public BankDictionariesQuery() {
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

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andMapUrlIsNull() {
            addCriterion("map_url is null");
            return (Criteria) this;
        }

        public Criteria andMapUrlIsNotNull() {
            addCriterion("map_url is not null");
            return (Criteria) this;
        }

        public Criteria andMapUrlEqualTo(String value) {
            addCriterion("map_url =", value, "mapUrl");
            return (Criteria) this;
        }

        public Criteria andMapUrlNotEqualTo(String value) {
            addCriterion("map_url <>", value, "mapUrl");
            return (Criteria) this;
        }

        public Criteria andMapUrlGreaterThan(String value) {
            addCriterion("map_url >", value, "mapUrl");
            return (Criteria) this;
        }

        public Criteria andMapUrlGreaterThanOrEqualTo(String value) {
            addCriterion("map_url >=", value, "mapUrl");
            return (Criteria) this;
        }

        public Criteria andMapUrlLessThan(String value) {
            addCriterion("map_url <", value, "mapUrl");
            return (Criteria) this;
        }

        public Criteria andMapUrlLessThanOrEqualTo(String value) {
            addCriterion("map_url <=", value, "mapUrl");
            return (Criteria) this;
        }

        public Criteria andMapUrlLike(String value) {
            addCriterion("map_url like", value, "mapUrl");
            return (Criteria) this;
        }

        public Criteria andMapUrlNotLike(String value) {
            addCriterion("map_url not like", value, "mapUrl");
            return (Criteria) this;
        }

        public Criteria andMapUrlIn(List<String> values) {
            addCriterion("map_url in", values, "mapUrl");
            return (Criteria) this;
        }

        public Criteria andMapUrlNotIn(List<String> values) {
            addCriterion("map_url not in", values, "mapUrl");
            return (Criteria) this;
        }

        public Criteria andMapUrlBetween(String value1, String value2) {
            addCriterion("map_url between", value1, value2, "mapUrl");
            return (Criteria) this;
        }

        public Criteria andMapUrlNotBetween(String value1, String value2) {
            addCriterion("map_url not between", value1, value2, "mapUrl");
            return (Criteria) this;
        }

        public Criteria andSingerMaxAmountIsNull() {
            addCriterion("singer_max_amount is null");
            return (Criteria) this;
        }

        public Criteria andSingerMaxAmountIsNotNull() {
            addCriterion("singer_max_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSingerMaxAmountEqualTo(BigDecimal value) {
            addCriterion("singer_max_amount =", value, "singerMaxAmount");
            return (Criteria) this;
        }

        public Criteria andSingerMaxAmountNotEqualTo(BigDecimal value) {
            addCriterion("singer_max_amount <>", value, "singerMaxAmount");
            return (Criteria) this;
        }

        public Criteria andSingerMaxAmountGreaterThan(BigDecimal value) {
            addCriterion("singer_max_amount >", value, "singerMaxAmount");
            return (Criteria) this;
        }

        public Criteria andSingerMaxAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("singer_max_amount >=", value, "singerMaxAmount");
            return (Criteria) this;
        }

        public Criteria andSingerMaxAmountLessThan(BigDecimal value) {
            addCriterion("singer_max_amount <", value, "singerMaxAmount");
            return (Criteria) this;
        }

        public Criteria andSingerMaxAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("singer_max_amount <=", value, "singerMaxAmount");
            return (Criteria) this;
        }

        public Criteria andSingerMaxAmountIn(List<BigDecimal> values) {
            addCriterion("singer_max_amount in", values, "singerMaxAmount");
            return (Criteria) this;
        }

        public Criteria andSingerMaxAmountNotIn(List<BigDecimal> values) {
            addCriterion("singer_max_amount not in", values, "singerMaxAmount");
            return (Criteria) this;
        }

        public Criteria andSingerMaxAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("singer_max_amount between", value1, value2, "singerMaxAmount");
            return (Criteria) this;
        }

        public Criteria andSingerMaxAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("singer_max_amount not between", value1, value2, "singerMaxAmount");
            return (Criteria) this;
        }

        public Criteria andSingerDayAmountIsNull() {
            addCriterion("singer_day_amount is null");
            return (Criteria) this;
        }

        public Criteria andSingerDayAmountIsNotNull() {
            addCriterion("singer_day_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSingerDayAmountEqualTo(BigDecimal value) {
            addCriterion("singer_day_amount =", value, "singerDayAmount");
            return (Criteria) this;
        }

        public Criteria andSingerDayAmountNotEqualTo(BigDecimal value) {
            addCriterion("singer_day_amount <>", value, "singerDayAmount");
            return (Criteria) this;
        }

        public Criteria andSingerDayAmountGreaterThan(BigDecimal value) {
            addCriterion("singer_day_amount >", value, "singerDayAmount");
            return (Criteria) this;
        }

        public Criteria andSingerDayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("singer_day_amount >=", value, "singerDayAmount");
            return (Criteria) this;
        }

        public Criteria andSingerDayAmountLessThan(BigDecimal value) {
            addCriterion("singer_day_amount <", value, "singerDayAmount");
            return (Criteria) this;
        }

        public Criteria andSingerDayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("singer_day_amount <=", value, "singerDayAmount");
            return (Criteria) this;
        }

        public Criteria andSingerDayAmountIn(List<BigDecimal> values) {
            addCriterion("singer_day_amount in", values, "singerDayAmount");
            return (Criteria) this;
        }

        public Criteria andSingerDayAmountNotIn(List<BigDecimal> values) {
            addCriterion("singer_day_amount not in", values, "singerDayAmount");
            return (Criteria) this;
        }

        public Criteria andSingerDayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("singer_day_amount between", value1, value2, "singerDayAmount");
            return (Criteria) this;
        }

        public Criteria andSingerDayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("singer_day_amount not between", value1, value2, "singerDayAmount");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNull() {
            addCriterion("bank_code is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNotNull() {
            addCriterion("bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeEqualTo(String value) {
            addCriterion("bank_code =", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotEqualTo(String value) {
            addCriterion("bank_code <>", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThan(String value) {
            addCriterion("bank_code >", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_code >=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThan(String value) {
            addCriterion("bank_code <", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThanOrEqualTo(String value) {
            addCriterion("bank_code <=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLike(String value) {
            addCriterion("bank_code like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotLike(String value) {
            addCriterion("bank_code not like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIn(List<String> values) {
            addCriterion("bank_code in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotIn(List<String> values) {
            addCriterion("bank_code not in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeBetween(String value1, String value2) {
            addCriterion("bank_code between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotBetween(String value1, String value2) {
            addCriterion("bank_code not between", value1, value2, "bankCode");
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