package com.shanli.jf.model;

import java.io.Serializable;
import java.util.Date;

public class UserContactsInfo implements Serializable {
    /**
     * 系统编号
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 联系人类型 1 紧急联系人 2 直系亲属 3其他联系人
     */
    private String contType;

    /**
     * 联系人姓名
     */
    private String contUserName;

    /**
     * 联系人手机号
     */
    private String contMobile;

    /**
     * 与联系人关系
     */
    private String contShip;

    /**
     * 居住地址
     */
    private String contAddr;

    /**
     * 联系人状态 0 可用 1 不可用
     */
    private String contStatus;

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

    public String getContType() {
        return contType;
    }

    public void setContType(String contType) {
        this.contType = contType == null ? null : contType.trim();
    }

    public String getContUserName() {
        return contUserName;
    }

    public void setContUserName(String contUserName) {
        this.contUserName = contUserName == null ? null : contUserName.trim();
    }

    public String getContMobile() {
        return contMobile;
    }

    public void setContMobile(String contMobile) {
        this.contMobile = contMobile == null ? null : contMobile.trim();
    }

    public String getContShip() {
        return contShip;
    }

    public void setContShip(String contShip) {
        this.contShip = contShip == null ? null : contShip.trim();
    }

    public String getContAddr() {
        return contAddr;
    }

    public void setContAddr(String contAddr) {
        this.contAddr = contAddr == null ? null : contAddr.trim();
    }

    public String getContStatus() {
        return contStatus;
    }

    public void setContStatus(String contStatus) {
        this.contStatus = contStatus == null ? null : contStatus.trim();
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
        sb.append(", contType=").append(contType);
        sb.append(", contUserName=").append(contUserName);
        sb.append(", contMobile=").append(contMobile);
        sb.append(", contShip=").append(contShip);
        sb.append(", contAddr=").append(contAddr);
        sb.append(", contStatus=").append(contStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}