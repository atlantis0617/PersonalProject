package org.personal.service.product.impl;

import org.personal.base.dao.CommDao;
import org.personal.model.product.Product;
import org.personal.service.product.ProductManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductManagerImpl  implements ProductManager{
	
	@Autowired
    private CommDao commonDao;

	@Override
	public void saveProduct(Product product) {
		
		commonDao.save(product);
		
	}

}
