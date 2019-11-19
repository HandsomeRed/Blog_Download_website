package com.bd.entity;

import java.util.Objects;
import java.util.Set;

public class ColumnListEntity {
    private int id;
    private String name;
    private String introduction;
    private Byte relation;
    private Set<BlogArticleEntity> blogArticles;
    private BlogMngEntity blogMng;
    private BlogClassifyEntity blogClassify;

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

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Byte getRelation() {
        return relation;
    }

    public void setRelation(Byte relation) {
        this.relation = relation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColumnListEntity that = (ColumnListEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(introduction, that.introduction) &&
                Objects.equals(relation, that.relation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, introduction, relation);
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

    public BlogClassifyEntity getBlogClassify() {
        return blogClassify;
    }

    public void setBlogClassify(BlogClassifyEntity blogClassify) {
        this.blogClassify = blogClassify;
    }
}
