package org.personal.base.dao;

import org.personal.base.model.BaseModel;

public interface BaseDao {
	
	public abstract<T extends BaseModel> void save(T entity);

}
