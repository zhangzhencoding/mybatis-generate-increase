package com.shanli.jf.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RechargeLog implements Serializable {
    /**
     * 系统编号
     */
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 银行卡id
     */
    private Integer bankCardId;

    /**
     * 卡号
     */
    private String bankCardNum;

    /**
     * 操作金额
     */
    private BigDecimal operationAmount;

    /**
     * 提现手续费
     */
    private BigDecimal withdrawFee;

    /**
     * 操作前
     */
    private BigDecimal operationBefore;

    /**
     * 操作后
     */
    private BigDecimal operationAfter;

    /**
     * 描述
     */
    private String remark;

    /**
     * 1、充值  2、提现 
     */
    private Integer type;

    /**
     * 登录IP地址
     */
    private String addIp;

    /**
     * 添加时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 银行名字
     */
    private String bankName;

    /**
     * 资金流水id
     */
    private Integer userAccountLogId;

    /**
     * 1  成功 2 失败 3 订单进行中
     */
    private Integer status;

    /**
     * 厂商 1 sina
     */
    private Integer factory;

    /**
     * 订单号
     */
    private String orderNum;

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

    public Integer getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(Integer bankCardId) {
        this.bankCardId = bankCardId;
    }

    public String getBankCardNum() {
        return bankCardNum;
    }

    public void setBankCardNum(String bankCardNum) {
        this.bankCardNum = bankCardNum == null ? null : bankCardNum.trim();
    }

    public BigDecimal getOperationAmount() {
        return operationAmount;
    }

    public void setOperationAmount(BigDecimal operationAmount) {
        this.operationAmount = operationAmount;
    }

    public BigDecimal getWithdrawFee() {
        return withdrawFee;
    }

    public void setWithdrawFee(BigDecimal withdrawFee) {
        this.withdrawFee = withdrawFee;
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

    public String getAddIp() {
        return addIp;
    }

    public void setAddIp(String addIp) {
        this.addIp = addIp == null ? null : addIp.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public Integer getUserAccountLogId() {
        return userAccountLogId;
    }

    public void setUserAccountLogId(Integer userAccountLogId) {
        this.userAccountLogId = userAccountLogId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFactory() {
        return factory;
    }

    public void setFactory(Integer factory) {
        this.factory = factory;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", bankCardId=").append(bankCardId);
        sb.append(", bankCardNum=").append(bankCardNum);
        sb.append(", operationAmount=").append(operationAmount);
        sb.append(", withdrawFee=").append(withdrawFee);
        sb.append(", operationBefore=").append(operationBefore);
        sb.append(", operationAfter=").append(operationAfter);
        sb.append(", remark=").append(remark);
        sb.append(", type=").append(type);
        sb.append(", addIp=").append(addIp);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", bankName=").append(bankName);
        sb.append(", userAccountLogId=").append(userAccountLogId);
        sb.append(", status=").append(status);
        sb.append(", factory=").append(factory);
        sb.append(", orderNum=").append(orderNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}