package com.shanli.jf.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LoanProductInfo implements Serializable {
    /**
     * 系统编号
     */
    private Integer id;

    /**
     * 借款产品id
     */
    private String productId;

    /**
     * 最小借款金额
     */
    private Integer minBorrowAmount;

    /**
     * 最大借款金额
     */
    private Integer maxBorrowAmount;

    /**
     * 借款利率计算方式 0 请选择 1 按预期年化收益 2 按日利率计算
     */
    private String rateType;

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
     * 风险保障金计算方式1 按借款比例 2 具体金额
     */
    private String calcRiskType;

    /**
     * 风险保障金额
     */
    private BigDecimal riskMoney;

    /**
     * 平台管理费计算方式 1 按借款比例 2 具体金额
     */
    private String calcBorfeeType;

    /**
     * 借款管理费
     */
    private BigDecimal borrowFee;

    /**
     * 借款管理费收取方式 1 提现时按月收取 2 提现时一次性收取 3还款时按月收取 4 还款时一次性收取
     */
    private String borrowFeePaytype;

    /**
     * 平台服务费计算方式 1 按借款比例 2 具体金额
     */
    private String calcSerfeeType;

    /**
     * 平台服务费
     */
    private BigDecimal serviceFee;

    /**
     * 平台服务费收取方式 1 提现时收取 2还款收取
     */
    private String serviceFeePaytype;

    /**
     * 逾期罚息计算方式 1 未还本金 2 未还利息 3未还本金+未还利息
     */
    private String expiredRateType;

    /**
     * 逾期罚息比例
     */
    private BigDecimal expiredRate;

    /**
     * 提前还款违约金计算方式 1 未还本金 2 未还利息 3未还本金+未还利息
     */
    private String ealryFeeType;

    /**
     * 提前还款违约金比例
     */
    private BigDecimal ealryFeeRate;

    /**
     * 提前还款手续费计算方式 1 未还本金 2 未还利息 3未还本金+未还利息
     */
    private String ealryChargeType;

    /**
     * 提前还款手续费比例
     */
    private BigDecimal ealryChargeRate;

    /**
     * 还款顺序(存储案例 1,2,3,4) 1 本金 2利息 3服务费 4 罚息
     */
    private String repaymentSequence;

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

    public Integer getMinBorrowAmount() {
        return minBorrowAmount;
    }

    public void setMinBorrowAmount(Integer minBorrowAmount) {
        this.minBorrowAmount = minBorrowAmount;
    }

    public Integer getMaxBorrowAmount() {
        return maxBorrowAmount;
    }

    public void setMaxBorrowAmount(Integer maxBorrowAmount) {
        this.maxBorrowAmount = maxBorrowAmount;
    }

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType == null ? null : rateType.trim();
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

    public String getCalcRiskType() {
        return calcRiskType;
    }

    public void setCalcRiskType(String calcRiskType) {
        this.calcRiskType = calcRiskType == null ? null : calcRiskType.trim();
    }

    public BigDecimal getRiskMoney() {
        return riskMoney;
    }

    public void setRiskMoney(BigDecimal riskMoney) {
        this.riskMoney = riskMoney;
    }

    public String getCalcBorfeeType() {
        return calcBorfeeType;
    }

    public void setCalcBorfeeType(String calcBorfeeType) {
        this.calcBorfeeType = calcBorfeeType == null ? null : calcBorfeeType.trim();
    }

    public BigDecimal getBorrowFee() {
        return borrowFee;
    }

    public void setBorrowFee(BigDecimal borrowFee) {
        this.borrowFee = borrowFee;
    }

    public String getBorrowFeePaytype() {
        return borrowFeePaytype;
    }

    public void setBorrowFeePaytype(String borrowFeePaytype) {
        this.borrowFeePaytype = borrowFeePaytype == null ? null : borrowFeePaytype.trim();
    }

    public String getCalcSerfeeType() {
        return calcSerfeeType;
    }

    public void setCalcSerfeeType(String calcSerfeeType) {
        this.calcSerfeeType = calcSerfeeType == null ? null : calcSerfeeType.trim();
    }

    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = serviceFee;
    }

    public String getServiceFeePaytype() {
        return serviceFeePaytype;
    }

    public void setServiceFeePaytype(String serviceFeePaytype) {
        this.serviceFeePaytype = serviceFeePaytype == null ? null : serviceFeePaytype.trim();
    }

    public String getExpiredRateType() {
        return expiredRateType;
    }

    public void setExpiredRateType(String expiredRateType) {
        this.expiredRateType = expiredRateType == null ? null : expiredRateType.trim();
    }

    public BigDecimal getExpiredRate() {
        return expiredRate;
    }

    public void setExpiredRate(BigDecimal expiredRate) {
        this.expiredRate = expiredRate;
    }

    public String getEalryFeeType() {
        return ealryFeeType;
    }

    public void setEalryFeeType(String ealryFeeType) {
        this.ealryFeeType = ealryFeeType == null ? null : ealryFeeType.trim();
    }

    public BigDecimal getEalryFeeRate() {
        return ealryFeeRate;
    }

    public void setEalryFeeRate(BigDecimal ealryFeeRate) {
        this.ealryFeeRate = ealryFeeRate;
    }

    public String getEalryChargeType() {
        return ealryChargeType;
    }

    public void setEalryChargeType(String ealryChargeType) {
        this.ealryChargeType = ealryChargeType == null ? null : ealryChargeType.trim();
    }

    public BigDecimal getEalryChargeRate() {
        return ealryChargeRate;
    }

    public void setEalryChargeRate(BigDecimal ealryChargeRate) {
        this.ealryChargeRate = ealryChargeRate;
    }

    public String getRepaymentSequence() {
        return repaymentSequence;
    }

    public void setRepaymentSequence(String repaymentSequence) {
        this.repaymentSequence = repaymentSequence == null ? null : repaymentSequence.trim();
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
        sb.append(", minBorrowAmount=").append(minBorrowAmount);
        sb.append(", maxBorrowAmount=").append(maxBorrowAmount);
        sb.append(", rateType=").append(rateType);
        sb.append(", rate=").append(rate);
        sb.append(", durationType=").append(durationType);
        sb.append(", duration=").append(duration);
        sb.append(", repaymentType=").append(repaymentType);
        sb.append(", calcRiskType=").append(calcRiskType);
        sb.append(", riskMoney=").append(riskMoney);
        sb.append(", calcBorfeeType=").append(calcBorfeeType);
        sb.append(", borrowFee=").append(borrowFee);
        sb.append(", borrowFeePaytype=").append(borrowFeePaytype);
        sb.append(", calcSerfeeType=").append(calcSerfeeType);
        sb.append(", serviceFee=").append(serviceFee);
        sb.append(", serviceFeePaytype=").append(serviceFeePaytype);
        sb.append(", expiredRateType=").append(expiredRateType);
        sb.append(", expiredRate=").append(expiredRate);
        sb.append(", ealryFeeType=").append(ealryFeeType);
        sb.append(", ealryFeeRate=").append(ealryFeeRate);
        sb.append(", ealryChargeType=").append(ealryChargeType);
        sb.append(", ealryChargeRate=").append(ealryChargeRate);
        sb.append(", repaymentSequence=").append(repaymentSequence);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}