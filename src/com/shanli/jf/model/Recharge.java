package com.shanli.jf.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Recharge implements Serializable {
    /**
     * 系统编号
     */
    private Integer id;

    /**
     * 银行卡id
     */
    private Integer bankCardId;

    /**
     * 充值总额
     */
    private BigDecimal rechargeAmount;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * ip
     */
    private String addIp;

    /**
     * 版本号
     */
    private String version;

    /**
     * 提现总额
     */
    private BigDecimal repayAmount;

    /**
     * 卡号
     */
    private String bankCardNum;

    /**
     * 1、充值 2、提现 
     */
    private Integer type;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(Integer bankCardId) {
        this.bankCardId = bankCardId;
    }

    public BigDecimal getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(BigDecimal rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAddIp() {
        return addIp;
    }

    public void setAddIp(String addIp) {
        this.addIp = addIp == null ? null : addIp.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public BigDecimal getRepayAmount() {
        return repayAmount;
    }

    public void setRepayAmount(BigDecimal repayAmount) {
        this.repayAmount = repayAmount;
    }

    public String getBankCardNum() {
        return bankCardNum;
    }

    public void setBankCardNum(String bankCardNum) {
        this.bankCardNum = bankCardNum == null ? null : bankCardNum.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bankCardId=").append(bankCardId);
        sb.append(", rechargeAmount=").append(rechargeAmount);
        sb.append(", userId=").append(userId);
        sb.append(", addIp=").append(addIp);
        sb.append(", version=").append(version);
        sb.append(", repayAmount=").append(repayAmount);
        sb.append(", bankCardNum=").append(bankCardNum);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}