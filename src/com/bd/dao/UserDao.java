package com.bd.dao;

import java.util.List;

import com.bd.entity.UserEntity;

public interface UserDao {
	// 查找用户(登录)
    public UserEntity search(UserEntity cond);
	
	// 添加用户(注册)
	public boolean addUser(UserEntity cond);
	
	//查询用户(检查是否可用)
	public boolean checkUser(UserEntity cond);
}
