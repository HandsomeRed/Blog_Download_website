package com.bd.service;

import com.bd.entity.BlogArticleEntity;
import com.bd.entity.UserEntity;

public interface WriteBlogService {

    public boolean addArticle(UserEntity user, BlogArticleEntity blogArticle);
}
