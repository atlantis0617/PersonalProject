package org.personal.base.dao;

import java.util.List;

import org.personal.base.model.BaseModel;

@SuppressWarnings("rawtypes")
public interface CommDao {

	<T extends BaseModel> void save(T entity);

	<T extends BaseModel> BaseModel load(Class<T> paramClass, Long paramId);

	<T extends BaseModel> void delete(Class<T> paramClass);
	
	List findByQuery(String hql);

}
