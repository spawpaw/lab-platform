package com.spawpaw.lab.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class DetailedLostAndFound implements Serializable {
    private Integer lostAndFoundId;

    /**
     * 招领描述
     */
    private String description;

    private Integer type;

    /**
     * 领取地点/联系方式
     */
    private String contact;

    private Integer userId;

    /**
     * 失物招领的状态
1.正在招领
2.因信息不符合规范被隐藏
3.已被领取
     */
    private Integer statues;

    private String username;

    private String nickName;

    private static final long serialVersionUID = 1L;

    public Integer getLostAndFoundId() {
        return lostAndFoundId;
    }

    public void setLostAndFoundId(Integer lostAndFoundId) {
        this.lostAndFoundId = lostAndFoundId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStatues() {
        return statues;
    }

    public void setStatues(Integer statues) {
        this.statues = statues;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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
        DetailedLostAndFound other = (DetailedLostAndFound) that;
        return (this.getLostAndFoundId() == null ? other.getLostAndFoundId() == null : this.getLostAndFoundId().equals(other.getLostAndFoundId()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getContact() == null ? other.getContact() == null : this.getContact().equals(other.getContact()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getStatues() == null ? other.getStatues() == null : this.getStatues().equals(other.getStatues()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getNickName() == null ? other.getNickName() == null : this.getNickName().equals(other.getNickName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLostAndFoundId() == null) ? 0 : getLostAndFoundId().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getContact() == null) ? 0 : getContact().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getStatues() == null) ? 0 : getStatues().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getNickName() == null) ? 0 : getNickName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lostAndFoundId=").append(lostAndFoundId);
        sb.append(", description=").append(description);
        sb.append(", type=").append(type);
        sb.append(", contact=").append(contact);
        sb.append(", userId=").append(userId);
        sb.append(", statues=").append(statues);
        sb.append(", username=").append(username);
        sb.append(", nickName=").append(nickName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}