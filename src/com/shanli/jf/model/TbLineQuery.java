package com.shanli.jf.model;

import java.util.ArrayList;
import java.util.List;

public class TbLineQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public TbLineQuery() {
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

        public Criteria andLineIdIsNull() {
            addCriterion("LINE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLineIdIsNotNull() {
            addCriterion("LINE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLineIdEqualTo(String value) {
            addCriterion("LINE_ID =", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotEqualTo(String value) {
            addCriterion("LINE_ID <>", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdGreaterThan(String value) {
            addCriterion("LINE_ID >", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdGreaterThanOrEqualTo(String value) {
            addCriterion("LINE_ID >=", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLessThan(String value) {
            addCriterion("LINE_ID <", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLessThanOrEqualTo(String value) {
            addCriterion("LINE_ID <=", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLike(String value) {
            addCriterion("LINE_ID like", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotLike(String value) {
            addCriterion("LINE_ID not like", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdIn(List<String> values) {
            addCriterion("LINE_ID in", values, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotIn(List<String> values) {
            addCriterion("LINE_ID not in", values, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdBetween(String value1, String value2) {
            addCriterion("LINE_ID between", value1, value2, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotBetween(String value1, String value2) {
            addCriterion("LINE_ID not between", value1, value2, "lineId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andLineUrlIsNull() {
            addCriterion("LINE_URL is null");
            return (Criteria) this;
        }

        public Criteria andLineUrlIsNotNull() {
            addCriterion("LINE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andLineUrlEqualTo(String value) {
            addCriterion("LINE_URL =", value, "lineUrl");
            return (Criteria) this;
        }

        public Criteria andLineUrlNotEqualTo(String value) {
            addCriterion("LINE_URL <>", value, "lineUrl");
            return (Criteria) this;
        }

        public Criteria andLineUrlGreaterThan(String value) {
            addCriterion("LINE_URL >", value, "lineUrl");
            return (Criteria) this;
        }

        public Criteria andLineUrlGreaterThanOrEqualTo(String value) {
            addCriterion("LINE_URL >=", value, "lineUrl");
            return (Criteria) this;
        }

        public Criteria andLineUrlLessThan(String value) {
            addCriterion("LINE_URL <", value, "lineUrl");
            return (Criteria) this;
        }

        public Criteria andLineUrlLessThanOrEqualTo(String value) {
            addCriterion("LINE_URL <=", value, "lineUrl");
            return (Criteria) this;
        }

        public Criteria andLineUrlLike(String value) {
            addCriterion("LINE_URL like", value, "lineUrl");
            return (Criteria) this;
        }

        public Criteria andLineUrlNotLike(String value) {
            addCriterion("LINE_URL not like", value, "lineUrl");
            return (Criteria) this;
        }

        public Criteria andLineUrlIn(List<String> values) {
            addCriterion("LINE_URL in", values, "lineUrl");
            return (Criteria) this;
        }

        public Criteria andLineUrlNotIn(List<String> values) {
            addCriterion("LINE_URL not in", values, "lineUrl");
            return (Criteria) this;
        }

        public Criteria andLineUrlBetween(String value1, String value2) {
            addCriterion("LINE_URL between", value1, value2, "lineUrl");
            return (Criteria) this;
        }

        public Criteria andLineUrlNotBetween(String value1, String value2) {
            addCriterion("LINE_URL not between", value1, value2, "lineUrl");
            return (Criteria) this;
        }

        public Criteria andLineRoadIsNull() {
            addCriterion("LINE_ROAD is null");
            return (Criteria) this;
        }

        public Criteria andLineRoadIsNotNull() {
            addCriterion("LINE_ROAD is not null");
            return (Criteria) this;
        }

        public Criteria andLineRoadEqualTo(String value) {
            addCriterion("LINE_ROAD =", value, "lineRoad");
            return (Criteria) this;
        }

        public Criteria andLineRoadNotEqualTo(String value) {
            addCriterion("LINE_ROAD <>", value, "lineRoad");
            return (Criteria) this;
        }

        public Criteria andLineRoadGreaterThan(String value) {
            addCriterion("LINE_ROAD >", value, "lineRoad");
            return (Criteria) this;
        }

        public Criteria andLineRoadGreaterThanOrEqualTo(String value) {
            addCriterion("LINE_ROAD >=", value, "lineRoad");
            return (Criteria) this;
        }

        public Criteria andLineRoadLessThan(String value) {
            addCriterion("LINE_ROAD <", value, "lineRoad");
            return (Criteria) this;
        }

        public Criteria andLineRoadLessThanOrEqualTo(String value) {
            addCriterion("LINE_ROAD <=", value, "lineRoad");
            return (Criteria) this;
        }

        public Criteria andLineRoadLike(String value) {
            addCriterion("LINE_ROAD like", value, "lineRoad");
            return (Criteria) this;
        }

        public Criteria andLineRoadNotLike(String value) {
            addCriterion("LINE_ROAD not like", value, "lineRoad");
            return (Criteria) this;
        }

        public Criteria andLineRoadIn(List<String> values) {
            addCriterion("LINE_ROAD in", values, "lineRoad");
            return (Criteria) this;
        }

        public Criteria andLineRoadNotIn(List<String> values) {
            addCriterion("LINE_ROAD not in", values, "lineRoad");
            return (Criteria) this;
        }

        public Criteria andLineRoadBetween(String value1, String value2) {
            addCriterion("LINE_ROAD between", value1, value2, "lineRoad");
            return (Criteria) this;
        }

        public Criteria andLineRoadNotBetween(String value1, String value2) {
            addCriterion("LINE_ROAD not between", value1, value2, "lineRoad");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andLineOrderIsNull() {
            addCriterion("LINE_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andLineOrderIsNotNull() {
            addCriterion("LINE_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andLineOrderEqualTo(Integer value) {
            addCriterion("LINE_ORDER =", value, "lineOrder");
            return (Criteria) this;
        }

        public Criteria andLineOrderNotEqualTo(Integer value) {
            addCriterion("LINE_ORDER <>", value, "lineOrder");
            return (Criteria) this;
        }

        public Criteria andLineOrderGreaterThan(Integer value) {
            addCriterion("LINE_ORDER >", value, "lineOrder");
            return (Criteria) this;
        }

        public Criteria andLineOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("LINE_ORDER >=", value, "lineOrder");
            return (Criteria) this;
        }

        public Criteria andLineOrderLessThan(Integer value) {
            addCriterion("LINE_ORDER <", value, "lineOrder");
            return (Criteria) this;
        }

        public Criteria andLineOrderLessThanOrEqualTo(Integer value) {
            addCriterion("LINE_ORDER <=", value, "lineOrder");
            return (Criteria) this;
        }

        public Criteria andLineOrderIn(List<Integer> values) {
            addCriterion("LINE_ORDER in", values, "lineOrder");
            return (Criteria) this;
        }

        public Criteria andLineOrderNotIn(List<Integer> values) {
            addCriterion("LINE_ORDER not in", values, "lineOrder");
            return (Criteria) this;
        }

        public Criteria andLineOrderBetween(Integer value1, Integer value2) {
            addCriterion("LINE_ORDER between", value1, value2, "lineOrder");
            return (Criteria) this;
        }

        public Criteria andLineOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("LINE_ORDER not between", value1, value2, "lineOrder");
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