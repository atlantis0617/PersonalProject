package org.personal.service.product.impl;

import java.util.Date;
import java.util.List;

import org.personal.base.dao.CommDao;
import org.personal.base.model.BaseStatus;
import org.personal.base.model.UpdateInfo;
import org.personal.model.product.Product;
import org.personal.model.user.AlterUser;
import org.personal.service.product.ProductManager;
import org.personal.utils.EntityFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductManagerImpl  implements ProductManager{
	
	@Autowired
    private CommDao commonDao;

	@Override
	public void saveProduct(Product product) {
		AlterUser au = EntityFactory.getEntity(AlterUser.class);
		au.setRegisterTime(new Date());
		au.setStatus(BaseStatus.O);
		UpdateInfo info = new UpdateInfo();
		info.setCreatedTime(new Date());
		info.setCreator("test");
		info.setCreatorId(1L);
		info.setLastOperator("yhy");
		info.setLastOperatorId(1L);
		info.setUpdateTime(new Date());
		au.setUpdateInfo(info);
		commonDao.save(au);
		commonDao.save(product);
	}


	@Override
	public void delProduct() {
		
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Product> showProduct() {
		String hql = "FROM Product WHERE 1=1";
		List<Product> pros = commonDao.findByQuery(hql);		
		return pros;
	}

}
