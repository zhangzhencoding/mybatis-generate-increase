package com.shanli.jf.model;

import java.io.Serializable;
import java.util.Date;

public class ContractInfo implements Serializable {
    /**
     * 系统编号
     */
    private Integer id;

    /**
     * 合同id
     */
    private String conId;

    /**
     * 合同名称
     */
    private String conName;

    /**
     * 合同所属
     */
    private String productId;

    /**
     * 合同状态 0 使用中 1 未使用
     */
    private String status;

    /**
     * 添加时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 合同内容
     */
    private String conInfo;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConId() {
        return conId;
    }

    public void setConId(String conId) {
        this.conId = conId == null ? null : conId.trim();
    }

    public String getConName() {
        return conName;
    }

    public void setConName(String conName) {
        this.conName = conName == null ? null : conName.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public String getConInfo() {
        return conInfo;
    }

    public void setConInfo(String conInfo) {
        this.conInfo = conInfo == null ? null : conInfo.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", conId=").append(conId);
        sb.append(", conName=").append(conName);
        sb.append(", productId=").append(productId);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", conInfo=").append(conInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}