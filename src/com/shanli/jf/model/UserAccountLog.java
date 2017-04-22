package com.shanli.jf.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UserAccountLog implements Serializable {
    /**
     * 系统编号
     */
    private Integer id;

    /**
     * 操作额度
     */
    private BigDecimal operationAmount;

    /**
     * 操作前
     */
    private BigDecimal operationBefore;

    /**
     * 操作后
     */
    private BigDecimal operationAfter;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 标的id
     */
    private String borrowNid;

    /**
     * 备注
     */
    private String remark;

    /**
     * 操作类型（1借款 2平台服务费 3贷后管理费 4罚息 5本金还款 6利息还款 7充值 8提现冻结 9提现解冻 10提现扣除 11提现回退 12平台调整 13银行对账调整 14罚息减免 15存钱罐收益） 
     */
    private Integer type;

    /**
     * 添加时间
     */
    private Date addTime;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 1、加  2、减 3、平移 
     */
    private Integer operateUse;

    /**
     * 交易流水号
     */
    private String nid;

    /**
     * 冻结金额操作前
     */
    private BigDecimal frozenAmountBefore;

    /**
     * 冻结金额操作后
     */
    private BigDecimal frozenAmountAfter;

    /**
     * 已操作的冻结金额数
     */
    private BigDecimal frozenAmountYes;

    /**
     * 已操作的可用金额数
     */
    private BigDecimal availableCreditYes;

    /**
     * 可用金额操作前
     */
    private BigDecimal availableCreditBefore;

    /**
     * 可用金额操作后
     */
    private BigDecimal availableCreditAfter;

    /**
     * 操作待收本金数
     */
    private BigDecimal cashWaitYes;

    /**
     * 待收本金操作前
     */
    private BigDecimal cashWaitBefore;

    /**
     * 待收本金操作后
     */
    private BigDecimal cashWaitAfter;

    /**
     * 操作利息金额
     */
    private BigDecimal profitYes;

    /**
     * 利息金额操作前
     */
    private BigDecimal profitBefore;

    /**
     * 利息金额操作后
     */
    private BigDecimal profitAfter;

    /**
     * 活期金额
     */
    private BigDecimal demandAmountYes;

    /**
     * 活期金额操作前
     */
    private BigDecimal demandAmountBefore;

    /**
     * 活期金额操作后
     */
    private BigDecimal demandAmountAfter;

    /**
     * 活期计息金额
     */
    private BigDecimal interestAmountYes;

    /**
     * 活期计息金额前
     */
    private BigDecimal interestAmountBefore;

    /**
     * 活期计息金额后
     */
    private BigDecimal interestAmountAfter;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getOperationAmount() {
        return operationAmount;
    }

    public void setOperationAmount(BigDecimal operationAmount) {
        this.operationAmount = operationAmount;
    }

    public BigDecimal getOperationBefore() {
        return operationBefore;
    }

    public void setOperationBefore(BigDecimal operationBefore) {
        this.operationBefore = operationBefore;
    }

    public BigDecimal getOperationAfter() {
        return operationAfter;
    }

    public void setOperationAfter(BigDecimal operationAfter) {
        this.operationAfter = operationAfter;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getBorrowNid() {
        return borrowNid;
    }

    public void setBorrowNid(String borrowNid) {
        this.borrowNid = borrowNid == null ? null : borrowNid.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getOperateUse() {
        return operateUse;
    }

    public void setOperateUse(Integer operateUse) {
        this.operateUse = operateUse;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid == null ? null : nid.trim();
    }

    public BigDecimal getFrozenAmountBefore() {
        return frozenAmountBefore;
    }

    public void setFrozenAmountBefore(BigDecimal frozenAmountBefore) {
        this.frozenAmountBefore = frozenAmountBefore;
    }

    public BigDecimal getFrozenAmountAfter() {
        return frozenAmountAfter;
    }

    public void setFrozenAmountAfter(BigDecimal frozenAmountAfter) {
        this.frozenAmountAfter = frozenAmountAfter;
    }

    public BigDecimal getFrozenAmountYes() {
        return frozenAmountYes;
    }

    public void setFrozenAmountYes(BigDecimal frozenAmountYes) {
        this.frozenAmountYes = frozenAmountYes;
    }

    public BigDecimal getAvailableCreditYes() {
        return availableCreditYes;
    }

    public void setAvailableCreditYes(BigDecimal availableCreditYes) {
        this.availableCreditYes = availableCreditYes;
    }

    public BigDecimal getAvailableCreditBefore() {
        return availableCreditBefore;
    }

    public void setAvailableCreditBefore(BigDecimal availableCreditBefore) {
        this.availableCreditBefore = availableCreditBefore;
    }

    public BigDecimal getAvailableCreditAfter() {
        return availableCreditAfter;
    }

    public void setAvailableCreditAfter(BigDecimal availableCreditAfter) {
        this.availableCreditAfter = availableCreditAfter;
    }

    public BigDecimal getCashWaitYes() {
        return cashWaitYes;
    }

    public void setCashWaitYes(BigDecimal cashWaitYes) {
        this.cashWaitYes = cashWaitYes;
    }

    public BigDecimal getCashWaitBefore() {
        return cashWaitBefore;
    }

    public void setCashWaitBefore(BigDecimal cashWaitBefore) {
        this.cashWaitBefore = cashWaitBefore;
    }

    public BigDecimal getCashWaitAfter() {
        return cashWaitAfter;
    }

    public void setCashWaitAfter(BigDecimal cashWaitAfter) {
        this.cashWaitAfter = cashWaitAfter;
    }

    public BigDecimal getProfitYes() {
        return profitYes;
    }

    public void setProfitYes(BigDecimal profitYes) {
        this.profitYes = profitYes;
    }

    public BigDecimal getProfitBefore() {
        return profitBefore;
    }

    public void setProfitBefore(BigDecimal profitBefore) {
        this.profitBefore = profitBefore;
    }

    public BigDecimal getProfitAfter() {
        return profitAfter;
    }

    public void setProfitAfter(BigDecimal profitAfter) {
        this.profitAfter = profitAfter;
    }

    public BigDecimal getDemandAmountYes() {
        return demandAmountYes;
    }

    public void setDemandAmountYes(BigDecimal demandAmountYes) {
        this.demandAmountYes = demandAmountYes;
    }

    public BigDecimal getDemandAmountBefore() {
        return demandAmountBefore;
    }

    public void setDemandAmountBefore(BigDecimal demandAmountBefore) {
        this.demandAmountBefore = demandAmountBefore;
    }

    public BigDecimal getDemandAmountAfter() {
        return demandAmountAfter;
    }

    public void setDemandAmountAfter(BigDecimal demandAmountAfter) {
        this.demandAmountAfter = demandAmountAfter;
    }

    public BigDecimal getInterestAmountYes() {
        return interestAmountYes;
    }

    public void setInterestAmountYes(BigDecimal interestAmountYes) {
        this.interestAmountYes = interestAmountYes;
    }

    public BigDecimal getInterestAmountBefore() {
        return interestAmountBefore;
    }

    public void setInterestAmountBefore(BigDecimal interestAmountBefore) {
        this.interestAmountBefore = interestAmountBefore;
    }

    public BigDecimal getInterestAmountAfter() {
        return interestAmountAfter;
    }

    public void setInterestAmountAfter(BigDecimal interestAmountAfter) {
        this.interestAmountAfter = interestAmountAfter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", operationAmount=").append(operationAmount);
        sb.append(", operationBefore=").append(operationBefore);
        sb.append(", operationAfter=").append(operationAfter);
        sb.append(", userId=").append(userId);
        sb.append(", borrowNid=").append(borrowNid);
        sb.append(", remark=").append(remark);
        sb.append(", type=").append(type);
        sb.append(", addTime=").append(addTime);
        sb.append(", version=").append(version);
        sb.append(", operateUse=").append(operateUse);
        sb.append(", nid=").append(nid);
        sb.append(", frozenAmountBefore=").append(frozenAmountBefore);
        sb.append(", frozenAmountAfter=").append(frozenAmountAfter);
        sb.append(", frozenAmountYes=").append(frozenAmountYes);
        sb.append(", availableCreditYes=").append(availableCreditYes);
        sb.append(", availableCreditBefore=").append(availableCreditBefore);
        sb.append(", availableCreditAfter=").append(availableCreditAfter);
        sb.append(", cashWaitYes=").append(cashWaitYes);
        sb.append(", cashWaitBefore=").append(cashWaitBefore);
        sb.append(", cashWaitAfter=").append(cashWaitAfter);
        sb.append(", profitYes=").append(profitYes);
        sb.append(", profitBefore=").append(profitBefore);
        sb.append(", profitAfter=").append(profitAfter);
        sb.append(", demandAmountYes=").append(demandAmountYes);
        sb.append(", demandAmountBefore=").append(demandAmountBefore);
        sb.append(", demandAmountAfter=").append(demandAmountAfter);
        sb.append(", interestAmountYes=").append(interestAmountYes);
        sb.append(", interestAmountBefore=").append(interestAmountBefore);
        sb.append(", interestAmountAfter=").append(interestAmountAfter);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}