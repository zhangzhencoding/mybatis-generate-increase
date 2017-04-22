package com.shanli.jf.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer id;

    /**
     * 新浪账户
     */
    private String sinaId;

    /**
     * 用户登陆名
     */
    private String userName;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 添加时间
     */
    private Date createTime;

    /**
     * 登录密码
     */
    private String passWord;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 1、注册 2、实名 3、绑卡 4、注销 
     */
    private Integer status;

    /**
     * 1.未锁定 2、锁定 
     */
    private Integer lockStatus;

    /**
     * 注册邀请码
     */
    private String inviteCode;

    /**
     * 微信的头像url
     */
    private String weixinUrl;

    /**
     * 微信key
     */
    private String weixinKey;

    /**
     * 友盟推送设置的key
     */
    private String deviceToken;

    /**
     * 用户设备信息
     */
    private String deviceInfo;

    /**
     * 推荐人的user_id
     */
    private Integer recommendUserId;

    /**
     * 用户等级
     */
    private Integer level;

    /**
     * 手势密码
     */
    private Integer gesturePassword;

    /**
     * 锁定时间
     */
    private Date lockTime;

    /**
     * 用户类型 1、普通用户 2、企业用户 
     */
    private Byte userType;

    /**
     * 注册IP
     */
    private String regIp;

    /**
     * 员工号
     */
    private String agentId;

    /**
     * app类型 0、PC 1、ios 2、安卓 null、其他 
     */
    private Byte apptype;

    /**
     * 渠道 0、正常注册 1、内勤推荐 2、外勤推荐 3、BD 4、多盟 
     */
    private String userSource;

    /**
     * 默认推荐投资邀请码
     */
    private String investCode;

    /**
     * bd渠道标识
     */
    private String bdUserCode;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSinaId() {
        return sinaId;
    }

    public void setSinaId(String sinaId) {
        this.sinaId = sinaId == null ? null : sinaId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(Integer lockStatus) {
        this.lockStatus = lockStatus;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    public String getWeixinUrl() {
        return weixinUrl;
    }

    public void setWeixinUrl(String weixinUrl) {
        this.weixinUrl = weixinUrl == null ? null : weixinUrl.trim();
    }

    public String getWeixinKey() {
        return weixinKey;
    }

    public void setWeixinKey(String weixinKey) {
        this.weixinKey = weixinKey == null ? null : weixinKey.trim();
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken == null ? null : deviceToken.trim();
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo == null ? null : deviceInfo.trim();
    }

    public Integer getRecommendUserId() {
        return recommendUserId;
    }

    public void setRecommendUserId(Integer recommendUserId) {
        this.recommendUserId = recommendUserId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getGesturePassword() {
        return gesturePassword;
    }

    public void setGesturePassword(Integer gesturePassword) {
        this.gesturePassword = gesturePassword;
    }

    public Date getLockTime() {
        return lockTime;
    }

    public void setLockTime(Date lockTime) {
        this.lockTime = lockTime;
    }

    public Byte getUserType() {
        return userType;
    }

    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp == null ? null : regIp.trim();
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId == null ? null : agentId.trim();
    }

    public Byte getApptype() {
        return apptype;
    }

    public void setApptype(Byte apptype) {
        this.apptype = apptype;
    }

    public String getUserSource() {
        return userSource;
    }

    public void setUserSource(String userSource) {
        this.userSource = userSource == null ? null : userSource.trim();
    }

    public String getInvestCode() {
        return investCode;
    }

    public void setInvestCode(String investCode) {
        this.investCode = investCode == null ? null : investCode.trim();
    }

    public String getBdUserCode() {
        return bdUserCode;
    }

    public void setBdUserCode(String bdUserCode) {
        this.bdUserCode = bdUserCode == null ? null : bdUserCode.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sinaId=").append(sinaId);
        sb.append(", userName=").append(userName);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", passWord=").append(passWord);
        sb.append(", mobile=").append(mobile);
        sb.append(", status=").append(status);
        sb.append(", lockStatus=").append(lockStatus);
        sb.append(", inviteCode=").append(inviteCode);
        sb.append(", weixinUrl=").append(weixinUrl);
        sb.append(", weixinKey=").append(weixinKey);
        sb.append(", deviceToken=").append(deviceToken);
        sb.append(", deviceInfo=").append(deviceInfo);
        sb.append(", recommendUserId=").append(recommendUserId);
        sb.append(", level=").append(level);
        sb.append(", gesturePassword=").append(gesturePassword);
        sb.append(", lockTime=").append(lockTime);
        sb.append(", userType=").append(userType);
        sb.append(", regIp=").append(regIp);
        sb.append(", agentId=").append(agentId);
        sb.append(", apptype=").append(apptype);
        sb.append(", userSource=").append(userSource);
        sb.append(", investCode=").append(investCode);
        sb.append(", bdUserCode=").append(bdUserCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}