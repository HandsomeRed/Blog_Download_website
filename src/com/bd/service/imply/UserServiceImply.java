package com.bd.service.imply;

import com.bd.dao.UserDao;
import com.bd.entity.UserEntity;
import com.bd.service.UserService;

public class UserServiceImply implements UserService {

	UserDao userDao; // Ðè×¢Èë
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
    public UserEntity login(UserEntity cond) {
		return userDao.search(cond);
	}

	@Override
	public boolean addUser(UserEntity cond) {
		return userDao.addUser(cond);
	}

	@Override
	public boolean checkUser(UserEntity cond) {
		return userDao.checkUser(cond);
	}
}
