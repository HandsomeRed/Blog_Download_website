package com.bd.service;

import java.util.List;

import com.bd.entity.BlogArticleEntity;
import com.bd.entity.BlogClassifyEntity;
import com.bd.entity.UserEntity;

public interface BlogService {
	
	// ��ȡ������������
	List<BlogClassifyEntity> getBlogClassify();
	//��ȡ�����ص�һ������
	List<BlogArticleEntity> getSelectBlogArticles(BlogClassifyEntity bc);

	BlogArticleEntity getArticle(BlogArticleEntity ba);

	//����������ȡ�����ҵĲ���
	List<BlogArticleEntity> getMyArticles(UserEntity user, BlogArticleEntity ba);

	List<BlogArticleEntity> getBlogMng(UserEntity user);

    String doDeleteBlogArticle(UserEntity user, BlogArticleEntity ba);

    //���� user.id ��ȡĳ���û�
    UserEntity getUser(UserEntity user);
}
