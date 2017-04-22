package com.shanli.jf.model;

import java.io.Serializable;
import java.util.Date;

public class RealUserCard implements Serializable {
    /**
     * 系统编号
     */
    private Integer id;

    /**
     * 收款人姓名
     */
    private String toAccName;

    /**
     * 收款人银行帐号
     */
    private String toAccNo;

    /**
     * 收款人银行名称
     */
    private String toBankName;

    /**
     * 收款人开户行省名
     */
    private String toProName;

    /**
     * 收款人开户行市名
     */
    private String toCityName;

    /**
     * 收款人开户行机构名
     */
    private String toAccDept;

    /**
     * 摘要
     */
    private String transSummary;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 绑卡时间
     */
    private Date timeCard;

    /**
     * 绑卡手机号
     */
    private String mobile;

    /**
     * 第三方充值的唯一凭据。 在绑卡的时候存入
     */
    private String bindId;

    /**
     * 状态.1、绑定成功 2、绑定失败 3、注销 4、绑定进行 
     */
    private Integer status;

    /**
     * 1、默认卡 2、不是默认卡 
     */
    private Integer isDefault;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToAccName() {
        return toAccName;
    }

    public void setToAccName(String toAccName) {
        this.toAccName = toAccName == null ? null : toAccName.trim();
    }

    public String getToAccNo() {
        return toAccNo;
    }

    public void setToAccNo(String toAccNo) {
        this.toAccNo = toAccNo == null ? null : toAccNo.trim();
    }

    public String getToBankName() {
        return toBankName;
    }

    public void setToBankName(String toBankName) {
        this.toBankName = toBankName == null ? null : toBankName.trim();
    }

    public String getToProName() {
        return toProName;
    }

    public void setToProName(String toProName) {
        this.toProName = toProName == null ? null : toProName.trim();
    }

    public String getToCityName() {
        return toCityName;
    }

    public void setToCityName(String toCityName) {
        this.toCityName = toCityName == null ? null : toCityName.trim();
    }

    public String getToAccDept() {
        return toAccDept;
    }

    public void setToAccDept(String toAccDept) {
        this.toAccDept = toAccDept == null ? null : toAccDept.trim();
    }

    public String getTransSummary() {
        return transSummary;
    }

    public void setTransSummary(String transSummary) {
        this.transSummary = transSummary == null ? null : transSummary.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getTimeCard() {
        return timeCard;
    }

    public void setTimeCard(Date timeCard) {
        this.timeCard = timeCard;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getBindId() {
        return bindId;
    }

    public void setBindId(String bindId) {
        this.bindId = bindId == null ? null : bindId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", toAccName=").append(toAccName);
        sb.append(", toAccNo=").append(toAccNo);
        sb.append(", toBankName=").append(toBankName);
        sb.append(", toProName=").append(toProName);
        sb.append(", toCityName=").append(toCityName);
        sb.append(", toAccDept=").append(toAccDept);
        sb.append(", transSummary=").append(transSummary);
        sb.append(", userId=").append(userId);
        sb.append(", timeCard=").append(timeCard);
        sb.append(", mobile=").append(mobile);
        sb.append(", bindId=").append(bindId);
        sb.append(", status=").append(status);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}