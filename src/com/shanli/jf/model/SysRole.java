package com.shanli.jf.model;

import java.io.Serializable;

public class SysRole implements Serializable {
    private String roleId;

    private String roleName;

    private String rights;

    private String parentId;

    private String addQx;

    private String delQx;

    private String editQx;

    private String chaQx;

    private String qxId;

    private static final long serialVersionUID = 1L;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRights() {
        return rights;
    }

    public void setRights(String rights) {
        this.rights = rights == null ? null : rights.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getAddQx() {
        return addQx;
    }

    public void setAddQx(String addQx) {
        this.addQx = addQx == null ? null : addQx.trim();
    }

    public String getDelQx() {
        return delQx;
    }

    public void setDelQx(String delQx) {
        this.delQx = delQx == null ? null : delQx.trim();
    }

    public String getEditQx() {
        return editQx;
    }

    public void setEditQx(String editQx) {
        this.editQx = editQx == null ? null : editQx.trim();
    }

    public String getChaQx() {
        return chaQx;
    }

    public void setChaQx(String chaQx) {
        this.chaQx = chaQx == null ? null : chaQx.trim();
    }

    public String getQxId() {
        return qxId;
    }

    public void setQxId(String qxId) {
        this.qxId = qxId == null ? null : qxId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", roleName=").append(roleName);
        sb.append(", rights=").append(rights);
        sb.append(", parentId=").append(parentId);
        sb.append(", addQx=").append(addQx);
        sb.append(", delQx=").append(delQx);
        sb.append(", editQx=").append(editQx);
        sb.append(", chaQx=").append(chaQx);
        sb.append(", qxId=").append(qxId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}