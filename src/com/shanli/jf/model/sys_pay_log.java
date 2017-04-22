package com.shanli.jf.model;

import java.io.Serializable;
import java.util.Date;

public class sys_pay_log implements Serializable {
    /**
     * 系统编号
     */
    private Integer id;

    /**
     *  1 充值  2 鉴权 3 支付 4 短信  5 下单 6绑卡推进 7解绑银行卡  8解绑推进
     */
    private Integer type;

    /**
     * 请求发送时间
     */
    private Date startTime;

    /**
     * 请求返回时间
     */
    private Date endTime;

    /**
     * 耗时时长（单位ms）
     */
    private Integer lossNum;

    /**
     * 请求状态  1 成功 0失败
     */
    private Integer status;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 标号
     */
    private String borrowNid;

    /**
     * 订单号
     */
    private String nid;

    /**
     * 1,sina
     */
    private Integer factory;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 描述
     */
    private String description;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getLossNum() {
        return lossNum;
    }

    public void setLossNum(Integer lossNum) {
        this.lossNum = lossNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getBorrowNid() {
        return borrowNid;
    }

    public void setBorrowNid(String borrowNid) {
        this.borrowNid = borrowNid == null ? null : borrowNid.trim();
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid == null ? null : nid.trim();
    }

    public Integer getFactory() {
        return factory;
    }

    public void setFactory(Integer factory) {
        this.factory = factory;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", lossNum=").append(lossNum);
        sb.append(", status=").append(status);
        sb.append(", mobile=").append(mobile);
        sb.append(", borrowNid=").append(borrowNid);
        sb.append(", nid=").append(nid);
        sb.append(", factory=").append(factory);
        sb.append(", userId=").append(userId);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}