package com.shanli.jf.model;

import java.io.Serializable;

public class TbPictures implements Serializable {
    private String picturesId;

    /**
     * 标题
     */
    private String title;

    /**
     * 文件名
     */
    private String name;

    /**
     * 路径
     */
    private String path;

    /**
     * 创建时间
     */
    private String createtime;

    /**
     * 属于
     */
    private String masterId;

    /**
     * 备注
     */
    private String bz;

    private static final long serialVersionUID = 1L;

    public String getPicturesId() {
        return picturesId;
    }

    public void setPicturesId(String picturesId) {
        this.picturesId = picturesId == null ? null : picturesId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getMasterId() {
        return masterId;
    }

    public void setMasterId(String masterId) {
        this.masterId = masterId == null ? null : masterId.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", picturesId=").append(picturesId);
        sb.append(", title=").append(title);
        sb.append(", name=").append(name);
        sb.append(", path=").append(path);
        sb.append(", createtime=").append(createtime);
        sb.append(", masterId=").append(masterId);
        sb.append(", bz=").append(bz);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}