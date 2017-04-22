package com.shanli.jf.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysCodeConfigInfoQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public SysCodeConfigInfoQuery() {
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

        public Criteria andCodeNameIsNull() {
            addCriterion("code_name is null");
            return (Criteria) this;
        }

        public Criteria andCodeNameIsNotNull() {
            addCriterion("code_name is not null");
            return (Criteria) this;
        }

        public Criteria andCodeNameEqualTo(String value) {
            addCriterion("code_name =", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameNotEqualTo(String value) {
            addCriterion("code_name <>", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameGreaterThan(String value) {
            addCriterion("code_name >", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("code_name >=", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameLessThan(String value) {
            addCriterion("code_name <", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameLessThanOrEqualTo(String value) {
            addCriterion("code_name <=", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameLike(String value) {
            addCriterion("code_name like", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameNotLike(String value) {
            addCriterion("code_name not like", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameIn(List<String> values) {
            addCriterion("code_name in", values, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameNotIn(List<String> values) {
            addCriterion("code_name not in", values, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameBetween(String value1, String value2) {
            addCriterion("code_name between", value1, value2, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameNotBetween(String value1, String value2) {
            addCriterion("code_name not between", value1, value2, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeDescIsNull() {
            addCriterion("code_desc is null");
            return (Criteria) this;
        }

        public Criteria andCodeDescIsNotNull() {
            addCriterion("code_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCodeDescEqualTo(String value) {
            addCriterion("code_desc =", value, "codeDesc");
            return (Criteria) this;
        }

        public Criteria andCodeDescNotEqualTo(String value) {
            addCriterion("code_desc <>", value, "codeDesc");
            return (Criteria) this;
        }

        public Criteria andCodeDescGreaterThan(String value) {
            addCriterion("code_desc >", value, "codeDesc");
            return (Criteria) this;
        }

        public Criteria andCodeDescGreaterThanOrEqualTo(String value) {
            addCriterion("code_desc >=", value, "codeDesc");
            return (Criteria) this;
        }

        public Criteria andCodeDescLessThan(String value) {
            addCriterion("code_desc <", value, "codeDesc");
            return (Criteria) this;
        }

        public Criteria andCodeDescLessThanOrEqualTo(String value) {
            addCriterion("code_desc <=", value, "codeDesc");
            return (Criteria) this;
        }

        public Criteria andCodeDescLike(String value) {
            addCriterion("code_desc like", value, "codeDesc");
            return (Criteria) this;
        }

        public Criteria andCodeDescNotLike(String value) {
            addCriterion("code_desc not like", value, "codeDesc");
            return (Criteria) this;
        }

        public Criteria andCodeDescIn(List<String> values) {
            addCriterion("code_desc in", values, "codeDesc");
            return (Criteria) this;
        }

        public Criteria andCodeDescNotIn(List<String> values) {
            addCriterion("code_desc not in", values, "codeDesc");
            return (Criteria) this;
        }

        public Criteria andCodeDescBetween(String value1, String value2) {
            addCriterion("code_desc between", value1, value2, "codeDesc");
            return (Criteria) this;
        }

        public Criteria andCodeDescNotBetween(String value1, String value2) {
            addCriterion("code_desc not between", value1, value2, "codeDesc");
            return (Criteria) this;
        }

        public Criteria andSubCodeNameIsNull() {
            addCriterion("sub_code_name is null");
            return (Criteria) this;
        }

        public Criteria andSubCodeNameIsNotNull() {
            addCriterion("sub_code_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubCodeNameEqualTo(String value) {
            addCriterion("sub_code_name =", value, "subCodeName");
            return (Criteria) this;
        }

        public Criteria andSubCodeNameNotEqualTo(String value) {
            addCriterion("sub_code_name <>", value, "subCodeName");
            return (Criteria) this;
        }

        public Criteria andSubCodeNameGreaterThan(String value) {
            addCriterion("sub_code_name >", value, "subCodeName");
            return (Criteria) this;
        }

        public Criteria andSubCodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("sub_code_name >=", value, "subCodeName");
            return (Criteria) this;
        }

        public Criteria andSubCodeNameLessThan(String value) {
            addCriterion("sub_code_name <", value, "subCodeName");
            return (Criteria) this;
        }

        public Criteria andSubCodeNameLessThanOrEqualTo(String value) {
            addCriterion("sub_code_name <=", value, "subCodeName");
            return (Criteria) this;
        }

        public Criteria andSubCodeNameLike(String value) {
            addCriterion("sub_code_name like", value, "subCodeName");
            return (Criteria) this;
        }

        public Criteria andSubCodeNameNotLike(String value) {
            addCriterion("sub_code_name not like", value, "subCodeName");
            return (Criteria) this;
        }

        public Criteria andSubCodeNameIn(List<String> values) {
            addCriterion("sub_code_name in", values, "subCodeName");
            return (Criteria) this;
        }

        public Criteria andSubCodeNameNotIn(List<String> values) {
            addCriterion("sub_code_name not in", values, "subCodeName");
            return (Criteria) this;
        }

        public Criteria andSubCodeNameBetween(String value1, String value2) {
            addCriterion("sub_code_name between", value1, value2, "subCodeName");
            return (Criteria) this;
        }

        public Criteria andSubCodeNameNotBetween(String value1, String value2) {
            addCriterion("sub_code_name not between", value1, value2, "subCodeName");
            return (Criteria) this;
        }

        public Criteria andSubCodeDescIsNull() {
            addCriterion("sub_code_desc is null");
            return (Criteria) this;
        }

        public Criteria andSubCodeDescIsNotNull() {
            addCriterion("sub_code_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSubCodeDescEqualTo(String value) {
            addCriterion("sub_code_desc =", value, "subCodeDesc");
            return (Criteria) this;
        }

        public Criteria andSubCodeDescNotEqualTo(String value) {
            addCriterion("sub_code_desc <>", value, "subCodeDesc");
            return (Criteria) this;
        }

        public Criteria andSubCodeDescGreaterThan(String value) {
            addCriterion("sub_code_desc >", value, "subCodeDesc");
            return (Criteria) this;
        }

        public Criteria andSubCodeDescGreaterThanOrEqualTo(String value) {
            addCriterion("sub_code_desc >=", value, "subCodeDesc");
            return (Criteria) this;
        }

        public Criteria andSubCodeDescLessThan(String value) {
            addCriterion("sub_code_desc <", value, "subCodeDesc");
            return (Criteria) this;
        }

        public Criteria andSubCodeDescLessThanOrEqualTo(String value) {
            addCriterion("sub_code_desc <=", value, "subCodeDesc");
            return (Criteria) this;
        }

        public Criteria andSubCodeDescLike(String value) {
            addCriterion("sub_code_desc like", value, "subCodeDesc");
            return (Criteria) this;
        }

        public Criteria andSubCodeDescNotLike(String value) {
            addCriterion("sub_code_desc not like", value, "subCodeDesc");
            return (Criteria) this;
        }

        public Criteria andSubCodeDescIn(List<String> values) {
            addCriterion("sub_code_desc in", values, "subCodeDesc");
            return (Criteria) this;
        }

        public Criteria andSubCodeDescNotIn(List<String> values) {
            addCriterion("sub_code_desc not in", values, "subCodeDesc");
            return (Criteria) this;
        }

        public Criteria andSubCodeDescBetween(String value1, String value2) {
            addCriterion("sub_code_desc between", value1, value2, "subCodeDesc");
            return (Criteria) this;
        }

        public Criteria andSubCodeDescNotBetween(String value1, String value2) {
            addCriterion("sub_code_desc not between", value1, value2, "subCodeDesc");
            return (Criteria) this;
        }

        public Criteria andCodeValueIsNull() {
            addCriterion("code_value is null");
            return (Criteria) this;
        }

        public Criteria andCodeValueIsNotNull() {
            addCriterion("code_value is not null");
            return (Criteria) this;
        }

        public Criteria andCodeValueEqualTo(String value) {
            addCriterion("code_value =", value, "codeValue");
            return (Criteria) this;
        }

        public Criteria andCodeValueNotEqualTo(String value) {
            addCriterion("code_value <>", value, "codeValue");
            return (Criteria) this;
        }

        public Criteria andCodeValueGreaterThan(String value) {
            addCriterion("code_value >", value, "codeValue");
            return (Criteria) this;
        }

        public Criteria andCodeValueGreaterThanOrEqualTo(String value) {
            addCriterion("code_value >=", value, "codeValue");
            return (Criteria) this;
        }

        public Criteria andCodeValueLessThan(String value) {
            addCriterion("code_value <", value, "codeValue");
            return (Criteria) this;
        }

        public Criteria andCodeValueLessThanOrEqualTo(String value) {
            addCriterion("code_value <=", value, "codeValue");
            return (Criteria) this;
        }

        public Criteria andCodeValueLike(String value) {
            addCriterion("code_value like", value, "codeValue");
            return (Criteria) this;
        }

        public Criteria andCodeValueNotLike(String value) {
            addCriterion("code_value not like", value, "codeValue");
            return (Criteria) this;
        }

        public Criteria andCodeValueIn(List<String> values) {
            addCriterion("code_value in", values, "codeValue");
            return (Criteria) this;
        }

        public Criteria andCodeValueNotIn(List<String> values) {
            addCriterion("code_value not in", values, "codeValue");
            return (Criteria) this;
        }

        public Criteria andCodeValueBetween(String value1, String value2) {
            addCriterion("code_value between", value1, value2, "codeValue");
            return (Criteria) this;
        }

        public Criteria andCodeValueNotBetween(String value1, String value2) {
            addCriterion("code_value not between", value1, value2, "codeValue");
            return (Criteria) this;
        }

        public Criteria andCodeValueDescIsNull() {
            addCriterion("code_value_desc is null");
            return (Criteria) this;
        }

        public Criteria andCodeValueDescIsNotNull() {
            addCriterion("code_value_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCodeValueDescEqualTo(String value) {
            addCriterion("code_value_desc =", value, "codeValueDesc");
            return (Criteria) this;
        }

        public Criteria andCodeValueDescNotEqualTo(String value) {
            addCriterion("code_value_desc <>", value, "codeValueDesc");
            return (Criteria) this;
        }

        public Criteria andCodeValueDescGreaterThan(String value) {
            addCriterion("code_value_desc >", value, "codeValueDesc");
            return (Criteria) this;
        }

        public Criteria andCodeValueDescGreaterThanOrEqualTo(String value) {
            addCriterion("code_value_desc >=", value, "codeValueDesc");
            return (Criteria) this;
        }

        public Criteria andCodeValueDescLessThan(String value) {
            addCriterion("code_value_desc <", value, "codeValueDesc");
            return (Criteria) this;
        }

        public Criteria andCodeValueDescLessThanOrEqualTo(String value) {
            addCriterion("code_value_desc <=", value, "codeValueDesc");
            return (Criteria) this;
        }

        public Criteria andCodeValueDescLike(String value) {
            addCriterion("code_value_desc like", value, "codeValueDesc");
            return (Criteria) this;
        }

        public Criteria andCodeValueDescNotLike(String value) {
            addCriterion("code_value_desc not like", value, "codeValueDesc");
            return (Criteria) this;
        }

        public Criteria andCodeValueDescIn(List<String> values) {
            addCriterion("code_value_desc in", values, "codeValueDesc");
            return (Criteria) this;
        }

        public Criteria andCodeValueDescNotIn(List<String> values) {
            addCriterion("code_value_desc not in", values, "codeValueDesc");
            return (Criteria) this;
        }

        public Criteria andCodeValueDescBetween(String value1, String value2) {
            addCriterion("code_value_desc between", value1, value2, "codeValueDesc");
            return (Criteria) this;
        }

        public Criteria andCodeValueDescNotBetween(String value1, String value2) {
            addCriterion("code_value_desc not between", value1, value2, "codeValueDesc");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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