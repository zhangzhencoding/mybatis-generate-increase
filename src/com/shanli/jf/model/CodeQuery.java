package com.shanli.jf.model;

import java.util.ArrayList;
import java.util.List;

public class CodeQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public CodeQuery() {
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

        public Criteria andTabnameIsNull() {
            addCriterion("tabname is null");
            return (Criteria) this;
        }

        public Criteria andTabnameIsNotNull() {
            addCriterion("tabname is not null");
            return (Criteria) this;
        }

        public Criteria andTabnameEqualTo(String value) {
            addCriterion("tabname =", value, "tabname");
            return (Criteria) this;
        }

        public Criteria andTabnameNotEqualTo(String value) {
            addCriterion("tabname <>", value, "tabname");
            return (Criteria) this;
        }

        public Criteria andTabnameGreaterThan(String value) {
            addCriterion("tabname >", value, "tabname");
            return (Criteria) this;
        }

        public Criteria andTabnameGreaterThanOrEqualTo(String value) {
            addCriterion("tabname >=", value, "tabname");
            return (Criteria) this;
        }

        public Criteria andTabnameLessThan(String value) {
            addCriterion("tabname <", value, "tabname");
            return (Criteria) this;
        }

        public Criteria andTabnameLessThanOrEqualTo(String value) {
            addCriterion("tabname <=", value, "tabname");
            return (Criteria) this;
        }

        public Criteria andTabnameLike(String value) {
            addCriterion("tabname like", value, "tabname");
            return (Criteria) this;
        }

        public Criteria andTabnameNotLike(String value) {
            addCriterion("tabname not like", value, "tabname");
            return (Criteria) this;
        }

        public Criteria andTabnameIn(List<String> values) {
            addCriterion("tabname in", values, "tabname");
            return (Criteria) this;
        }

        public Criteria andTabnameNotIn(List<String> values) {
            addCriterion("tabname not in", values, "tabname");
            return (Criteria) this;
        }

        public Criteria andTabnameBetween(String value1, String value2) {
            addCriterion("tabname between", value1, value2, "tabname");
            return (Criteria) this;
        }

        public Criteria andTabnameNotBetween(String value1, String value2) {
            addCriterion("tabname not between", value1, value2, "tabname");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andDfvsIsNull() {
            addCriterion("dfvs is null");
            return (Criteria) this;
        }

        public Criteria andDfvsIsNotNull() {
            addCriterion("dfvs is not null");
            return (Criteria) this;
        }

        public Criteria andDfvsEqualTo(String value) {
            addCriterion("dfvs =", value, "dfvs");
            return (Criteria) this;
        }

        public Criteria andDfvsNotEqualTo(String value) {
            addCriterion("dfvs <>", value, "dfvs");
            return (Criteria) this;
        }

        public Criteria andDfvsGreaterThan(String value) {
            addCriterion("dfvs >", value, "dfvs");
            return (Criteria) this;
        }

        public Criteria andDfvsGreaterThanOrEqualTo(String value) {
            addCriterion("dfvs >=", value, "dfvs");
            return (Criteria) this;
        }

        public Criteria andDfvsLessThan(String value) {
            addCriterion("dfvs <", value, "dfvs");
            return (Criteria) this;
        }

        public Criteria andDfvsLessThanOrEqualTo(String value) {
            addCriterion("dfvs <=", value, "dfvs");
            return (Criteria) this;
        }

        public Criteria andDfvsLike(String value) {
            addCriterion("dfvs like", value, "dfvs");
            return (Criteria) this;
        }

        public Criteria andDfvsNotLike(String value) {
            addCriterion("dfvs not like", value, "dfvs");
            return (Criteria) this;
        }

        public Criteria andDfvsIn(List<String> values) {
            addCriterion("dfvs in", values, "dfvs");
            return (Criteria) this;
        }

        public Criteria andDfvsNotIn(List<String> values) {
            addCriterion("dfvs not in", values, "dfvs");
            return (Criteria) this;
        }

        public Criteria andDfvsBetween(String value1, String value2) {
            addCriterion("dfvs between", value1, value2, "dfvs");
            return (Criteria) this;
        }

        public Criteria andDfvsNotBetween(String value1, String value2) {
            addCriterion("dfvs not between", value1, value2, "dfvs");
            return (Criteria) this;
        }

        public Criteria andKfIsNull() {
            addCriterion("kf is null");
            return (Criteria) this;
        }

        public Criteria andKfIsNotNull() {
            addCriterion("kf is not null");
            return (Criteria) this;
        }

        public Criteria andKfEqualTo(Short value) {
            addCriterion("kf =", value, "kf");
            return (Criteria) this;
        }

        public Criteria andKfNotEqualTo(Short value) {
            addCriterion("kf <>", value, "kf");
            return (Criteria) this;
        }

        public Criteria andKfGreaterThan(Short value) {
            addCriterion("kf >", value, "kf");
            return (Criteria) this;
        }

        public Criteria andKfGreaterThanOrEqualTo(Short value) {
            addCriterion("kf >=", value, "kf");
            return (Criteria) this;
        }

        public Criteria andKfLessThan(Short value) {
            addCriterion("kf <", value, "kf");
            return (Criteria) this;
        }

        public Criteria andKfLessThanOrEqualTo(Short value) {
            addCriterion("kf <=", value, "kf");
            return (Criteria) this;
        }

        public Criteria andKfIn(List<Short> values) {
            addCriterion("kf in", values, "kf");
            return (Criteria) this;
        }

        public Criteria andKfNotIn(List<Short> values) {
            addCriterion("kf not in", values, "kf");
            return (Criteria) this;
        }

        public Criteria andKfBetween(Short value1, Short value2) {
            addCriterion("kf between", value1, value2, "kf");
            return (Criteria) this;
        }

        public Criteria andKfNotBetween(Short value1, Short value2) {
            addCriterion("kf not between", value1, value2, "kf");
            return (Criteria) this;
        }

        public Criteria andKjfIsNull() {
            addCriterion("kjf is null");
            return (Criteria) this;
        }

        public Criteria andKjfIsNotNull() {
            addCriterion("kjf is not null");
            return (Criteria) this;
        }

        public Criteria andKjfEqualTo(Short value) {
            addCriterion("kjf =", value, "kjf");
            return (Criteria) this;
        }

        public Criteria andKjfNotEqualTo(Short value) {
            addCriterion("kjf <>", value, "kjf");
            return (Criteria) this;
        }

        public Criteria andKjfGreaterThan(Short value) {
            addCriterion("kjf >", value, "kjf");
            return (Criteria) this;
        }

        public Criteria andKjfGreaterThanOrEqualTo(Short value) {
            addCriterion("kjf >=", value, "kjf");
            return (Criteria) this;
        }

        public Criteria andKjfLessThan(Short value) {
            addCriterion("kjf <", value, "kjf");
            return (Criteria) this;
        }

        public Criteria andKjfLessThanOrEqualTo(Short value) {
            addCriterion("kjf <=", value, "kjf");
            return (Criteria) this;
        }

        public Criteria andKjfIn(List<Short> values) {
            addCriterion("kjf in", values, "kjf");
            return (Criteria) this;
        }

        public Criteria andKjfNotIn(List<Short> values) {
            addCriterion("kjf not in", values, "kjf");
            return (Criteria) this;
        }

        public Criteria andKjfBetween(Short value1, Short value2) {
            addCriterion("kjf between", value1, value2, "kjf");
            return (Criteria) this;
        }

        public Criteria andKjfNotBetween(Short value1, Short value2) {
            addCriterion("kjf not between", value1, value2, "kjf");
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