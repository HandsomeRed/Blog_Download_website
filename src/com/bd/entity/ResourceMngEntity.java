package com.bd.entity;

import java.util.Objects;
import java.util.Set;

public class ResourceMngEntity {
    private int id;
    private Integer lv;
    private Integer uploadLimit;
    private Integer rank;
    private Set<FavoriteResourceEntity> favoriteResources;
    private Set<ResourceEntity> resources;
    private UserEntity user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getLv() {
        return lv;
    }

    public void setLv(Integer lv) {
        this.lv = lv;
    }

    public Integer getUploadLimit() {
        return uploadLimit;
    }

    public void setUploadLimit(Integer uploadLimit) {
        this.uploadLimit = uploadLimit;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResourceMngEntity that = (ResourceMngEntity) o;
        return id == that.id &&
                Objects.equals(lv, that.lv) &&
                Objects.equals(uploadLimit, that.uploadLimit) &&
                Objects.equals(rank, that.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lv, uploadLimit, rank);
    }

    public Set<FavoriteResourceEntity> getFavoriteResources() {
        return favoriteResources;
    }

    public void setFavoriteResources(Set<FavoriteResourceEntity> favoriteResources) {
        this.favoriteResources = favoriteResources;
    }

    public Set<ResourceEntity> getResources() {
        return resources;
    }

    public void setResources(Set<ResourceEntity> resources) {
        this.resources = resources;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
