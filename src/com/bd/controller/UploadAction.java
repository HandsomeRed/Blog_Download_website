package com.bd.controller;

import com.bd.entity.ResourceEntity;
import com.bd.entity.UserEntity;
import com.bd.service.ResourceService;
import com.opensymphony.xwork2.ActionSupport;

import tool.Key_Value;

import java.io.File;
import java.util.Map;

public class UploadAction extends ActionSupport{

    private File file;
    private String fileFileName;
    private String fileContentType;
    private ResourceEntity resource;
    private ResourceService resourceService;
    private Map<String, Object> session;

    public String uploadFile() {
        UserEntity user = (UserEntity) session.get(Key_Value.user);
        if (user == null) return "fail";
        if (resource == null) resource = new ResourceEntity();

        return resourceService.saveResource(user, file, fileFileName, resource);
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileFileName() {
        return fileFileName;
    }

    public void setFileFileName(String fileFileName) {
        this.fileFileName = fileFileName;
    }

    public String getFileContentType() {
        return fileContentType;
    }

    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }

    public ResourceEntity getResource() {
        return resource;
    }

    public void setResource(ResourceEntity resource) {
        this.resource = resource;
    }

//    @Override
//    public void setSession(Map<String, Object> map) {
//        this.session = map;
//    }

    public void setResourceService(ResourceService resourceService) {
        this.resourceService = resourceService;
    }
}
