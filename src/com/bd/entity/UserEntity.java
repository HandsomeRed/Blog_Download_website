package com.bd.entity;

import java.sql.Date;
import java.util.Objects;
import java.util.Set;

public class UserEntity {
    private int id;
    private String account;
    private String password;
    private String name;
    private String realName;
    private String sex;
    private Date birth;
    private String address;
    private String trade;
    private String position;
    private String introduction;
    private Date registDate;
    private String email;
    private String phone;
    private String userPic;
    private Integer fansNum;
    private String status;
    private Integer code;

    //fans - attention : many to many
    private Set<UserEntity> fans;
    private Set<UserEntity> attentions;

    private BlogMngEntity blogMng;


    private Set<DetailEntity> details;

    private Set<FavoriteAttentionEntity> favoriteAttentions;

    private Set<FavoriteListEntity> favoriteLists;


    //information (send and accept): one to many
    private Set<InformationEntity> inforSend;
    private Set<InformationEntity> inforAccepted;


    private ResourceMngEntity resourceMng;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Date getRegistDate() {
        return registDate;
    }

    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserPic() {
        return userPic;
    }

    public void setUserPic(String userPic) {
        this.userPic = userPic;
    }

    public Integer getFansNum() {
        return fansNum;
    }

    public void setFansNum(Integer fansNum) {
        this.fansNum = fansNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id &&
                Objects.equals(account, that.account) &&
                Objects.equals(password, that.password) &&
                Objects.equals(name, that.name) &&
                Objects.equals(realName, that.realName) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(birth, that.birth) &&
                Objects.equals(address, that.address) &&
                Objects.equals(trade, that.trade) &&
                Objects.equals(position, that.position) &&
                Objects.equals(introduction, that.introduction) &&
                Objects.equals(registDate, that.registDate) &&
                Objects.equals(email, that.email) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(userPic, that.userPic) &&
                Objects.equals(fans, that.fans) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, account, password, name, realName, sex, birth, address, trade, position, introduction, registDate, email, phone, userPic, fansNum, status, code);
    }

    public Set<UserEntity> getAttentions() {
        return attentions;
    }

    public void setAttentions(Set<UserEntity> attentions) {
        this.attentions = attentions;
    }

    public Set<UserEntity> getFans() {
        return fans;
    }

    public void setFans(Set<UserEntity> fans) {
        this.fans = fans;
    }

    public BlogMngEntity getBlogMng() {
        return blogMng;
    }

    public void setBlogMng(BlogMngEntity blogMngsById) {
        this.blogMng = blogMngsById;
    }

    public Set<DetailEntity> getDetails() {
        return details;
    }

    public void setDetails(Set<DetailEntity> details) {
        this.details = details;
    }

    public Set<FavoriteAttentionEntity> getFavoriteAttentions() {
        return favoriteAttentions;
    }

    public void setFavoriteAttentions(Set<FavoriteAttentionEntity> favoriteAttentions) {
        this.favoriteAttentions = favoriteAttentions;
    }

    public Set<FavoriteListEntity> getFavoriteLists() {
        return favoriteLists;
    }

    public void setFavoriteLists(Set<FavoriteListEntity> favoriteLists) {
        this.favoriteLists = favoriteLists;
    }

    public Set<InformationEntity> getInforSend() {
        return inforSend;
    }

    public void setInforSend(Set<InformationEntity> inforSend) {
        this.inforSend = inforSend;
    }

    public Set<InformationEntity> getInforAccepted() {
        return inforAccepted;
    }

    public void setInforAccepted(Set<InformationEntity> inforAccepted) {
        this.inforAccepted = inforAccepted;
    }

    public ResourceMngEntity getResourceMng() {
        return resourceMng;
    }

    public void setResourceMng(ResourceMngEntity resourceMng) {
        this.resourceMng = resourceMng;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}