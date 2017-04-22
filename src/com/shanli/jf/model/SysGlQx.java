package com.shanli.jf.model;

import java.io.Serializable;

public class SysGlQx implements Serializable {
    private String glId;

    private String roleId;

    private Integer fxQx;

    private Integer fwQx;

    private Integer qx1;

    private Integer qx2;

    private Integer qx3;

    private Integer qx4;

    private static final long serialVersionUID = 1L;

    public String getGlId() {
        return glId;
    }

    public void setGlId(String glId) {
        this.glId = glId == null ? null : glId.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public Integer getFxQx() {
        return fxQx;
    }

    public void setFxQx(Integer fxQx) {
        this.fxQx = fxQx;
    }

    public Integer getFwQx() {
        return fwQx;
    }

    public void setFwQx(Integer fwQx) {
        this.fwQx = fwQx;
    }

    public Integer getQx1() {
        return qx1;
    }

    public void setQx1(Integer qx1) {
        this.qx1 = qx1;
    }

    public Integer getQx2() {
        return qx2;
    }

    public void setQx2(Integer qx2) {
        this.qx2 = qx2;
    }

    public Integer getQx3() {
        return qx3;
    }

    public void setQx3(Integer qx3) {
        this.qx3 = qx3;
    }

    public Integer getQx4() {
        return qx4;
    }

    public void setQx4(Integer qx4) {
        this.qx4 = qx4;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", glId=").append(glId);
        sb.append(", roleId=").append(roleId);
        sb.append(", fxQx=").append(fxQx);
        sb.append(", fwQx=").append(fwQx);
        sb.append(", qx1=").append(qx1);
        sb.append(", qx2=").append(qx2);
        sb.append(", qx3=").append(qx3);
        sb.append(", qx4=").append(qx4);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}