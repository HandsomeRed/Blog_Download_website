package com.bd.dao;

import java.util.List;

import com.bd.entity.BlogArticleEntity;
import com.bd.entity.BlogClassifyEntity;
import com.bd.entity.UserEntity;

public interface BlogDao {
	
	// 获取所有文章类型
	List<BlogClassifyEntity> getBlogClassify();
	//获取欲加载的一类文章
	List<BlogArticleEntity> getSelectArticle(BlogClassifyEntity bc);

	BlogArticleEntity getArticle(BlogArticleEntity ba);

    List<BlogArticleEntity> getArticles(UserEntity user, BlogArticleEntity ba);

    String deleteArticle(UserEntity user, BlogArticleEntity ba);
    
    // 获取某个用户
    UserEntity getUser(UserEntity user);
}
