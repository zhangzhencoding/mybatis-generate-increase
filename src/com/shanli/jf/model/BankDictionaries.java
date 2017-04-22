package com.shanli.jf.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class BankDictionaries implements Serializable {
    /**
     * 系统编号
     */
    private Integer id;

    /**
     * 银行名称
     */
    private String bankName;

    /**
     * 银行图标ur
     */
    private String mapUrl;

    /**
     * 单次投资最大金额
     */
    private BigDecimal singerMaxAmount;

    /**
     * 单天最大使用额度
     */
    private BigDecimal singerDayAmount;

    /**
     * 银行编码
     */
    private String bankCode;

    /**
     * 是否使用状态 0 未使用  1 使用
     */
    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getMapUrl() {
        return mapUrl;
    }

    public void setMapUrl(String mapUrl) {
        this.mapUrl = mapUrl == null ? null : mapUrl.trim();
    }

    public BigDecimal getSingerMaxAmount() {
        return singerMaxAmount;
    }

    public void setSingerMaxAmount(BigDecimal singerMaxAmount) {
        this.singerMaxAmount = singerMaxAmount;
    }

    public BigDecimal getSingerDayAmount() {
        return singerDayAmount;
    }

    public void setSingerDayAmount(BigDecimal singerDayAmount) {
        this.singerDayAmount = singerDayAmount;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
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
        sb.append(", bankName=").append(bankName);
        sb.append(", mapUrl=").append(mapUrl);
        sb.append(", singerMaxAmount=").append(singerMaxAmount);
        sb.append(", singerDayAmount=").append(singerDayAmount);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}