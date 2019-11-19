package com.bd.entity;

import java.util.Objects;

public class FavoriteBlogEntity {
    private int id;
    private FavoriteAttentionEntity favoriteAttention;
    private BlogArticleEntity blogArticle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FavoriteBlogEntity that = (FavoriteBlogEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public FavoriteAttentionEntity getFavoriteAttention() {
        return favoriteAttention;
    }

    public void setFavoriteAttention(FavoriteAttentionEntity favoriteAttention) {
        this.favoriteAttention = favoriteAttention;
    }

    public BlogArticleEntity getBlogArticle() {
        return blogArticle;
    }

    public void setBlogArticle(BlogArticleEntity blogArticle) {
        this.blogArticle = blogArticle;
    }
}
