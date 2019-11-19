package com.bd.dao;

import java.util.List;

import com.bd.entity.BlogArticleEntity;
import com.bd.entity.BlogClassifyEntity;
import com.bd.entity.UserEntity;

public interface BlogDao {
	
	// ��ȡ������������
	List<BlogClassifyEntity> getBlogClassify();
	//��ȡ�����ص�һ������
	List<BlogArticleEntity> getSelectArticle(BlogClassifyEntity bc);

	BlogArticleEntity getArticle(BlogArticleEntity ba);

    List<BlogArticleEntity> getArticles(UserEntity user, BlogArticleEntity ba);

    String deleteArticle(UserEntity user, BlogArticleEntity ba);
    
    // ��ȡĳ���û�
    UserEntity getUser(UserEntity user);
}
