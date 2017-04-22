package com.shanli.jf.model;

import java.io.Serializable;

public class Code implements Serializable {
    /**
     * 系统编号
     */
    private Integer id;

    /**
     * 库对象
     */
    private String tabname;

    /**
     * 代码
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 类型
     */
    private String type;

    /**
     * 逻辑值
     */
    private String dfvs;

    /**
     * 空否
     */
    private Short kf;

    /**
     * 可见否
     */
    private Short kjf;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTabname() {
        return tabname;
    }

    public void setTabname(String tabname) {
        this.tabname = tabname == null ? null : tabname.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDfvs() {
        return dfvs;
    }

    public void setDfvs(String dfvs) {
        this.dfvs = dfvs == null ? null : dfvs.trim();
    }

    public Short getKf() {
        return kf;
    }

    public void setKf(Short kf) {
        this.kf = kf;
    }

    public Short getKjf() {
        return kjf;
    }

    public void setKjf(Short kjf) {
        this.kjf = kjf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tabname=").append(tabname);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", dfvs=").append(dfvs);
        sb.append(", kf=").append(kf);
        sb.append(", kjf=").append(kjf);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}