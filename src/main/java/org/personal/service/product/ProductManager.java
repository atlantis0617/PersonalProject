package org.personal.service.product;

import java.util.List;

import org.personal.model.product.Product;
import org.springframework.transaction.annotation.Transactional;

public interface ProductManager {
	
	@Transactional(readOnly=false)
	void saveProduct(Product product);
	
	@Transactional(readOnly=false)
	void delProduct();
	
	List<Product> showProduct();
	
}
