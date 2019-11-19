package com.bd.controller;

import com.bd.entity.ResourceEntity;
import com.bd.entity.UserEntity;
import com.bd.service.ResourceService;
import com.opensymphony.xwork2.ActionSupport;
import tool.Key_Value;

import java.util.List;
import java.util.Map;

public class ResourceAction extends ActionSupport{

    private ResourceEntity resource;
    private Map<String, Object> session;
    private Map<String, Object> request;
    private ResourceService resourceService;


    public String doGetResourceList() {

        List<ResourceEntity> list;
        list = resourceService.getResourceList(resource);
        request.put("resourceList", list);
        return "success";
    }


    public String doGetMyResources() {
        UserEntity user = (UserEntity) session.get(Key_Value.user);
        if (user == null) return "fail";
        List list = resourceService.getMyResources(user, resource);
        request.put("myResources", list);
        return "success";
    }

    public String doGetResource() {
        if (session.get(Key_Value.user) == null) return "fail";
        request.put("resource", resourceService.getResource(resource));
        return "success";
    }


    public String doChangeResourceInfor() {
        if (session.get(Key_Value.user) == null) return "fail";
        if (resource.getId() == 0) return "fail";
        return resourceService.changeResourceInfor(resource);
    }

//    @Override
//    public void setSession(Map<String, Object> map) {
//        this.session = map;
//    }

    public void setResource(ResourceEntity resource) {
        this.resource = resource;
    }

//    @Override
//    public void setRequest(Map<String, Object> map) {
//        this.request = map;
//    }

    public void setResourceService(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    public ResourceEntity getResource() {
        return resource;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public Map<String, Object> getRequest() {
        return request;
    }

    public ResourceService getResourceService() {
        return resourceService;
    }
}
