package com.shanli.jf.model;

import java.io.Serializable;
import java.util.Date;

public class RealUser implements Serializable {
    /**
     * 系统编号
     */
    private Integer id;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 身份证
     */
    private String idCard;

    /**
     * 注册时间
     */
    private Date registTime;

    /**
     * 状态(1、注册 2、实名 3、绑卡 4、注销 )
     */
    private Integer status;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 更新时间
     */
    private Date modifyTime;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 添加ip
     */
    private String addIp;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 提现密码
     */
    private String cashPassword;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * qq
     */
    private String qq;

    /**
     * weixin
     */
    private String weixin;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String sex;

    /**
     * 单位名称
     */
    private String companyName;

    /**
     * 职业
     */
    private String zy;

    /**
     * 部门
     */
    private String department;

    /**
     * 个人描述
     */
    private String info;

    /**
     * 婚否
     */
    private String isMarry;

    /**
     * 是否生育
     */
    private String isChildred;

    /**
     * 家庭关系
     */
    private String familyShip;

    /**
     * 教育程度
     */
    private String education;

    /**
     * 收入
     */
    private String income;

    /**
     * 房产信息
     */
    private String houseInfo;

    /**
     * 车子信息
     */
    private String carInfo;

    /**
     * 负债信息
     */
    private String debtsInfo;

    /**
     * 户籍住址
     */
    private String addressHk;

    /**
     * 常住地址
     */
    private String addressCz;

    /**
     * 公司地址
     */
    private String addrCompany;

    /**
     * 所在省
     */
    private Integer province;

    /**
     * 所在市
     */
    private Integer city;

    /**
     * 所在区
     */
    private Integer area;

    /**
     * 上传时间
     */
    private Date upTime;

    /**
     * 身份证正面照片
     */
    private String cardImg;

    /**
     * 身份证背面照片
     */
    private String cardBackImg;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getAddIp() {
        return addIp;
    }

    public void setAddIp(String addIp) {
        this.addIp = addIp == null ? null : addIp.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCashPassword() {
        return cashPassword;
    }

    public void setCashPassword(String cashPassword) {
        this.cashPassword = cashPassword == null ? null : cashPassword.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getZy() {
        return zy;
    }

    public void setZy(String zy) {
        this.zy = zy == null ? null : zy.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getIsMarry() {
        return isMarry;
    }

    public void setIsMarry(String isMarry) {
        this.isMarry = isMarry == null ? null : isMarry.trim();
    }

    public String getIsChildred() {
        return isChildred;
    }

    public void setIsChildred(String isChildred) {
        this.isChildred = isChildred == null ? null : isChildred.trim();
    }

    public String getFamilyShip() {
        return familyShip;
    }

    public void setFamilyShip(String familyShip) {
        this.familyShip = familyShip == null ? null : familyShip.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income == null ? null : income.trim();
    }

    public String getHouseInfo() {
        return houseInfo;
    }

    public void setHouseInfo(String houseInfo) {
        this.houseInfo = houseInfo == null ? null : houseInfo.trim();
    }

    public String getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo == null ? null : carInfo.trim();
    }

    public String getDebtsInfo() {
        return debtsInfo;
    }

    public void setDebtsInfo(String debtsInfo) {
        this.debtsInfo = debtsInfo == null ? null : debtsInfo.trim();
    }

    public String getAddressHk() {
        return addressHk;
    }

    public void setAddressHk(String addressHk) {
        this.addressHk = addressHk == null ? null : addressHk.trim();
    }

    public String getAddressCz() {
        return addressCz;
    }

    public void setAddressCz(String addressCz) {
        this.addressCz = addressCz == null ? null : addressCz.trim();
    }

    public String getAddrCompany() {
        return addrCompany;
    }

    public void setAddrCompany(String addrCompany) {
        this.addrCompany = addrCompany == null ? null : addrCompany.trim();
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Date getUpTime() {
        return upTime;
    }

    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }

    public String getCardImg() {
        return cardImg;
    }

    public void setCardImg(String cardImg) {
        this.cardImg = cardImg == null ? null : cardImg.trim();
    }

    public String getCardBackImg() {
        return cardBackImg;
    }

    public void setCardBackImg(String cardBackImg) {
        this.cardBackImg = cardBackImg == null ? null : cardBackImg.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", realName=").append(realName);
        sb.append(", idCard=").append(idCard);
        sb.append(", registTime=").append(registTime);
        sb.append(", status=").append(status);
        sb.append(", level=").append(level);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", mobile=").append(mobile);
        sb.append(", addIp=").append(addIp);
        sb.append(", userId=").append(userId);
        sb.append(", cashPassword=").append(cashPassword);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", qq=").append(qq);
        sb.append(", weixin=").append(weixin);
        sb.append(", age=").append(age);
        sb.append(", sex=").append(sex);
        sb.append(", companyName=").append(companyName);
        sb.append(", zy=").append(zy);
        sb.append(", department=").append(department);
        sb.append(", info=").append(info);
        sb.append(", isMarry=").append(isMarry);
        sb.append(", isChildred=").append(isChildred);
        sb.append(", familyShip=").append(familyShip);
        sb.append(", education=").append(education);
        sb.append(", income=").append(income);
        sb.append(", houseInfo=").append(houseInfo);
        sb.append(", carInfo=").append(carInfo);
        sb.append(", debtsInfo=").append(debtsInfo);
        sb.append(", addressHk=").append(addressHk);
        sb.append(", addressCz=").append(addressCz);
        sb.append(", addrCompany=").append(addrCompany);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", area=").append(area);
        sb.append(", upTime=").append(upTime);
        sb.append(", cardImg=").append(cardImg);
        sb.append(", cardBackImg=").append(cardBackImg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}