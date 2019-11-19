package com.bd.service;

import java.util.List;

import com.bd.entity.BlogArticleEntity;
import com.bd.entity.BlogClassifyEntity;
import com.bd.entity.UserEntity;

public interface BlogService {
	
	// 获取所有文章类型
	List<BlogClassifyEntity> getBlogClassify();
	//获取欲加载的一类文章
	List<BlogArticleEntity> getSelectBlogArticles(BlogClassifyEntity bc);

	BlogArticleEntity getArticle(BlogArticleEntity ba);

	//根据条件获取关于我的博文
	List<BlogArticleEntity> getMyArticles(UserEntity user, BlogArticleEntity ba);

	List<BlogArticleEntity> getBlogMng(UserEntity user);

    String doDeleteBlogArticle(UserEntity user, BlogArticleEntity ba);

    //根据 user.id 获取某个用户
    UserEntity getUser(UserEntity user);
}
