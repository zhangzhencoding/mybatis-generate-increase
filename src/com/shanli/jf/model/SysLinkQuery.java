package com.shanli.jf.model;

import java.util.ArrayList;
import java.util.List;

public class SysLinkQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public SysLinkQuery() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStienameIsNull() {
            addCriterion("stiename is null");
            return (Criteria) this;
        }

        public Criteria andStienameIsNotNull() {
            addCriterion("stiename is not null");
            return (Criteria) this;
        }

        public Criteria andStienameEqualTo(String value) {
            addCriterion("stiename =", value, "stiename");
            return (Criteria) this;
        }

        public Criteria andStienameNotEqualTo(String value) {
            addCriterion("stiename <>", value, "stiename");
            return (Criteria) this;
        }

        public Criteria andStienameGreaterThan(String value) {
            addCriterion("stiename >", value, "stiename");
            return (Criteria) this;
        }

        public Criteria andStienameGreaterThanOrEqualTo(String value) {
            addCriterion("stiename >=", value, "stiename");
            return (Criteria) this;
        }

        public Criteria andStienameLessThan(String value) {
            addCriterion("stiename <", value, "stiename");
            return (Criteria) this;
        }

        public Criteria andStienameLessThanOrEqualTo(String value) {
            addCriterion("stiename <=", value, "stiename");
            return (Criteria) this;
        }

        public Criteria andStienameLike(String value) {
            addCriterion("stiename like", value, "stiename");
            return (Criteria) this;
        }

        public Criteria andStienameNotLike(String value) {
            addCriterion("stiename not like", value, "stiename");
            return (Criteria) this;
        }

        public Criteria andStienameIn(List<String> values) {
            addCriterion("stiename in", values, "stiename");
            return (Criteria) this;
        }

        public Criteria andStienameNotIn(List<String> values) {
            addCriterion("stiename not in", values, "stiename");
            return (Criteria) this;
        }

        public Criteria andStienameBetween(String value1, String value2) {
            addCriterion("stiename between", value1, value2, "stiename");
            return (Criteria) this;
        }

        public Criteria andStienameNotBetween(String value1, String value2) {
            addCriterion("stiename not between", value1, value2, "stiename");
            return (Criteria) this;
        }

        public Criteria andSitecontentIsNull() {
            addCriterion("sitecontent is null");
            return (Criteria) this;
        }

        public Criteria andSitecontentIsNotNull() {
            addCriterion("sitecontent is not null");
            return (Criteria) this;
        }

        public Criteria andSitecontentEqualTo(String value) {
            addCriterion("sitecontent =", value, "sitecontent");
            return (Criteria) this;
        }

        public Criteria andSitecontentNotEqualTo(String value) {
            addCriterion("sitecontent <>", value, "sitecontent");
            return (Criteria) this;
        }

        public Criteria andSitecontentGreaterThan(String value) {
            addCriterion("sitecontent >", value, "sitecontent");
            return (Criteria) this;
        }

        public Criteria andSitecontentGreaterThanOrEqualTo(String value) {
            addCriterion("sitecontent >=", value, "sitecontent");
            return (Criteria) this;
        }

        public Criteria andSitecontentLessThan(String value) {
            addCriterion("sitecontent <", value, "sitecontent");
            return (Criteria) this;
        }

        public Criteria andSitecontentLessThanOrEqualTo(String value) {
            addCriterion("sitecontent <=", value, "sitecontent");
            return (Criteria) this;
        }

        public Criteria andSitecontentLike(String value) {
            addCriterion("sitecontent like", value, "sitecontent");
            return (Criteria) this;
        }

        public Criteria andSitecontentNotLike(String value) {
            addCriterion("sitecontent not like", value, "sitecontent");
            return (Criteria) this;
        }

        public Criteria andSitecontentIn(List<String> values) {
            addCriterion("sitecontent in", values, "sitecontent");
            return (Criteria) this;
        }

        public Criteria andSitecontentNotIn(List<String> values) {
            addCriterion("sitecontent not in", values, "sitecontent");
            return (Criteria) this;
        }

        public Criteria andSitecontentBetween(String value1, String value2) {
            addCriterion("sitecontent between", value1, value2, "sitecontent");
            return (Criteria) this;
        }

        public Criteria andSitecontentNotBetween(String value1, String value2) {
            addCriterion("sitecontent not between", value1, value2, "sitecontent");
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

        public Criteria andStieurlIsNull() {
            addCriterion("stieurl is null");
            return (Criteria) this;
        }

        public Criteria andStieurlIsNotNull() {
            addCriterion("stieurl is not null");
            return (Criteria) this;
        }

        public Criteria andStieurlEqualTo(String value) {
            addCriterion("stieurl =", value, "stieurl");
            return (Criteria) this;
        }

        public Criteria andStieurlNotEqualTo(String value) {
            addCriterion("stieurl <>", value, "stieurl");
            return (Criteria) this;
        }

        public Criteria andStieurlGreaterThan(String value) {
            addCriterion("stieurl >", value, "stieurl");
            return (Criteria) this;
        }

        public Criteria andStieurlGreaterThanOrEqualTo(String value) {
            addCriterion("stieurl >=", value, "stieurl");
            return (Criteria) this;
        }

        public Criteria andStieurlLessThan(String value) {
            addCriterion("stieurl <", value, "stieurl");
            return (Criteria) this;
        }

        public Criteria andStieurlLessThanOrEqualTo(String value) {
            addCriterion("stieurl <=", value, "stieurl");
            return (Criteria) this;
        }

        public Criteria andStieurlLike(String value) {
            addCriterion("stieurl like", value, "stieurl");
            return (Criteria) this;
        }

        public Criteria andStieurlNotLike(String value) {
            addCriterion("stieurl not like", value, "stieurl");
            return (Criteria) this;
        }

        public Criteria andStieurlIn(List<String> values) {
            addCriterion("stieurl in", values, "stieurl");
            return (Criteria) this;
        }

        public Criteria andStieurlNotIn(List<String> values) {
            addCriterion("stieurl not in", values, "stieurl");
            return (Criteria) this;
        }

        public Criteria andStieurlBetween(String value1, String value2) {
            addCriterion("stieurl between", value1, value2, "stieurl");
            return (Criteria) this;
        }

        public Criteria andStieurlNotBetween(String value1, String value2) {
            addCriterion("stieurl not between", value1, value2, "stieurl");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(String value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(String value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(String value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(String value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(String value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(String value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLike(String value) {
            addCriterion("addtime like", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotLike(String value) {
            addCriterion("addtime not like", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<String> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<String> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(String value1, String value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(String value1, String value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNull() {
            addCriterion("uptime is null");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNotNull() {
            addCriterion("uptime is not null");
            return (Criteria) this;
        }

        public Criteria andUptimeEqualTo(String value) {
            addCriterion("uptime =", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotEqualTo(String value) {
            addCriterion("uptime <>", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThan(String value) {
            addCriterion("uptime >", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThanOrEqualTo(String value) {
            addCriterion("uptime >=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThan(String value) {
            addCriterion("uptime <", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThanOrEqualTo(String value) {
            addCriterion("uptime <=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLike(String value) {
            addCriterion("uptime like", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotLike(String value) {
            addCriterion("uptime not like", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeIn(List<String> values) {
            addCriterion("uptime in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotIn(List<String> values) {
            addCriterion("uptime not in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeBetween(String value1, String value2) {
            addCriterion("uptime between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotBetween(String value1, String value2) {
            addCriterion("uptime not between", value1, value2, "uptime");
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

        public Criteria andSequenceIsNull() {
            addCriterion("sequence is null");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNotNull() {
            addCriterion("sequence is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceEqualTo(Integer value) {
            addCriterion("sequence =", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotEqualTo(Integer value) {
            addCriterion("sequence <>", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThan(Integer value) {
            addCriterion("sequence >", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("sequence >=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThan(Integer value) {
            addCriterion("sequence <", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThanOrEqualTo(Integer value) {
            addCriterion("sequence <=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceIn(List<Integer> values) {
            addCriterion("sequence in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotIn(List<Integer> values) {
            addCriterion("sequence not in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceBetween(Integer value1, Integer value2) {
            addCriterion("sequence between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("sequence not between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andTourlIsNull() {
            addCriterion("tourl is null");
            return (Criteria) this;
        }

        public Criteria andTourlIsNotNull() {
            addCriterion("tourl is not null");
            return (Criteria) this;
        }

        public Criteria andTourlEqualTo(String value) {
            addCriterion("tourl =", value, "tourl");
            return (Criteria) this;
        }

        public Criteria andTourlNotEqualTo(String value) {
            addCriterion("tourl <>", value, "tourl");
            return (Criteria) this;
        }

        public Criteria andTourlGreaterThan(String value) {
            addCriterion("tourl >", value, "tourl");
            return (Criteria) this;
        }

        public Criteria andTourlGreaterThanOrEqualTo(String value) {
            addCriterion("tourl >=", value, "tourl");
            return (Criteria) this;
        }

        public Criteria andTourlLessThan(String value) {
            addCriterion("tourl <", value, "tourl");
            return (Criteria) this;
        }

        public Criteria andTourlLessThanOrEqualTo(String value) {
            addCriterion("tourl <=", value, "tourl");
            return (Criteria) this;
        }

        public Criteria andTourlLike(String value) {
            addCriterion("tourl like", value, "tourl");
            return (Criteria) this;
        }

        public Criteria andTourlNotLike(String value) {
            addCriterion("tourl not like", value, "tourl");
            return (Criteria) this;
        }

        public Criteria andTourlIn(List<String> values) {
            addCriterion("tourl in", values, "tourl");
            return (Criteria) this;
        }

        public Criteria andTourlNotIn(List<String> values) {
            addCriterion("tourl not in", values, "tourl");
            return (Criteria) this;
        }

        public Criteria andTourlBetween(String value1, String value2) {
            addCriterion("tourl between", value1, value2, "tourl");
            return (Criteria) this;
        }

        public Criteria andTourlNotBetween(String value1, String value2) {
            addCriterion("tourl not between", value1, value2, "tourl");
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