package org.personal.service.product;

import org.personal.model.product.Product;
import org.springframework.transaction.annotation.Transactional;

public interface ProductManager {
	
	@Transactional(readOnly=false)
	void saveProduct(Product product);
	
}
