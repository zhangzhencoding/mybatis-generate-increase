package com.shanli.jf.model;

import java.util.ArrayList;
import java.util.List;

public class SysUserQxQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public SysUserQxQuery() {
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

        public Criteria andUIdIsNull() {
            addCriterion("U_ID is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("U_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(String value) {
            addCriterion("U_ID =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(String value) {
            addCriterion("U_ID <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(String value) {
            addCriterion("U_ID >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(String value) {
            addCriterion("U_ID >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(String value) {
            addCriterion("U_ID <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(String value) {
            addCriterion("U_ID <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLike(String value) {
            addCriterion("U_ID like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotLike(String value) {
            addCriterion("U_ID not like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<String> values) {
            addCriterion("U_ID in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<String> values) {
            addCriterion("U_ID not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(String value1, String value2) {
            addCriterion("U_ID between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(String value1, String value2) {
            addCriterion("U_ID not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andC1IsNull() {
            addCriterion("C1 is null");
            return (Criteria) this;
        }

        public Criteria andC1IsNotNull() {
            addCriterion("C1 is not null");
            return (Criteria) this;
        }

        public Criteria andC1EqualTo(Integer value) {
            addCriterion("C1 =", value, "c1");
            return (Criteria) this;
        }

        public Criteria andC1NotEqualTo(Integer value) {
            addCriterion("C1 <>", value, "c1");
            return (Criteria) this;
        }

        public Criteria andC1GreaterThan(Integer value) {
            addCriterion("C1 >", value, "c1");
            return (Criteria) this;
        }

        public Criteria andC1GreaterThanOrEqualTo(Integer value) {
            addCriterion("C1 >=", value, "c1");
            return (Criteria) this;
        }

        public Criteria andC1LessThan(Integer value) {
            addCriterion("C1 <", value, "c1");
            return (Criteria) this;
        }

        public Criteria andC1LessThanOrEqualTo(Integer value) {
            addCriterion("C1 <=", value, "c1");
            return (Criteria) this;
        }

        public Criteria andC1In(List<Integer> values) {
            addCriterion("C1 in", values, "c1");
            return (Criteria) this;
        }

        public Criteria andC1NotIn(List<Integer> values) {
            addCriterion("C1 not in", values, "c1");
            return (Criteria) this;
        }

        public Criteria andC1Between(Integer value1, Integer value2) {
            addCriterion("C1 between", value1, value2, "c1");
            return (Criteria) this;
        }

        public Criteria andC1NotBetween(Integer value1, Integer value2) {
            addCriterion("C1 not between", value1, value2, "c1");
            return (Criteria) this;
        }

        public Criteria andC2IsNull() {
            addCriterion("C2 is null");
            return (Criteria) this;
        }

        public Criteria andC2IsNotNull() {
            addCriterion("C2 is not null");
            return (Criteria) this;
        }

        public Criteria andC2EqualTo(Integer value) {
            addCriterion("C2 =", value, "c2");
            return (Criteria) this;
        }

        public Criteria andC2NotEqualTo(Integer value) {
            addCriterion("C2 <>", value, "c2");
            return (Criteria) this;
        }

        public Criteria andC2GreaterThan(Integer value) {
            addCriterion("C2 >", value, "c2");
            return (Criteria) this;
        }

        public Criteria andC2GreaterThanOrEqualTo(Integer value) {
            addCriterion("C2 >=", value, "c2");
            return (Criteria) this;
        }

        public Criteria andC2LessThan(Integer value) {
            addCriterion("C2 <", value, "c2");
            return (Criteria) this;
        }

        public Criteria andC2LessThanOrEqualTo(Integer value) {
            addCriterion("C2 <=", value, "c2");
            return (Criteria) this;
        }

        public Criteria andC2In(List<Integer> values) {
            addCriterion("C2 in", values, "c2");
            return (Criteria) this;
        }

        public Criteria andC2NotIn(List<Integer> values) {
            addCriterion("C2 not in", values, "c2");
            return (Criteria) this;
        }

        public Criteria andC2Between(Integer value1, Integer value2) {
            addCriterion("C2 between", value1, value2, "c2");
            return (Criteria) this;
        }

        public Criteria andC2NotBetween(Integer value1, Integer value2) {
            addCriterion("C2 not between", value1, value2, "c2");
            return (Criteria) this;
        }

        public Criteria andC3IsNull() {
            addCriterion("C3 is null");
            return (Criteria) this;
        }

        public Criteria andC3IsNotNull() {
            addCriterion("C3 is not null");
            return (Criteria) this;
        }

        public Criteria andC3EqualTo(Integer value) {
            addCriterion("C3 =", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3NotEqualTo(Integer value) {
            addCriterion("C3 <>", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3GreaterThan(Integer value) {
            addCriterion("C3 >", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3GreaterThanOrEqualTo(Integer value) {
            addCriterion("C3 >=", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3LessThan(Integer value) {
            addCriterion("C3 <", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3LessThanOrEqualTo(Integer value) {
            addCriterion("C3 <=", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3In(List<Integer> values) {
            addCriterion("C3 in", values, "c3");
            return (Criteria) this;
        }

        public Criteria andC3NotIn(List<Integer> values) {
            addCriterion("C3 not in", values, "c3");
            return (Criteria) this;
        }

        public Criteria andC3Between(Integer value1, Integer value2) {
            addCriterion("C3 between", value1, value2, "c3");
            return (Criteria) this;
        }

        public Criteria andC3NotBetween(Integer value1, Integer value2) {
            addCriterion("C3 not between", value1, value2, "c3");
            return (Criteria) this;
        }

        public Criteria andC4IsNull() {
            addCriterion("C4 is null");
            return (Criteria) this;
        }

        public Criteria andC4IsNotNull() {
            addCriterion("C4 is not null");
            return (Criteria) this;
        }

        public Criteria andC4EqualTo(Integer value) {
            addCriterion("C4 =", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4NotEqualTo(Integer value) {
            addCriterion("C4 <>", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4GreaterThan(Integer value) {
            addCriterion("C4 >", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4GreaterThanOrEqualTo(Integer value) {
            addCriterion("C4 >=", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4LessThan(Integer value) {
            addCriterion("C4 <", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4LessThanOrEqualTo(Integer value) {
            addCriterion("C4 <=", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4In(List<Integer> values) {
            addCriterion("C4 in", values, "c4");
            return (Criteria) this;
        }

        public Criteria andC4NotIn(List<Integer> values) {
            addCriterion("C4 not in", values, "c4");
            return (Criteria) this;
        }

        public Criteria andC4Between(Integer value1, Integer value2) {
            addCriterion("C4 between", value1, value2, "c4");
            return (Criteria) this;
        }

        public Criteria andC4NotBetween(Integer value1, Integer value2) {
            addCriterion("C4 not between", value1, value2, "c4");
            return (Criteria) this;
        }

        public Criteria andQ1IsNull() {
            addCriterion("Q1 is null");
            return (Criteria) this;
        }

        public Criteria andQ1IsNotNull() {
            addCriterion("Q1 is not null");
            return (Criteria) this;
        }

        public Criteria andQ1EqualTo(Integer value) {
            addCriterion("Q1 =", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1NotEqualTo(Integer value) {
            addCriterion("Q1 <>", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1GreaterThan(Integer value) {
            addCriterion("Q1 >", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1GreaterThanOrEqualTo(Integer value) {
            addCriterion("Q1 >=", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1LessThan(Integer value) {
            addCriterion("Q1 <", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1LessThanOrEqualTo(Integer value) {
            addCriterion("Q1 <=", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1In(List<Integer> values) {
            addCriterion("Q1 in", values, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1NotIn(List<Integer> values) {
            addCriterion("Q1 not in", values, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1Between(Integer value1, Integer value2) {
            addCriterion("Q1 between", value1, value2, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1NotBetween(Integer value1, Integer value2) {
            addCriterion("Q1 not between", value1, value2, "q1");
            return (Criteria) this;
        }

        public Criteria andQ2IsNull() {
            addCriterion("Q2 is null");
            return (Criteria) this;
        }

        public Criteria andQ2IsNotNull() {
            addCriterion("Q2 is not null");
            return (Criteria) this;
        }

        public Criteria andQ2EqualTo(Integer value) {
            addCriterion("Q2 =", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2NotEqualTo(Integer value) {
            addCriterion("Q2 <>", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2GreaterThan(Integer value) {
            addCriterion("Q2 >", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2GreaterThanOrEqualTo(Integer value) {
            addCriterion("Q2 >=", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2LessThan(Integer value) {
            addCriterion("Q2 <", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2LessThanOrEqualTo(Integer value) {
            addCriterion("Q2 <=", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2In(List<Integer> values) {
            addCriterion("Q2 in", values, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2NotIn(List<Integer> values) {
            addCriterion("Q2 not in", values, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2Between(Integer value1, Integer value2) {
            addCriterion("Q2 between", value1, value2, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2NotBetween(Integer value1, Integer value2) {
            addCriterion("Q2 not between", value1, value2, "q2");
            return (Criteria) this;
        }

        public Criteria andQ3IsNull() {
            addCriterion("Q3 is null");
            return (Criteria) this;
        }

        public Criteria andQ3IsNotNull() {
            addCriterion("Q3 is not null");
            return (Criteria) this;
        }

        public Criteria andQ3EqualTo(Integer value) {
            addCriterion("Q3 =", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3NotEqualTo(Integer value) {
            addCriterion("Q3 <>", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3GreaterThan(Integer value) {
            addCriterion("Q3 >", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3GreaterThanOrEqualTo(Integer value) {
            addCriterion("Q3 >=", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3LessThan(Integer value) {
            addCriterion("Q3 <", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3LessThanOrEqualTo(Integer value) {
            addCriterion("Q3 <=", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3In(List<Integer> values) {
            addCriterion("Q3 in", values, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3NotIn(List<Integer> values) {
            addCriterion("Q3 not in", values, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3Between(Integer value1, Integer value2) {
            addCriterion("Q3 between", value1, value2, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3NotBetween(Integer value1, Integer value2) {
            addCriterion("Q3 not between", value1, value2, "q3");
            return (Criteria) this;
        }

        public Criteria andQ4IsNull() {
            addCriterion("Q4 is null");
            return (Criteria) this;
        }

        public Criteria andQ4IsNotNull() {
            addCriterion("Q4 is not null");
            return (Criteria) this;
        }

        public Criteria andQ4EqualTo(Integer value) {
            addCriterion("Q4 =", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4NotEqualTo(Integer value) {
            addCriterion("Q4 <>", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4GreaterThan(Integer value) {
            addCriterion("Q4 >", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4GreaterThanOrEqualTo(Integer value) {
            addCriterion("Q4 >=", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4LessThan(Integer value) {
            addCriterion("Q4 <", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4LessThanOrEqualTo(Integer value) {
            addCriterion("Q4 <=", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4In(List<Integer> values) {
            addCriterion("Q4 in", values, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4NotIn(List<Integer> values) {
            addCriterion("Q4 not in", values, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4Between(Integer value1, Integer value2) {
            addCriterion("Q4 between", value1, value2, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4NotBetween(Integer value1, Integer value2) {
            addCriterion("Q4 not between", value1, value2, "q4");
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