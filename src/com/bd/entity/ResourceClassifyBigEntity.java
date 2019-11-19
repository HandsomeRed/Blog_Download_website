package com.bd.entity;

import java.util.Objects;
import java.util.Set;

public class ResourceClassifyBigEntity {
    private int id;
    private String name;
    private Set<ResourceClassifySmallEntity> resourceClassifySmalls;

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
        ResourceClassifyBigEntity that = (ResourceClassifyBigEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Set<ResourceClassifySmallEntity> getResourceClassifySmalls() {
        return resourceClassifySmalls;
    }

    public void setResourceClassifySmalls(Set<ResourceClassifySmallEntity> resourceClassifySmalls) {
        this.resourceClassifySmalls = resourceClassifySmalls;
    }
}
