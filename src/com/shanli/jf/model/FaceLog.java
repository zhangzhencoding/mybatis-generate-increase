package com.shanli.jf.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class FaceLog implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 身份证编号
     */
    private String idcardNumber;

    /**
     * 真实姓名
     */
    private String idcardName;

    /**
     * 身份证有效期限
     */
    private String validDate;

    /**
     * 评价分值
     */
    private BigDecimal confidence;

    /**
     * 身份证正面
     */
    private String shenfenZ;

    /**
     * 身份证反面
     */
    private String shenfenF;

    /**
     * 入库时间
     */
    private Integer createDate;

    /**
     * 人脸照片
     */
    private String image;

    /**
     * 人脸照片
     */
    private String address;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getIdcardNumber() {
        return idcardNumber;
    }

    public void setIdcardNumber(String idcardNumber) {
        this.idcardNumber = idcardNumber == null ? null : idcardNumber.trim();
    }

    public String getIdcardName() {
        return idcardName;
    }

    public void setIdcardName(String idcardName) {
        this.idcardName = idcardName == null ? null : idcardName.trim();
    }

    public String getValidDate() {
        return validDate;
    }

    public void setValidDate(String validDate) {
        this.validDate = validDate == null ? null : validDate.trim();
    }

    public BigDecimal getConfidence() {
        return confidence;
    }

    public void setConfidence(BigDecimal confidence) {
        this.confidence = confidence;
    }

    public String getShenfenZ() {
        return shenfenZ;
    }

    public void setShenfenZ(String shenfenZ) {
        this.shenfenZ = shenfenZ == null ? null : shenfenZ.trim();
    }

    public String getShenfenF() {
        return shenfenF;
    }

    public void setShenfenF(String shenfenF) {
        this.shenfenF = shenfenF == null ? null : shenfenF.trim();
    }

    public Integer getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Integer createDate) {
        this.createDate = createDate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", idcardNumber=").append(idcardNumber);
        sb.append(", idcardName=").append(idcardName);
        sb.append(", validDate=").append(validDate);
        sb.append(", confidence=").append(confidence);
        sb.append(", shenfenZ=").append(shenfenZ);
        sb.append(", shenfenF=").append(shenfenF);
        sb.append(", createDate=").append(createDate);
        sb.append(", image=").append(image);
        sb.append(", address=").append(address);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}