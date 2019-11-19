package com.bd.entity;

import java.util.Objects;

public class AttentionFansEntity {
    private int id;
    private Integer uId;
    private Integer targetId;
    private UserEntity userByUId;
    private UserEntity userByTargetId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttentionFansEntity that = (AttentionFansEntity) o;
        return id == that.id &&
                Objects.equals(uId, that.uId) &&
                Objects.equals(targetId, that.targetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uId, targetId);
    }

    public UserEntity getUserByUId() {
        return userByUId;
    }

    public void setUserByUId(UserEntity userByUId) {
        this.userByUId = userByUId;
    }

    public UserEntity getUserByTargetId() {
        return userByTargetId;
    }

    public void setUserByTargetId(UserEntity userByTargetId) {
        this.userByTargetId = userByTargetId;
    }
}
