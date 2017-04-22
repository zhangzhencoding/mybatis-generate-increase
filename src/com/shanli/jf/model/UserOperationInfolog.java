package com.shanli.jf.model;

import java.io.Serializable;
import java.util.Date;

public class UserOperationInfolog implements Serializable {
    /**
     * 系统编号
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 操作类型:1、实名认证 2、绑卡 21、绑卡推进 3、邮箱认证 4、交易密码设置 5、提现 6、充值 7、创建用户 8、投资 9、登录 10起息代付 11、打款 12 委托扣款 13 解绑银行卡 14 解绑银行卡推进
     */
    private Integer type;

    /**
     * 操作状态结果:1、成功 2、失败 
     */
    private Integer status;

    /**
     * 操作终端:1、pc 2、app 3、H5 
     */
    private String terminalSource;

    /**
     * 操作返回信息
     */
    private String info;

    /**
     * 详细描述
     */
    private String infoDesc;

    /**
     * 操作订单号
     */
    private String orderNum;

    /**
     * 操作时间
     */
    private Date addTime;

    /**
     * 预留字段
     */
    private String columnOne;

    /**
     * 预留字段
     */
    private String repayNum;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTerminalSource() {
        return terminalSource;
    }

    public void setTerminalSource(String terminalSource) {
        this.terminalSource = terminalSource == null ? null : terminalSource.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getInfoDesc() {
        return infoDesc;
    }

    public void setInfoDesc(String infoDesc) {
        this.infoDesc = infoDesc == null ? null : infoDesc.trim();
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getColumnOne() {
        return columnOne;
    }

    public void setColumnOne(String columnOne) {
        this.columnOne = columnOne == null ? null : columnOne.trim();
    }

    public String getRepayNum() {
        return repayNum;
    }

    public void setRepayNum(String repayNum) {
        this.repayNum = repayNum == null ? null : repayNum.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
        sb.append(", terminalSource=").append(terminalSource);
        sb.append(", info=").append(info);
        sb.append(", infoDesc=").append(infoDesc);
        sb.append(", orderNum=").append(orderNum);
        sb.append(", addTime=").append(addTime);
        sb.append(", columnOne=").append(columnOne);
        sb.append(", repayNum=").append(repayNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}