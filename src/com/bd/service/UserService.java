package com.bd.service;

import com.bd.entity.UserEntity;

public interface UserService {
	
	// 查找用户(登录)
    public UserEntity login(UserEntity cond);
	
	// 添加用户(注册)
	public boolean addUser(UserEntity cond);
	
	//查询用户(检查是否可用)
	public boolean checkUser(UserEntity cond);
}
