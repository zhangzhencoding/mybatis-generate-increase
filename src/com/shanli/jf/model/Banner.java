package com.shanli.jf.model;

import java.io.Serializable;
import java.util.Date;

public class Banner implements Serializable {
    /**
     * 系统编号
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 图片路径
     */
    private String url;

    /**
     * 1 广告页  2 引导页 3 log 4 icon
     */
    private Integer type;

    /**
     * 超链接
     */
    private String redirect;

    /**
     * 1 可用 2  不可用
     */
    private Integer status;

    /**
     * 描述
     */
    private String description;

    /**
     * 1 安卓 2 ios  3 h5 4 pc -1所有
     */
    private String use;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect == null ? null : redirect.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use == null ? null : use.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append(", type=").append(type);
        sb.append(", redirect=").append(redirect);
        sb.append(", status=").append(status);
        sb.append(", description=").append(description);
        sb.append(", use=").append(use);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}