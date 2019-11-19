package com.bd.entity;

import java.sql.Date;
import java.util.Objects;
import java.util.Set;

public class CommentEntity {
    private int id;
    private Integer floor;
    private Date time;
    private String status;
    private String content;
    private BlogArticleEntity blogArticle;
    private CommentEntity parent;
    private Set<CommentEntity> children;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentEntity that = (CommentEntity) o;
        return id == that.id &&
                Objects.equals(floor, that.floor) &&
                Objects.equals(time, that.time) &&
                Objects.equals(status, that.status) &&
                Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, floor, time, status, content);
    }

    public BlogArticleEntity getBlogArticle() {
        return blogArticle;
    }

    public void setBlogArticle(BlogArticleEntity blogArticle) {
        this.blogArticle = blogArticle;
    }

    public CommentEntity getParent() {
        return parent;
    }

    public void setParent(CommentEntity parent) {
        this.parent = parent;
    }

    public Set<CommentEntity> getChildren() {
        return children;
    }

    public void setChildren(Set<CommentEntity> children) {
        this.children = children;
    }
}
