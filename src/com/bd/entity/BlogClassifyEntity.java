package com.bd.entity;

import java.util.Objects;
import java.util.Set;

public class BlogClassifyEntity {
    private int id;
    private String name;
    private Set<BlogArticleEntity> blogArticles;
    private Set<ColumnListEntity> columnLists;

    
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
        BlogClassifyEntity that = (BlogClassifyEntity) o;
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

    public Set<ColumnListEntity> getColumnLists() {
        return columnLists;
    }

    public void setColumnLists(Set<ColumnListEntity> columnLists) {
        this.columnLists = columnLists;
    }
}
