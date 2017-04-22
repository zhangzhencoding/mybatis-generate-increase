package com.shanli.jf.model;

import java.io.Serializable;

public class SysNews implements Serializable {
    /**
     * 新闻ID
     */
    private Long id;

    /**
     * 新闻标题
     */
    private String title;

    /**
     * 发布人
     */
    private String publisher;

    /**
     * 发布时间
     */
    private String addtime;

    /**
     * 修改时间
     */
    private String uptime;

    /**
     * 发布IP
     */
    private String pip;

    /**
     * 点击数
     */
    private Integer hits;

    /**
     * 排序
     */
    private Integer sequence;

    /**
     * 推荐  0默认未推荐，1推荐
     */
    private String recommand;

    /**
     * 状态  0默认未发布，1发布
     */
    private String status;

    /**
     * 新闻内容
     */
    private String content;

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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
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

    public String getPip() {
        return pip;
    }

    public void setPip(String pip) {
        this.pip = pip == null ? null : pip.trim();
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getRecommand() {
        return recommand;
    }

    public void setRecommand(String recommand) {
        this.recommand = recommand == null ? null : recommand.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", publisher=").append(publisher);
        sb.append(", addtime=").append(addtime);
        sb.append(", uptime=").append(uptime);
        sb.append(", pip=").append(pip);
        sb.append(", hits=").append(hits);
        sb.append(", sequence=").append(sequence);
        sb.append(", recommand=").append(recommand);
        sb.append(", status=").append(status);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}