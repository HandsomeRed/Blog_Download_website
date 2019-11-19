package com.bd.dao.imply;

import com.bd.dao.ResourceDao;
import com.bd.entity.ResourceClassifySmallEntity;
import com.bd.entity.ResourceEntity;
import com.bd.entity.ResourceKeywordEntity;
import com.bd.entity.UserEntity;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import tool.ChangeObject;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.List;

public class ResourceDaoImply implements ResourceDao {

    private SessionFactory sessionFactory;

    @Override
    public boolean addResource(UserEntity user, ResourceEntity resource) {
        Session session = sessionFactory.getCurrentSession();
        user = session.load(UserEntity.class, user.getId());
        resource.setReleaseTime(new Date(new java.util.Date().getTime()));
        resource.setResourceMng(user.getResourceMng());
        resource.setStatus("已通过");
        resource.setResourceCode(5);
        if (resource.getResourceClassifySmall() == null) {
            resource.setResourceClassifySmall(new ResourceClassifySmallEntity());
            resource.getResourceClassifySmall().setId(1);
        }


        for (ResourceKeywordEntity rk : resource.getResourceKeyword()) {
            System.out.println(rk.getName());
            ResourceKeywordEntity r = (ResourceKeywordEntity) session
                    .createCriteria(ResourceKeywordEntity.class)
                    .add(Restrictions.eq("name", rk.getName()))
                    .uniqueResult();
            if (r != null) rk.setId(r.getId());
            else rk.setId((Integer) session.save(rk));

        }

        try {
            session.save(resource);
        } catch (HibernateException he) {
            he.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public List<ResourceEntity> getResources(UserEntity user, ResourceEntity resource) {
        
    	if(resource == null) resource = new ResourceEntity();
    	
    	List list = sessionFactory
                .getCurrentSession()
                .createCriteria(ResourceEntity.class)
                .add(Example.create(resource))
                .addOrder(Order.desc("releaseTime"))
                .createCriteria("resourceMng")
                .add(Restrictions.eq("id", user.getBlogMng().getId()))
                .list();
        return list;
    }

    @Override
    public ResourceEntity getResource(ResourceEntity re) {
    	if(re == null) re = new ResourceEntity();
        return sessionFactory
                .getCurrentSession()
                .load(ResourceEntity.class, re.getId());
    }

    @Override
    public List<ResourceEntity> getResourceList(ResourceEntity resource) {
    	
    	if(resource == null) resource = new ResourceEntity();
    	
    	resource.setStatus("已通过"); // 设置已通过的资源作为example
        Criteria li = sessionFactory.getCurrentSession()
                .createCriteria(ResourceEntity.class)
                .add(Example.create(resource)) // 筛选
                .addOrder(Order.desc("releaseTime")); // 按时间排序

        if (resource.getResourceClassifySmall() != null) {
            li.createCriteria("resourceClassifySmall")
                    .add(Restrictions.eq("id", resource.getResourceClassifySmall().getId()));
        }

        return li.list();
    }

    @Override
    public String changeResourceInfor(ResourceEntity resource) {
        Session session = sessionFactory.getCurrentSession();
        ResourceEntity update = session.get(resource.getClass(), resource.getId());
        resource.setReleaseTime(new Date(new java.util.Date().getTime()));

        try {
            update = (ResourceEntity) ChangeObject.change(resource, update);
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }


        try {
            session.update(update);
            return "success";
        } catch (Exception e) {
            return "fail";
        }
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
