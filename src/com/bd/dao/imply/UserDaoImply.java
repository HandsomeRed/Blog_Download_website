package com.bd.dao.imply;

import java.util.List;

import com.bd.entity.BlogMngEntity;
import com.bd.entity.ResourceMngEntity;
import org.hibernate.*;
import org.hibernate.criterion.Example;

import com.bd.dao.UserDao;
import com.bd.entity.UserEntity;

public class UserDaoImply implements UserDao{

	SessionFactory sessionFactory; // 需注入
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	// 查找用户
	@Override
	public UserEntity search(UserEntity cond) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession(); // 创建hibernate session对象
		Criteria criteria = session.createCriteria(UserEntity.class);
		Example example = Example.create(cond); // 创建实例对象
		criteria.add(example);
		return (UserEntity) criteria.uniqueResult();
	}

	
	// 添加用户 同时添加其blogMng , resourceMng.
	// 对于blogMng , resourceMng : default lv  rank = 1 -1.
	// 对于resourceMng : default upload = 5
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
		cond.getBlogMng().setTitle(cond.getAccount() + " 的博客");

		try {
			session.save(cond);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}

	}

	//查询用户是否可用
	public boolean checkUser(UserEntity cond) {
		boolean result = false;
		List<UserEntity> ueList = null;
		Session session = sessionFactory.getCurrentSession(); // 创建hibernate session对象
		Criteria criteria = session.createCriteria(UserEntity.class);
		Example example = Example.create(cond); // 创建实例对象
		criteria.add(example);
		System.out.println(ueList==null);
		ueList = criteria.list();
		if(ueList.isEmpty()) {
			result  = true;
		}
		return result;
	}
	
}
