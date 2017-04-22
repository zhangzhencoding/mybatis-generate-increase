package com.shanli.jf.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserOperationInfologQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public UserOperationInfologQuery() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andTerminalSourceIsNull() {
            addCriterion("terminal_source is null");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceIsNotNull() {
            addCriterion("terminal_source is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceEqualTo(String value) {
            addCriterion("terminal_source =", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceNotEqualTo(String value) {
            addCriterion("terminal_source <>", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceGreaterThan(String value) {
            addCriterion("terminal_source >", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceGreaterThanOrEqualTo(String value) {
            addCriterion("terminal_source >=", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceLessThan(String value) {
            addCriterion("terminal_source <", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceLessThanOrEqualTo(String value) {
            addCriterion("terminal_source <=", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceLike(String value) {
            addCriterion("terminal_source like", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceNotLike(String value) {
            addCriterion("terminal_source not like", value, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceIn(List<String> values) {
            addCriterion("terminal_source in", values, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceNotIn(List<String> values) {
            addCriterion("terminal_source not in", values, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceBetween(String value1, String value2) {
            addCriterion("terminal_source between", value1, value2, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andTerminalSourceNotBetween(String value1, String value2) {
            addCriterion("terminal_source not between", value1, value2, "terminalSource");
            return (Criteria) this;
        }

        public Criteria andInfoIsNull() {
            addCriterion("info is null");
            return (Criteria) this;
        }

        public Criteria andInfoIsNotNull() {
            addCriterion("info is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEqualTo(String value) {
            addCriterion("info =", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotEqualTo(String value) {
            addCriterion("info <>", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThan(String value) {
            addCriterion("info >", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThanOrEqualTo(String value) {
            addCriterion("info >=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThan(String value) {
            addCriterion("info <", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThanOrEqualTo(String value) {
            addCriterion("info <=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLike(String value) {
            addCriterion("info like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotLike(String value) {
            addCriterion("info not like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoIn(List<String> values) {
            addCriterion("info in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotIn(List<String> values) {
            addCriterion("info not in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoBetween(String value1, String value2) {
            addCriterion("info between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotBetween(String value1, String value2) {
            addCriterion("info not between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoDescIsNull() {
            addCriterion("info_desc is null");
            return (Criteria) this;
        }

        public Criteria andInfoDescIsNotNull() {
            addCriterion("info_desc is not null");
            return (Criteria) this;
        }

        public Criteria andInfoDescEqualTo(String value) {
            addCriterion("info_desc =", value, "infoDesc");
            return (Criteria) this;
        }

        public Criteria andInfoDescNotEqualTo(String value) {
            addCriterion("info_desc <>", value, "infoDesc");
            return (Criteria) this;
        }

        public Criteria andInfoDescGreaterThan(String value) {
            addCriterion("info_desc >", value, "infoDesc");
            return (Criteria) this;
        }

        public Criteria andInfoDescGreaterThanOrEqualTo(String value) {
            addCriterion("info_desc >=", value, "infoDesc");
            return (Criteria) this;
        }

        public Criteria andInfoDescLessThan(String value) {
            addCriterion("info_desc <", value, "infoDesc");
            return (Criteria) this;
        }

        public Criteria andInfoDescLessThanOrEqualTo(String value) {
            addCriterion("info_desc <=", value, "infoDesc");
            return (Criteria) this;
        }

        public Criteria andInfoDescLike(String value) {
            addCriterion("info_desc like", value, "infoDesc");
            return (Criteria) this;
        }

        public Criteria andInfoDescNotLike(String value) {
            addCriterion("info_desc not like", value, "infoDesc");
            return (Criteria) this;
        }

        public Criteria andInfoDescIn(List<String> values) {
            addCriterion("info_desc in", values, "infoDesc");
            return (Criteria) this;
        }

        public Criteria andInfoDescNotIn(List<String> values) {
            addCriterion("info_desc not in", values, "infoDesc");
            return (Criteria) this;
        }

        public Criteria andInfoDescBetween(String value1, String value2) {
            addCriterion("info_desc between", value1, value2, "infoDesc");
            return (Criteria) this;
        }

        public Criteria andInfoDescNotBetween(String value1, String value2) {
            addCriterion("info_desc not between", value1, value2, "infoDesc");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(String value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(String value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(String value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(String value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(String value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(String value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLike(String value) {
            addCriterion("order_num like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotLike(String value) {
            addCriterion("order_num not like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<String> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<String> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(String value1, String value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(String value1, String value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andColumnOneIsNull() {
            addCriterion("column_one is null");
            return (Criteria) this;
        }

        public Criteria andColumnOneIsNotNull() {
            addCriterion("column_one is not null");
            return (Criteria) this;
        }

        public Criteria andColumnOneEqualTo(String value) {
            addCriterion("column_one =", value, "columnOne");
            return (Criteria) this;
        }

        public Criteria andColumnOneNotEqualTo(String value) {
            addCriterion("column_one <>", value, "columnOne");
            return (Criteria) this;
        }

        public Criteria andColumnOneGreaterThan(String value) {
            addCriterion("column_one >", value, "columnOne");
            return (Criteria) this;
        }

        public Criteria andColumnOneGreaterThanOrEqualTo(String value) {
            addCriterion("column_one >=", value, "columnOne");
            return (Criteria) this;
        }

        public Criteria andColumnOneLessThan(String value) {
            addCriterion("column_one <", value, "columnOne");
            return (Criteria) this;
        }

        public Criteria andColumnOneLessThanOrEqualTo(String value) {
            addCriterion("column_one <=", value, "columnOne");
            return (Criteria) this;
        }

        public Criteria andColumnOneLike(String value) {
            addCriterion("column_one like", value, "columnOne");
            return (Criteria) this;
        }

        public Criteria andColumnOneNotLike(String value) {
            addCriterion("column_one not like", value, "columnOne");
            return (Criteria) this;
        }

        public Criteria andColumnOneIn(List<String> values) {
            addCriterion("column_one in", values, "columnOne");
            return (Criteria) this;
        }

        public Criteria andColumnOneNotIn(List<String> values) {
            addCriterion("column_one not in", values, "columnOne");
            return (Criteria) this;
        }

        public Criteria andColumnOneBetween(String value1, String value2) {
            addCriterion("column_one between", value1, value2, "columnOne");
            return (Criteria) this;
        }

        public Criteria andColumnOneNotBetween(String value1, String value2) {
            addCriterion("column_one not between", value1, value2, "columnOne");
            return (Criteria) this;
        }

        public Criteria andRepayNumIsNull() {
            addCriterion("repay_num is null");
            return (Criteria) this;
        }

        public Criteria andRepayNumIsNotNull() {
            addCriterion("repay_num is not null");
            return (Criteria) this;
        }

        public Criteria andRepayNumEqualTo(String value) {
            addCriterion("repay_num =", value, "repayNum");
            return (Criteria) this;
        }

        public Criteria andRepayNumNotEqualTo(String value) {
            addCriterion("repay_num <>", value, "repayNum");
            return (Criteria) this;
        }

        public Criteria andRepayNumGreaterThan(String value) {
            addCriterion("repay_num >", value, "repayNum");
            return (Criteria) this;
        }

        public Criteria andRepayNumGreaterThanOrEqualTo(String value) {
            addCriterion("repay_num >=", value, "repayNum");
            return (Criteria) this;
        }

        public Criteria andRepayNumLessThan(String value) {
            addCriterion("repay_num <", value, "repayNum");
            return (Criteria) this;
        }

        public Criteria andRepayNumLessThanOrEqualTo(String value) {
            addCriterion("repay_num <=", value, "repayNum");
            return (Criteria) this;
        }

        public Criteria andRepayNumLike(String value) {
            addCriterion("repay_num like", value, "repayNum");
            return (Criteria) this;
        }

        public Criteria andRepayNumNotLike(String value) {
            addCriterion("repay_num not like", value, "repayNum");
            return (Criteria) this;
        }

        public Criteria andRepayNumIn(List<String> values) {
            addCriterion("repay_num in", values, "repayNum");
            return (Criteria) this;
        }

        public Criteria andRepayNumNotIn(List<String> values) {
            addCriterion("repay_num not in", values, "repayNum");
            return (Criteria) this;
        }

        public Criteria andRepayNumBetween(String value1, String value2) {
            addCriterion("repay_num between", value1, value2, "repayNum");
            return (Criteria) this;
        }

        public Criteria andRepayNumNotBetween(String value1, String value2) {
            addCriterion("repay_num not between", value1, value2, "repayNum");
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