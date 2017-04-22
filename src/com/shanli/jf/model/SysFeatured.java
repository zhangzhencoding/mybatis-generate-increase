package com.shanli.jf.model;

import java.io.Serializable;
import java.util.Date;

public class SysFeatured implements Serializable {
    /**
     * 特别推荐ID
     */
    private Long id;

    /**
     * 特别推荐标题
     */
    private String title;

    /**
     * 特别推荐内容
     */
    private String content;

    /**
     * 特别推荐连接地址
     */
    private String url;

    /**
     * 热度  按1 2 3 4 5级
     */
    private String heat;

    /**
     * 星级  按1 2 3 4 5级
     */
    private String stars;

    /**
     * 排序
     */
    private Integer sequence;

    /**
     * 添加时间
     */
    private Date addtime;

    /**
     * 修改时间
     */
    private Date uptime;

    /**
     * 状态 0为未启用，1为启用
     */
    private String status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getHeat() {
        return heat;
    }

    public void setHeat(String heat) {
        this.heat = heat == null ? null : heat.trim();
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars == null ? null : stars.trim();
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", url=").append(url);
        sb.append(", heat=").append(heat);
        sb.append(", stars=").append(stars);
        sb.append(", sequence=").append(sequence);
        sb.append(", addtime=").append(addtime);
        sb.append(", uptime=").append(uptime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}