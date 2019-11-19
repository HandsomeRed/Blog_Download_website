package com.bd.entity;

import java.util.Objects;
import java.util.Set;

public class BlogClassifyListEntity {
    private int id;
    private String name;
    private Set<BlogArticleEntity> blogArticles;
    private BlogMngEntity blogMng;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlogClassifyListEntity that = (BlogClassifyListEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Set<BlogArticleEntity> getBlogArticles() {
        return blogArticles;
    }

    public void setBlogArticles(Set<BlogArticleEntity> blogArticles) {
        this.blogArticles = blogArticles;
    }

    public BlogMngEntity getBlogMng() {
        return blogMng;
    }

    public void setBlogMng(BlogMngEntity blogMng) {
        this.blogMng = blogMng;
    }
}
