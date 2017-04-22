package com.shanli.jf.model;

import java.util.ArrayList;
import java.util.List;

public class SysDictionariesQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public SysDictionariesQuery() {
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

        public Criteria andZdIdIsNull() {
            addCriterion("ZD_ID is null");
            return (Criteria) this;
        }

        public Criteria andZdIdIsNotNull() {
            addCriterion("ZD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andZdIdEqualTo(String value) {
            addCriterion("ZD_ID =", value, "zdId");
            return (Criteria) this;
        }

        public Criteria andZdIdNotEqualTo(String value) {
            addCriterion("ZD_ID <>", value, "zdId");
            return (Criteria) this;
        }

        public Criteria andZdIdGreaterThan(String value) {
            addCriterion("ZD_ID >", value, "zdId");
            return (Criteria) this;
        }

        public Criteria andZdIdGreaterThanOrEqualTo(String value) {
            addCriterion("ZD_ID >=", value, "zdId");
            return (Criteria) this;
        }

        public Criteria andZdIdLessThan(String value) {
            addCriterion("ZD_ID <", value, "zdId");
            return (Criteria) this;
        }

        public Criteria andZdIdLessThanOrEqualTo(String value) {
            addCriterion("ZD_ID <=", value, "zdId");
            return (Criteria) this;
        }

        public Criteria andZdIdLike(String value) {
            addCriterion("ZD_ID like", value, "zdId");
            return (Criteria) this;
        }

        public Criteria andZdIdNotLike(String value) {
            addCriterion("ZD_ID not like", value, "zdId");
            return (Criteria) this;
        }

        public Criteria andZdIdIn(List<String> values) {
            addCriterion("ZD_ID in", values, "zdId");
            return (Criteria) this;
        }

        public Criteria andZdIdNotIn(List<String> values) {
            addCriterion("ZD_ID not in", values, "zdId");
            return (Criteria) this;
        }

        public Criteria andZdIdBetween(String value1, String value2) {
            addCriterion("ZD_ID between", value1, value2, "zdId");
            return (Criteria) this;
        }

        public Criteria andZdIdNotBetween(String value1, String value2) {
            addCriterion("ZD_ID not between", value1, value2, "zdId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andBianmaIsNull() {
            addCriterion("BIANMA is null");
            return (Criteria) this;
        }

        public Criteria andBianmaIsNotNull() {
            addCriterion("BIANMA is not null");
            return (Criteria) this;
        }

        public Criteria andBianmaEqualTo(String value) {
            addCriterion("BIANMA =", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaNotEqualTo(String value) {
            addCriterion("BIANMA <>", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaGreaterThan(String value) {
            addCriterion("BIANMA >", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaGreaterThanOrEqualTo(String value) {
            addCriterion("BIANMA >=", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaLessThan(String value) {
            addCriterion("BIANMA <", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaLessThanOrEqualTo(String value) {
            addCriterion("BIANMA <=", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaLike(String value) {
            addCriterion("BIANMA like", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaNotLike(String value) {
            addCriterion("BIANMA not like", value, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaIn(List<String> values) {
            addCriterion("BIANMA in", values, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaNotIn(List<String> values) {
            addCriterion("BIANMA not in", values, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaBetween(String value1, String value2) {
            addCriterion("BIANMA between", value1, value2, "bianma");
            return (Criteria) this;
        }

        public Criteria andBianmaNotBetween(String value1, String value2) {
            addCriterion("BIANMA not between", value1, value2, "bianma");
            return (Criteria) this;
        }

        public Criteria andOrdyByIsNull() {
            addCriterion("ORDY_BY is null");
            return (Criteria) this;
        }

        public Criteria andOrdyByIsNotNull() {
            addCriterion("ORDY_BY is not null");
            return (Criteria) this;
        }

        public Criteria andOrdyByEqualTo(Integer value) {
            addCriterion("ORDY_BY =", value, "ordyBy");
            return (Criteria) this;
        }

        public Criteria andOrdyByNotEqualTo(Integer value) {
            addCriterion("ORDY_BY <>", value, "ordyBy");
            return (Criteria) this;
        }

        public Criteria andOrdyByGreaterThan(Integer value) {
            addCriterion("ORDY_BY >", value, "ordyBy");
            return (Criteria) this;
        }

        public Criteria andOrdyByGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDY_BY >=", value, "ordyBy");
            return (Criteria) this;
        }

        public Criteria andOrdyByLessThan(Integer value) {
            addCriterion("ORDY_BY <", value, "ordyBy");
            return (Criteria) this;
        }

        public Criteria andOrdyByLessThanOrEqualTo(Integer value) {
            addCriterion("ORDY_BY <=", value, "ordyBy");
            return (Criteria) this;
        }

        public Criteria andOrdyByIn(List<Integer> values) {
            addCriterion("ORDY_BY in", values, "ordyBy");
            return (Criteria) this;
        }

        public Criteria andOrdyByNotIn(List<Integer> values) {
            addCriterion("ORDY_BY not in", values, "ordyBy");
            return (Criteria) this;
        }

        public Criteria andOrdyByBetween(Integer value1, Integer value2) {
            addCriterion("ORDY_BY between", value1, value2, "ordyBy");
            return (Criteria) this;
        }

        public Criteria andOrdyByNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDY_BY not between", value1, value2, "ordyBy");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("PARENT_ID like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("PARENT_ID not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andJbIsNull() {
            addCriterion("JB is null");
            return (Criteria) this;
        }

        public Criteria andJbIsNotNull() {
            addCriterion("JB is not null");
            return (Criteria) this;
        }

        public Criteria andJbEqualTo(Integer value) {
            addCriterion("JB =", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbNotEqualTo(Integer value) {
            addCriterion("JB <>", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbGreaterThan(Integer value) {
            addCriterion("JB >", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbGreaterThanOrEqualTo(Integer value) {
            addCriterion("JB >=", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbLessThan(Integer value) {
            addCriterion("JB <", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbLessThanOrEqualTo(Integer value) {
            addCriterion("JB <=", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbIn(List<Integer> values) {
            addCriterion("JB in", values, "jb");
            return (Criteria) this;
        }

        public Criteria andJbNotIn(List<Integer> values) {
            addCriterion("JB not in", values, "jb");
            return (Criteria) this;
        }

        public Criteria andJbBetween(Integer value1, Integer value2) {
            addCriterion("JB between", value1, value2, "jb");
            return (Criteria) this;
        }

        public Criteria andJbNotBetween(Integer value1, Integer value2) {
            addCriterion("JB not between", value1, value2, "jb");
            return (Criteria) this;
        }

        public Criteria andPBmIsNull() {
            addCriterion("P_BM is null");
            return (Criteria) this;
        }

        public Criteria andPBmIsNotNull() {
            addCriterion("P_BM is not null");
            return (Criteria) this;
        }

        public Criteria andPBmEqualTo(String value) {
            addCriterion("P_BM =", value, "pBm");
            return (Criteria) this;
        }

        public Criteria andPBmNotEqualTo(String value) {
            addCriterion("P_BM <>", value, "pBm");
            return (Criteria) this;
        }

        public Criteria andPBmGreaterThan(String value) {
            addCriterion("P_BM >", value, "pBm");
            return (Criteria) this;
        }

        public Criteria andPBmGreaterThanOrEqualTo(String value) {
            addCriterion("P_BM >=", value, "pBm");
            return (Criteria) this;
        }

        public Criteria andPBmLessThan(String value) {
            addCriterion("P_BM <", value, "pBm");
            return (Criteria) this;
        }

        public Criteria andPBmLessThanOrEqualTo(String value) {
            addCriterion("P_BM <=", value, "pBm");
            return (Criteria) this;
        }

        public Criteria andPBmLike(String value) {
            addCriterion("P_BM like", value, "pBm");
            return (Criteria) this;
        }

        public Criteria andPBmNotLike(String value) {
            addCriterion("P_BM not like", value, "pBm");
            return (Criteria) this;
        }

        public Criteria andPBmIn(List<String> values) {
            addCriterion("P_BM in", values, "pBm");
            return (Criteria) this;
        }

        public Criteria andPBmNotIn(List<String> values) {
            addCriterion("P_BM not in", values, "pBm");
            return (Criteria) this;
        }

        public Criteria andPBmBetween(String value1, String value2) {
            addCriterion("P_BM between", value1, value2, "pBm");
            return (Criteria) this;
        }

        public Criteria andPBmNotBetween(String value1, String value2) {
            addCriterion("P_BM not between", value1, value2, "pBm");
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