package com.shanli.jf.model;

import java.io.Serializable;

public class Tree implements Serializable {
    /**
     * 节点编号
     */
    private Integer id;

    /**
     * 父级编号
     */
    private Integer pid;

    /**
     * 节点名称
     */
    private String name;

    /**
     * 响应路径
     */
    private String ul;

    /**
     * 内容存取
     */
    private String tv;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUl() {
        return ul;
    }

    public void setUl(String ul) {
        this.ul = ul == null ? null : ul.trim();
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv == null ? null : tv.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pid=").append(pid);
        sb.append(", name=").append(name);
        sb.append(", ul=").append(ul);
        sb.append(", tv=").append(tv);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}