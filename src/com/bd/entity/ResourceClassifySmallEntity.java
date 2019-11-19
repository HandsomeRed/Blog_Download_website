package com.bd.entity;

import java.util.Objects;
import java.util.Set;

public class ResourceClassifySmallEntity {
    private int id;
    private String name;
    private Set<ResourceEntity> resources;
    private ResourceClassifyBigEntity resourceClassifyBig;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResourceClassifySmallEntity that = (ResourceClassifySmallEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Set<ResourceEntity> getResources() {
        return resources;
    }

    public void setResources(Set<ResourceEntity> resources) {
        this.resources = resources;
    }

    public ResourceClassifyBigEntity getResourceClassifyBig() {
        return resourceClassifyBig;
    }

    public void setResourceClassifyBig(ResourceClassifyBigEntity resourceClassifyBig) {
        this.resourceClassifyBig = resourceClassifyBig;
    }
}
