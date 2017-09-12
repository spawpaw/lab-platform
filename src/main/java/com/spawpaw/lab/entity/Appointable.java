package com.spawpaw.lab.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class Appointable implements Serializable {
    /**
     * 可被预约的对象,如教室

     */
    private Integer id;

    private String name;

    private Integer appointableGroupId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAppointableGroupId() {
        return appointableGroupId;
    }

    public void setAppointableGroupId(Integer appointableGroupId) {
        this.appointableGroupId = appointableGroupId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Appointable other = (Appointable) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAppointableGroupId() == null ? other.getAppointableGroupId() == null : this.getAppointableGroupId().equals(other.getAppointableGroupId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAppointableGroupId() == null) ? 0 : getAppointableGroupId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", appointableGroupId=").append(appointableGroupId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}