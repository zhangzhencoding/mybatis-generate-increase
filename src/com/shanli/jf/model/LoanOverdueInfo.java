package com.shanli.jf.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LoanOverdueInfo implements Serializable {
    /**
     * 系统编号
     */
    private Integer id;

    /**
     * 日期
     */
    private String dataDate;

    /**
     * 逾期编号
     */
    private String overdueId;

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
     * 还款计划id
     */
    private Integer borrowRecoverId;

    /**
     * 版本id
     */
    private Integer version;

    /**
     * 逾期利息
     */
    private BigDecimal overdueInterest;

    /**
     * 逾期本金
     */
    private BigDecimal overdueCaptial;

    /**
     * 逾期本息
     */
    private BigDecimal overdueAmount;

    /**
     * 逾期服务费
     */
    private BigDecimal overdueSerFee;

    /**
     * 当天罚息
     */
    private BigDecimal overduePerFee;

    /**
     * 逾期金额
     */
    private BigDecimal overdueFee;

    /**
     * 未结清总金额
     */
    private BigDecimal overdueAmountTotal;

    /**
     * 逾期计算日期
     */
    private String overdueDate;

    /**
     * 逾期天数
     */
    private Integer overdueDateNum;

    /**
     * 添加时间
     */
    private Date addTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate == null ? null : dataDate.trim();
    }

    public String getOverdueId() {
        return overdueId;
    }

    public void setOverdueId(String overdueId) {
        this.overdueId = overdueId == null ? null : overdueId.trim();
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

    public Integer getBorrowRecoverId() {
        return borrowRecoverId;
    }

    public void setBorrowRecoverId(Integer borrowRecoverId) {
        this.borrowRecoverId = borrowRecoverId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public BigDecimal getOverdueInterest() {
        return overdueInterest;
    }

    public void setOverdueInterest(BigDecimal overdueInterest) {
        this.overdueInterest = overdueInterest;
    }

    public BigDecimal getOverdueCaptial() {
        return overdueCaptial;
    }

    public void setOverdueCaptial(BigDecimal overdueCaptial) {
        this.overdueCaptial = overdueCaptial;
    }

    public BigDecimal getOverdueAmount() {
        return overdueAmount;
    }

    public void setOverdueAmount(BigDecimal overdueAmount) {
        this.overdueAmount = overdueAmount;
    }

    public BigDecimal getOverdueSerFee() {
        return overdueSerFee;
    }

    public void setOverdueSerFee(BigDecimal overdueSerFee) {
        this.overdueSerFee = overdueSerFee;
    }

    public BigDecimal getOverduePerFee() {
        return overduePerFee;
    }

    public void setOverduePerFee(BigDecimal overduePerFee) {
        this.overduePerFee = overduePerFee;
    }

    public BigDecimal getOverdueFee() {
        return overdueFee;
    }

    public void setOverdueFee(BigDecimal overdueFee) {
        this.overdueFee = overdueFee;
    }

    public BigDecimal getOverdueAmountTotal() {
        return overdueAmountTotal;
    }

    public void setOverdueAmountTotal(BigDecimal overdueAmountTotal) {
        this.overdueAmountTotal = overdueAmountTotal;
    }

    public String getOverdueDate() {
        return overdueDate;
    }

    public void setOverdueDate(String overdueDate) {
        this.overdueDate = overdueDate == null ? null : overdueDate.trim();
    }

    public Integer getOverdueDateNum() {
        return overdueDateNum;
    }

    public void setOverdueDateNum(Integer overdueDateNum) {
        this.overdueDateNum = overdueDateNum;
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
        sb.append(", dataDate=").append(dataDate);
        sb.append(", overdueId=").append(overdueId);
        sb.append(", userId=").append(userId);
        sb.append(", productId=").append(productId);
        sb.append(", borrowNid=").append(borrowNid);
        sb.append(", period=").append(period);
        sb.append(", borrowRecoverId=").append(borrowRecoverId);
        sb.append(", version=").append(version);
        sb.append(", overdueInterest=").append(overdueInterest);
        sb.append(", overdueCaptial=").append(overdueCaptial);
        sb.append(", overdueAmount=").append(overdueAmount);
        sb.append(", overdueSerFee=").append(overdueSerFee);
        sb.append(", overduePerFee=").append(overduePerFee);
        sb.append(", overdueFee=").append(overdueFee);
        sb.append(", overdueAmountTotal=").append(overdueAmountTotal);
        sb.append(", overdueDate=").append(overdueDate);
        sb.append(", overdueDateNum=").append(overdueDateNum);
        sb.append(", addTime=").append(addTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}