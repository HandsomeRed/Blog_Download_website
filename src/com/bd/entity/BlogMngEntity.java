package com.bd.entity;

import java.util.Objects;
import java.util.Set;

public class BlogMngEntity {
    private int id;
    private Integer lv;
    private Integer rank;
    private String title;
    private String desc;
    private Set<BlogArticleEntity> blogArticles;
    private Set<BlogClassifyListEntity> blogClassifyLists;
    private UserEntity user;
    private Set<ColumnListEntity> columnLists;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getLv() {
        return lv;
    }

    public void setLv(Integer lv) {
        this.lv = lv;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlogMngEntity that = (BlogMngEntity) o;
        return id == that.id &&
                Objects.equals(lv, that.lv) &&
                Objects.equals(rank, that.rank) &&
                Objects.equals(title, that.title) &&
                Objects.equals(desc, that.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lv, rank, title, desc);
    }

    public Set<BlogArticleEntity> getBlogArticles() {
        return blogArticles;
    }

    public void setBlogArticles(Set<BlogArticleEntity> blogArticles) {
        this.blogArticles = blogArticles;
    }

    public Set<BlogClassifyListEntity> getBlogClassifyLists() {
        return blogClassifyLists;
    }

    public void setBlogClassifyLists(Set<BlogClassifyListEntity> blogClassifyLists) {
        this.blogClassifyLists = blogClassifyLists;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public Set<ColumnListEntity> getColumnLists() {
        return columnLists;
    }

    public void setColumnLists(Set<ColumnListEntity> columnLists) {
        this.columnLists = columnLists;
    }
}
