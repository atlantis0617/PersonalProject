package org.personal.base.dao.impl;

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
		
		getHibernateTemplate().save(entity);
		
	}

}
