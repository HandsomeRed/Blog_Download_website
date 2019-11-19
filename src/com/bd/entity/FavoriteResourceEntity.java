package com.bd.entity;

import java.util.Objects;

public class FavoriteResourceEntity {
    private int id;
    private ResourceMngEntity resourceMng;
    private ResourceEntity resource;

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
        FavoriteResourceEntity that = (FavoriteResourceEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public ResourceMngEntity getResourceMng() {
        return resourceMng;
    }

    public void setResourceMng(ResourceMngEntity resourceMng) {
        this.resourceMng = resourceMng;
    }

    public ResourceEntity getResource() {
        return resource;
    }

    public void setResource(ResourceEntity resource) {
        this.resource = resource;
    }
}
