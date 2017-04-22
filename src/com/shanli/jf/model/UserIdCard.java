package com.shanli.jf.model;

import java.io.Serializable;
import java.util.Date;

public class UserIdCard implements Serializable {
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 添加时间
     */
    private Integer createDate;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 姓名
     */
    private String name;

    /**
     * 生日
     */
    private String birthday;

    /**
     * 名族
     */
    private String race;

    /**
     * 地址
     */
    private String address;

    /**
     * 性别
     */
    private String gender;

    /**
     * 身份证号
     */
    private String idCardNumber;

    /**
     * 有效期
     */
    private String validDate;

    /**
     * 签发单位
     */
    private String issuedBy;

    /**
     * 正面
     */
    private String frontUrl;

    /**
     * 反面
     */
    private String backUrl;

    /**
     * 状态 0 可用 1 不可用
     */
    private Integer status;

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

    public Integer getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Integer createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race == null ? null : race.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber == null ? null : idCardNumber.trim();
    }

    public String getValidDate() {
        return validDate;
    }

    public void setValidDate(String validDate) {
        this.validDate = validDate == null ? null : validDate.trim();
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy == null ? null : issuedBy.trim();
    }

    public String getFrontUrl() {
        return frontUrl;
    }

    public void setFrontUrl(String frontUrl) {
        this.frontUrl = frontUrl == null ? null : frontUrl.trim();
    }

    public String getBackUrl() {
        return backUrl;
    }

    public void setBackUrl(String backUrl) {
        this.backUrl = backUrl == null ? null : backUrl.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", name=").append(name);
        sb.append(", birthday=").append(birthday);
        sb.append(", race=").append(race);
        sb.append(", address=").append(address);
        sb.append(", gender=").append(gender);
        sb.append(", idCardNumber=").append(idCardNumber);
        sb.append(", validDate=").append(validDate);
        sb.append(", issuedBy=").append(issuedBy);
        sb.append(", frontUrl=").append(frontUrl);
        sb.append(", backUrl=").append(backUrl);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}