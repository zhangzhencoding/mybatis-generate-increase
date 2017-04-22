package com.shanli.jf.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LoanBorrow implements Serializable {
    /**
     * 系统编号
     */
    private Integer id;

    /**
     * 借款产品id
     */
    private String productId;

    /**
     * 标的id
     */
    private String borrowNid;

    /**
     * 标的名称
     */
    private String borrowName;

    /**
     * 借款金额
     */
    private Integer borrowAmount;

    /**
     * 借款用途
     */
    private String borrowUse;

    /**
     * 利率
     */
    private BigDecimal rate;

    /**
     * 借款期限类型 0 请选择 1 天 2 周 3 月 4 年
     */
    private String durationType;

    /**
     * 借款期限
     */
    private Integer duration;

    /**
     * 还款方式 0 请选择 1 等额本息 2 一次性还本付息 3 按月付息分期还本 4 按季付息分期还本 5一次性付息到期还本
     */
    private String repaymentType;

    /**
     * 借款人用户id
     */
    private Integer borrowUserId;

    /**
     * 期数
     */
    private Integer period;

    /**
     * 起息日
     */
    private Integer interestDay;

    /**
     * 还款日
     */
    private Integer repaymentDate;

    /**
     * 状态 0 默认 1 待审核 2审核通过 3审核失败 4 待打包 5 已打包 6 待发售 7 待起息 8 已起息 9 流标 10 还款中 11 已还款 12 逾期 13 结束
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 风险保障金额
     */
    private BigDecimal riskMoney;

    /**
     * 借款管理费
     */
    private BigDecimal borrowFee;

    /**
     * 标的风险等级
     */
    private String riskLevel;

    /**
     * 平台服务费
     */
    private BigDecimal serviceFee;

    /**
     * 添加时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getBorrowName() {
        return borrowName;
    }

    public void setBorrowName(String borrowName) {
        this.borrowName = borrowName == null ? null : borrowName.trim();
    }

    public Integer getBorrowAmount() {
        return borrowAmount;
    }

    public void setBorrowAmount(Integer borrowAmount) {
        this.borrowAmount = borrowAmount;
    }

    public String getBorrowUse() {
        return borrowUse;
    }

    public void setBorrowUse(String borrowUse) {
        this.borrowUse = borrowUse == null ? null : borrowUse.trim();
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getDurationType() {
        return durationType;
    }

    public void setDurationType(String durationType) {
        this.durationType = durationType == null ? null : durationType.trim();
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getRepaymentType() {
        return repaymentType;
    }

    public void setRepaymentType(String repaymentType) {
        this.repaymentType = repaymentType == null ? null : repaymentType.trim();
    }

    public Integer getBorrowUserId() {
        return borrowUserId;
    }

    public void setBorrowUserId(Integer borrowUserId) {
        this.borrowUserId = borrowUserId;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getInterestDay() {
        return interestDay;
    }

    public void setInterestDay(Integer interestDay) {
        this.interestDay = interestDay;
    }

    public Integer getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(Integer repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public BigDecimal getRiskMoney() {
        return riskMoney;
    }

    public void setRiskMoney(BigDecimal riskMoney) {
        this.riskMoney = riskMoney;
    }

    public BigDecimal getBorrowFee() {
        return borrowFee;
    }

    public void setBorrowFee(BigDecimal borrowFee) {
        this.borrowFee = borrowFee;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel == null ? null : riskLevel.trim();
    }

    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = serviceFee;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", borrowNid=").append(borrowNid);
        sb.append(", borrowName=").append(borrowName);
        sb.append(", borrowAmount=").append(borrowAmount);
        sb.append(", borrowUse=").append(borrowUse);
        sb.append(", rate=").append(rate);
        sb.append(", durationType=").append(durationType);
        sb.append(", duration=").append(duration);
        sb.append(", repaymentType=").append(repaymentType);
        sb.append(", borrowUserId=").append(borrowUserId);
        sb.append(", period=").append(period);
        sb.append(", interestDay=").append(interestDay);
        sb.append(", repaymentDate=").append(repaymentDate);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", riskMoney=").append(riskMoney);
        sb.append(", borrowFee=").append(borrowFee);
        sb.append(", riskLevel=").append(riskLevel);
        sb.append(", serviceFee=").append(serviceFee);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}