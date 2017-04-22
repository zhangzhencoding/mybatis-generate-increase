package com.shanli.jf.model;

import java.io.Serializable;
import java.util.Date;

public class SysAndorra implements Serializable {
    /**
     * 广告ID
     */
    private Long id;

    /**
     * 广告标题
     */
    private String title;

    /**
     * 广告内容
     */
    private String content;

    /**
     * 广告类型  0为默认文字广告，1为图片广告
     */
    private String type;

    /**
     * 广告图片地址
     */
    private String adurl;

    /**
     * 广告发布人
     */
    private String publisher;

    /**
     * 添加时间
     */
    private Date addtime;

    /**
     * 修改时间
     */
    private Date uptime;

    /**
     * 开始时间
     */
    private String starttime;

    /**
     * 结束时间
     */
    private String endtime;

    /**
     * 状态  0为默认未启用，1为启用
     */
    private String status;

    private String tourl;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getAdurl() {
        return adurl;
    }

    public void setAdurl(String adurl) {
        this.adurl = adurl == null ? null : adurl.trim();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
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

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", type=").append(type);
        sb.append(", adurl=").append(adurl);
        sb.append(", publisher=").append(publisher);
        sb.append(", addtime=").append(addtime);
        sb.append(", uptime=").append(uptime);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", status=").append(status);
        sb.append(", tourl=").append(tourl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}