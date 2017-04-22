package com.shanli.jf.model;

import java.io.Serializable;
import java.util.Date;

public class LoanProduct implements Serializable {
    /**
     * 系统编号
     */
    private Integer id;

    /**
     * 借款产品id
     */
    private String productId;

    /**
     * 借款产品名称
     */
    private String productName;

    /**
     * 借款产品来源 1 自营 2拿米 3 雪橙 4善林商务
     */
    private String productSource;

    /**
     * 一级分类 1 信用 2抵押 3 质押
     */
    private String levelOne;

    /**
     * 二级分类 1 个人小额信用贷 2个人大额信用贷 3 企业小额信用贷 4企业大额信用贷
     */
    private String levelTwo;

    /**
     * 状态 1发售中 2停售
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

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

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductSource() {
        return productSource;
    }

    public void setProductSource(String productSource) {
        this.productSource = productSource == null ? null : productSource.trim();
    }

    public String getLevelOne() {
        return levelOne;
    }

    public void setLevelOne(String levelOne) {
        this.levelOne = levelOne == null ? null : levelOne.trim();
    }

    public String getLevelTwo() {
        return levelTwo;
    }

    public void setLevelTwo(String levelTwo) {
        this.levelTwo = levelTwo == null ? null : levelTwo.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
        sb.append(", productId=").append(productId);
        sb.append(", productName=").append(productName);
        sb.append(", productSource=").append(productSource);
        sb.append(", levelOne=").append(levelOne);
        sb.append(", levelTwo=").append(levelTwo);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}