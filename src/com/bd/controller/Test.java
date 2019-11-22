package com.bd.controller;

import com.alibaba.fastjson.JSON;
import com.bd.entity.BlogArticleEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import tool.fastjson.filter.SimpleFilter;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Serializable;

@Controller
public class Test implements Serializable {

    @Autowired
    SessionFactory sessionFactory = null;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test(Integer id) {

        System.out.println("-------------------------------------------");
//        System.out.println("***********************************************");

        System.out.println(id);
        return (sessionFactory.openSession().get(BlogArticleEntity.class, id).toJson());
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
