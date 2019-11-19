package com.bd.service.imply;

import com.bd.dao.WriteBlogDao;
import com.bd.entity.BlogArticleEntity;
import com.bd.entity.UserEntity;
import com.bd.service.WriteBlogService;

public class WriteBlogServiceImply implements WriteBlogService{

    private WriteBlogDao writeBlogDao;

    @Override
    public boolean addArticle(UserEntity user, BlogArticleEntity blogArticle) {
        return writeBlogDao.addArticle(user, blogArticle);
    }


    public WriteBlogDao getWriteBlogDao() {
        return writeBlogDao;
    }

    public void setWriteBlogDao(WriteBlogDao writeBlogDao) {
        this.writeBlogDao = writeBlogDao;
    }
}
