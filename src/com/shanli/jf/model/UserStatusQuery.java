package com.shanli.jf.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserStatusQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public UserStatusQuery() {
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

        public Criteria andPhoneStatusIsNull() {
            addCriterion("phone_status is null");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusIsNotNull() {
            addCriterion("phone_status is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusEqualTo(Byte value) {
            addCriterion("phone_status =", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusNotEqualTo(Byte value) {
            addCriterion("phone_status <>", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusGreaterThan(Byte value) {
            addCriterion("phone_status >", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("phone_status >=", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusLessThan(Byte value) {
            addCriterion("phone_status <", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusLessThanOrEqualTo(Byte value) {
            addCriterion("phone_status <=", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusIn(List<Byte> values) {
            addCriterion("phone_status in", values, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusNotIn(List<Byte> values) {
            addCriterion("phone_status not in", values, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusBetween(Byte value1, Byte value2) {
            addCriterion("phone_status between", value1, value2, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("phone_status not between", value1, value2, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andIdCardStatusIsNull() {
            addCriterion("id_card_status is null");
            return (Criteria) this;
        }

        public Criteria andIdCardStatusIsNotNull() {
            addCriterion("id_card_status is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardStatusEqualTo(Byte value) {
            addCriterion("id_card_status =", value, "idCardStatus");
            return (Criteria) this;
        }

        public Criteria andIdCardStatusNotEqualTo(Byte value) {
            addCriterion("id_card_status <>", value, "idCardStatus");
            return (Criteria) this;
        }

        public Criteria andIdCardStatusGreaterThan(Byte value) {
            addCriterion("id_card_status >", value, "idCardStatus");
            return (Criteria) this;
        }

        public Criteria andIdCardStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("id_card_status >=", value, "idCardStatus");
            return (Criteria) this;
        }

        public Criteria andIdCardStatusLessThan(Byte value) {
            addCriterion("id_card_status <", value, "idCardStatus");
            return (Criteria) this;
        }

        public Criteria andIdCardStatusLessThanOrEqualTo(Byte value) {
            addCriterion("id_card_status <=", value, "idCardStatus");
            return (Criteria) this;
        }

        public Criteria andIdCardStatusIn(List<Byte> values) {
            addCriterion("id_card_status in", values, "idCardStatus");
            return (Criteria) this;
        }

        public Criteria andIdCardStatusNotIn(List<Byte> values) {
            addCriterion("id_card_status not in", values, "idCardStatus");
            return (Criteria) this;
        }

        public Criteria andIdCardStatusBetween(Byte value1, Byte value2) {
            addCriterion("id_card_status between", value1, value2, "idCardStatus");
            return (Criteria) this;
        }

        public Criteria andIdCardStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("id_card_status not between", value1, value2, "idCardStatus");
            return (Criteria) this;
        }

        public Criteria andIsPasswordIsNull() {
            addCriterion("is_password is null");
            return (Criteria) this;
        }

        public Criteria andIsPasswordIsNotNull() {
            addCriterion("is_password is not null");
            return (Criteria) this;
        }

        public Criteria andIsPasswordEqualTo(Byte value) {
            addCriterion("is_password =", value, "isPassword");
            return (Criteria) this;
        }

        public Criteria andIsPasswordNotEqualTo(Byte value) {
            addCriterion("is_password <>", value, "isPassword");
            return (Criteria) this;
        }

        public Criteria andIsPasswordGreaterThan(Byte value) {
            addCriterion("is_password >", value, "isPassword");
            return (Criteria) this;
        }

        public Criteria andIsPasswordGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_password >=", value, "isPassword");
            return (Criteria) this;
        }

        public Criteria andIsPasswordLessThan(Byte value) {
            addCriterion("is_password <", value, "isPassword");
            return (Criteria) this;
        }

        public Criteria andIsPasswordLessThanOrEqualTo(Byte value) {
            addCriterion("is_password <=", value, "isPassword");
            return (Criteria) this;
        }

        public Criteria andIsPasswordIn(List<Byte> values) {
            addCriterion("is_password in", values, "isPassword");
            return (Criteria) this;
        }

        public Criteria andIsPasswordNotIn(List<Byte> values) {
            addCriterion("is_password not in", values, "isPassword");
            return (Criteria) this;
        }

        public Criteria andIsPasswordBetween(Byte value1, Byte value2) {
            addCriterion("is_password between", value1, value2, "isPassword");
            return (Criteria) this;
        }

        public Criteria andIsPasswordNotBetween(Byte value1, Byte value2) {
            addCriterion("is_password not between", value1, value2, "isPassword");
            return (Criteria) this;
        }

        public Criteria andIsBaseInfoIsNull() {
            addCriterion("is_base_info is null");
            return (Criteria) this;
        }

        public Criteria andIsBaseInfoIsNotNull() {
            addCriterion("is_base_info is not null");
            return (Criteria) this;
        }

        public Criteria andIsBaseInfoEqualTo(Byte value) {
            addCriterion("is_base_info =", value, "isBaseInfo");
            return (Criteria) this;
        }

        public Criteria andIsBaseInfoNotEqualTo(Byte value) {
            addCriterion("is_base_info <>", value, "isBaseInfo");
            return (Criteria) this;
        }

        public Criteria andIsBaseInfoGreaterThan(Byte value) {
            addCriterion("is_base_info >", value, "isBaseInfo");
            return (Criteria) this;
        }

        public Criteria andIsBaseInfoGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_base_info >=", value, "isBaseInfo");
            return (Criteria) this;
        }

        public Criteria andIsBaseInfoLessThan(Byte value) {
            addCriterion("is_base_info <", value, "isBaseInfo");
            return (Criteria) this;
        }

        public Criteria andIsBaseInfoLessThanOrEqualTo(Byte value) {
            addCriterion("is_base_info <=", value, "isBaseInfo");
            return (Criteria) this;
        }

        public Criteria andIsBaseInfoIn(List<Byte> values) {
            addCriterion("is_base_info in", values, "isBaseInfo");
            return (Criteria) this;
        }

        public Criteria andIsBaseInfoNotIn(List<Byte> values) {
            addCriterion("is_base_info not in", values, "isBaseInfo");
            return (Criteria) this;
        }

        public Criteria andIsBaseInfoBetween(Byte value1, Byte value2) {
            addCriterion("is_base_info between", value1, value2, "isBaseInfo");
            return (Criteria) this;
        }

        public Criteria andIsBaseInfoNotBetween(Byte value1, Byte value2) {
            addCriterion("is_base_info not between", value1, value2, "isBaseInfo");
            return (Criteria) this;
        }

        public Criteria andIsEntrustIsNull() {
            addCriterion("is_entrust is null");
            return (Criteria) this;
        }

        public Criteria andIsEntrustIsNotNull() {
            addCriterion("is_entrust is not null");
            return (Criteria) this;
        }

        public Criteria andIsEntrustEqualTo(Byte value) {
            addCriterion("is_entrust =", value, "isEntrust");
            return (Criteria) this;
        }

        public Criteria andIsEntrustNotEqualTo(Byte value) {
            addCriterion("is_entrust <>", value, "isEntrust");
            return (Criteria) this;
        }

        public Criteria andIsEntrustGreaterThan(Byte value) {
            addCriterion("is_entrust >", value, "isEntrust");
            return (Criteria) this;
        }

        public Criteria andIsEntrustGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_entrust >=", value, "isEntrust");
            return (Criteria) this;
        }

        public Criteria andIsEntrustLessThan(Byte value) {
            addCriterion("is_entrust <", value, "isEntrust");
            return (Criteria) this;
        }

        public Criteria andIsEntrustLessThanOrEqualTo(Byte value) {
            addCriterion("is_entrust <=", value, "isEntrust");
            return (Criteria) this;
        }

        public Criteria andIsEntrustIn(List<Byte> values) {
            addCriterion("is_entrust in", values, "isEntrust");
            return (Criteria) this;
        }

        public Criteria andIsEntrustNotIn(List<Byte> values) {
            addCriterion("is_entrust not in", values, "isEntrust");
            return (Criteria) this;
        }

        public Criteria andIsEntrustBetween(Byte value1, Byte value2) {
            addCriterion("is_entrust between", value1, value2, "isEntrust");
            return (Criteria) this;
        }

        public Criteria andIsEntrustNotBetween(Byte value1, Byte value2) {
            addCriterion("is_entrust not between", value1, value2, "isEntrust");
            return (Criteria) this;
        }

        public Criteria andFaceStatusIsNull() {
            addCriterion("face_status is null");
            return (Criteria) this;
        }

        public Criteria andFaceStatusIsNotNull() {
            addCriterion("face_status is not null");
            return (Criteria) this;
        }

        public Criteria andFaceStatusEqualTo(Byte value) {
            addCriterion("face_status =", value, "faceStatus");
            return (Criteria) this;
        }

        public Criteria andFaceStatusNotEqualTo(Byte value) {
            addCriterion("face_status <>", value, "faceStatus");
            return (Criteria) this;
        }

        public Criteria andFaceStatusGreaterThan(Byte value) {
            addCriterion("face_status >", value, "faceStatus");
            return (Criteria) this;
        }

        public Criteria andFaceStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("face_status >=", value, "faceStatus");
            return (Criteria) this;
        }

        public Criteria andFaceStatusLessThan(Byte value) {
            addCriterion("face_status <", value, "faceStatus");
            return (Criteria) this;
        }

        public Criteria andFaceStatusLessThanOrEqualTo(Byte value) {
            addCriterion("face_status <=", value, "faceStatus");
            return (Criteria) this;
        }

        public Criteria andFaceStatusIn(List<Byte> values) {
            addCriterion("face_status in", values, "faceStatus");
            return (Criteria) this;
        }

        public Criteria andFaceStatusNotIn(List<Byte> values) {
            addCriterion("face_status not in", values, "faceStatus");
            return (Criteria) this;
        }

        public Criteria andFaceStatusBetween(Byte value1, Byte value2) {
            addCriterion("face_status between", value1, value2, "faceStatus");
            return (Criteria) this;
        }

        public Criteria andFaceStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("face_status not between", value1, value2, "faceStatus");
            return (Criteria) this;
        }

        public Criteria andFaceppStatusIsNull() {
            addCriterion("facepp_status is null");
            return (Criteria) this;
        }

        public Criteria andFaceppStatusIsNotNull() {
            addCriterion("facepp_status is not null");
            return (Criteria) this;
        }

        public Criteria andFaceppStatusEqualTo(Byte value) {
            addCriterion("facepp_status =", value, "faceppStatus");
            return (Criteria) this;
        }

        public Criteria andFaceppStatusNotEqualTo(Byte value) {
            addCriterion("facepp_status <>", value, "faceppStatus");
            return (Criteria) this;
        }

        public Criteria andFaceppStatusGreaterThan(Byte value) {
            addCriterion("facepp_status >", value, "faceppStatus");
            return (Criteria) this;
        }

        public Criteria andFaceppStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("facepp_status >=", value, "faceppStatus");
            return (Criteria) this;
        }

        public Criteria andFaceppStatusLessThan(Byte value) {
            addCriterion("facepp_status <", value, "faceppStatus");
            return (Criteria) this;
        }

        public Criteria andFaceppStatusLessThanOrEqualTo(Byte value) {
            addCriterion("facepp_status <=", value, "faceppStatus");
            return (Criteria) this;
        }

        public Criteria andFaceppStatusIn(List<Byte> values) {
            addCriterion("facepp_status in", values, "faceppStatus");
            return (Criteria) this;
        }

        public Criteria andFaceppStatusNotIn(List<Byte> values) {
            addCriterion("facepp_status not in", values, "faceppStatus");
            return (Criteria) this;
        }

        public Criteria andFaceppStatusBetween(Byte value1, Byte value2) {
            addCriterion("facepp_status between", value1, value2, "faceppStatus");
            return (Criteria) this;
        }

        public Criteria andFaceppStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("facepp_status not between", value1, value2, "faceppStatus");
            return (Criteria) this;
        }

        public Criteria andComfundsStatusIsNull() {
            addCriterion("comfunds_status is null");
            return (Criteria) this;
        }

        public Criteria andComfundsStatusIsNotNull() {
            addCriterion("comfunds_status is not null");
            return (Criteria) this;
        }

        public Criteria andComfundsStatusEqualTo(Byte value) {
            addCriterion("comfunds_status =", value, "comfundsStatus");
            return (Criteria) this;
        }

        public Criteria andComfundsStatusNotEqualTo(Byte value) {
            addCriterion("comfunds_status <>", value, "comfundsStatus");
            return (Criteria) this;
        }

        public Criteria andComfundsStatusGreaterThan(Byte value) {
            addCriterion("comfunds_status >", value, "comfundsStatus");
            return (Criteria) this;
        }

        public Criteria andComfundsStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("comfunds_status >=", value, "comfundsStatus");
            return (Criteria) this;
        }

        public Criteria andComfundsStatusLessThan(Byte value) {
            addCriterion("comfunds_status <", value, "comfundsStatus");
            return (Criteria) this;
        }

        public Criteria andComfundsStatusLessThanOrEqualTo(Byte value) {
            addCriterion("comfunds_status <=", value, "comfundsStatus");
            return (Criteria) this;
        }

        public Criteria andComfundsStatusIn(List<Byte> values) {
            addCriterion("comfunds_status in", values, "comfundsStatus");
            return (Criteria) this;
        }

        public Criteria andComfundsStatusNotIn(List<Byte> values) {
            addCriterion("comfunds_status not in", values, "comfundsStatus");
            return (Criteria) this;
        }

        public Criteria andComfundsStatusBetween(Byte value1, Byte value2) {
            addCriterion("comfunds_status between", value1, value2, "comfundsStatus");
            return (Criteria) this;
        }

        public Criteria andComfundsStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("comfunds_status not between", value1, value2, "comfundsStatus");
            return (Criteria) this;
        }

        public Criteria andOcialInsStatusIsNull() {
            addCriterion("ocial_ins_status is null");
            return (Criteria) this;
        }

        public Criteria andOcialInsStatusIsNotNull() {
            addCriterion("ocial_ins_status is not null");
            return (Criteria) this;
        }

        public Criteria andOcialInsStatusEqualTo(Byte value) {
            addCriterion("ocial_ins_status =", value, "ocialInsStatus");
            return (Criteria) this;
        }

        public Criteria andOcialInsStatusNotEqualTo(Byte value) {
            addCriterion("ocial_ins_status <>", value, "ocialInsStatus");
            return (Criteria) this;
        }

        public Criteria andOcialInsStatusGreaterThan(Byte value) {
            addCriterion("ocial_ins_status >", value, "ocialInsStatus");
            return (Criteria) this;
        }

        public Criteria andOcialInsStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("ocial_ins_status >=", value, "ocialInsStatus");
            return (Criteria) this;
        }

        public Criteria andOcialInsStatusLessThan(Byte value) {
            addCriterion("ocial_ins_status <", value, "ocialInsStatus");
            return (Criteria) this;
        }

        public Criteria andOcialInsStatusLessThanOrEqualTo(Byte value) {
            addCriterion("ocial_ins_status <=", value, "ocialInsStatus");
            return (Criteria) this;
        }

        public Criteria andOcialInsStatusIn(List<Byte> values) {
            addCriterion("ocial_ins_status in", values, "ocialInsStatus");
            return (Criteria) this;
        }

        public Criteria andOcialInsStatusNotIn(List<Byte> values) {
            addCriterion("ocial_ins_status not in", values, "ocialInsStatus");
            return (Criteria) this;
        }

        public Criteria andOcialInsStatusBetween(Byte value1, Byte value2) {
            addCriterion("ocial_ins_status between", value1, value2, "ocialInsStatus");
            return (Criteria) this;
        }

        public Criteria andOcialInsStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("ocial_ins_status not between", value1, value2, "ocialInsStatus");
            return (Criteria) this;
        }

        public Criteria andSesameCredStatusIsNull() {
            addCriterion("sesame_cred_status is null");
            return (Criteria) this;
        }

        public Criteria andSesameCredStatusIsNotNull() {
            addCriterion("sesame_cred_status is not null");
            return (Criteria) this;
        }

        public Criteria andSesameCredStatusEqualTo(Byte value) {
            addCriterion("sesame_cred_status =", value, "sesameCredStatus");
            return (Criteria) this;
        }

        public Criteria andSesameCredStatusNotEqualTo(Byte value) {
            addCriterion("sesame_cred_status <>", value, "sesameCredStatus");
            return (Criteria) this;
        }

        public Criteria andSesameCredStatusGreaterThan(Byte value) {
            addCriterion("sesame_cred_status >", value, "sesameCredStatus");
            return (Criteria) this;
        }

        public Criteria andSesameCredStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("sesame_cred_status >=", value, "sesameCredStatus");
            return (Criteria) this;
        }

        public Criteria andSesameCredStatusLessThan(Byte value) {
            addCriterion("sesame_cred_status <", value, "sesameCredStatus");
            return (Criteria) this;
        }

        public Criteria andSesameCredStatusLessThanOrEqualTo(Byte value) {
            addCriterion("sesame_cred_status <=", value, "sesameCredStatus");
            return (Criteria) this;
        }

        public Criteria andSesameCredStatusIn(List<Byte> values) {
            addCriterion("sesame_cred_status in", values, "sesameCredStatus");
            return (Criteria) this;
        }

        public Criteria andSesameCredStatusNotIn(List<Byte> values) {
            addCriterion("sesame_cred_status not in", values, "sesameCredStatus");
            return (Criteria) this;
        }

        public Criteria andSesameCredStatusBetween(Byte value1, Byte value2) {
            addCriterion("sesame_cred_status between", value1, value2, "sesameCredStatus");
            return (Criteria) this;
        }

        public Criteria andSesameCredStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("sesame_cred_status not between", value1, value2, "sesameCredStatus");
            return (Criteria) this;
        }

        public Criteria andQianhaiCredStatusIsNull() {
            addCriterion("qianhai_cred_status is null");
            return (Criteria) this;
        }

        public Criteria andQianhaiCredStatusIsNotNull() {
            addCriterion("qianhai_cred_status is not null");
            return (Criteria) this;
        }

        public Criteria andQianhaiCredStatusEqualTo(Byte value) {
            addCriterion("qianhai_cred_status =", value, "qianhaiCredStatus");
            return (Criteria) this;
        }

        public Criteria andQianhaiCredStatusNotEqualTo(Byte value) {
            addCriterion("qianhai_cred_status <>", value, "qianhaiCredStatus");
            return (Criteria) this;
        }

        public Criteria andQianhaiCredStatusGreaterThan(Byte value) {
            addCriterion("qianhai_cred_status >", value, "qianhaiCredStatus");
            return (Criteria) this;
        }

        public Criteria andQianhaiCredStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("qianhai_cred_status >=", value, "qianhaiCredStatus");
            return (Criteria) this;
        }

        public Criteria andQianhaiCredStatusLessThan(Byte value) {
            addCriterion("qianhai_cred_status <", value, "qianhaiCredStatus");
            return (Criteria) this;
        }

        public Criteria andQianhaiCredStatusLessThanOrEqualTo(Byte value) {
            addCriterion("qianhai_cred_status <=", value, "qianhaiCredStatus");
            return (Criteria) this;
        }

        public Criteria andQianhaiCredStatusIn(List<Byte> values) {
            addCriterion("qianhai_cred_status in", values, "qianhaiCredStatus");
            return (Criteria) this;
        }

        public Criteria andQianhaiCredStatusNotIn(List<Byte> values) {
            addCriterion("qianhai_cred_status not in", values, "qianhaiCredStatus");
            return (Criteria) this;
        }

        public Criteria andQianhaiCredStatusBetween(Byte value1, Byte value2) {
            addCriterion("qianhai_cred_status between", value1, value2, "qianhaiCredStatus");
            return (Criteria) this;
        }

        public Criteria andQianhaiCredStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("qianhai_cred_status not between", value1, value2, "qianhaiCredStatus");
            return (Criteria) this;
        }

        public Criteria andCreditCardStatusIsNull() {
            addCriterion("credit_card_status is null");
            return (Criteria) this;
        }

        public Criteria andCreditCardStatusIsNotNull() {
            addCriterion("credit_card_status is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCardStatusEqualTo(Byte value) {
            addCriterion("credit_card_status =", value, "creditCardStatus");
            return (Criteria) this;
        }

        public Criteria andCreditCardStatusNotEqualTo(Byte value) {
            addCriterion("credit_card_status <>", value, "creditCardStatus");
            return (Criteria) this;
        }

        public Criteria andCreditCardStatusGreaterThan(Byte value) {
            addCriterion("credit_card_status >", value, "creditCardStatus");
            return (Criteria) this;
        }

        public Criteria andCreditCardStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("credit_card_status >=", value, "creditCardStatus");
            return (Criteria) this;
        }

        public Criteria andCreditCardStatusLessThan(Byte value) {
            addCriterion("credit_card_status <", value, "creditCardStatus");
            return (Criteria) this;
        }

        public Criteria andCreditCardStatusLessThanOrEqualTo(Byte value) {
            addCriterion("credit_card_status <=", value, "creditCardStatus");
            return (Criteria) this;
        }

        public Criteria andCreditCardStatusIn(List<Byte> values) {
            addCriterion("credit_card_status in", values, "creditCardStatus");
            return (Criteria) this;
        }

        public Criteria andCreditCardStatusNotIn(List<Byte> values) {
            addCriterion("credit_card_status not in", values, "creditCardStatus");
            return (Criteria) this;
        }

        public Criteria andCreditCardStatusBetween(Byte value1, Byte value2) {
            addCriterion("credit_card_status between", value1, value2, "creditCardStatus");
            return (Criteria) this;
        }

        public Criteria andCreditCardStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("credit_card_status not between", value1, value2, "creditCardStatus");
            return (Criteria) this;
        }

        public Criteria andEducateStatusIsNull() {
            addCriterion("educate_status is null");
            return (Criteria) this;
        }

        public Criteria andEducateStatusIsNotNull() {
            addCriterion("educate_status is not null");
            return (Criteria) this;
        }

        public Criteria andEducateStatusEqualTo(Byte value) {
            addCriterion("educate_status =", value, "educateStatus");
            return (Criteria) this;
        }

        public Criteria andEducateStatusNotEqualTo(Byte value) {
            addCriterion("educate_status <>", value, "educateStatus");
            return (Criteria) this;
        }

        public Criteria andEducateStatusGreaterThan(Byte value) {
            addCriterion("educate_status >", value, "educateStatus");
            return (Criteria) this;
        }

        public Criteria andEducateStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("educate_status >=", value, "educateStatus");
            return (Criteria) this;
        }

        public Criteria andEducateStatusLessThan(Byte value) {
            addCriterion("educate_status <", value, "educateStatus");
            return (Criteria) this;
        }

        public Criteria andEducateStatusLessThanOrEqualTo(Byte value) {
            addCriterion("educate_status <=", value, "educateStatus");
            return (Criteria) this;
        }

        public Criteria andEducateStatusIn(List<Byte> values) {
            addCriterion("educate_status in", values, "educateStatus");
            return (Criteria) this;
        }

        public Criteria andEducateStatusNotIn(List<Byte> values) {
            addCriterion("educate_status not in", values, "educateStatus");
            return (Criteria) this;
        }

        public Criteria andEducateStatusBetween(Byte value1, Byte value2) {
            addCriterion("educate_status between", value1, value2, "educateStatus");
            return (Criteria) this;
        }

        public Criteria andEducateStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("educate_status not between", value1, value2, "educateStatus");
            return (Criteria) this;
        }

        public Criteria andFadadaStatusIsNull() {
            addCriterion("fadada_status is null");
            return (Criteria) this;
        }

        public Criteria andFadadaStatusIsNotNull() {
            addCriterion("fadada_status is not null");
            return (Criteria) this;
        }

        public Criteria andFadadaStatusEqualTo(Byte value) {
            addCriterion("fadada_status =", value, "fadadaStatus");
            return (Criteria) this;
        }

        public Criteria andFadadaStatusNotEqualTo(Byte value) {
            addCriterion("fadada_status <>", value, "fadadaStatus");
            return (Criteria) this;
        }

        public Criteria andFadadaStatusGreaterThan(Byte value) {
            addCriterion("fadada_status >", value, "fadadaStatus");
            return (Criteria) this;
        }

        public Criteria andFadadaStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("fadada_status >=", value, "fadadaStatus");
            return (Criteria) this;
        }

        public Criteria andFadadaStatusLessThan(Byte value) {
            addCriterion("fadada_status <", value, "fadadaStatus");
            return (Criteria) this;
        }

        public Criteria andFadadaStatusLessThanOrEqualTo(Byte value) {
            addCriterion("fadada_status <=", value, "fadadaStatus");
            return (Criteria) this;
        }

        public Criteria andFadadaStatusIn(List<Byte> values) {
            addCriterion("fadada_status in", values, "fadadaStatus");
            return (Criteria) this;
        }

        public Criteria andFadadaStatusNotIn(List<Byte> values) {
            addCriterion("fadada_status not in", values, "fadadaStatus");
            return (Criteria) this;
        }

        public Criteria andFadadaStatusBetween(Byte value1, Byte value2) {
            addCriterion("fadada_status between", value1, value2, "fadadaStatus");
            return (Criteria) this;
        }

        public Criteria andFadadaStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("fadada_status not between", value1, value2, "fadadaStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusIsNull() {
            addCriterion("email_status is null");
            return (Criteria) this;
        }

        public Criteria andEmailStatusIsNotNull() {
            addCriterion("email_status is not null");
            return (Criteria) this;
        }

        public Criteria andEmailStatusEqualTo(Byte value) {
            addCriterion("email_status =", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusNotEqualTo(Byte value) {
            addCriterion("email_status <>", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusGreaterThan(Byte value) {
            addCriterion("email_status >", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("email_status >=", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusLessThan(Byte value) {
            addCriterion("email_status <", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusLessThanOrEqualTo(Byte value) {
            addCriterion("email_status <=", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusIn(List<Byte> values) {
            addCriterion("email_status in", values, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusNotIn(List<Byte> values) {
            addCriterion("email_status not in", values, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusBetween(Byte value1, Byte value2) {
            addCriterion("email_status between", value1, value2, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("email_status not between", value1, value2, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusIsNull() {
            addCriterion("account_status is null");
            return (Criteria) this;
        }

        public Criteria andAccountStatusIsNotNull() {
            addCriterion("account_status is not null");
            return (Criteria) this;
        }

        public Criteria andAccountStatusEqualTo(Byte value) {
            addCriterion("account_status =", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotEqualTo(Byte value) {
            addCriterion("account_status <>", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusGreaterThan(Byte value) {
            addCriterion("account_status >", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("account_status >=", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusLessThan(Byte value) {
            addCriterion("account_status <", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusLessThanOrEqualTo(Byte value) {
            addCriterion("account_status <=", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusIn(List<Byte> values) {
            addCriterion("account_status in", values, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotIn(List<Byte> values) {
            addCriterion("account_status not in", values, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusBetween(Byte value1, Byte value2) {
            addCriterion("account_status between", value1, value2, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("account_status not between", value1, value2, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusIsNull() {
            addCriterion("credit_status is null");
            return (Criteria) this;
        }

        public Criteria andCreditStatusIsNotNull() {
            addCriterion("credit_status is not null");
            return (Criteria) this;
        }

        public Criteria andCreditStatusEqualTo(Byte value) {
            addCriterion("credit_status =", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusNotEqualTo(Byte value) {
            addCriterion("credit_status <>", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusGreaterThan(Byte value) {
            addCriterion("credit_status >", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("credit_status >=", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusLessThan(Byte value) {
            addCriterion("credit_status <", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusLessThanOrEqualTo(Byte value) {
            addCriterion("credit_status <=", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusIn(List<Byte> values) {
            addCriterion("credit_status in", values, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusNotIn(List<Byte> values) {
            addCriterion("credit_status not in", values, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusBetween(Byte value1, Byte value2) {
            addCriterion("credit_status between", value1, value2, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("credit_status not between", value1, value2, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andSafequestionStatusIsNull() {
            addCriterion("safequestion_status is null");
            return (Criteria) this;
        }

        public Criteria andSafequestionStatusIsNotNull() {
            addCriterion("safequestion_status is not null");
            return (Criteria) this;
        }

        public Criteria andSafequestionStatusEqualTo(Byte value) {
            addCriterion("safequestion_status =", value, "safequestionStatus");
            return (Criteria) this;
        }

        public Criteria andSafequestionStatusNotEqualTo(Byte value) {
            addCriterion("safequestion_status <>", value, "safequestionStatus");
            return (Criteria) this;
        }

        public Criteria andSafequestionStatusGreaterThan(Byte value) {
            addCriterion("safequestion_status >", value, "safequestionStatus");
            return (Criteria) this;
        }

        public Criteria andSafequestionStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("safequestion_status >=", value, "safequestionStatus");
            return (Criteria) this;
        }

        public Criteria andSafequestionStatusLessThan(Byte value) {
            addCriterion("safequestion_status <", value, "safequestionStatus");
            return (Criteria) this;
        }

        public Criteria andSafequestionStatusLessThanOrEqualTo(Byte value) {
            addCriterion("safequestion_status <=", value, "safequestionStatus");
            return (Criteria) this;
        }

        public Criteria andSafequestionStatusIn(List<Byte> values) {
            addCriterion("safequestion_status in", values, "safequestionStatus");
            return (Criteria) this;
        }

        public Criteria andSafequestionStatusNotIn(List<Byte> values) {
            addCriterion("safequestion_status not in", values, "safequestionStatus");
            return (Criteria) this;
        }

        public Criteria andSafequestionStatusBetween(Byte value1, Byte value2) {
            addCriterion("safequestion_status between", value1, value2, "safequestionStatus");
            return (Criteria) this;
        }

        public Criteria andSafequestionStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("safequestion_status not between", value1, value2, "safequestionStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusIsNull() {
            addCriterion("video_status is null");
            return (Criteria) this;
        }

        public Criteria andVideoStatusIsNotNull() {
            addCriterion("video_status is not null");
            return (Criteria) this;
        }

        public Criteria andVideoStatusEqualTo(Byte value) {
            addCriterion("video_status =", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusNotEqualTo(Byte value) {
            addCriterion("video_status <>", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusGreaterThan(Byte value) {
            addCriterion("video_status >", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("video_status >=", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusLessThan(Byte value) {
            addCriterion("video_status <", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusLessThanOrEqualTo(Byte value) {
            addCriterion("video_status <=", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusIn(List<Byte> values) {
            addCriterion("video_status in", values, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusNotIn(List<Byte> values) {
            addCriterion("video_status not in", values, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusBetween(Byte value1, Byte value2) {
            addCriterion("video_status between", value1, value2, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("video_status not between", value1, value2, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusIsNull() {
            addCriterion("vip_status is null");
            return (Criteria) this;
        }

        public Criteria andVipStatusIsNotNull() {
            addCriterion("vip_status is not null");
            return (Criteria) this;
        }

        public Criteria andVipStatusEqualTo(Byte value) {
            addCriterion("vip_status =", value, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusNotEqualTo(Byte value) {
            addCriterion("vip_status <>", value, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusGreaterThan(Byte value) {
            addCriterion("vip_status >", value, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("vip_status >=", value, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusLessThan(Byte value) {
            addCriterion("vip_status <", value, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusLessThanOrEqualTo(Byte value) {
            addCriterion("vip_status <=", value, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusIn(List<Byte> values) {
            addCriterion("vip_status in", values, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusNotIn(List<Byte> values) {
            addCriterion("vip_status not in", values, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusBetween(Byte value1, Byte value2) {
            addCriterion("vip_status between", value1, value2, "vipStatus");
            return (Criteria) this;
        }

        public Criteria andVipStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("vip_status not between", value1, value2, "vipStatus");
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