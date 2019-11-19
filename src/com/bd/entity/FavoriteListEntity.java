package com.bd.entity;

import java.sql.Date;
import java.util.Objects;
import java.util.Set;

public class FavoriteListEntity {
    private int id;
    private String name;
    private Integer attention;
    private Date createTime;
    private Date alterTime;
    private Set<FavoriteAttentionEntity> favoriteAttentions;
    private UserEntity user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAttention() {
        return attention;
    }

    public void setAttention(Integer attention) {
        this.attention = attention;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getAlterTime() {
        return alterTime;
    }

    public void setAlterTime(Date alterTime) {
        this.alterTime = alterTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FavoriteListEntity that = (FavoriteListEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(attention, that.attention) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(alterTime, that.alterTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, attention, createTime, alterTime);
    }

    public Set<FavoriteAttentionEntity> getFavoriteAttentions() {
        return favoriteAttentions;
    }

    public void setFavoriteAttentions(Set<FavoriteAttentionEntity> favoriteAttentions) {
        this.favoriteAttentions = favoriteAttentions;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
