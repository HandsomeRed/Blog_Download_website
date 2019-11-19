package com.bd.controller;

import com.bd.entity.BlogArticleEntity;
import com.bd.entity.UserEntity;
import com.bd.service.WriteBlogService;
import com.opensymphony.xwork2.ActionSupport;
import tool.Key_Value;

import java.util.Map;

public class WriteBlogAction extends ActionSupport{

	private BlogArticleEntity be; // 封装表单提交参数 这里是博文对象
	private WriteBlogService wbs;
	private Map<String, Object> session;

	public BlogArticleEntity getBe() {
		return be;
	}

	public void setBe(BlogArticleEntity be) {
		this.be = be;
	}

	// 写博客
	public String doWriteBlog() {

		UserEntity user = (UserEntity) session.get(Key_Value.user);
		return wbs.addArticle(user, be) ? "success" : "fail";
	}

	// 加载写博客页面
	public String doLoginWriteBlog() {
		return "success";
	}
	
//	@Override
//	public void setSession(Map<String, Object> map) {
//		this.session = map;
//	}


	public WriteBlogService getWbs() {
		return wbs;
	}

	public void setWbs(WriteBlogService wbs) {
		this.wbs = wbs;
	}
}
