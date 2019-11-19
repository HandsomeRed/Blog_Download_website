package com.bd.service;

import com.bd.entity.ResourceEntity;
import com.bd.entity.UserEntity;

import java.io.File;
import java.util.List;

public interface ResourceService {

    String saveResource(UserEntity user, File file, String fileFileName, ResourceEntity resource);

    List<ResourceEntity> getMyResources(UserEntity user, ResourceEntity resource);

    List<ResourceEntity> getResourceList(ResourceEntity resource);

    ResourceEntity getResource(ResourceEntity resource);

    String changeResourceInfor(ResourceEntity resource);
}
