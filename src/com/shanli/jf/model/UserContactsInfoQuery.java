package com.shanli.jf.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserContactsInfoQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public UserContactsInfoQuery() {
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

        public Criteria andContTypeIsNull() {
            addCriterion("cont_type is null");
            return (Criteria) this;
        }

        public Criteria andContTypeIsNotNull() {
            addCriterion("cont_type is not null");
            return (Criteria) this;
        }

        public Criteria andContTypeEqualTo(String value) {
            addCriterion("cont_type =", value, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeNotEqualTo(String value) {
            addCriterion("cont_type <>", value, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeGreaterThan(String value) {
            addCriterion("cont_type >", value, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cont_type >=", value, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeLessThan(String value) {
            addCriterion("cont_type <", value, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeLessThanOrEqualTo(String value) {
            addCriterion("cont_type <=", value, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeLike(String value) {
            addCriterion("cont_type like", value, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeNotLike(String value) {
            addCriterion("cont_type not like", value, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeIn(List<String> values) {
            addCriterion("cont_type in", values, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeNotIn(List<String> values) {
            addCriterion("cont_type not in", values, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeBetween(String value1, String value2) {
            addCriterion("cont_type between", value1, value2, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeNotBetween(String value1, String value2) {
            addCriterion("cont_type not between", value1, value2, "contType");
            return (Criteria) this;
        }

        public Criteria andContUserNameIsNull() {
            addCriterion("cont_user_name is null");
            return (Criteria) this;
        }

        public Criteria andContUserNameIsNotNull() {
            addCriterion("cont_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andContUserNameEqualTo(String value) {
            addCriterion("cont_user_name =", value, "contUserName");
            return (Criteria) this;
        }

        public Criteria andContUserNameNotEqualTo(String value) {
            addCriterion("cont_user_name <>", value, "contUserName");
            return (Criteria) this;
        }

        public Criteria andContUserNameGreaterThan(String value) {
            addCriterion("cont_user_name >", value, "contUserName");
            return (Criteria) this;
        }

        public Criteria andContUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("cont_user_name >=", value, "contUserName");
            return (Criteria) this;
        }

        public Criteria andContUserNameLessThan(String value) {
            addCriterion("cont_user_name <", value, "contUserName");
            return (Criteria) this;
        }

        public Criteria andContUserNameLessThanOrEqualTo(String value) {
            addCriterion("cont_user_name <=", value, "contUserName");
            return (Criteria) this;
        }

        public Criteria andContUserNameLike(String value) {
            addCriterion("cont_user_name like", value, "contUserName");
            return (Criteria) this;
        }

        public Criteria andContUserNameNotLike(String value) {
            addCriterion("cont_user_name not like", value, "contUserName");
            return (Criteria) this;
        }

        public Criteria andContUserNameIn(List<String> values) {
            addCriterion("cont_user_name in", values, "contUserName");
            return (Criteria) this;
        }

        public Criteria andContUserNameNotIn(List<String> values) {
            addCriterion("cont_user_name not in", values, "contUserName");
            return (Criteria) this;
        }

        public Criteria andContUserNameBetween(String value1, String value2) {
            addCriterion("cont_user_name between", value1, value2, "contUserName");
            return (Criteria) this;
        }

        public Criteria andContUserNameNotBetween(String value1, String value2) {
            addCriterion("cont_user_name not between", value1, value2, "contUserName");
            return (Criteria) this;
        }

        public Criteria andContMobileIsNull() {
            addCriterion("cont_mobile is null");
            return (Criteria) this;
        }

        public Criteria andContMobileIsNotNull() {
            addCriterion("cont_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andContMobileEqualTo(String value) {
            addCriterion("cont_mobile =", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileNotEqualTo(String value) {
            addCriterion("cont_mobile <>", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileGreaterThan(String value) {
            addCriterion("cont_mobile >", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileGreaterThanOrEqualTo(String value) {
            addCriterion("cont_mobile >=", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileLessThan(String value) {
            addCriterion("cont_mobile <", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileLessThanOrEqualTo(String value) {
            addCriterion("cont_mobile <=", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileLike(String value) {
            addCriterion("cont_mobile like", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileNotLike(String value) {
            addCriterion("cont_mobile not like", value, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileIn(List<String> values) {
            addCriterion("cont_mobile in", values, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileNotIn(List<String> values) {
            addCriterion("cont_mobile not in", values, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileBetween(String value1, String value2) {
            addCriterion("cont_mobile between", value1, value2, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContMobileNotBetween(String value1, String value2) {
            addCriterion("cont_mobile not between", value1, value2, "contMobile");
            return (Criteria) this;
        }

        public Criteria andContShipIsNull() {
            addCriterion("cont_ship is null");
            return (Criteria) this;
        }

        public Criteria andContShipIsNotNull() {
            addCriterion("cont_ship is not null");
            return (Criteria) this;
        }

        public Criteria andContShipEqualTo(String value) {
            addCriterion("cont_ship =", value, "contShip");
            return (Criteria) this;
        }

        public Criteria andContShipNotEqualTo(String value) {
            addCriterion("cont_ship <>", value, "contShip");
            return (Criteria) this;
        }

        public Criteria andContShipGreaterThan(String value) {
            addCriterion("cont_ship >", value, "contShip");
            return (Criteria) this;
        }

        public Criteria andContShipGreaterThanOrEqualTo(String value) {
            addCriterion("cont_ship >=", value, "contShip");
            return (Criteria) this;
        }

        public Criteria andContShipLessThan(String value) {
            addCriterion("cont_ship <", value, "contShip");
            return (Criteria) this;
        }

        public Criteria andContShipLessThanOrEqualTo(String value) {
            addCriterion("cont_ship <=", value, "contShip");
            return (Criteria) this;
        }

        public Criteria andContShipLike(String value) {
            addCriterion("cont_ship like", value, "contShip");
            return (Criteria) this;
        }

        public Criteria andContShipNotLike(String value) {
            addCriterion("cont_ship not like", value, "contShip");
            return (Criteria) this;
        }

        public Criteria andContShipIn(List<String> values) {
            addCriterion("cont_ship in", values, "contShip");
            return (Criteria) this;
        }

        public Criteria andContShipNotIn(List<String> values) {
            addCriterion("cont_ship not in", values, "contShip");
            return (Criteria) this;
        }

        public Criteria andContShipBetween(String value1, String value2) {
            addCriterion("cont_ship between", value1, value2, "contShip");
            return (Criteria) this;
        }

        public Criteria andContShipNotBetween(String value1, String value2) {
            addCriterion("cont_ship not between", value1, value2, "contShip");
            return (Criteria) this;
        }

        public Criteria andContAddrIsNull() {
            addCriterion("cont_addr is null");
            return (Criteria) this;
        }

        public Criteria andContAddrIsNotNull() {
            addCriterion("cont_addr is not null");
            return (Criteria) this;
        }

        public Criteria andContAddrEqualTo(String value) {
            addCriterion("cont_addr =", value, "contAddr");
            return (Criteria) this;
        }

        public Criteria andContAddrNotEqualTo(String value) {
            addCriterion("cont_addr <>", value, "contAddr");
            return (Criteria) this;
        }

        public Criteria andContAddrGreaterThan(String value) {
            addCriterion("cont_addr >", value, "contAddr");
            return (Criteria) this;
        }

        public Criteria andContAddrGreaterThanOrEqualTo(String value) {
            addCriterion("cont_addr >=", value, "contAddr");
            return (Criteria) this;
        }

        public Criteria andContAddrLessThan(String value) {
            addCriterion("cont_addr <", value, "contAddr");
            return (Criteria) this;
        }

        public Criteria andContAddrLessThanOrEqualTo(String value) {
            addCriterion("cont_addr <=", value, "contAddr");
            return (Criteria) this;
        }

        public Criteria andContAddrLike(String value) {
            addCriterion("cont_addr like", value, "contAddr");
            return (Criteria) this;
        }

        public Criteria andContAddrNotLike(String value) {
            addCriterion("cont_addr not like", value, "contAddr");
            return (Criteria) this;
        }

        public Criteria andContAddrIn(List<String> values) {
            addCriterion("cont_addr in", values, "contAddr");
            return (Criteria) this;
        }

        public Criteria andContAddrNotIn(List<String> values) {
            addCriterion("cont_addr not in", values, "contAddr");
            return (Criteria) this;
        }

        public Criteria andContAddrBetween(String value1, String value2) {
            addCriterion("cont_addr between", value1, value2, "contAddr");
            return (Criteria) this;
        }

        public Criteria andContAddrNotBetween(String value1, String value2) {
            addCriterion("cont_addr not between", value1, value2, "contAddr");
            return (Criteria) this;
        }

        public Criteria andContStatusIsNull() {
            addCriterion("cont_status is null");
            return (Criteria) this;
        }

        public Criteria andContStatusIsNotNull() {
            addCriterion("cont_status is not null");
            return (Criteria) this;
        }

        public Criteria andContStatusEqualTo(String value) {
            addCriterion("cont_status =", value, "contStatus");
            return (Criteria) this;
        }

        public Criteria andContStatusNotEqualTo(String value) {
            addCriterion("cont_status <>", value, "contStatus");
            return (Criteria) this;
        }

        public Criteria andContStatusGreaterThan(String value) {
            addCriterion("cont_status >", value, "contStatus");
            return (Criteria) this;
        }

        public Criteria andContStatusGreaterThanOrEqualTo(String value) {
            addCriterion("cont_status >=", value, "contStatus");
            return (Criteria) this;
        }

        public Criteria andContStatusLessThan(String value) {
            addCriterion("cont_status <", value, "contStatus");
            return (Criteria) this;
        }

        public Criteria andContStatusLessThanOrEqualTo(String value) {
            addCriterion("cont_status <=", value, "contStatus");
            return (Criteria) this;
        }

        public Criteria andContStatusLike(String value) {
            addCriterion("cont_status like", value, "contStatus");
            return (Criteria) this;
        }

        public Criteria andContStatusNotLike(String value) {
            addCriterion("cont_status not like", value, "contStatus");
            return (Criteria) this;
        }

        public Criteria andContStatusIn(List<String> values) {
            addCriterion("cont_status in", values, "contStatus");
            return (Criteria) this;
        }

        public Criteria andContStatusNotIn(List<String> values) {
            addCriterion("cont_status not in", values, "contStatus");
            return (Criteria) this;
        }

        public Criteria andContStatusBetween(String value1, String value2) {
            addCriterion("cont_status between", value1, value2, "contStatus");
            return (Criteria) this;
        }

        public Criteria andContStatusNotBetween(String value1, String value2) {
            addCriterion("cont_status not between", value1, value2, "contStatus");
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