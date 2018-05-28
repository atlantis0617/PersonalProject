package org.personal.service.product.impl;

import org.personal.dao.ProductDao;
import org.personal.model.Product;
import org.personal.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl  implements ProductService{
	
	@Autowired
    private ProductDao productDao;

	@Override
	public void saveProduct(Product product) {
		
		productDao.saveProduct(product);
		
	}

}
