package org.personal.base.dao;

import org.personal.base.model.BaseModel;

public interface CommDao {
	
	public abstract<T extends BaseModel> void save(T entity);

}
