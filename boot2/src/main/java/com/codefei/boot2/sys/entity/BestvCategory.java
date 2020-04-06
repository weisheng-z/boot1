package com.codefei.boot2.sys.entity;

import java.io.Serializable;

public class BestvCategory implements Serializable {
    private Integer id;

    private Integer cid;

    private String name;

    private String icon;

    private Byte level;

    private Integer parentcid;

    private Byte status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public Integer getParentcid() {
        return parentcid;
    }

    public void setParentcid(Integer parentcid) {
        this.parentcid = parentcid;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BestvCategory{" +
                "id=" + id +
                ", cid=" + cid +
                ", name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", level=" + level +
                ", parentcid=" + parentcid +
                ", status=" + status +
                '}';
    }
}