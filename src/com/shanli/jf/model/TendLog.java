package com.shanli.jf.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TendLog implements Serializable {
    /**
     * 系统编号
     */
    private Integer id;

    /**
     * 标号
     */
    private String borrowNid;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 操作时间
     */
    private Date operateTime;

    /**
     * 操作描述
     */
    private String operateDescribe;

    /**
     * IP地址
     */
    private String addIp;

    /**
     * 借款金额
     */
    private BigDecimal amout;

    /**
     * 利率
     */
    private Float rate;

    /**
     * 1成功 2失败
     */
    private Integer status;

    /**
     * 订单号
     */
    private String nid;

    /**
     * 1 定期 2 活期
     */
    private Integer type;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBorrowNid() {
        return borrowNid;
    }

    public void setBorrowNid(String borrowNid) {
        this.borrowNid = borrowNid == null ? null : borrowNid.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperateDescribe() {
        return operateDescribe;
    }

    public void setOperateDescribe(String operateDescribe) {
        this.operateDescribe = operateDescribe == null ? null : operateDescribe.trim();
    }

    public String getAddIp() {
        return addIp;
    }

    public void setAddIp(String addIp) {
        this.addIp = addIp == null ? null : addIp.trim();
    }

    public BigDecimal getAmout() {
        return amout;
    }

    public void setAmout(BigDecimal amout) {
        this.amout = amout;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid == null ? null : nid.trim();
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
        sb.append(", borrowNid=").append(borrowNid);
        sb.append(", userId=").append(userId);
        sb.append(", operateTime=").append(operateTime);
        sb.append(", operateDescribe=").append(operateDescribe);
        sb.append(", addIp=").append(addIp);
        sb.append(", amout=").append(amout);
        sb.append(", rate=").append(rate);
        sb.append(", status=").append(status);
        sb.append(", nid=").append(nid);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}