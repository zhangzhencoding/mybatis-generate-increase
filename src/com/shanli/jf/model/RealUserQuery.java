package com.shanli.jf.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RealUserQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public RealUserQuery() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIsNull() {
            addCriterion("regist_time is null");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIsNotNull() {
            addCriterion("regist_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegistTimeEqualTo(Date value) {
            addCriterion("regist_time =", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotEqualTo(Date value) {
            addCriterion("regist_time <>", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeGreaterThan(Date value) {
            addCriterion("regist_time >", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("regist_time >=", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeLessThan(Date value) {
            addCriterion("regist_time <", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeLessThanOrEqualTo(Date value) {
            addCriterion("regist_time <=", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIn(List<Date> values) {
            addCriterion("regist_time in", values, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotIn(List<Date> values) {
            addCriterion("regist_time not in", values, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeBetween(Date value1, Date value2) {
            addCriterion("regist_time between", value1, value2, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotBetween(Date value1, Date value2) {
            addCriterion("regist_time not between", value1, value2, "registTime");
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

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andAddIpIsNull() {
            addCriterion("add_ip is null");
            return (Criteria) this;
        }

        public Criteria andAddIpIsNotNull() {
            addCriterion("add_ip is not null");
            return (Criteria) this;
        }

        public Criteria andAddIpEqualTo(String value) {
            addCriterion("add_ip =", value, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpNotEqualTo(String value) {
            addCriterion("add_ip <>", value, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpGreaterThan(String value) {
            addCriterion("add_ip >", value, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpGreaterThanOrEqualTo(String value) {
            addCriterion("add_ip >=", value, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpLessThan(String value) {
            addCriterion("add_ip <", value, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpLessThanOrEqualTo(String value) {
            addCriterion("add_ip <=", value, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpLike(String value) {
            addCriterion("add_ip like", value, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpNotLike(String value) {
            addCriterion("add_ip not like", value, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpIn(List<String> values) {
            addCriterion("add_ip in", values, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpNotIn(List<String> values) {
            addCriterion("add_ip not in", values, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpBetween(String value1, String value2) {
            addCriterion("add_ip between", value1, value2, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpNotBetween(String value1, String value2) {
            addCriterion("add_ip not between", value1, value2, "addIp");
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

        public Criteria andCashPasswordIsNull() {
            addCriterion("cash_password is null");
            return (Criteria) this;
        }

        public Criteria andCashPasswordIsNotNull() {
            addCriterion("cash_password is not null");
            return (Criteria) this;
        }

        public Criteria andCashPasswordEqualTo(String value) {
            addCriterion("cash_password =", value, "cashPassword");
            return (Criteria) this;
        }

        public Criteria andCashPasswordNotEqualTo(String value) {
            addCriterion("cash_password <>", value, "cashPassword");
            return (Criteria) this;
        }

        public Criteria andCashPasswordGreaterThan(String value) {
            addCriterion("cash_password >", value, "cashPassword");
            return (Criteria) this;
        }

        public Criteria andCashPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("cash_password >=", value, "cashPassword");
            return (Criteria) this;
        }

        public Criteria andCashPasswordLessThan(String value) {
            addCriterion("cash_password <", value, "cashPassword");
            return (Criteria) this;
        }

        public Criteria andCashPasswordLessThanOrEqualTo(String value) {
            addCriterion("cash_password <=", value, "cashPassword");
            return (Criteria) this;
        }

        public Criteria andCashPasswordLike(String value) {
            addCriterion("cash_password like", value, "cashPassword");
            return (Criteria) this;
        }

        public Criteria andCashPasswordNotLike(String value) {
            addCriterion("cash_password not like", value, "cashPassword");
            return (Criteria) this;
        }

        public Criteria andCashPasswordIn(List<String> values) {
            addCriterion("cash_password in", values, "cashPassword");
            return (Criteria) this;
        }

        public Criteria andCashPasswordNotIn(List<String> values) {
            addCriterion("cash_password not in", values, "cashPassword");
            return (Criteria) this;
        }

        public Criteria andCashPasswordBetween(String value1, String value2) {
            addCriterion("cash_password between", value1, value2, "cashPassword");
            return (Criteria) this;
        }

        public Criteria andCashPasswordNotBetween(String value1, String value2) {
            addCriterion("cash_password not between", value1, value2, "cashPassword");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNull() {
            addCriterion("weixin is null");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNotNull() {
            addCriterion("weixin is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinEqualTo(String value) {
            addCriterion("weixin =", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotEqualTo(String value) {
            addCriterion("weixin <>", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThan(String value) {
            addCriterion("weixin >", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("weixin >=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThan(String value) {
            addCriterion("weixin <", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThanOrEqualTo(String value) {
            addCriterion("weixin <=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLike(String value) {
            addCriterion("weixin like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotLike(String value) {
            addCriterion("weixin not like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIn(List<String> values) {
            addCriterion("weixin in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotIn(List<String> values) {
            addCriterion("weixin not in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinBetween(String value1, String value2) {
            addCriterion("weixin between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotBetween(String value1, String value2) {
            addCriterion("weixin not between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andZyIsNull() {
            addCriterion("zy is null");
            return (Criteria) this;
        }

        public Criteria andZyIsNotNull() {
            addCriterion("zy is not null");
            return (Criteria) this;
        }

        public Criteria andZyEqualTo(String value) {
            addCriterion("zy =", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotEqualTo(String value) {
            addCriterion("zy <>", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyGreaterThan(String value) {
            addCriterion("zy >", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyGreaterThanOrEqualTo(String value) {
            addCriterion("zy >=", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLessThan(String value) {
            addCriterion("zy <", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLessThanOrEqualTo(String value) {
            addCriterion("zy <=", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLike(String value) {
            addCriterion("zy like", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotLike(String value) {
            addCriterion("zy not like", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyIn(List<String> values) {
            addCriterion("zy in", values, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotIn(List<String> values) {
            addCriterion("zy not in", values, "zy");
            return (Criteria) this;
        }

        public Criteria andZyBetween(String value1, String value2) {
            addCriterion("zy between", value1, value2, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotBetween(String value1, String value2) {
            addCriterion("zy not between", value1, value2, "zy");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
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

        public Criteria andIsMarryIsNull() {
            addCriterion("is_marry is null");
            return (Criteria) this;
        }

        public Criteria andIsMarryIsNotNull() {
            addCriterion("is_marry is not null");
            return (Criteria) this;
        }

        public Criteria andIsMarryEqualTo(String value) {
            addCriterion("is_marry =", value, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryNotEqualTo(String value) {
            addCriterion("is_marry <>", value, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryGreaterThan(String value) {
            addCriterion("is_marry >", value, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryGreaterThanOrEqualTo(String value) {
            addCriterion("is_marry >=", value, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryLessThan(String value) {
            addCriterion("is_marry <", value, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryLessThanOrEqualTo(String value) {
            addCriterion("is_marry <=", value, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryLike(String value) {
            addCriterion("is_marry like", value, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryNotLike(String value) {
            addCriterion("is_marry not like", value, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryIn(List<String> values) {
            addCriterion("is_marry in", values, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryNotIn(List<String> values) {
            addCriterion("is_marry not in", values, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryBetween(String value1, String value2) {
            addCriterion("is_marry between", value1, value2, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryNotBetween(String value1, String value2) {
            addCriterion("is_marry not between", value1, value2, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsChildredIsNull() {
            addCriterion("is_childred is null");
            return (Criteria) this;
        }

        public Criteria andIsChildredIsNotNull() {
            addCriterion("is_childred is not null");
            return (Criteria) this;
        }

        public Criteria andIsChildredEqualTo(String value) {
            addCriterion("is_childred =", value, "isChildred");
            return (Criteria) this;
        }

        public Criteria andIsChildredNotEqualTo(String value) {
            addCriterion("is_childred <>", value, "isChildred");
            return (Criteria) this;
        }

        public Criteria andIsChildredGreaterThan(String value) {
            addCriterion("is_childred >", value, "isChildred");
            return (Criteria) this;
        }

        public Criteria andIsChildredGreaterThanOrEqualTo(String value) {
            addCriterion("is_childred >=", value, "isChildred");
            return (Criteria) this;
        }

        public Criteria andIsChildredLessThan(String value) {
            addCriterion("is_childred <", value, "isChildred");
            return (Criteria) this;
        }

        public Criteria andIsChildredLessThanOrEqualTo(String value) {
            addCriterion("is_childred <=", value, "isChildred");
            return (Criteria) this;
        }

        public Criteria andIsChildredLike(String value) {
            addCriterion("is_childred like", value, "isChildred");
            return (Criteria) this;
        }

        public Criteria andIsChildredNotLike(String value) {
            addCriterion("is_childred not like", value, "isChildred");
            return (Criteria) this;
        }

        public Criteria andIsChildredIn(List<String> values) {
            addCriterion("is_childred in", values, "isChildred");
            return (Criteria) this;
        }

        public Criteria andIsChildredNotIn(List<String> values) {
            addCriterion("is_childred not in", values, "isChildred");
            return (Criteria) this;
        }

        public Criteria andIsChildredBetween(String value1, String value2) {
            addCriterion("is_childred between", value1, value2, "isChildred");
            return (Criteria) this;
        }

        public Criteria andIsChildredNotBetween(String value1, String value2) {
            addCriterion("is_childred not between", value1, value2, "isChildred");
            return (Criteria) this;
        }

        public Criteria andFamilyShipIsNull() {
            addCriterion("family_ship is null");
            return (Criteria) this;
        }

        public Criteria andFamilyShipIsNotNull() {
            addCriterion("family_ship is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyShipEqualTo(String value) {
            addCriterion("family_ship =", value, "familyShip");
            return (Criteria) this;
        }

        public Criteria andFamilyShipNotEqualTo(String value) {
            addCriterion("family_ship <>", value, "familyShip");
            return (Criteria) this;
        }

        public Criteria andFamilyShipGreaterThan(String value) {
            addCriterion("family_ship >", value, "familyShip");
            return (Criteria) this;
        }

        public Criteria andFamilyShipGreaterThanOrEqualTo(String value) {
            addCriterion("family_ship >=", value, "familyShip");
            return (Criteria) this;
        }

        public Criteria andFamilyShipLessThan(String value) {
            addCriterion("family_ship <", value, "familyShip");
            return (Criteria) this;
        }

        public Criteria andFamilyShipLessThanOrEqualTo(String value) {
            addCriterion("family_ship <=", value, "familyShip");
            return (Criteria) this;
        }

        public Criteria andFamilyShipLike(String value) {
            addCriterion("family_ship like", value, "familyShip");
            return (Criteria) this;
        }

        public Criteria andFamilyShipNotLike(String value) {
            addCriterion("family_ship not like", value, "familyShip");
            return (Criteria) this;
        }

        public Criteria andFamilyShipIn(List<String> values) {
            addCriterion("family_ship in", values, "familyShip");
            return (Criteria) this;
        }

        public Criteria andFamilyShipNotIn(List<String> values) {
            addCriterion("family_ship not in", values, "familyShip");
            return (Criteria) this;
        }

        public Criteria andFamilyShipBetween(String value1, String value2) {
            addCriterion("family_ship between", value1, value2, "familyShip");
            return (Criteria) this;
        }

        public Criteria andFamilyShipNotBetween(String value1, String value2) {
            addCriterion("family_ship not between", value1, value2, "familyShip");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(String value) {
            addCriterion("income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(String value) {
            addCriterion("income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(String value) {
            addCriterion("income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(String value) {
            addCriterion("income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(String value) {
            addCriterion("income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLike(String value) {
            addCriterion("income like", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotLike(String value) {
            addCriterion("income not like", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<String> values) {
            addCriterion("income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<String> values) {
            addCriterion("income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(String value1, String value2) {
            addCriterion("income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(String value1, String value2) {
            addCriterion("income not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andHouseInfoIsNull() {
            addCriterion("house_info is null");
            return (Criteria) this;
        }

        public Criteria andHouseInfoIsNotNull() {
            addCriterion("house_info is not null");
            return (Criteria) this;
        }

        public Criteria andHouseInfoEqualTo(String value) {
            addCriterion("house_info =", value, "houseInfo");
            return (Criteria) this;
        }

        public Criteria andHouseInfoNotEqualTo(String value) {
            addCriterion("house_info <>", value, "houseInfo");
            return (Criteria) this;
        }

        public Criteria andHouseInfoGreaterThan(String value) {
            addCriterion("house_info >", value, "houseInfo");
            return (Criteria) this;
        }

        public Criteria andHouseInfoGreaterThanOrEqualTo(String value) {
            addCriterion("house_info >=", value, "houseInfo");
            return (Criteria) this;
        }

        public Criteria andHouseInfoLessThan(String value) {
            addCriterion("house_info <", value, "houseInfo");
            return (Criteria) this;
        }

        public Criteria andHouseInfoLessThanOrEqualTo(String value) {
            addCriterion("house_info <=", value, "houseInfo");
            return (Criteria) this;
        }

        public Criteria andHouseInfoLike(String value) {
            addCriterion("house_info like", value, "houseInfo");
            return (Criteria) this;
        }

        public Criteria andHouseInfoNotLike(String value) {
            addCriterion("house_info not like", value, "houseInfo");
            return (Criteria) this;
        }

        public Criteria andHouseInfoIn(List<String> values) {
            addCriterion("house_info in", values, "houseInfo");
            return (Criteria) this;
        }

        public Criteria andHouseInfoNotIn(List<String> values) {
            addCriterion("house_info not in", values, "houseInfo");
            return (Criteria) this;
        }

        public Criteria andHouseInfoBetween(String value1, String value2) {
            addCriterion("house_info between", value1, value2, "houseInfo");
            return (Criteria) this;
        }

        public Criteria andHouseInfoNotBetween(String value1, String value2) {
            addCriterion("house_info not between", value1, value2, "houseInfo");
            return (Criteria) this;
        }

        public Criteria andCarInfoIsNull() {
            addCriterion("car_info is null");
            return (Criteria) this;
        }

        public Criteria andCarInfoIsNotNull() {
            addCriterion("car_info is not null");
            return (Criteria) this;
        }

        public Criteria andCarInfoEqualTo(String value) {
            addCriterion("car_info =", value, "carInfo");
            return (Criteria) this;
        }

        public Criteria andCarInfoNotEqualTo(String value) {
            addCriterion("car_info <>", value, "carInfo");
            return (Criteria) this;
        }

        public Criteria andCarInfoGreaterThan(String value) {
            addCriterion("car_info >", value, "carInfo");
            return (Criteria) this;
        }

        public Criteria andCarInfoGreaterThanOrEqualTo(String value) {
            addCriterion("car_info >=", value, "carInfo");
            return (Criteria) this;
        }

        public Criteria andCarInfoLessThan(String value) {
            addCriterion("car_info <", value, "carInfo");
            return (Criteria) this;
        }

        public Criteria andCarInfoLessThanOrEqualTo(String value) {
            addCriterion("car_info <=", value, "carInfo");
            return (Criteria) this;
        }

        public Criteria andCarInfoLike(String value) {
            addCriterion("car_info like", value, "carInfo");
            return (Criteria) this;
        }

        public Criteria andCarInfoNotLike(String value) {
            addCriterion("car_info not like", value, "carInfo");
            return (Criteria) this;
        }

        public Criteria andCarInfoIn(List<String> values) {
            addCriterion("car_info in", values, "carInfo");
            return (Criteria) this;
        }

        public Criteria andCarInfoNotIn(List<String> values) {
            addCriterion("car_info not in", values, "carInfo");
            return (Criteria) this;
        }

        public Criteria andCarInfoBetween(String value1, String value2) {
            addCriterion("car_info between", value1, value2, "carInfo");
            return (Criteria) this;
        }

        public Criteria andCarInfoNotBetween(String value1, String value2) {
            addCriterion("car_info not between", value1, value2, "carInfo");
            return (Criteria) this;
        }

        public Criteria andDebtsInfoIsNull() {
            addCriterion("debts_info is null");
            return (Criteria) this;
        }

        public Criteria andDebtsInfoIsNotNull() {
            addCriterion("debts_info is not null");
            return (Criteria) this;
        }

        public Criteria andDebtsInfoEqualTo(String value) {
            addCriterion("debts_info =", value, "debtsInfo");
            return (Criteria) this;
        }

        public Criteria andDebtsInfoNotEqualTo(String value) {
            addCriterion("debts_info <>", value, "debtsInfo");
            return (Criteria) this;
        }

        public Criteria andDebtsInfoGreaterThan(String value) {
            addCriterion("debts_info >", value, "debtsInfo");
            return (Criteria) this;
        }

        public Criteria andDebtsInfoGreaterThanOrEqualTo(String value) {
            addCriterion("debts_info >=", value, "debtsInfo");
            return (Criteria) this;
        }

        public Criteria andDebtsInfoLessThan(String value) {
            addCriterion("debts_info <", value, "debtsInfo");
            return (Criteria) this;
        }

        public Criteria andDebtsInfoLessThanOrEqualTo(String value) {
            addCriterion("debts_info <=", value, "debtsInfo");
            return (Criteria) this;
        }

        public Criteria andDebtsInfoLike(String value) {
            addCriterion("debts_info like", value, "debtsInfo");
            return (Criteria) this;
        }

        public Criteria andDebtsInfoNotLike(String value) {
            addCriterion("debts_info not like", value, "debtsInfo");
            return (Criteria) this;
        }

        public Criteria andDebtsInfoIn(List<String> values) {
            addCriterion("debts_info in", values, "debtsInfo");
            return (Criteria) this;
        }

        public Criteria andDebtsInfoNotIn(List<String> values) {
            addCriterion("debts_info not in", values, "debtsInfo");
            return (Criteria) this;
        }

        public Criteria andDebtsInfoBetween(String value1, String value2) {
            addCriterion("debts_info between", value1, value2, "debtsInfo");
            return (Criteria) this;
        }

        public Criteria andDebtsInfoNotBetween(String value1, String value2) {
            addCriterion("debts_info not between", value1, value2, "debtsInfo");
            return (Criteria) this;
        }

        public Criteria andAddressHkIsNull() {
            addCriterion("address_hk is null");
            return (Criteria) this;
        }

        public Criteria andAddressHkIsNotNull() {
            addCriterion("address_hk is not null");
            return (Criteria) this;
        }

        public Criteria andAddressHkEqualTo(String value) {
            addCriterion("address_hk =", value, "addressHk");
            return (Criteria) this;
        }

        public Criteria andAddressHkNotEqualTo(String value) {
            addCriterion("address_hk <>", value, "addressHk");
            return (Criteria) this;
        }

        public Criteria andAddressHkGreaterThan(String value) {
            addCriterion("address_hk >", value, "addressHk");
            return (Criteria) this;
        }

        public Criteria andAddressHkGreaterThanOrEqualTo(String value) {
            addCriterion("address_hk >=", value, "addressHk");
            return (Criteria) this;
        }

        public Criteria andAddressHkLessThan(String value) {
            addCriterion("address_hk <", value, "addressHk");
            return (Criteria) this;
        }

        public Criteria andAddressHkLessThanOrEqualTo(String value) {
            addCriterion("address_hk <=", value, "addressHk");
            return (Criteria) this;
        }

        public Criteria andAddressHkLike(String value) {
            addCriterion("address_hk like", value, "addressHk");
            return (Criteria) this;
        }

        public Criteria andAddressHkNotLike(String value) {
            addCriterion("address_hk not like", value, "addressHk");
            return (Criteria) this;
        }

        public Criteria andAddressHkIn(List<String> values) {
            addCriterion("address_hk in", values, "addressHk");
            return (Criteria) this;
        }

        public Criteria andAddressHkNotIn(List<String> values) {
            addCriterion("address_hk not in", values, "addressHk");
            return (Criteria) this;
        }

        public Criteria andAddressHkBetween(String value1, String value2) {
            addCriterion("address_hk between", value1, value2, "addressHk");
            return (Criteria) this;
        }

        public Criteria andAddressHkNotBetween(String value1, String value2) {
            addCriterion("address_hk not between", value1, value2, "addressHk");
            return (Criteria) this;
        }

        public Criteria andAddressCzIsNull() {
            addCriterion("address_cz is null");
            return (Criteria) this;
        }

        public Criteria andAddressCzIsNotNull() {
            addCriterion("address_cz is not null");
            return (Criteria) this;
        }

        public Criteria andAddressCzEqualTo(String value) {
            addCriterion("address_cz =", value, "addressCz");
            return (Criteria) this;
        }

        public Criteria andAddressCzNotEqualTo(String value) {
            addCriterion("address_cz <>", value, "addressCz");
            return (Criteria) this;
        }

        public Criteria andAddressCzGreaterThan(String value) {
            addCriterion("address_cz >", value, "addressCz");
            return (Criteria) this;
        }

        public Criteria andAddressCzGreaterThanOrEqualTo(String value) {
            addCriterion("address_cz >=", value, "addressCz");
            return (Criteria) this;
        }

        public Criteria andAddressCzLessThan(String value) {
            addCriterion("address_cz <", value, "addressCz");
            return (Criteria) this;
        }

        public Criteria andAddressCzLessThanOrEqualTo(String value) {
            addCriterion("address_cz <=", value, "addressCz");
            return (Criteria) this;
        }

        public Criteria andAddressCzLike(String value) {
            addCriterion("address_cz like", value, "addressCz");
            return (Criteria) this;
        }

        public Criteria andAddressCzNotLike(String value) {
            addCriterion("address_cz not like", value, "addressCz");
            return (Criteria) this;
        }

        public Criteria andAddressCzIn(List<String> values) {
            addCriterion("address_cz in", values, "addressCz");
            return (Criteria) this;
        }

        public Criteria andAddressCzNotIn(List<String> values) {
            addCriterion("address_cz not in", values, "addressCz");
            return (Criteria) this;
        }

        public Criteria andAddressCzBetween(String value1, String value2) {
            addCriterion("address_cz between", value1, value2, "addressCz");
            return (Criteria) this;
        }

        public Criteria andAddressCzNotBetween(String value1, String value2) {
            addCriterion("address_cz not between", value1, value2, "addressCz");
            return (Criteria) this;
        }

        public Criteria andAddrCompanyIsNull() {
            addCriterion("addr_company is null");
            return (Criteria) this;
        }

        public Criteria andAddrCompanyIsNotNull() {
            addCriterion("addr_company is not null");
            return (Criteria) this;
        }

        public Criteria andAddrCompanyEqualTo(String value) {
            addCriterion("addr_company =", value, "addrCompany");
            return (Criteria) this;
        }

        public Criteria andAddrCompanyNotEqualTo(String value) {
            addCriterion("addr_company <>", value, "addrCompany");
            return (Criteria) this;
        }

        public Criteria andAddrCompanyGreaterThan(String value) {
            addCriterion("addr_company >", value, "addrCompany");
            return (Criteria) this;
        }

        public Criteria andAddrCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("addr_company >=", value, "addrCompany");
            return (Criteria) this;
        }

        public Criteria andAddrCompanyLessThan(String value) {
            addCriterion("addr_company <", value, "addrCompany");
            return (Criteria) this;
        }

        public Criteria andAddrCompanyLessThanOrEqualTo(String value) {
            addCriterion("addr_company <=", value, "addrCompany");
            return (Criteria) this;
        }

        public Criteria andAddrCompanyLike(String value) {
            addCriterion("addr_company like", value, "addrCompany");
            return (Criteria) this;
        }

        public Criteria andAddrCompanyNotLike(String value) {
            addCriterion("addr_company not like", value, "addrCompany");
            return (Criteria) this;
        }

        public Criteria andAddrCompanyIn(List<String> values) {
            addCriterion("addr_company in", values, "addrCompany");
            return (Criteria) this;
        }

        public Criteria andAddrCompanyNotIn(List<String> values) {
            addCriterion("addr_company not in", values, "addrCompany");
            return (Criteria) this;
        }

        public Criteria andAddrCompanyBetween(String value1, String value2) {
            addCriterion("addr_company between", value1, value2, "addrCompany");
            return (Criteria) this;
        }

        public Criteria andAddrCompanyNotBetween(String value1, String value2) {
            addCriterion("addr_company not between", value1, value2, "addrCompany");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Integer value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Integer value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Integer value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Integer value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Integer> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Integer> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Integer value1, Integer value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(Integer value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Integer value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Integer value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Integer value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Integer value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Integer> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Integer> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Integer value1, Integer value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Integer value1, Integer value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Integer value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Integer value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Integer value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Integer value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Integer value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Integer> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Integer> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Integer value1, Integer value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andUpTimeIsNull() {
            addCriterion("up_time is null");
            return (Criteria) this;
        }

        public Criteria andUpTimeIsNotNull() {
            addCriterion("up_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpTimeEqualTo(Date value) {
            addCriterion("up_time =", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotEqualTo(Date value) {
            addCriterion("up_time <>", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeGreaterThan(Date value) {
            addCriterion("up_time >", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("up_time >=", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeLessThan(Date value) {
            addCriterion("up_time <", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeLessThanOrEqualTo(Date value) {
            addCriterion("up_time <=", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeIn(List<Date> values) {
            addCriterion("up_time in", values, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotIn(List<Date> values) {
            addCriterion("up_time not in", values, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeBetween(Date value1, Date value2) {
            addCriterion("up_time between", value1, value2, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotBetween(Date value1, Date value2) {
            addCriterion("up_time not between", value1, value2, "upTime");
            return (Criteria) this;
        }

        public Criteria andCardImgIsNull() {
            addCriterion("card_img is null");
            return (Criteria) this;
        }

        public Criteria andCardImgIsNotNull() {
            addCriterion("card_img is not null");
            return (Criteria) this;
        }

        public Criteria andCardImgEqualTo(String value) {
            addCriterion("card_img =", value, "cardImg");
            return (Criteria) this;
        }

        public Criteria andCardImgNotEqualTo(String value) {
            addCriterion("card_img <>", value, "cardImg");
            return (Criteria) this;
        }

        public Criteria andCardImgGreaterThan(String value) {
            addCriterion("card_img >", value, "cardImg");
            return (Criteria) this;
        }

        public Criteria andCardImgGreaterThanOrEqualTo(String value) {
            addCriterion("card_img >=", value, "cardImg");
            return (Criteria) this;
        }

        public Criteria andCardImgLessThan(String value) {
            addCriterion("card_img <", value, "cardImg");
            return (Criteria) this;
        }

        public Criteria andCardImgLessThanOrEqualTo(String value) {
            addCriterion("card_img <=", value, "cardImg");
            return (Criteria) this;
        }

        public Criteria andCardImgLike(String value) {
            addCriterion("card_img like", value, "cardImg");
            return (Criteria) this;
        }

        public Criteria andCardImgNotLike(String value) {
            addCriterion("card_img not like", value, "cardImg");
            return (Criteria) this;
        }

        public Criteria andCardImgIn(List<String> values) {
            addCriterion("card_img in", values, "cardImg");
            return (Criteria) this;
        }

        public Criteria andCardImgNotIn(List<String> values) {
            addCriterion("card_img not in", values, "cardImg");
            return (Criteria) this;
        }

        public Criteria andCardImgBetween(String value1, String value2) {
            addCriterion("card_img between", value1, value2, "cardImg");
            return (Criteria) this;
        }

        public Criteria andCardImgNotBetween(String value1, String value2) {
            addCriterion("card_img not between", value1, value2, "cardImg");
            return (Criteria) this;
        }

        public Criteria andCardBackImgIsNull() {
            addCriterion("card_back_img is null");
            return (Criteria) this;
        }

        public Criteria andCardBackImgIsNotNull() {
            addCriterion("card_back_img is not null");
            return (Criteria) this;
        }

        public Criteria andCardBackImgEqualTo(String value) {
            addCriterion("card_back_img =", value, "cardBackImg");
            return (Criteria) this;
        }

        public Criteria andCardBackImgNotEqualTo(String value) {
            addCriterion("card_back_img <>", value, "cardBackImg");
            return (Criteria) this;
        }

        public Criteria andCardBackImgGreaterThan(String value) {
            addCriterion("card_back_img >", value, "cardBackImg");
            return (Criteria) this;
        }

        public Criteria andCardBackImgGreaterThanOrEqualTo(String value) {
            addCriterion("card_back_img >=", value, "cardBackImg");
            return (Criteria) this;
        }

        public Criteria andCardBackImgLessThan(String value) {
            addCriterion("card_back_img <", value, "cardBackImg");
            return (Criteria) this;
        }

        public Criteria andCardBackImgLessThanOrEqualTo(String value) {
            addCriterion("card_back_img <=", value, "cardBackImg");
            return (Criteria) this;
        }

        public Criteria andCardBackImgLike(String value) {
            addCriterion("card_back_img like", value, "cardBackImg");
            return (Criteria) this;
        }

        public Criteria andCardBackImgNotLike(String value) {
            addCriterion("card_back_img not like", value, "cardBackImg");
            return (Criteria) this;
        }

        public Criteria andCardBackImgIn(List<String> values) {
            addCriterion("card_back_img in", values, "cardBackImg");
            return (Criteria) this;
        }

        public Criteria andCardBackImgNotIn(List<String> values) {
            addCriterion("card_back_img not in", values, "cardBackImg");
            return (Criteria) this;
        }

        public Criteria andCardBackImgBetween(String value1, String value2) {
            addCriterion("card_back_img between", value1, value2, "cardBackImg");
            return (Criteria) this;
        }

        public Criteria andCardBackImgNotBetween(String value1, String value2) {
            addCriterion("card_back_img not between", value1, value2, "cardBackImg");
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