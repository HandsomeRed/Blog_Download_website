package com.bd.dao;

import com.bd.entity.ResourceEntity;
import com.bd.entity.UserEntity;

import java.util.List;

public interface ResourceDao {

    boolean addResource(UserEntity user, ResourceEntity resource);

    List<ResourceEntity> getResources(UserEntity user, ResourceEntity resource);

    ResourceEntity getResource(ResourceEntity re);

    List<ResourceEntity> getResourceList(ResourceEntity resource);

    String changeResourceInfor(ResourceEntity resource);
}
