package com.bd.entity;

import java.sql.Date;
import java.util.Objects;
import java.util.Set;

public class BlogArticleEntity {
    private int id;
    private Date releaseTime;
    private Date modificationTime;
    private String title;
    private String content;
    private String type;
    private String status;
    private Integer readNum;
    private Integer likeNum;
    private BlogMngEntity blogMng;
    private BlogClassifyEntity blogClassify;
    private BlogClassifyListEntity blogClassifyList;
    private ColumnListEntity columnList;
    private Set<CommentEntity> comments;
    private Set<FavoriteBlogEntity> favorite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Date getModificationTime() {
        return modificationTime;
    }

    public void setModificationTime(Date modificationTime) {
        this.modificationTime = modificationTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getReadNum() {
        return readNum;
    }

    public void setReadNum(Integer readNum) {
        this.readNum = readNum;
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlogArticleEntity that = (BlogArticleEntity) o;
        return id == that.id &&
                Objects.equals(releaseTime, that.releaseTime) &&
                Objects.equals(modificationTime, that.modificationTime) &&
                Objects.equals(title, that.title) &&
                Objects.equals(content, that.content) &&
                Objects.equals(type, that.type) &&
                Objects.equals(status, that.status) &&
                Objects.equals(readNum, that.readNum) &&
                Objects.equals(likeNum, that.likeNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, releaseTime, modificationTime, title, content, type, status, readNum, likeNum);
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

    public BlogClassifyListEntity getBlogClassifyList() {
        return blogClassifyList;
    }

    public void setBlogClassifyList(BlogClassifyListEntity blogClassifyList) {
        this.blogClassifyList = blogClassifyList;
    }

    public ColumnListEntity getColumnList() {
        return columnList;
    }

    public void setColumnList(ColumnListEntity columnList) {
        this.columnList = columnList;
    }

    public Set<CommentEntity> getComments() {
        return comments;
    }

    public void setComments(Set<CommentEntity> comments) {
        this.comments = comments;
    }

    public Set<FavoriteBlogEntity> getFavorite() {
        return favorite;
    }

    public void setFavorite(Set<FavoriteBlogEntity> favorite) {
        this.favorite = favorite;
    }
}
