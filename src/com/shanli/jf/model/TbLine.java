package com.shanli.jf.model;

import java.io.Serializable;

public class TbLine implements Serializable {
    private String lineId;

    /**
     * 名称
     */
    private String title;

    /**
     * 链接
     */
    private String lineUrl;

    /**
     * 线路
     */
    private String lineRoad;

    /**
     * 类型
     */
    private String type;

    /**
     * 排序
     */
    private Integer lineOrder;

    /**
     * 父类ID
     */
    private String parentId;

    private static final long serialVersionUID = 1L;

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId == null ? null : lineId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getLineUrl() {
        return lineUrl;
    }

    public void setLineUrl(String lineUrl) {
        this.lineUrl = lineUrl == null ? null : lineUrl.trim();
    }

    public String getLineRoad() {
        return lineRoad;
    }

    public void setLineRoad(String lineRoad) {
        this.lineRoad = lineRoad == null ? null : lineRoad.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getLineOrder() {
        return lineOrder;
    }

    public void setLineOrder(Integer lineOrder) {
        this.lineOrder = lineOrder;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lineId=").append(lineId);
        sb.append(", title=").append(title);
        sb.append(", lineUrl=").append(lineUrl);
        sb.append(", lineRoad=").append(lineRoad);
        sb.append(", type=").append(type);
        sb.append(", lineOrder=").append(lineOrder);
        sb.append(", parentId=").append(parentId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}