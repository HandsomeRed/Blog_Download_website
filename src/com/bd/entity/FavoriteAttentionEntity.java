package com.bd.entity;

import java.util.Objects;
import java.util.Set;

public class FavoriteAttentionEntity {
    private int id;
    private UserEntity user;
    private FavoriteListEntity favoriteList;
    private Set<FavoriteBlogEntity> favoriteBlogs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FavoriteAttentionEntity that = (FavoriteAttentionEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public FavoriteListEntity getFavoriteList() {
        return favoriteList;
    }

    public void setFavoriteList(FavoriteListEntity favoriteList) {
        this.favoriteList = favoriteList;
    }

    public Set<FavoriteBlogEntity> getFavoriteBlogs() {
        return favoriteBlogs;
    }

    public void setFavoriteBlogs(Set<FavoriteBlogEntity> favoriteBlogs) {
        this.favoriteBlogs = favoriteBlogs;
    }
}
