package com.shanli.jf.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UserAccount implements Serializable {
    /**
     * 系统编号
     */
    private Integer id;

    /**
     * 免费提现额度
     */
    private BigDecimal freeCash;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 可用额度
     */
    private BigDecimal availableCredit;

    /**
     * 冻结额度
     */
    private BigDecimal frozenAmount;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 投资总额
     */
    private BigDecimal tendAmount;

    /**
     * 已得收益
     */
    private BigDecimal profitYes;

    /**
     * 待收收益
     */
    private BigDecimal profitWait;

    /**
     * 总收益
     */
    private BigDecimal profitAll;

    /**
     * 投资回款总额
     */
    private BigDecimal tendReturnAmount;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 待收本金
     */
    private BigDecimal cashWait;

    /**
     * 总资产
     */
    private BigDecimal totalAmount;

    /**
     * 是否可用  1、可用 2、不可用 
     */
    private Integer status;

    /**
     * 活期金额
     */
    private BigDecimal demandAmount;

    /**
     * 活期计息中金额
     */
    private BigDecimal interestAmount;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getFreeCash() {
        return freeCash;
    }

    public void setFreeCash(BigDecimal freeCash) {
        this.freeCash = freeCash;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public BigDecimal getAvailableCredit() {
        return availableCredit;
    }

    public void setAvailableCredit(BigDecimal availableCredit) {
        this.availableCredit = availableCredit;
    }

    public BigDecimal getFrozenAmount() {
        return frozenAmount;
    }

    public void setFrozenAmount(BigDecimal frozenAmount) {
        this.frozenAmount = frozenAmount;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public BigDecimal getTendAmount() {
        return tendAmount;
    }

    public void setTendAmount(BigDecimal tendAmount) {
        this.tendAmount = tendAmount;
    }

    public BigDecimal getProfitYes() {
        return profitYes;
    }

    public void setProfitYes(BigDecimal profitYes) {
        this.profitYes = profitYes;
    }

    public BigDecimal getProfitWait() {
        return profitWait;
    }

    public void setProfitWait(BigDecimal profitWait) {
        this.profitWait = profitWait;
    }

    public BigDecimal getProfitAll() {
        return profitAll;
    }

    public void setProfitAll(BigDecimal profitAll) {
        this.profitAll = profitAll;
    }

    public BigDecimal getTendReturnAmount() {
        return tendReturnAmount;
    }

    public void setTendReturnAmount(BigDecimal tendReturnAmount) {
        this.tendReturnAmount = tendReturnAmount;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getCashWait() {
        return cashWait;
    }

    public void setCashWait(BigDecimal cashWait) {
        this.cashWait = cashWait;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getDemandAmount() {
        return demandAmount;
    }

    public void setDemandAmount(BigDecimal demandAmount) {
        this.demandAmount = demandAmount;
    }

    public BigDecimal getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(BigDecimal interestAmount) {
        this.interestAmount = interestAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", freeCash=").append(freeCash);
        sb.append(", version=").append(version);
        sb.append(", availableCredit=").append(availableCredit);
        sb.append(", frozenAmount=").append(frozenAmount);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", tendAmount=").append(tendAmount);
        sb.append(", profitYes=").append(profitYes);
        sb.append(", profitWait=").append(profitWait);
        sb.append(", profitAll=").append(profitAll);
        sb.append(", tendReturnAmount=").append(tendReturnAmount);
        sb.append(", userId=").append(userId);
        sb.append(", cashWait=").append(cashWait);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", status=").append(status);
        sb.append(", demandAmount=").append(demandAmount);
        sb.append(", interestAmount=").append(interestAmount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}