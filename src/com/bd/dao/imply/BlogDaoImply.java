package com.bd.dao.imply;

import java.util.ArrayList;
import java.util.List;

import com.bd.entity.BlogClassifyEntity;
import com.bd.entity.UserEntity;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bd.dao.BlogDao;
import com.bd.entity.BlogArticleEntity;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class BlogDaoImply implements BlogDao {

	SessionFactory sessionFactory;// 注入Spring容器中的sessionFactory实例

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override // 查询所有博文类型 返回List<博文类型对象>
	public List<BlogClassifyEntity> getBlogClassify() {
		List<BlogClassifyEntity> baList = null;
		Session session = sessionFactory.getCurrentSession();
		Criteria c = session.createCriteria(BlogClassifyEntity.class);
		baList = c.list();
		return baList;
	}

	@Override	//获取欲加载的一类文章
	public List<BlogArticleEntity> getSelectArticle(BlogClassifyEntity bc) {

		if (bc == null)
			return sessionFactory.getCurrentSession().createCriteria(BlogArticleEntity.class).addOrder(Order.desc("releaseTime")).list();
		return sessionFactory.getCurrentSession().createCriteria(BlogArticleEntity.class).addOrder(Order.desc("releaseTime")).createCriteria("blogClassify").add(Restrictions.eq("id", bc.getId())).list();

	}

	@Override // 有记录则返回记录,没有返回null;
	public BlogArticleEntity getArticle(BlogArticleEntity ba) {
		Session session = sessionFactory.getCurrentSession();
		BlogArticleEntity ret = null;

		try {
			BlogArticleEntity article = session.load(BlogArticleEntity.class, ba.getId());
			article.setReadNum(article.getReadNum() + 1);
			session.update(article);
			return article;
		} catch (HibernateException he) {
			return null;
		}

	}

	@Override
	public List<BlogArticleEntity> getArticles(UserEntity user, BlogArticleEntity ba) {

		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(BlogArticleEntity.class);

		// 处理第一次进入博客管理页面时 前端不传ba
		if(ba==null) {
			ba = new BlogArticleEntity();
		}
		
		//预加载user对象
        user = session.load(UserEntity.class, user.getId());

		//绑定blogMng
		ba.setBlogMng(user.getBlogMng());

		// 时间约束
		if (ba.getReleaseTime() != null)
			criteria.add(Restrictions.ge("releaseTime", ba.getReleaseTime()));

		//status 约束
		if (ba.getStatus() != null)
			criteria.add(Restrictions.eq("status", ba.getStatus()));

		//blogMng约束
		criteria.add(Restrictions.eq("blogMng", ba.getBlogMng()));

        //title key 约束
        if (ba.getTitle() != null)
            criteria.add(Restrictions.like("title", "%" + ba.getTitle() + "%"));

        //type 约束
        if (ba.getType() != null)
            criteria.add(Restrictions.eq("type", ba.getType()));

		//按日期降序
		criteria.addOrder(Order.desc("releaseTime"));


        return criteria.list();

	}

    @Override
    public String deleteArticle(UserEntity user, BlogArticleEntity ba) {

        Session session = sessionFactory.getCurrentSession();
        user = session.load(UserEntity.class, user.getId());
        ba = session.load(BlogArticleEntity.class, ba.getId());
        if (user.getId() != ba.getBlogMng().getUser().getId()) return "fail";

        try {
            session.delete(ba);
            return "success";
        } catch (HibernateException he) {
            he.printStackTrace();
            return "fail";
        }

    }


	@Override
	public UserEntity getUser(UserEntity user) {
		Session session = sessionFactory.getCurrentSession();
		
		return session.load(UserEntity.class, user.getId());
	}

}





















