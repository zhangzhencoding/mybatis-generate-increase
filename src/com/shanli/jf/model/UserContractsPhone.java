package com.shanli.jf.model;

import java.io.Serializable;
import java.util.Date;

public class UserContractsPhone implements Serializable {
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 联系人手机号
     */
    private String contactsMobile;

    /**
     * 联系人姓名
     */
    private String contactsName;

    /**
     * 联系人邮箱
     */
    private String contactsMail;

    /**
     * 联系人地址
     */
    private String contactsAddr;

    /**
     * 联系人公司
     */
    private String contactsComp;

    /**
     * 联系人状态 0 不可用 1 可用
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContactsMobile() {
        return contactsMobile;
    }

    public void setContactsMobile(String contactsMobile) {
        this.contactsMobile = contactsMobile == null ? null : contactsMobile.trim();
    }

    public String getContactsName() {
        return contactsName;
    }

    public void setContactsName(String contactsName) {
        this.contactsName = contactsName == null ? null : contactsName.trim();
    }

    public String getContactsMail() {
        return contactsMail;
    }

    public void setContactsMail(String contactsMail) {
        this.contactsMail = contactsMail == null ? null : contactsMail.trim();
    }

    public String getContactsAddr() {
        return contactsAddr;
    }

    public void setContactsAddr(String contactsAddr) {
        this.contactsAddr = contactsAddr == null ? null : contactsAddr.trim();
    }

    public String getContactsComp() {
        return contactsComp;
    }

    public void setContactsComp(String contactsComp) {
        this.contactsComp = contactsComp == null ? null : contactsComp.trim();
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
        sb.append(", userId=").append(userId);
        sb.append(", contactsMobile=").append(contactsMobile);
        sb.append(", contactsName=").append(contactsName);
        sb.append(", contactsMail=").append(contactsMail);
        sb.append(", contactsAddr=").append(contactsAddr);
        sb.append(", contactsComp=").append(contactsComp);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}