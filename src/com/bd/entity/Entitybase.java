package com.bd.entity;

import com.alibaba.fastjson.JSON;
import tool.fastjson.filter.SimpleFilter;

public class Entitybase {

    public String toJson() {
        return JSON.toJSONString(this, new SimpleFilter());
    }

}
