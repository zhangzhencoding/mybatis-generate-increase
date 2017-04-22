package com.shanli.jf.model;

import java.io.Serializable;

public class SysLink implements Serializable {
    /**
     * 友情链接ID
     */
    private Long id;

    /**
     * 友情链接网站名称
     */
    private String stiename;

    /**
     * 友情链接网站内容
     */
    private String sitecontent;

    /**
     * 类型  0为文字连接，1为图片连接
     */
    private String type;

    /**
     * 图片连接地址
     */
    private String stieurl;

    /**
     * 添加时间
     */
    private String addtime;

    /**
     * 修改时间
     */
    private String uptime;

    /**
     * 状态  0为未启用，1为启用
     */
    private String status;

    /**
     * 排序
     */
    private Integer sequence;

    private String tourl;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStiename() {
        return stiename;
    }

    public void setStiename(String stiename) {
        this.stiename = stiename == null ? null : stiename.trim();
    }

    public String getSitecontent() {
        return sitecontent;
    }

    public void setSitecontent(String sitecontent) {
        this.sitecontent = sitecontent == null ? null : sitecontent.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStieurl() {
        return stieurl;
    }

    public void setStieurl(String stieurl) {
        this.stieurl = stieurl == null ? null : stieurl.trim();
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime == null ? null : uptime.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getTourl() {
        return tourl;
    }

    public void setTourl(String tourl) {
        this.tourl = tourl == null ? null : tourl.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", stiename=").append(stiename);
        sb.append(", sitecontent=").append(sitecontent);
        sb.append(", type=").append(type);
        sb.append(", stieurl=").append(stieurl);
        sb.append(", addtime=").append(addtime);
        sb.append(", uptime=").append(uptime);
        sb.append(", status=").append(status);
        sb.append(", sequence=").append(sequence);
        sb.append(", tourl=").append(tourl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}