package com.shanli.jf.model;

import java.io.Serializable;

public class Area implements Serializable {
    /**
     * 系统编号
     */
    private Short id;

    /**
     * 父级编号
     */
    private Short reid;

    /**
     * 名称
     */
    private String name;

    /**
     * 排序
     */
    private Short sortOrder;

    /**
     * 是否使用
     */
    private Byte isOpen;

    /**
     * 区域
     */
    private String domain;

    private static final long serialVersionUID = 1L;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getReid() {
        return reid;
    }

    public void setReid(Short reid) {
        this.reid = reid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Short sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Byte getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Byte isOpen) {
        this.isOpen = isOpen;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", reid=").append(reid);
        sb.append(", name=").append(name);
        sb.append(", sortOrder=").append(sortOrder);
        sb.append(", isOpen=").append(isOpen);
        sb.append(", domain=").append(domain);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}