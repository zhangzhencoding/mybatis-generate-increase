package com.shanli.jf.model;

import java.util.ArrayList;
import java.util.List;

public class SysGlQxQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public SysGlQxQuery() {
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

        public Criteria andGlIdIsNull() {
            addCriterion("GL_ID is null");
            return (Criteria) this;
        }

        public Criteria andGlIdIsNotNull() {
            addCriterion("GL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGlIdEqualTo(String value) {
            addCriterion("GL_ID =", value, "glId");
            return (Criteria) this;
        }

        public Criteria andGlIdNotEqualTo(String value) {
            addCriterion("GL_ID <>", value, "glId");
            return (Criteria) this;
        }

        public Criteria andGlIdGreaterThan(String value) {
            addCriterion("GL_ID >", value, "glId");
            return (Criteria) this;
        }

        public Criteria andGlIdGreaterThanOrEqualTo(String value) {
            addCriterion("GL_ID >=", value, "glId");
            return (Criteria) this;
        }

        public Criteria andGlIdLessThan(String value) {
            addCriterion("GL_ID <", value, "glId");
            return (Criteria) this;
        }

        public Criteria andGlIdLessThanOrEqualTo(String value) {
            addCriterion("GL_ID <=", value, "glId");
            return (Criteria) this;
        }

        public Criteria andGlIdLike(String value) {
            addCriterion("GL_ID like", value, "glId");
            return (Criteria) this;
        }

        public Criteria andGlIdNotLike(String value) {
            addCriterion("GL_ID not like", value, "glId");
            return (Criteria) this;
        }

        public Criteria andGlIdIn(List<String> values) {
            addCriterion("GL_ID in", values, "glId");
            return (Criteria) this;
        }

        public Criteria andGlIdNotIn(List<String> values) {
            addCriterion("GL_ID not in", values, "glId");
            return (Criteria) this;
        }

        public Criteria andGlIdBetween(String value1, String value2) {
            addCriterion("GL_ID between", value1, value2, "glId");
            return (Criteria) this;
        }

        public Criteria andGlIdNotBetween(String value1, String value2) {
            addCriterion("GL_ID not between", value1, value2, "glId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(String value) {
            addCriterion("ROLE_ID =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(String value) {
            addCriterion("ROLE_ID <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(String value) {
            addCriterion("ROLE_ID >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_ID >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(String value) {
            addCriterion("ROLE_ID <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(String value) {
            addCriterion("ROLE_ID <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLike(String value) {
            addCriterion("ROLE_ID like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotLike(String value) {
            addCriterion("ROLE_ID not like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<String> values) {
            addCriterion("ROLE_ID in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<String> values) {
            addCriterion("ROLE_ID not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(String value1, String value2) {
            addCriterion("ROLE_ID between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(String value1, String value2) {
            addCriterion("ROLE_ID not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andFxQxIsNull() {
            addCriterion("FX_QX is null");
            return (Criteria) this;
        }

        public Criteria andFxQxIsNotNull() {
            addCriterion("FX_QX is not null");
            return (Criteria) this;
        }

        public Criteria andFxQxEqualTo(Integer value) {
            addCriterion("FX_QX =", value, "fxQx");
            return (Criteria) this;
        }

        public Criteria andFxQxNotEqualTo(Integer value) {
            addCriterion("FX_QX <>", value, "fxQx");
            return (Criteria) this;
        }

        public Criteria andFxQxGreaterThan(Integer value) {
            addCriterion("FX_QX >", value, "fxQx");
            return (Criteria) this;
        }

        public Criteria andFxQxGreaterThanOrEqualTo(Integer value) {
            addCriterion("FX_QX >=", value, "fxQx");
            return (Criteria) this;
        }

        public Criteria andFxQxLessThan(Integer value) {
            addCriterion("FX_QX <", value, "fxQx");
            return (Criteria) this;
        }

        public Criteria andFxQxLessThanOrEqualTo(Integer value) {
            addCriterion("FX_QX <=", value, "fxQx");
            return (Criteria) this;
        }

        public Criteria andFxQxIn(List<Integer> values) {
            addCriterion("FX_QX in", values, "fxQx");
            return (Criteria) this;
        }

        public Criteria andFxQxNotIn(List<Integer> values) {
            addCriterion("FX_QX not in", values, "fxQx");
            return (Criteria) this;
        }

        public Criteria andFxQxBetween(Integer value1, Integer value2) {
            addCriterion("FX_QX between", value1, value2, "fxQx");
            return (Criteria) this;
        }

        public Criteria andFxQxNotBetween(Integer value1, Integer value2) {
            addCriterion("FX_QX not between", value1, value2, "fxQx");
            return (Criteria) this;
        }

        public Criteria andFwQxIsNull() {
            addCriterion("FW_QX is null");
            return (Criteria) this;
        }

        public Criteria andFwQxIsNotNull() {
            addCriterion("FW_QX is not null");
            return (Criteria) this;
        }

        public Criteria andFwQxEqualTo(Integer value) {
            addCriterion("FW_QX =", value, "fwQx");
            return (Criteria) this;
        }

        public Criteria andFwQxNotEqualTo(Integer value) {
            addCriterion("FW_QX <>", value, "fwQx");
            return (Criteria) this;
        }

        public Criteria andFwQxGreaterThan(Integer value) {
            addCriterion("FW_QX >", value, "fwQx");
            return (Criteria) this;
        }

        public Criteria andFwQxGreaterThanOrEqualTo(Integer value) {
            addCriterion("FW_QX >=", value, "fwQx");
            return (Criteria) this;
        }

        public Criteria andFwQxLessThan(Integer value) {
            addCriterion("FW_QX <", value, "fwQx");
            return (Criteria) this;
        }

        public Criteria andFwQxLessThanOrEqualTo(Integer value) {
            addCriterion("FW_QX <=", value, "fwQx");
            return (Criteria) this;
        }

        public Criteria andFwQxIn(List<Integer> values) {
            addCriterion("FW_QX in", values, "fwQx");
            return (Criteria) this;
        }

        public Criteria andFwQxNotIn(List<Integer> values) {
            addCriterion("FW_QX not in", values, "fwQx");
            return (Criteria) this;
        }

        public Criteria andFwQxBetween(Integer value1, Integer value2) {
            addCriterion("FW_QX between", value1, value2, "fwQx");
            return (Criteria) this;
        }

        public Criteria andFwQxNotBetween(Integer value1, Integer value2) {
            addCriterion("FW_QX not between", value1, value2, "fwQx");
            return (Criteria) this;
        }

        public Criteria andQx1IsNull() {
            addCriterion("QX1 is null");
            return (Criteria) this;
        }

        public Criteria andQx1IsNotNull() {
            addCriterion("QX1 is not null");
            return (Criteria) this;
        }

        public Criteria andQx1EqualTo(Integer value) {
            addCriterion("QX1 =", value, "qx1");
            return (Criteria) this;
        }

        public Criteria andQx1NotEqualTo(Integer value) {
            addCriterion("QX1 <>", value, "qx1");
            return (Criteria) this;
        }

        public Criteria andQx1GreaterThan(Integer value) {
            addCriterion("QX1 >", value, "qx1");
            return (Criteria) this;
        }

        public Criteria andQx1GreaterThanOrEqualTo(Integer value) {
            addCriterion("QX1 >=", value, "qx1");
            return (Criteria) this;
        }

        public Criteria andQx1LessThan(Integer value) {
            addCriterion("QX1 <", value, "qx1");
            return (Criteria) this;
        }

        public Criteria andQx1LessThanOrEqualTo(Integer value) {
            addCriterion("QX1 <=", value, "qx1");
            return (Criteria) this;
        }

        public Criteria andQx1In(List<Integer> values) {
            addCriterion("QX1 in", values, "qx1");
            return (Criteria) this;
        }

        public Criteria andQx1NotIn(List<Integer> values) {
            addCriterion("QX1 not in", values, "qx1");
            return (Criteria) this;
        }

        public Criteria andQx1Between(Integer value1, Integer value2) {
            addCriterion("QX1 between", value1, value2, "qx1");
            return (Criteria) this;
        }

        public Criteria andQx1NotBetween(Integer value1, Integer value2) {
            addCriterion("QX1 not between", value1, value2, "qx1");
            return (Criteria) this;
        }

        public Criteria andQx2IsNull() {
            addCriterion("QX2 is null");
            return (Criteria) this;
        }

        public Criteria andQx2IsNotNull() {
            addCriterion("QX2 is not null");
            return (Criteria) this;
        }

        public Criteria andQx2EqualTo(Integer value) {
            addCriterion("QX2 =", value, "qx2");
            return (Criteria) this;
        }

        public Criteria andQx2NotEqualTo(Integer value) {
            addCriterion("QX2 <>", value, "qx2");
            return (Criteria) this;
        }

        public Criteria andQx2GreaterThan(Integer value) {
            addCriterion("QX2 >", value, "qx2");
            return (Criteria) this;
        }

        public Criteria andQx2GreaterThanOrEqualTo(Integer value) {
            addCriterion("QX2 >=", value, "qx2");
            return (Criteria) this;
        }

        public Criteria andQx2LessThan(Integer value) {
            addCriterion("QX2 <", value, "qx2");
            return (Criteria) this;
        }

        public Criteria andQx2LessThanOrEqualTo(Integer value) {
            addCriterion("QX2 <=", value, "qx2");
            return (Criteria) this;
        }

        public Criteria andQx2In(List<Integer> values) {
            addCriterion("QX2 in", values, "qx2");
            return (Criteria) this;
        }

        public Criteria andQx2NotIn(List<Integer> values) {
            addCriterion("QX2 not in", values, "qx2");
            return (Criteria) this;
        }

        public Criteria andQx2Between(Integer value1, Integer value2) {
            addCriterion("QX2 between", value1, value2, "qx2");
            return (Criteria) this;
        }

        public Criteria andQx2NotBetween(Integer value1, Integer value2) {
            addCriterion("QX2 not between", value1, value2, "qx2");
            return (Criteria) this;
        }

        public Criteria andQx3IsNull() {
            addCriterion("QX3 is null");
            return (Criteria) this;
        }

        public Criteria andQx3IsNotNull() {
            addCriterion("QX3 is not null");
            return (Criteria) this;
        }

        public Criteria andQx3EqualTo(Integer value) {
            addCriterion("QX3 =", value, "qx3");
            return (Criteria) this;
        }

        public Criteria andQx3NotEqualTo(Integer value) {
            addCriterion("QX3 <>", value, "qx3");
            return (Criteria) this;
        }

        public Criteria andQx3GreaterThan(Integer value) {
            addCriterion("QX3 >", value, "qx3");
            return (Criteria) this;
        }

        public Criteria andQx3GreaterThanOrEqualTo(Integer value) {
            addCriterion("QX3 >=", value, "qx3");
            return (Criteria) this;
        }

        public Criteria andQx3LessThan(Integer value) {
            addCriterion("QX3 <", value, "qx3");
            return (Criteria) this;
        }

        public Criteria andQx3LessThanOrEqualTo(Integer value) {
            addCriterion("QX3 <=", value, "qx3");
            return (Criteria) this;
        }

        public Criteria andQx3In(List<Integer> values) {
            addCriterion("QX3 in", values, "qx3");
            return (Criteria) this;
        }

        public Criteria andQx3NotIn(List<Integer> values) {
            addCriterion("QX3 not in", values, "qx3");
            return (Criteria) this;
        }

        public Criteria andQx3Between(Integer value1, Integer value2) {
            addCriterion("QX3 between", value1, value2, "qx3");
            return (Criteria) this;
        }

        public Criteria andQx3NotBetween(Integer value1, Integer value2) {
            addCriterion("QX3 not between", value1, value2, "qx3");
            return (Criteria) this;
        }

        public Criteria andQx4IsNull() {
            addCriterion("QX4 is null");
            return (Criteria) this;
        }

        public Criteria andQx4IsNotNull() {
            addCriterion("QX4 is not null");
            return (Criteria) this;
        }

        public Criteria andQx4EqualTo(Integer value) {
            addCriterion("QX4 =", value, "qx4");
            return (Criteria) this;
        }

        public Criteria andQx4NotEqualTo(Integer value) {
            addCriterion("QX4 <>", value, "qx4");
            return (Criteria) this;
        }

        public Criteria andQx4GreaterThan(Integer value) {
            addCriterion("QX4 >", value, "qx4");
            return (Criteria) this;
        }

        public Criteria andQx4GreaterThanOrEqualTo(Integer value) {
            addCriterion("QX4 >=", value, "qx4");
            return (Criteria) this;
        }

        public Criteria andQx4LessThan(Integer value) {
            addCriterion("QX4 <", value, "qx4");
            return (Criteria) this;
        }

        public Criteria andQx4LessThanOrEqualTo(Integer value) {
            addCriterion("QX4 <=", value, "qx4");
            return (Criteria) this;
        }

        public Criteria andQx4In(List<Integer> values) {
            addCriterion("QX4 in", values, "qx4");
            return (Criteria) this;
        }

        public Criteria andQx4NotIn(List<Integer> values) {
            addCriterion("QX4 not in", values, "qx4");
            return (Criteria) this;
        }

        public Criteria andQx4Between(Integer value1, Integer value2) {
            addCriterion("QX4 between", value1, value2, "qx4");
            return (Criteria) this;
        }

        public Criteria andQx4NotBetween(Integer value1, Integer value2) {
            addCriterion("QX4 not between", value1, value2, "qx4");
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