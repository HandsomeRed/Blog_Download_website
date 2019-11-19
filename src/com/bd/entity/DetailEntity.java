package com.bd.entity;

import java.sql.Date;
import java.util.Objects;

public class DetailEntity {
    private int id;
    private Date downloadTime;
    private UserEntity user;
    private ResourceEntity resource;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Date getDownloadTime() {
        return downloadTime;
    }

    public void setDownloadTime(Date downloadTime) {
        this.downloadTime = downloadTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetailEntity that = (DetailEntity) o;
        return id == that.id &&
                Objects.equals(downloadTime, that.downloadTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, downloadTime);
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public ResourceEntity getResource() {
        return resource;
    }

    public void setResource(ResourceEntity resource) {
        this.resource = resource;
    }
}
