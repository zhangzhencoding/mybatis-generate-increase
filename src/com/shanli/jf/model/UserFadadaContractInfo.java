package com.shanli.jf.model;

import java.io.Serializable;
import java.util.Date;

public class UserFadadaContractInfo implements Serializable {
    /**
     * 系统编号
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 身份证号码
     */
    private String idCard;

    /**
     * 借款编号
     */
    private Integer loanBorrowId;

    /**
     * 合同编号
     */
    private String conNum;

    /**
     * 合同标题
     */
    private String conTitle;

    /**
     * 存放路径
     */
    private String conAddr;

    /**
     * 签署时间
     */
    private Date createTime;

    /**
     * 合同生效时间
     */
    private Date effectiveTime;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public Integer getLoanBorrowId() {
        return loanBorrowId;
    }

    public void setLoanBorrowId(Integer loanBorrowId) {
        this.loanBorrowId = loanBorrowId;
    }

    public String getConNum() {
        return conNum;
    }

    public void setConNum(String conNum) {
        this.conNum = conNum == null ? null : conNum.trim();
    }

    public String getConTitle() {
        return conTitle;
    }

    public void setConTitle(String conTitle) {
        this.conTitle = conTitle == null ? null : conTitle.trim();
    }

    public String getConAddr() {
        return conAddr;
    }

    public void setConAddr(String conAddr) {
        this.conAddr = conAddr == null ? null : conAddr.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
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
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", idCard=").append(idCard);
        sb.append(", loanBorrowId=").append(loanBorrowId);
        sb.append(", conNum=").append(conNum);
        sb.append(", conTitle=").append(conTitle);
        sb.append(", conAddr=").append(conAddr);
        sb.append(", createTime=").append(createTime);
        sb.append(", effectiveTime=").append(effectiveTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}