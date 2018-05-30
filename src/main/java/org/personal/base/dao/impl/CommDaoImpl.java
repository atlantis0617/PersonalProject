package org.personal.base.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.personal.base.dao.CommDao;
import org.personal.base.model.BaseModel;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

@Component
public class CommDaoImpl extends HibernateDaoSupport implements CommDao{
	
	@Resource(name="sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory) {
		
		super.setSessionFactory(sessionFactory);
		
	}
	
	@Override
	public <T extends BaseModel> void save(T entity) {
		
		this.getHibernateTemplate().save(entity);
		
	}

	@Override
	public <T extends BaseModel> BaseModel load(Class<T> clazz,Long id) {
		
		return (BaseModel) this.getHibernateTemplate().load(clazz, id);
		
	}

	@Override
	public <T extends BaseModel> void delete(Class<T> entity) {
			
		this.getHibernateTemplate().delete(entity);
		
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List findByQuery(String hql) {
		
		return this.getHibernateTemplate().find(hql);
		
	}

}
