package com.shanli.jf.model;

import java.io.Serializable;
import java.util.Date;

public class ChannelInfo implements Serializable {
    private Integer id;

    /**
     * 渠道id
     */
    private Integer channelId;

    /**
     * 渠道名称
     */
    private String channelName;

    /**
     * 渠道简介
     */
    private String channelInfo;

    /**
     * 是否可用状态 0 不可用 1 可用
     */
    private String status;

    /**
     * 开始合作时间
     */
    private Date startCooperateTime;

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

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public String getChannelInfo() {
        return channelInfo;
    }

    public void setChannelInfo(String channelInfo) {
        this.channelInfo = channelInfo == null ? null : channelInfo.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getStartCooperateTime() {
        return startCooperateTime;
    }

    public void setStartCooperateTime(Date startCooperateTime) {
        this.startCooperateTime = startCooperateTime;
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
        sb.append(", channelId=").append(channelId);
        sb.append(", channelName=").append(channelName);
        sb.append(", channelInfo=").append(channelInfo);
        sb.append(", status=").append(status);
        sb.append(", startCooperateTime=").append(startCooperateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}