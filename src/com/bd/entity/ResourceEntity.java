package com.bd.entity;

import java.sql.Date;
import java.util.Objects;
import java.util.Set;

public class ResourceEntity {
    private int id;
    private Date releaseTime;
    private String name;
    private String type;
    private String introduction;
    private String status;
    private String addr;
    private Integer resourceCode;
    private Set<DetailEntity> details;
    private Set<FavoriteResourceEntity> favoriteResources;
    private ResourceMngEntity resourceMng;
    private ResourceClassifySmallEntity resourceClassifySmall;


    private Set<ResourceKeywordEntity> resourceKeyword;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResourceEntity that = (ResourceEntity) o;
        return id == that.id &&
                Objects.equals(releaseTime, that.releaseTime) &&
                Objects.equals(name, that.name) &&
                Objects.equals(type, that.type) &&
                Objects.equals(introduction, that.introduction) &&
                Objects.equals(status, that.status) &&
                Objects.equals(addr, that.addr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, releaseTime, name, type, introduction, status, addr, resourceCode);
    }

    public Set<DetailEntity> getDetails() {
        return details;
    }

    public void setDetails(Set<DetailEntity> details) {
        this.details = details;
    }

    public Set<FavoriteResourceEntity> getFavoriteResources() {
        return favoriteResources;
    }

    public void setFavoriteResources(Set<FavoriteResourceEntity> favoriteResources) {
        this.favoriteResources = favoriteResources;
    }

    public ResourceMngEntity getResourceMng() {
        return resourceMng;
    }

    public void setResourceMng(ResourceMngEntity resourceMng) {
        this.resourceMng = resourceMng;
    }

    public ResourceClassifySmallEntity getResourceClassifySmall() {
        return resourceClassifySmall;
    }

    public void setResourceClassifySmall(ResourceClassifySmallEntity resourceClassifySmall) {
        this.resourceClassifySmall = resourceClassifySmall;
    }

    public Set<ResourceKeywordEntity> getResourceKeyword() {
        return resourceKeyword;
    }

    public void setResourceKeyword(Set<ResourceKeywordEntity> resourceKeyword) {
        this.resourceKeyword = resourceKeyword;
    }

    public Integer getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(Integer resourceCode) {
        this.resourceCode = resourceCode;
    }
}
