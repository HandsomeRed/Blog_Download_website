package com.bd.dao;

import java.util.List;

import com.bd.entity.UserEntity;

public interface UserDao {
	// �����û�(��¼)
    public UserEntity search(UserEntity cond);
	
	// ����û�(ע��)
	public boolean addUser(UserEntity cond);
	
	//��ѯ�û�(����Ƿ����)
	public boolean checkUser(UserEntity cond);
}
