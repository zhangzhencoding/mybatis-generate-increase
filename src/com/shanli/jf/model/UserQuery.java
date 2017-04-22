package com.shanli.jf.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public UserQuery() {
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

        public Criteria andSinaIdIsNull() {
            addCriterion("sina_id is null");
            return (Criteria) this;
        }

        public Criteria andSinaIdIsNotNull() {
            addCriterion("sina_id is not null");
            return (Criteria) this;
        }

        public Criteria andSinaIdEqualTo(String value) {
            addCriterion("sina_id =", value, "sinaId");
            return (Criteria) this;
        }

        public Criteria andSinaIdNotEqualTo(String value) {
            addCriterion("sina_id <>", value, "sinaId");
            return (Criteria) this;
        }

        public Criteria andSinaIdGreaterThan(String value) {
            addCriterion("sina_id >", value, "sinaId");
            return (Criteria) this;
        }

        public Criteria andSinaIdGreaterThanOrEqualTo(String value) {
            addCriterion("sina_id >=", value, "sinaId");
            return (Criteria) this;
        }

        public Criteria andSinaIdLessThan(String value) {
            addCriterion("sina_id <", value, "sinaId");
            return (Criteria) this;
        }

        public Criteria andSinaIdLessThanOrEqualTo(String value) {
            addCriterion("sina_id <=", value, "sinaId");
            return (Criteria) this;
        }

        public Criteria andSinaIdLike(String value) {
            addCriterion("sina_id like", value, "sinaId");
            return (Criteria) this;
        }

        public Criteria andSinaIdNotLike(String value) {
            addCriterion("sina_id not like", value, "sinaId");
            return (Criteria) this;
        }

        public Criteria andSinaIdIn(List<String> values) {
            addCriterion("sina_id in", values, "sinaId");
            return (Criteria) this;
        }

        public Criteria andSinaIdNotIn(List<String> values) {
            addCriterion("sina_id not in", values, "sinaId");
            return (Criteria) this;
        }

        public Criteria andSinaIdBetween(String value1, String value2) {
            addCriterion("sina_id between", value1, value2, "sinaId");
            return (Criteria) this;
        }

        public Criteria andSinaIdNotBetween(String value1, String value2) {
            addCriterion("sina_id not between", value1, value2, "sinaId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
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

        public Criteria andPassWordIsNull() {
            addCriterion("pass_word is null");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNotNull() {
            addCriterion("pass_word is not null");
            return (Criteria) this;
        }

        public Criteria andPassWordEqualTo(String value) {
            addCriterion("pass_word =", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotEqualTo(String value) {
            addCriterion("pass_word <>", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThan(String value) {
            addCriterion("pass_word >", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThanOrEqualTo(String value) {
            addCriterion("pass_word >=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThan(String value) {
            addCriterion("pass_word <", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThanOrEqualTo(String value) {
            addCriterion("pass_word <=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLike(String value) {
            addCriterion("pass_word like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotLike(String value) {
            addCriterion("pass_word not like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordIn(List<String> values) {
            addCriterion("pass_word in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotIn(List<String> values) {
            addCriterion("pass_word not in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordBetween(String value1, String value2) {
            addCriterion("pass_word between", value1, value2, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotBetween(String value1, String value2) {
            addCriterion("pass_word not between", value1, value2, "passWord");
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

        public Criteria andLockStatusIsNull() {
            addCriterion("lock_status is null");
            return (Criteria) this;
        }

        public Criteria andLockStatusIsNotNull() {
            addCriterion("lock_status is not null");
            return (Criteria) this;
        }

        public Criteria andLockStatusEqualTo(Integer value) {
            addCriterion("lock_status =", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotEqualTo(Integer value) {
            addCriterion("lock_status <>", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusGreaterThan(Integer value) {
            addCriterion("lock_status >", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("lock_status >=", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusLessThan(Integer value) {
            addCriterion("lock_status <", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusLessThanOrEqualTo(Integer value) {
            addCriterion("lock_status <=", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusIn(List<Integer> values) {
            addCriterion("lock_status in", values, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotIn(List<Integer> values) {
            addCriterion("lock_status not in", values, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusBetween(Integer value1, Integer value2) {
            addCriterion("lock_status between", value1, value2, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("lock_status not between", value1, value2, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIsNull() {
            addCriterion("invite_code is null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIsNotNull() {
            addCriterion("invite_code is not null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeEqualTo(String value) {
            addCriterion("invite_code =", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotEqualTo(String value) {
            addCriterion("invite_code <>", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeGreaterThan(String value) {
            addCriterion("invite_code >", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeGreaterThanOrEqualTo(String value) {
            addCriterion("invite_code >=", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLessThan(String value) {
            addCriterion("invite_code <", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLessThanOrEqualTo(String value) {
            addCriterion("invite_code <=", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLike(String value) {
            addCriterion("invite_code like", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotLike(String value) {
            addCriterion("invite_code not like", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIn(List<String> values) {
            addCriterion("invite_code in", values, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotIn(List<String> values) {
            addCriterion("invite_code not in", values, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeBetween(String value1, String value2) {
            addCriterion("invite_code between", value1, value2, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotBetween(String value1, String value2) {
            addCriterion("invite_code not between", value1, value2, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andWeixinUrlIsNull() {
            addCriterion("weixin_url is null");
            return (Criteria) this;
        }

        public Criteria andWeixinUrlIsNotNull() {
            addCriterion("weixin_url is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinUrlEqualTo(String value) {
            addCriterion("weixin_url =", value, "weixinUrl");
            return (Criteria) this;
        }

        public Criteria andWeixinUrlNotEqualTo(String value) {
            addCriterion("weixin_url <>", value, "weixinUrl");
            return (Criteria) this;
        }

        public Criteria andWeixinUrlGreaterThan(String value) {
            addCriterion("weixin_url >", value, "weixinUrl");
            return (Criteria) this;
        }

        public Criteria andWeixinUrlGreaterThanOrEqualTo(String value) {
            addCriterion("weixin_url >=", value, "weixinUrl");
            return (Criteria) this;
        }

        public Criteria andWeixinUrlLessThan(String value) {
            addCriterion("weixin_url <", value, "weixinUrl");
            return (Criteria) this;
        }

        public Criteria andWeixinUrlLessThanOrEqualTo(String value) {
            addCriterion("weixin_url <=", value, "weixinUrl");
            return (Criteria) this;
        }

        public Criteria andWeixinUrlLike(String value) {
            addCriterion("weixin_url like", value, "weixinUrl");
            return (Criteria) this;
        }

        public Criteria andWeixinUrlNotLike(String value) {
            addCriterion("weixin_url not like", value, "weixinUrl");
            return (Criteria) this;
        }

        public Criteria andWeixinUrlIn(List<String> values) {
            addCriterion("weixin_url in", values, "weixinUrl");
            return (Criteria) this;
        }

        public Criteria andWeixinUrlNotIn(List<String> values) {
            addCriterion("weixin_url not in", values, "weixinUrl");
            return (Criteria) this;
        }

        public Criteria andWeixinUrlBetween(String value1, String value2) {
            addCriterion("weixin_url between", value1, value2, "weixinUrl");
            return (Criteria) this;
        }

        public Criteria andWeixinUrlNotBetween(String value1, String value2) {
            addCriterion("weixin_url not between", value1, value2, "weixinUrl");
            return (Criteria) this;
        }

        public Criteria andWeixinKeyIsNull() {
            addCriterion("weixin_key is null");
            return (Criteria) this;
        }

        public Criteria andWeixinKeyIsNotNull() {
            addCriterion("weixin_key is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinKeyEqualTo(String value) {
            addCriterion("weixin_key =", value, "weixinKey");
            return (Criteria) this;
        }

        public Criteria andWeixinKeyNotEqualTo(String value) {
            addCriterion("weixin_key <>", value, "weixinKey");
            return (Criteria) this;
        }

        public Criteria andWeixinKeyGreaterThan(String value) {
            addCriterion("weixin_key >", value, "weixinKey");
            return (Criteria) this;
        }

        public Criteria andWeixinKeyGreaterThanOrEqualTo(String value) {
            addCriterion("weixin_key >=", value, "weixinKey");
            return (Criteria) this;
        }

        public Criteria andWeixinKeyLessThan(String value) {
            addCriterion("weixin_key <", value, "weixinKey");
            return (Criteria) this;
        }

        public Criteria andWeixinKeyLessThanOrEqualTo(String value) {
            addCriterion("weixin_key <=", value, "weixinKey");
            return (Criteria) this;
        }

        public Criteria andWeixinKeyLike(String value) {
            addCriterion("weixin_key like", value, "weixinKey");
            return (Criteria) this;
        }

        public Criteria andWeixinKeyNotLike(String value) {
            addCriterion("weixin_key not like", value, "weixinKey");
            return (Criteria) this;
        }

        public Criteria andWeixinKeyIn(List<String> values) {
            addCriterion("weixin_key in", values, "weixinKey");
            return (Criteria) this;
        }

        public Criteria andWeixinKeyNotIn(List<String> values) {
            addCriterion("weixin_key not in", values, "weixinKey");
            return (Criteria) this;
        }

        public Criteria andWeixinKeyBetween(String value1, String value2) {
            addCriterion("weixin_key between", value1, value2, "weixinKey");
            return (Criteria) this;
        }

        public Criteria andWeixinKeyNotBetween(String value1, String value2) {
            addCriterion("weixin_key not between", value1, value2, "weixinKey");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenIsNull() {
            addCriterion("device_token is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenIsNotNull() {
            addCriterion("device_token is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenEqualTo(String value) {
            addCriterion("device_token =", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenNotEqualTo(String value) {
            addCriterion("device_token <>", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenGreaterThan(String value) {
            addCriterion("device_token >", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenGreaterThanOrEqualTo(String value) {
            addCriterion("device_token >=", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenLessThan(String value) {
            addCriterion("device_token <", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenLessThanOrEqualTo(String value) {
            addCriterion("device_token <=", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenLike(String value) {
            addCriterion("device_token like", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenNotLike(String value) {
            addCriterion("device_token not like", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenIn(List<String> values) {
            addCriterion("device_token in", values, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenNotIn(List<String> values) {
            addCriterion("device_token not in", values, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenBetween(String value1, String value2) {
            addCriterion("device_token between", value1, value2, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenNotBetween(String value1, String value2) {
            addCriterion("device_token not between", value1, value2, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoIsNull() {
            addCriterion("device_info is null");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoIsNotNull() {
            addCriterion("device_info is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoEqualTo(String value) {
            addCriterion("device_info =", value, "deviceInfo");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoNotEqualTo(String value) {
            addCriterion("device_info <>", value, "deviceInfo");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoGreaterThan(String value) {
            addCriterion("device_info >", value, "deviceInfo");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoGreaterThanOrEqualTo(String value) {
            addCriterion("device_info >=", value, "deviceInfo");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoLessThan(String value) {
            addCriterion("device_info <", value, "deviceInfo");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoLessThanOrEqualTo(String value) {
            addCriterion("device_info <=", value, "deviceInfo");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoLike(String value) {
            addCriterion("device_info like", value, "deviceInfo");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoNotLike(String value) {
            addCriterion("device_info not like", value, "deviceInfo");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoIn(List<String> values) {
            addCriterion("device_info in", values, "deviceInfo");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoNotIn(List<String> values) {
            addCriterion("device_info not in", values, "deviceInfo");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoBetween(String value1, String value2) {
            addCriterion("device_info between", value1, value2, "deviceInfo");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoNotBetween(String value1, String value2) {
            addCriterion("device_info not between", value1, value2, "deviceInfo");
            return (Criteria) this;
        }

        public Criteria andRecommendUserIdIsNull() {
            addCriterion("recommend_user_id is null");
            return (Criteria) this;
        }

        public Criteria andRecommendUserIdIsNotNull() {
            addCriterion("recommend_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendUserIdEqualTo(Integer value) {
            addCriterion("recommend_user_id =", value, "recommendUserId");
            return (Criteria) this;
        }

        public Criteria andRecommendUserIdNotEqualTo(Integer value) {
            addCriterion("recommend_user_id <>", value, "recommendUserId");
            return (Criteria) this;
        }

        public Criteria andRecommendUserIdGreaterThan(Integer value) {
            addCriterion("recommend_user_id >", value, "recommendUserId");
            return (Criteria) this;
        }

        public Criteria andRecommendUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommend_user_id >=", value, "recommendUserId");
            return (Criteria) this;
        }

        public Criteria andRecommendUserIdLessThan(Integer value) {
            addCriterion("recommend_user_id <", value, "recommendUserId");
            return (Criteria) this;
        }

        public Criteria andRecommendUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("recommend_user_id <=", value, "recommendUserId");
            return (Criteria) this;
        }

        public Criteria andRecommendUserIdIn(List<Integer> values) {
            addCriterion("recommend_user_id in", values, "recommendUserId");
            return (Criteria) this;
        }

        public Criteria andRecommendUserIdNotIn(List<Integer> values) {
            addCriterion("recommend_user_id not in", values, "recommendUserId");
            return (Criteria) this;
        }

        public Criteria andRecommendUserIdBetween(Integer value1, Integer value2) {
            addCriterion("recommend_user_id between", value1, value2, "recommendUserId");
            return (Criteria) this;
        }

        public Criteria andRecommendUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("recommend_user_id not between", value1, value2, "recommendUserId");
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

        public Criteria andGesturePasswordIsNull() {
            addCriterion("gesture_password is null");
            return (Criteria) this;
        }

        public Criteria andGesturePasswordIsNotNull() {
            addCriterion("gesture_password is not null");
            return (Criteria) this;
        }

        public Criteria andGesturePasswordEqualTo(Integer value) {
            addCriterion("gesture_password =", value, "gesturePassword");
            return (Criteria) this;
        }

        public Criteria andGesturePasswordNotEqualTo(Integer value) {
            addCriterion("gesture_password <>", value, "gesturePassword");
            return (Criteria) this;
        }

        public Criteria andGesturePasswordGreaterThan(Integer value) {
            addCriterion("gesture_password >", value, "gesturePassword");
            return (Criteria) this;
        }

        public Criteria andGesturePasswordGreaterThanOrEqualTo(Integer value) {
            addCriterion("gesture_password >=", value, "gesturePassword");
            return (Criteria) this;
        }

        public Criteria andGesturePasswordLessThan(Integer value) {
            addCriterion("gesture_password <", value, "gesturePassword");
            return (Criteria) this;
        }

        public Criteria andGesturePasswordLessThanOrEqualTo(Integer value) {
            addCriterion("gesture_password <=", value, "gesturePassword");
            return (Criteria) this;
        }

        public Criteria andGesturePasswordIn(List<Integer> values) {
            addCriterion("gesture_password in", values, "gesturePassword");
            return (Criteria) this;
        }

        public Criteria andGesturePasswordNotIn(List<Integer> values) {
            addCriterion("gesture_password not in", values, "gesturePassword");
            return (Criteria) this;
        }

        public Criteria andGesturePasswordBetween(Integer value1, Integer value2) {
            addCriterion("gesture_password between", value1, value2, "gesturePassword");
            return (Criteria) this;
        }

        public Criteria andGesturePasswordNotBetween(Integer value1, Integer value2) {
            addCriterion("gesture_password not between", value1, value2, "gesturePassword");
            return (Criteria) this;
        }

        public Criteria andLockTimeIsNull() {
            addCriterion("lock_time is null");
            return (Criteria) this;
        }

        public Criteria andLockTimeIsNotNull() {
            addCriterion("lock_time is not null");
            return (Criteria) this;
        }

        public Criteria andLockTimeEqualTo(Date value) {
            addCriterion("lock_time =", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeNotEqualTo(Date value) {
            addCriterion("lock_time <>", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeGreaterThan(Date value) {
            addCriterion("lock_time >", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lock_time >=", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeLessThan(Date value) {
            addCriterion("lock_time <", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeLessThanOrEqualTo(Date value) {
            addCriterion("lock_time <=", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeIn(List<Date> values) {
            addCriterion("lock_time in", values, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeNotIn(List<Date> values) {
            addCriterion("lock_time not in", values, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeBetween(Date value1, Date value2) {
            addCriterion("lock_time between", value1, value2, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeNotBetween(Date value1, Date value2) {
            addCriterion("lock_time not between", value1, value2, "lockTime");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Byte value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Byte value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Byte value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Byte value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Byte value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Byte> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Byte> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Byte value1, Byte value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andRegIpIsNull() {
            addCriterion("reg_ip is null");
            return (Criteria) this;
        }

        public Criteria andRegIpIsNotNull() {
            addCriterion("reg_ip is not null");
            return (Criteria) this;
        }

        public Criteria andRegIpEqualTo(String value) {
            addCriterion("reg_ip =", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotEqualTo(String value) {
            addCriterion("reg_ip <>", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpGreaterThan(String value) {
            addCriterion("reg_ip >", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpGreaterThanOrEqualTo(String value) {
            addCriterion("reg_ip >=", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLessThan(String value) {
            addCriterion("reg_ip <", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLessThanOrEqualTo(String value) {
            addCriterion("reg_ip <=", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLike(String value) {
            addCriterion("reg_ip like", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotLike(String value) {
            addCriterion("reg_ip not like", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpIn(List<String> values) {
            addCriterion("reg_ip in", values, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotIn(List<String> values) {
            addCriterion("reg_ip not in", values, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpBetween(String value1, String value2) {
            addCriterion("reg_ip between", value1, value2, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotBetween(String value1, String value2) {
            addCriterion("reg_ip not between", value1, value2, "regIp");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(String value) {
            addCriterion("agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(String value) {
            addCriterion("agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(String value) {
            addCriterion("agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(String value) {
            addCriterion("agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(String value) {
            addCriterion("agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(String value) {
            addCriterion("agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLike(String value) {
            addCriterion("agent_id like", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotLike(String value) {
            addCriterion("agent_id not like", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<String> values) {
            addCriterion("agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<String> values) {
            addCriterion("agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(String value1, String value2) {
            addCriterion("agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(String value1, String value2) {
            addCriterion("agent_id not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andApptypeIsNull() {
            addCriterion("apptype is null");
            return (Criteria) this;
        }

        public Criteria andApptypeIsNotNull() {
            addCriterion("apptype is not null");
            return (Criteria) this;
        }

        public Criteria andApptypeEqualTo(Byte value) {
            addCriterion("apptype =", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeNotEqualTo(Byte value) {
            addCriterion("apptype <>", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeGreaterThan(Byte value) {
            addCriterion("apptype >", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("apptype >=", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeLessThan(Byte value) {
            addCriterion("apptype <", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeLessThanOrEqualTo(Byte value) {
            addCriterion("apptype <=", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeIn(List<Byte> values) {
            addCriterion("apptype in", values, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeNotIn(List<Byte> values) {
            addCriterion("apptype not in", values, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeBetween(Byte value1, Byte value2) {
            addCriterion("apptype between", value1, value2, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeNotBetween(Byte value1, Byte value2) {
            addCriterion("apptype not between", value1, value2, "apptype");
            return (Criteria) this;
        }

        public Criteria andUserSourceIsNull() {
            addCriterion("user_source is null");
            return (Criteria) this;
        }

        public Criteria andUserSourceIsNotNull() {
            addCriterion("user_source is not null");
            return (Criteria) this;
        }

        public Criteria andUserSourceEqualTo(String value) {
            addCriterion("user_source =", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotEqualTo(String value) {
            addCriterion("user_source <>", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceGreaterThan(String value) {
            addCriterion("user_source >", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceGreaterThanOrEqualTo(String value) {
            addCriterion("user_source >=", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceLessThan(String value) {
            addCriterion("user_source <", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceLessThanOrEqualTo(String value) {
            addCriterion("user_source <=", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceLike(String value) {
            addCriterion("user_source like", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotLike(String value) {
            addCriterion("user_source not like", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceIn(List<String> values) {
            addCriterion("user_source in", values, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotIn(List<String> values) {
            addCriterion("user_source not in", values, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceBetween(String value1, String value2) {
            addCriterion("user_source between", value1, value2, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotBetween(String value1, String value2) {
            addCriterion("user_source not between", value1, value2, "userSource");
            return (Criteria) this;
        }

        public Criteria andInvestCodeIsNull() {
            addCriterion("invest_code is null");
            return (Criteria) this;
        }

        public Criteria andInvestCodeIsNotNull() {
            addCriterion("invest_code is not null");
            return (Criteria) this;
        }

        public Criteria andInvestCodeEqualTo(String value) {
            addCriterion("invest_code =", value, "investCode");
            return (Criteria) this;
        }

        public Criteria andInvestCodeNotEqualTo(String value) {
            addCriterion("invest_code <>", value, "investCode");
            return (Criteria) this;
        }

        public Criteria andInvestCodeGreaterThan(String value) {
            addCriterion("invest_code >", value, "investCode");
            return (Criteria) this;
        }

        public Criteria andInvestCodeGreaterThanOrEqualTo(String value) {
            addCriterion("invest_code >=", value, "investCode");
            return (Criteria) this;
        }

        public Criteria andInvestCodeLessThan(String value) {
            addCriterion("invest_code <", value, "investCode");
            return (Criteria) this;
        }

        public Criteria andInvestCodeLessThanOrEqualTo(String value) {
            addCriterion("invest_code <=", value, "investCode");
            return (Criteria) this;
        }

        public Criteria andInvestCodeLike(String value) {
            addCriterion("invest_code like", value, "investCode");
            return (Criteria) this;
        }

        public Criteria andInvestCodeNotLike(String value) {
            addCriterion("invest_code not like", value, "investCode");
            return (Criteria) this;
        }

        public Criteria andInvestCodeIn(List<String> values) {
            addCriterion("invest_code in", values, "investCode");
            return (Criteria) this;
        }

        public Criteria andInvestCodeNotIn(List<String> values) {
            addCriterion("invest_code not in", values, "investCode");
            return (Criteria) this;
        }

        public Criteria andInvestCodeBetween(String value1, String value2) {
            addCriterion("invest_code between", value1, value2, "investCode");
            return (Criteria) this;
        }

        public Criteria andInvestCodeNotBetween(String value1, String value2) {
            addCriterion("invest_code not between", value1, value2, "investCode");
            return (Criteria) this;
        }

        public Criteria andBdUserCodeIsNull() {
            addCriterion("bd_user_code is null");
            return (Criteria) this;
        }

        public Criteria andBdUserCodeIsNotNull() {
            addCriterion("bd_user_code is not null");
            return (Criteria) this;
        }

        public Criteria andBdUserCodeEqualTo(String value) {
            addCriterion("bd_user_code =", value, "bdUserCode");
            return (Criteria) this;
        }

        public Criteria andBdUserCodeNotEqualTo(String value) {
            addCriterion("bd_user_code <>", value, "bdUserCode");
            return (Criteria) this;
        }

        public Criteria andBdUserCodeGreaterThan(String value) {
            addCriterion("bd_user_code >", value, "bdUserCode");
            return (Criteria) this;
        }

        public Criteria andBdUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bd_user_code >=", value, "bdUserCode");
            return (Criteria) this;
        }

        public Criteria andBdUserCodeLessThan(String value) {
            addCriterion("bd_user_code <", value, "bdUserCode");
            return (Criteria) this;
        }

        public Criteria andBdUserCodeLessThanOrEqualTo(String value) {
            addCriterion("bd_user_code <=", value, "bdUserCode");
            return (Criteria) this;
        }

        public Criteria andBdUserCodeLike(String value) {
            addCriterion("bd_user_code like", value, "bdUserCode");
            return (Criteria) this;
        }

        public Criteria andBdUserCodeNotLike(String value) {
            addCriterion("bd_user_code not like", value, "bdUserCode");
            return (Criteria) this;
        }

        public Criteria andBdUserCodeIn(List<String> values) {
            addCriterion("bd_user_code in", values, "bdUserCode");
            return (Criteria) this;
        }

        public Criteria andBdUserCodeNotIn(List<String> values) {
            addCriterion("bd_user_code not in", values, "bdUserCode");
            return (Criteria) this;
        }

        public Criteria andBdUserCodeBetween(String value1, String value2) {
            addCriterion("bd_user_code between", value1, value2, "bdUserCode");
            return (Criteria) this;
        }

        public Criteria andBdUserCodeNotBetween(String value1, String value2) {
            addCriterion("bd_user_code not between", value1, value2, "bdUserCode");
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