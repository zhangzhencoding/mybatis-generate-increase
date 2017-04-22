package com.shanli.jf.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FaceLogQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FaceLogQuery() {
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

        public Criteria andIdcardNumberIsNull() {
            addCriterion("idcard_number is null");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberIsNotNull() {
            addCriterion("idcard_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberEqualTo(String value) {
            addCriterion("idcard_number =", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberNotEqualTo(String value) {
            addCriterion("idcard_number <>", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberGreaterThan(String value) {
            addCriterion("idcard_number >", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_number >=", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberLessThan(String value) {
            addCriterion("idcard_number <", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberLessThanOrEqualTo(String value) {
            addCriterion("idcard_number <=", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberLike(String value) {
            addCriterion("idcard_number like", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberNotLike(String value) {
            addCriterion("idcard_number not like", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberIn(List<String> values) {
            addCriterion("idcard_number in", values, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberNotIn(List<String> values) {
            addCriterion("idcard_number not in", values, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberBetween(String value1, String value2) {
            addCriterion("idcard_number between", value1, value2, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberNotBetween(String value1, String value2) {
            addCriterion("idcard_number not between", value1, value2, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNameIsNull() {
            addCriterion("idcard_name is null");
            return (Criteria) this;
        }

        public Criteria andIdcardNameIsNotNull() {
            addCriterion("idcard_name is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardNameEqualTo(String value) {
            addCriterion("idcard_name =", value, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameNotEqualTo(String value) {
            addCriterion("idcard_name <>", value, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameGreaterThan(String value) {
            addCriterion("idcard_name >", value, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_name >=", value, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameLessThan(String value) {
            addCriterion("idcard_name <", value, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameLessThanOrEqualTo(String value) {
            addCriterion("idcard_name <=", value, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameLike(String value) {
            addCriterion("idcard_name like", value, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameNotLike(String value) {
            addCriterion("idcard_name not like", value, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameIn(List<String> values) {
            addCriterion("idcard_name in", values, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameNotIn(List<String> values) {
            addCriterion("idcard_name not in", values, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameBetween(String value1, String value2) {
            addCriterion("idcard_name between", value1, value2, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameNotBetween(String value1, String value2) {
            addCriterion("idcard_name not between", value1, value2, "idcardName");
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

        public Criteria andConfidenceIsNull() {
            addCriterion("confidence is null");
            return (Criteria) this;
        }

        public Criteria andConfidenceIsNotNull() {
            addCriterion("confidence is not null");
            return (Criteria) this;
        }

        public Criteria andConfidenceEqualTo(BigDecimal value) {
            addCriterion("confidence =", value, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceNotEqualTo(BigDecimal value) {
            addCriterion("confidence <>", value, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceGreaterThan(BigDecimal value) {
            addCriterion("confidence >", value, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("confidence >=", value, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceLessThan(BigDecimal value) {
            addCriterion("confidence <", value, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("confidence <=", value, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceIn(List<BigDecimal> values) {
            addCriterion("confidence in", values, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceNotIn(List<BigDecimal> values) {
            addCriterion("confidence not in", values, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("confidence between", value1, value2, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("confidence not between", value1, value2, "confidence");
            return (Criteria) this;
        }

        public Criteria andShenfenZIsNull() {
            addCriterion("shenfen_z is null");
            return (Criteria) this;
        }

        public Criteria andShenfenZIsNotNull() {
            addCriterion("shenfen_z is not null");
            return (Criteria) this;
        }

        public Criteria andShenfenZEqualTo(String value) {
            addCriterion("shenfen_z =", value, "shenfenZ");
            return (Criteria) this;
        }

        public Criteria andShenfenZNotEqualTo(String value) {
            addCriterion("shenfen_z <>", value, "shenfenZ");
            return (Criteria) this;
        }

        public Criteria andShenfenZGreaterThan(String value) {
            addCriterion("shenfen_z >", value, "shenfenZ");
            return (Criteria) this;
        }

        public Criteria andShenfenZGreaterThanOrEqualTo(String value) {
            addCriterion("shenfen_z >=", value, "shenfenZ");
            return (Criteria) this;
        }

        public Criteria andShenfenZLessThan(String value) {
            addCriterion("shenfen_z <", value, "shenfenZ");
            return (Criteria) this;
        }

        public Criteria andShenfenZLessThanOrEqualTo(String value) {
            addCriterion("shenfen_z <=", value, "shenfenZ");
            return (Criteria) this;
        }

        public Criteria andShenfenZLike(String value) {
            addCriterion("shenfen_z like", value, "shenfenZ");
            return (Criteria) this;
        }

        public Criteria andShenfenZNotLike(String value) {
            addCriterion("shenfen_z not like", value, "shenfenZ");
            return (Criteria) this;
        }

        public Criteria andShenfenZIn(List<String> values) {
            addCriterion("shenfen_z in", values, "shenfenZ");
            return (Criteria) this;
        }

        public Criteria andShenfenZNotIn(List<String> values) {
            addCriterion("shenfen_z not in", values, "shenfenZ");
            return (Criteria) this;
        }

        public Criteria andShenfenZBetween(String value1, String value2) {
            addCriterion("shenfen_z between", value1, value2, "shenfenZ");
            return (Criteria) this;
        }

        public Criteria andShenfenZNotBetween(String value1, String value2) {
            addCriterion("shenfen_z not between", value1, value2, "shenfenZ");
            return (Criteria) this;
        }

        public Criteria andShenfenFIsNull() {
            addCriterion("shenfen_f is null");
            return (Criteria) this;
        }

        public Criteria andShenfenFIsNotNull() {
            addCriterion("shenfen_f is not null");
            return (Criteria) this;
        }

        public Criteria andShenfenFEqualTo(String value) {
            addCriterion("shenfen_f =", value, "shenfenF");
            return (Criteria) this;
        }

        public Criteria andShenfenFNotEqualTo(String value) {
            addCriterion("shenfen_f <>", value, "shenfenF");
            return (Criteria) this;
        }

        public Criteria andShenfenFGreaterThan(String value) {
            addCriterion("shenfen_f >", value, "shenfenF");
            return (Criteria) this;
        }

        public Criteria andShenfenFGreaterThanOrEqualTo(String value) {
            addCriterion("shenfen_f >=", value, "shenfenF");
            return (Criteria) this;
        }

        public Criteria andShenfenFLessThan(String value) {
            addCriterion("shenfen_f <", value, "shenfenF");
            return (Criteria) this;
        }

        public Criteria andShenfenFLessThanOrEqualTo(String value) {
            addCriterion("shenfen_f <=", value, "shenfenF");
            return (Criteria) this;
        }

        public Criteria andShenfenFLike(String value) {
            addCriterion("shenfen_f like", value, "shenfenF");
            return (Criteria) this;
        }

        public Criteria andShenfenFNotLike(String value) {
            addCriterion("shenfen_f not like", value, "shenfenF");
            return (Criteria) this;
        }

        public Criteria andShenfenFIn(List<String> values) {
            addCriterion("shenfen_f in", values, "shenfenF");
            return (Criteria) this;
        }

        public Criteria andShenfenFNotIn(List<String> values) {
            addCriterion("shenfen_f not in", values, "shenfenF");
            return (Criteria) this;
        }

        public Criteria andShenfenFBetween(String value1, String value2) {
            addCriterion("shenfen_f between", value1, value2, "shenfenF");
            return (Criteria) this;
        }

        public Criteria andShenfenFNotBetween(String value1, String value2) {
            addCriterion("shenfen_f not between", value1, value2, "shenfenF");
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

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
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