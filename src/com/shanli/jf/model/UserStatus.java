package com.shanli.jf.model;

import java.io.Serializable;
import java.util.Date;

public class UserStatus implements Serializable {
    /**
     * 系统编号
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 手机验证
     */
    private Byte phoneStatus;

    /**
     * 身份验证
     */
    private Byte idCardStatus;

    /**
     * 是否设置交易密码
     */
    private Byte isPassword;

    /**
     * 是否填写基本信息 0 未填写 1 已填写
     */
    private Byte isBaseInfo;

    /**
     * 是否委托扣款
     */
    private Byte isEntrust;

    /**
     * 当面验证
     */
    private Byte faceStatus;

    /**
     * face++验证
     */
    private Byte faceppStatus;

    /**
     * 公积金验证
     */
    private Byte comfundsStatus;

    /**
     * 社保信息验证
     */
    private Byte ocialInsStatus;

    /**
     * 芝麻征信验证
     */
    private Byte sesameCredStatus;

    /**
     * 前海征信验证
     */
    private Byte qianhaiCredStatus;

    /**
     * 信用卡验证
     */
    private Byte creditCardStatus;

    /**
     * 学历验证
     */
    private Byte educateStatus;

    /**
     * 学历验证
     */
    private Byte fadadaStatus;

    /**
     * 邮箱验证
     */
    private Byte emailStatus;

    /**
     * 账户验证
     */
    private Byte accountStatus;

    /**
     * 信用额度
     */
    private Byte creditStatus;

    /**
     * 安全问题设置
     */
    private Byte safequestionStatus;

    /**
     * 视频认证
     */
    private Byte videoStatus;

    /**
     * VIP申请
     */
    private Byte vipStatus;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Byte getPhoneStatus() {
        return phoneStatus;
    }

    public void setPhoneStatus(Byte phoneStatus) {
        this.phoneStatus = phoneStatus;
    }

    public Byte getIdCardStatus() {
        return idCardStatus;
    }

    public void setIdCardStatus(Byte idCardStatus) {
        this.idCardStatus = idCardStatus;
    }

    public Byte getIsPassword() {
        return isPassword;
    }

    public void setIsPassword(Byte isPassword) {
        this.isPassword = isPassword;
    }

    public Byte getIsBaseInfo() {
        return isBaseInfo;
    }

    public void setIsBaseInfo(Byte isBaseInfo) {
        this.isBaseInfo = isBaseInfo;
    }

    public Byte getIsEntrust() {
        return isEntrust;
    }

    public void setIsEntrust(Byte isEntrust) {
        this.isEntrust = isEntrust;
    }

    public Byte getFaceStatus() {
        return faceStatus;
    }

    public void setFaceStatus(Byte faceStatus) {
        this.faceStatus = faceStatus;
    }

    public Byte getFaceppStatus() {
        return faceppStatus;
    }

    public void setFaceppStatus(Byte faceppStatus) {
        this.faceppStatus = faceppStatus;
    }

    public Byte getComfundsStatus() {
        return comfundsStatus;
    }

    public void setComfundsStatus(Byte comfundsStatus) {
        this.comfundsStatus = comfundsStatus;
    }

    public Byte getOcialInsStatus() {
        return ocialInsStatus;
    }

    public void setOcialInsStatus(Byte ocialInsStatus) {
        this.ocialInsStatus = ocialInsStatus;
    }

    public Byte getSesameCredStatus() {
        return sesameCredStatus;
    }

    public void setSesameCredStatus(Byte sesameCredStatus) {
        this.sesameCredStatus = sesameCredStatus;
    }

    public Byte getQianhaiCredStatus() {
        return qianhaiCredStatus;
    }

    public void setQianhaiCredStatus(Byte qianhaiCredStatus) {
        this.qianhaiCredStatus = qianhaiCredStatus;
    }

    public Byte getCreditCardStatus() {
        return creditCardStatus;
    }

    public void setCreditCardStatus(Byte creditCardStatus) {
        this.creditCardStatus = creditCardStatus;
    }

    public Byte getEducateStatus() {
        return educateStatus;
    }

    public void setEducateStatus(Byte educateStatus) {
        this.educateStatus = educateStatus;
    }

    public Byte getFadadaStatus() {
        return fadadaStatus;
    }

    public void setFadadaStatus(Byte fadadaStatus) {
        this.fadadaStatus = fadadaStatus;
    }

    public Byte getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(Byte emailStatus) {
        this.emailStatus = emailStatus;
    }

    public Byte getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Byte accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Byte getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(Byte creditStatus) {
        this.creditStatus = creditStatus;
    }

    public Byte getSafequestionStatus() {
        return safequestionStatus;
    }

    public void setSafequestionStatus(Byte safequestionStatus) {
        this.safequestionStatus = safequestionStatus;
    }

    public Byte getVideoStatus() {
        return videoStatus;
    }

    public void setVideoStatus(Byte videoStatus) {
        this.videoStatus = videoStatus;
    }

    public Byte getVipStatus() {
        return vipStatus;
    }

    public void setVipStatus(Byte vipStatus) {
        this.vipStatus = vipStatus;
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
        sb.append(", userId=").append(userId);
        sb.append(", phoneStatus=").append(phoneStatus);
        sb.append(", idCardStatus=").append(idCardStatus);
        sb.append(", isPassword=").append(isPassword);
        sb.append(", isBaseInfo=").append(isBaseInfo);
        sb.append(", isEntrust=").append(isEntrust);
        sb.append(", faceStatus=").append(faceStatus);
        sb.append(", faceppStatus=").append(faceppStatus);
        sb.append(", comfundsStatus=").append(comfundsStatus);
        sb.append(", ocialInsStatus=").append(ocialInsStatus);
        sb.append(", sesameCredStatus=").append(sesameCredStatus);
        sb.append(", qianhaiCredStatus=").append(qianhaiCredStatus);
        sb.append(", creditCardStatus=").append(creditCardStatus);
        sb.append(", educateStatus=").append(educateStatus);
        sb.append(", fadadaStatus=").append(fadadaStatus);
        sb.append(", emailStatus=").append(emailStatus);
        sb.append(", accountStatus=").append(accountStatus);
        sb.append(", creditStatus=").append(creditStatus);
        sb.append(", safequestionStatus=").append(safequestionStatus);
        sb.append(", videoStatus=").append(videoStatus);
        sb.append(", vipStatus=").append(vipStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}