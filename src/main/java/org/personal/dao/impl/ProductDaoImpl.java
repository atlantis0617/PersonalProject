package org.personal.dao.impl;

import org.personal.base.dao.impl.BaseDaoImpl;
import org.personal.dao.ProductDao;
import org.personal.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl extends BaseDaoImpl implements ProductDao{

	@Override
	public void saveProduct(Product product) {
		
		save(product);
	
	}

}
