package com.shanli.jf.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserContractsPhoneQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public UserContractsPhoneQuery() {
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

        public Criteria andContactsMobileIsNull() {
            addCriterion("contacts_mobile is null");
            return (Criteria) this;
        }

        public Criteria andContactsMobileIsNotNull() {
            addCriterion("contacts_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andContactsMobileEqualTo(String value) {
            addCriterion("contacts_mobile =", value, "contactsMobile");
            return (Criteria) this;
        }

        public Criteria andContactsMobileNotEqualTo(String value) {
            addCriterion("contacts_mobile <>", value, "contactsMobile");
            return (Criteria) this;
        }

        public Criteria andContactsMobileGreaterThan(String value) {
            addCriterion("contacts_mobile >", value, "contactsMobile");
            return (Criteria) this;
        }

        public Criteria andContactsMobileGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_mobile >=", value, "contactsMobile");
            return (Criteria) this;
        }

        public Criteria andContactsMobileLessThan(String value) {
            addCriterion("contacts_mobile <", value, "contactsMobile");
            return (Criteria) this;
        }

        public Criteria andContactsMobileLessThanOrEqualTo(String value) {
            addCriterion("contacts_mobile <=", value, "contactsMobile");
            return (Criteria) this;
        }

        public Criteria andContactsMobileLike(String value) {
            addCriterion("contacts_mobile like", value, "contactsMobile");
            return (Criteria) this;
        }

        public Criteria andContactsMobileNotLike(String value) {
            addCriterion("contacts_mobile not like", value, "contactsMobile");
            return (Criteria) this;
        }

        public Criteria andContactsMobileIn(List<String> values) {
            addCriterion("contacts_mobile in", values, "contactsMobile");
            return (Criteria) this;
        }

        public Criteria andContactsMobileNotIn(List<String> values) {
            addCriterion("contacts_mobile not in", values, "contactsMobile");
            return (Criteria) this;
        }

        public Criteria andContactsMobileBetween(String value1, String value2) {
            addCriterion("contacts_mobile between", value1, value2, "contactsMobile");
            return (Criteria) this;
        }

        public Criteria andContactsMobileNotBetween(String value1, String value2) {
            addCriterion("contacts_mobile not between", value1, value2, "contactsMobile");
            return (Criteria) this;
        }

        public Criteria andContactsNameIsNull() {
            addCriterion("contacts_name is null");
            return (Criteria) this;
        }

        public Criteria andContactsNameIsNotNull() {
            addCriterion("contacts_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactsNameEqualTo(String value) {
            addCriterion("contacts_name =", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotEqualTo(String value) {
            addCriterion("contacts_name <>", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameGreaterThan(String value) {
            addCriterion("contacts_name >", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_name >=", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLessThan(String value) {
            addCriterion("contacts_name <", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLessThanOrEqualTo(String value) {
            addCriterion("contacts_name <=", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLike(String value) {
            addCriterion("contacts_name like", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotLike(String value) {
            addCriterion("contacts_name not like", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameIn(List<String> values) {
            addCriterion("contacts_name in", values, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotIn(List<String> values) {
            addCriterion("contacts_name not in", values, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameBetween(String value1, String value2) {
            addCriterion("contacts_name between", value1, value2, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotBetween(String value1, String value2) {
            addCriterion("contacts_name not between", value1, value2, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsMailIsNull() {
            addCriterion("contacts_mail is null");
            return (Criteria) this;
        }

        public Criteria andContactsMailIsNotNull() {
            addCriterion("contacts_mail is not null");
            return (Criteria) this;
        }

        public Criteria andContactsMailEqualTo(String value) {
            addCriterion("contacts_mail =", value, "contactsMail");
            return (Criteria) this;
        }

        public Criteria andContactsMailNotEqualTo(String value) {
            addCriterion("contacts_mail <>", value, "contactsMail");
            return (Criteria) this;
        }

        public Criteria andContactsMailGreaterThan(String value) {
            addCriterion("contacts_mail >", value, "contactsMail");
            return (Criteria) this;
        }

        public Criteria andContactsMailGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_mail >=", value, "contactsMail");
            return (Criteria) this;
        }

        public Criteria andContactsMailLessThan(String value) {
            addCriterion("contacts_mail <", value, "contactsMail");
            return (Criteria) this;
        }

        public Criteria andContactsMailLessThanOrEqualTo(String value) {
            addCriterion("contacts_mail <=", value, "contactsMail");
            return (Criteria) this;
        }

        public Criteria andContactsMailLike(String value) {
            addCriterion("contacts_mail like", value, "contactsMail");
            return (Criteria) this;
        }

        public Criteria andContactsMailNotLike(String value) {
            addCriterion("contacts_mail not like", value, "contactsMail");
            return (Criteria) this;
        }

        public Criteria andContactsMailIn(List<String> values) {
            addCriterion("contacts_mail in", values, "contactsMail");
            return (Criteria) this;
        }

        public Criteria andContactsMailNotIn(List<String> values) {
            addCriterion("contacts_mail not in", values, "contactsMail");
            return (Criteria) this;
        }

        public Criteria andContactsMailBetween(String value1, String value2) {
            addCriterion("contacts_mail between", value1, value2, "contactsMail");
            return (Criteria) this;
        }

        public Criteria andContactsMailNotBetween(String value1, String value2) {
            addCriterion("contacts_mail not between", value1, value2, "contactsMail");
            return (Criteria) this;
        }

        public Criteria andContactsAddrIsNull() {
            addCriterion("contacts_addr is null");
            return (Criteria) this;
        }

        public Criteria andContactsAddrIsNotNull() {
            addCriterion("contacts_addr is not null");
            return (Criteria) this;
        }

        public Criteria andContactsAddrEqualTo(String value) {
            addCriterion("contacts_addr =", value, "contactsAddr");
            return (Criteria) this;
        }

        public Criteria andContactsAddrNotEqualTo(String value) {
            addCriterion("contacts_addr <>", value, "contactsAddr");
            return (Criteria) this;
        }

        public Criteria andContactsAddrGreaterThan(String value) {
            addCriterion("contacts_addr >", value, "contactsAddr");
            return (Criteria) this;
        }

        public Criteria andContactsAddrGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_addr >=", value, "contactsAddr");
            return (Criteria) this;
        }

        public Criteria andContactsAddrLessThan(String value) {
            addCriterion("contacts_addr <", value, "contactsAddr");
            return (Criteria) this;
        }

        public Criteria andContactsAddrLessThanOrEqualTo(String value) {
            addCriterion("contacts_addr <=", value, "contactsAddr");
            return (Criteria) this;
        }

        public Criteria andContactsAddrLike(String value) {
            addCriterion("contacts_addr like", value, "contactsAddr");
            return (Criteria) this;
        }

        public Criteria andContactsAddrNotLike(String value) {
            addCriterion("contacts_addr not like", value, "contactsAddr");
            return (Criteria) this;
        }

        public Criteria andContactsAddrIn(List<String> values) {
            addCriterion("contacts_addr in", values, "contactsAddr");
            return (Criteria) this;
        }

        public Criteria andContactsAddrNotIn(List<String> values) {
            addCriterion("contacts_addr not in", values, "contactsAddr");
            return (Criteria) this;
        }

        public Criteria andContactsAddrBetween(String value1, String value2) {
            addCriterion("contacts_addr between", value1, value2, "contactsAddr");
            return (Criteria) this;
        }

        public Criteria andContactsAddrNotBetween(String value1, String value2) {
            addCriterion("contacts_addr not between", value1, value2, "contactsAddr");
            return (Criteria) this;
        }

        public Criteria andContactsCompIsNull() {
            addCriterion("contacts_comp is null");
            return (Criteria) this;
        }

        public Criteria andContactsCompIsNotNull() {
            addCriterion("contacts_comp is not null");
            return (Criteria) this;
        }

        public Criteria andContactsCompEqualTo(String value) {
            addCriterion("contacts_comp =", value, "contactsComp");
            return (Criteria) this;
        }

        public Criteria andContactsCompNotEqualTo(String value) {
            addCriterion("contacts_comp <>", value, "contactsComp");
            return (Criteria) this;
        }

        public Criteria andContactsCompGreaterThan(String value) {
            addCriterion("contacts_comp >", value, "contactsComp");
            return (Criteria) this;
        }

        public Criteria andContactsCompGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_comp >=", value, "contactsComp");
            return (Criteria) this;
        }

        public Criteria andContactsCompLessThan(String value) {
            addCriterion("contacts_comp <", value, "contactsComp");
            return (Criteria) this;
        }

        public Criteria andContactsCompLessThanOrEqualTo(String value) {
            addCriterion("contacts_comp <=", value, "contactsComp");
            return (Criteria) this;
        }

        public Criteria andContactsCompLike(String value) {
            addCriterion("contacts_comp like", value, "contactsComp");
            return (Criteria) this;
        }

        public Criteria andContactsCompNotLike(String value) {
            addCriterion("contacts_comp not like", value, "contactsComp");
            return (Criteria) this;
        }

        public Criteria andContactsCompIn(List<String> values) {
            addCriterion("contacts_comp in", values, "contactsComp");
            return (Criteria) this;
        }

        public Criteria andContactsCompNotIn(List<String> values) {
            addCriterion("contacts_comp not in", values, "contactsComp");
            return (Criteria) this;
        }

        public Criteria andContactsCompBetween(String value1, String value2) {
            addCriterion("contacts_comp between", value1, value2, "contactsComp");
            return (Criteria) this;
        }

        public Criteria andContactsCompNotBetween(String value1, String value2) {
            addCriterion("contacts_comp not between", value1, value2, "contactsComp");
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

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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