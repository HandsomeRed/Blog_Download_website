package com.bd.service;

import com.bd.entity.UserEntity;

public interface UserService {
	
	// �����û�(��¼)
    public UserEntity login(UserEntity cond);
	
	// ����û�(ע��)
	public boolean addUser(UserEntity cond);
	
	//��ѯ�û�(����Ƿ����)
	public boolean checkUser(UserEntity cond);
}
