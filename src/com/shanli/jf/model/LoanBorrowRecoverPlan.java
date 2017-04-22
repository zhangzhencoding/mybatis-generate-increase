package com.shanli.jf.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LoanBorrowRecoverPlan implements Serializable {
    /**
     * 系统编号
     */
    private Integer id;

    /**
     * 借款人id
     */
    private Integer userId;

    /**
     * 借款产品id
     */
    private String productId;

    /**
     * 标的id
     */
    private String borrowNid;

    /**
     * 期次
     */
    private Integer period;

    /**
     * 应还本息
     */
    private BigDecimal principalReceveWait;

    /**
     * 应还利息
     */
    private BigDecimal interestReceiveWait;

    /**
     * 应还本金
     */
    private BigDecimal receiveCapitalWait;

    /**
     * 剩余本金
     */
    private BigDecimal remainCapital;

    /**
     * 状态(1、待还 2、已还 )
     */
    private Integer status;

    /**
     * 借款id
     */
    private Integer borrowLoanId;

    /**
     * 版本id
     */
    private Integer version;

    /**
     * 剩余利息
     */
    private BigDecimal remainInterest;

    /**
     * 剩余本息
     */
    private BigDecimal remainCountAll;

    /**
     * 已还利息
     */
    private BigDecimal receveInterestYes;

    /**
     * 已还本金
     */
    private BigDecimal receveCaptialYes;

    /**
     * 已还本息
     */
    private BigDecimal receveAmountYes;

    /**
     * 还款时间
     */
    private Date recoverTime;

    /**
     * 实际还款时间
     */
    private Date actualRecoverTime;

    /**
     * 还款计划生成时间
     */
    private Date addTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getBorrowNid() {
        return borrowNid;
    }

    public void setBorrowNid(String borrowNid) {
        this.borrowNid = borrowNid == null ? null : borrowNid.trim();
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public BigDecimal getPrincipalReceveWait() {
        return principalReceveWait;
    }

    public void setPrincipalReceveWait(BigDecimal principalReceveWait) {
        this.principalReceveWait = principalReceveWait;
    }

    public BigDecimal getInterestReceiveWait() {
        return interestReceiveWait;
    }

    public void setInterestReceiveWait(BigDecimal interestReceiveWait) {
        this.interestReceiveWait = interestReceiveWait;
    }

    public BigDecimal getReceiveCapitalWait() {
        return receiveCapitalWait;
    }

    public void setReceiveCapitalWait(BigDecimal receiveCapitalWait) {
        this.receiveCapitalWait = receiveCapitalWait;
    }

    public BigDecimal getRemainCapital() {
        return remainCapital;
    }

    public void setRemainCapital(BigDecimal remainCapital) {
        this.remainCapital = remainCapital;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBorrowLoanId() {
        return borrowLoanId;
    }

    public void setBorrowLoanId(Integer borrowLoanId) {
        this.borrowLoanId = borrowLoanId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public BigDecimal getRemainInterest() {
        return remainInterest;
    }

    public void setRemainInterest(BigDecimal remainInterest) {
        this.remainInterest = remainInterest;
    }

    public BigDecimal getRemainCountAll() {
        return remainCountAll;
    }

    public void setRemainCountAll(BigDecimal remainCountAll) {
        this.remainCountAll = remainCountAll;
    }

    public BigDecimal getReceveInterestYes() {
        return receveInterestYes;
    }

    public void setReceveInterestYes(BigDecimal receveInterestYes) {
        this.receveInterestYes = receveInterestYes;
    }

    public BigDecimal getReceveCaptialYes() {
        return receveCaptialYes;
    }

    public void setReceveCaptialYes(BigDecimal receveCaptialYes) {
        this.receveCaptialYes = receveCaptialYes;
    }

    public BigDecimal getReceveAmountYes() {
        return receveAmountYes;
    }

    public void setReceveAmountYes(BigDecimal receveAmountYes) {
        this.receveAmountYes = receveAmountYes;
    }

    public Date getRecoverTime() {
        return recoverTime;
    }

    public void setRecoverTime(Date recoverTime) {
        this.recoverTime = recoverTime;
    }

    public Date getActualRecoverTime() {
        return actualRecoverTime;
    }

    public void setActualRecoverTime(Date actualRecoverTime) {
        this.actualRecoverTime = actualRecoverTime;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", productId=").append(productId);
        sb.append(", borrowNid=").append(borrowNid);
        sb.append(", period=").append(period);
        sb.append(", principalReceveWait=").append(principalReceveWait);
        sb.append(", interestReceiveWait=").append(interestReceiveWait);
        sb.append(", receiveCapitalWait=").append(receiveCapitalWait);
        sb.append(", remainCapital=").append(remainCapital);
        sb.append(", status=").append(status);
        sb.append(", borrowLoanId=").append(borrowLoanId);
        sb.append(", version=").append(version);
        sb.append(", remainInterest=").append(remainInterest);
        sb.append(", remainCountAll=").append(remainCountAll);
        sb.append(", receveInterestYes=").append(receveInterestYes);
        sb.append(", receveCaptialYes=").append(receveCaptialYes);
        sb.append(", receveAmountYes=").append(receveAmountYes);
        sb.append(", recoverTime=").append(recoverTime);
        sb.append(", actualRecoverTime=").append(actualRecoverTime);
        sb.append(", addTime=").append(addTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}