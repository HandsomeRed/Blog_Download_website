package com.bd.dao.imply;

import java.util.List;

import com.bd.entity.BlogMngEntity;
import com.bd.entity.ResourceMngEntity;
import org.hibernate.*;
import org.hibernate.criterion.Example;

import com.bd.dao.UserDao;
import com.bd.entity.UserEntity;

public class UserDaoImply implements UserDao{

	SessionFactory sessionFactory; // ��ע��
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	// �����û�
	@Override
	public UserEntity search(UserEntity cond) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession(); // ����hibernate session����
		Criteria criteria = session.createCriteria(UserEntity.class);
		Example example = Example.create(cond); // ����ʵ������
		criteria.add(example);
		return (UserEntity) criteria.uniqueResult();
	}

	
	// ����û� ͬʱ�����blogMng , resourceMng.
	// ����blogMng , resourceMng : default lv  rank = 1 -1.
	// ����resourceMng : default upload = 5
	@Override
	public boolean addUser(UserEntity cond) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		cond.setResourceMng(new ResourceMngEntity());
		cond.getResourceMng().setUser(cond);
        cond.getResourceMng().setLv(1);
        cond.getResourceMng().setUploadLimit(5);
        cond.getResourceMng().setRank(-1);
		cond.setBlogMng(new BlogMngEntity());
		cond.getBlogMng().setUser(cond);
        cond.getBlogMng().setLv(1);
        cond.getBlogMng().setRank(-1);
        cond.setName(cond.getAccount());
        cond.setCode(50);
        cond.setFansNum(0);
		cond.getBlogMng().setTitle(cond.getAccount() + " �Ĳ���");

		try {
			session.save(cond);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}

	}

	//��ѯ�û��Ƿ����
	public boolean checkUser(UserEntity cond) {
		boolean result = false;
		List<UserEntity> ueList = null;
		Session session = sessionFactory.getCurrentSession(); // ����hibernate session����
		Criteria criteria = session.createCriteria(UserEntity.class);
		Example example = Example.create(cond); // ����ʵ������
		criteria.add(example);
		System.out.println(ueList==null);
		ueList = criteria.list();
		if(ueList.isEmpty()) {
			result  = true;
		}
		return result;
	}
	
}
