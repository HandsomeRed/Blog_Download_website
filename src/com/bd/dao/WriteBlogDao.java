package com.bd.dao;

import com.bd.entity.BlogArticleEntity;
import com.bd.entity.UserEntity;

public interface WriteBlogDao {


    public boolean addArticle(UserEntity user, BlogArticleEntity blogArticle);
}
