package com.shanli.jf.model;

import java.io.Serializable;
import java.util.Date;

public class SysCodeConfigInfo implements Serializable {
    /**
     * 系统编号
     */
    private Integer id;

    /**
     * 父字段名
     */
    private String codeName;

    /**
     * 父字段名描述
     */
    private String codeDesc;

    /**
     * 子字段名
     */
    private String subCodeName;

    /**
     * 子字段名描述
     */
    private String subCodeDesc;

    /**
     * 字段值
     */
    private String codeValue;

    /**
     * 字段值说明
     */
    private String codeValueDesc;

    /**
     * 是否可用状态 0 不可用 1 可用
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

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName == null ? null : codeName.trim();
    }

    public String getCodeDesc() {
        return codeDesc;
    }

    public void setCodeDesc(String codeDesc) {
        this.codeDesc = codeDesc == null ? null : codeDesc.trim();
    }

    public String getSubCodeName() {
        return subCodeName;
    }

    public void setSubCodeName(String subCodeName) {
        this.subCodeName = subCodeName == null ? null : subCodeName.trim();
    }

    public String getSubCodeDesc() {
        return subCodeDesc;
    }

    public void setSubCodeDesc(String subCodeDesc) {
        this.subCodeDesc = subCodeDesc == null ? null : subCodeDesc.trim();
    }

    public String getCodeValue() {
        return codeValue;
    }

    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue == null ? null : codeValue.trim();
    }

    public String getCodeValueDesc() {
        return codeValueDesc;
    }

    public void setCodeValueDesc(String codeValueDesc) {
        this.codeValueDesc = codeValueDesc == null ? null : codeValueDesc.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", codeName=").append(codeName);
        sb.append(", codeDesc=").append(codeDesc);
        sb.append(", subCodeName=").append(subCodeName);
        sb.append(", subCodeDesc=").append(subCodeDesc);
        sb.append(", codeValue=").append(codeValue);
        sb.append(", codeValueDesc=").append(codeValueDesc);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}