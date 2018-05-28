package org.personal.dao;

import org.personal.base.dao.BaseDao;
import org.personal.model.Product;
import org.springframework.transaction.annotation.Transactional;

public interface ProductDao extends BaseDao{
	
	@Transactional(readOnly=false)
	void saveProduct(Product product);
	
}
