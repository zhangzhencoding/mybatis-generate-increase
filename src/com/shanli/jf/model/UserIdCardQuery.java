package com.shanli.jf.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserIdCardQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public UserIdCardQuery() {
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

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Integer value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Integer value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Integer value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Integer value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Integer value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Integer> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Integer> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Integer value1, Integer value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Integer value1, Integer value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
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

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andRaceIsNull() {
            addCriterion("race is null");
            return (Criteria) this;
        }

        public Criteria andRaceIsNotNull() {
            addCriterion("race is not null");
            return (Criteria) this;
        }

        public Criteria andRaceEqualTo(String value) {
            addCriterion("race =", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceNotEqualTo(String value) {
            addCriterion("race <>", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceGreaterThan(String value) {
            addCriterion("race >", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceGreaterThanOrEqualTo(String value) {
            addCriterion("race >=", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceLessThan(String value) {
            addCriterion("race <", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceLessThanOrEqualTo(String value) {
            addCriterion("race <=", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceLike(String value) {
            addCriterion("race like", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceNotLike(String value) {
            addCriterion("race not like", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceIn(List<String> values) {
            addCriterion("race in", values, "race");
            return (Criteria) this;
        }

        public Criteria andRaceNotIn(List<String> values) {
            addCriterion("race not in", values, "race");
            return (Criteria) this;
        }

        public Criteria andRaceBetween(String value1, String value2) {
            addCriterion("race between", value1, value2, "race");
            return (Criteria) this;
        }

        public Criteria andRaceNotBetween(String value1, String value2) {
            addCriterion("race not between", value1, value2, "race");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberIsNull() {
            addCriterion("id_card_number is null");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberIsNotNull() {
            addCriterion("id_card_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberEqualTo(String value) {
            addCriterion("id_card_number =", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberNotEqualTo(String value) {
            addCriterion("id_card_number <>", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberGreaterThan(String value) {
            addCriterion("id_card_number >", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_number >=", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberLessThan(String value) {
            addCriterion("id_card_number <", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberLessThanOrEqualTo(String value) {
            addCriterion("id_card_number <=", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberLike(String value) {
            addCriterion("id_card_number like", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberNotLike(String value) {
            addCriterion("id_card_number not like", value, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberIn(List<String> values) {
            addCriterion("id_card_number in", values, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberNotIn(List<String> values) {
            addCriterion("id_card_number not in", values, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberBetween(String value1, String value2) {
            addCriterion("id_card_number between", value1, value2, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardNumberNotBetween(String value1, String value2) {
            addCriterion("id_card_number not between", value1, value2, "idCardNumber");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNull() {
            addCriterion("valid_date is null");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNotNull() {
            addCriterion("valid_date is not null");
            return (Criteria) this;
        }

        public Criteria andValidDateEqualTo(String value) {
            addCriterion("valid_date =", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotEqualTo(String value) {
            addCriterion("valid_date <>", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThan(String value) {
            addCriterion("valid_date >", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThanOrEqualTo(String value) {
            addCriterion("valid_date >=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThan(String value) {
            addCriterion("valid_date <", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThanOrEqualTo(String value) {
            addCriterion("valid_date <=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLike(String value) {
            addCriterion("valid_date like", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotLike(String value) {
            addCriterion("valid_date not like", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateIn(List<String> values) {
            addCriterion("valid_date in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotIn(List<String> values) {
            addCriterion("valid_date not in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateBetween(String value1, String value2) {
            addCriterion("valid_date between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotBetween(String value1, String value2) {
            addCriterion("valid_date not between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andIssuedByIsNull() {
            addCriterion("issued_by is null");
            return (Criteria) this;
        }

        public Criteria andIssuedByIsNotNull() {
            addCriterion("issued_by is not null");
            return (Criteria) this;
        }

        public Criteria andIssuedByEqualTo(String value) {
            addCriterion("issued_by =", value, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByNotEqualTo(String value) {
            addCriterion("issued_by <>", value, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByGreaterThan(String value) {
            addCriterion("issued_by >", value, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByGreaterThanOrEqualTo(String value) {
            addCriterion("issued_by >=", value, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByLessThan(String value) {
            addCriterion("issued_by <", value, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByLessThanOrEqualTo(String value) {
            addCriterion("issued_by <=", value, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByLike(String value) {
            addCriterion("issued_by like", value, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByNotLike(String value) {
            addCriterion("issued_by not like", value, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByIn(List<String> values) {
            addCriterion("issued_by in", values, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByNotIn(List<String> values) {
            addCriterion("issued_by not in", values, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByBetween(String value1, String value2) {
            addCriterion("issued_by between", value1, value2, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByNotBetween(String value1, String value2) {
            addCriterion("issued_by not between", value1, value2, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andFrontUrlIsNull() {
            addCriterion("front_url is null");
            return (Criteria) this;
        }

        public Criteria andFrontUrlIsNotNull() {
            addCriterion("front_url is not null");
            return (Criteria) this;
        }

        public Criteria andFrontUrlEqualTo(String value) {
            addCriterion("front_url =", value, "frontUrl");
            return (Criteria) this;
        }

        public Criteria andFrontUrlNotEqualTo(String value) {
            addCriterion("front_url <>", value, "frontUrl");
            return (Criteria) this;
        }

        public Criteria andFrontUrlGreaterThan(String value) {
            addCriterion("front_url >", value, "frontUrl");
            return (Criteria) this;
        }

        public Criteria andFrontUrlGreaterThanOrEqualTo(String value) {
            addCriterion("front_url >=", value, "frontUrl");
            return (Criteria) this;
        }

        public Criteria andFrontUrlLessThan(String value) {
            addCriterion("front_url <", value, "frontUrl");
            return (Criteria) this;
        }

        public Criteria andFrontUrlLessThanOrEqualTo(String value) {
            addCriterion("front_url <=", value, "frontUrl");
            return (Criteria) this;
        }

        public Criteria andFrontUrlLike(String value) {
            addCriterion("front_url like", value, "frontUrl");
            return (Criteria) this;
        }

        public Criteria andFrontUrlNotLike(String value) {
            addCriterion("front_url not like", value, "frontUrl");
            return (Criteria) this;
        }

        public Criteria andFrontUrlIn(List<String> values) {
            addCriterion("front_url in", values, "frontUrl");
            return (Criteria) this;
        }

        public Criteria andFrontUrlNotIn(List<String> values) {
            addCriterion("front_url not in", values, "frontUrl");
            return (Criteria) this;
        }

        public Criteria andFrontUrlBetween(String value1, String value2) {
            addCriterion("front_url between", value1, value2, "frontUrl");
            return (Criteria) this;
        }

        public Criteria andFrontUrlNotBetween(String value1, String value2) {
            addCriterion("front_url not between", value1, value2, "frontUrl");
            return (Criteria) this;
        }

        public Criteria andBackUrlIsNull() {
            addCriterion("back_url is null");
            return (Criteria) this;
        }

        public Criteria andBackUrlIsNotNull() {
            addCriterion("back_url is not null");
            return (Criteria) this;
        }

        public Criteria andBackUrlEqualTo(String value) {
            addCriterion("back_url =", value, "backUrl");
            return (Criteria) this;
        }

        public Criteria andBackUrlNotEqualTo(String value) {
            addCriterion("back_url <>", value, "backUrl");
            return (Criteria) this;
        }

        public Criteria andBackUrlGreaterThan(String value) {
            addCriterion("back_url >", value, "backUrl");
            return (Criteria) this;
        }

        public Criteria andBackUrlGreaterThanOrEqualTo(String value) {
            addCriterion("back_url >=", value, "backUrl");
            return (Criteria) this;
        }

        public Criteria andBackUrlLessThan(String value) {
            addCriterion("back_url <", value, "backUrl");
            return (Criteria) this;
        }

        public Criteria andBackUrlLessThanOrEqualTo(String value) {
            addCriterion("back_url <=", value, "backUrl");
            return (Criteria) this;
        }

        public Criteria andBackUrlLike(String value) {
            addCriterion("back_url like", value, "backUrl");
            return (Criteria) this;
        }

        public Criteria andBackUrlNotLike(String value) {
            addCriterion("back_url not like", value, "backUrl");
            return (Criteria) this;
        }

        public Criteria andBackUrlIn(List<String> values) {
            addCriterion("back_url in", values, "backUrl");
            return (Criteria) this;
        }

        public Criteria andBackUrlNotIn(List<String> values) {
            addCriterion("back_url not in", values, "backUrl");
            return (Criteria) this;
        }

        public Criteria andBackUrlBetween(String value1, String value2) {
            addCriterion("back_url between", value1, value2, "backUrl");
            return (Criteria) this;
        }

        public Criteria andBackUrlNotBetween(String value1, String value2) {
            addCriterion("back_url not between", value1, value2, "backUrl");
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