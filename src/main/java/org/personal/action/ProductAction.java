package org.personal.action;

import java.util.List;

import org.personal.model.product.Product;
import org.personal.service.product.ProductManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("prototype")
public class ProductAction extends ActionSupport{

	private static final long serialVersionUID = -5340942082278906806L;
	
	@Autowired
    private ProductManager productManager;
	
	private Product product;
    
    /** 
    * @Title: saveProduct 
    * @Description: 保存商品
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws 
    */
    public String saveProduct() {
         
        productManager.saveProduct(product);
         
        this.addActionMessage("保存成功...");
        
        return SUCCESS;
         
    }
    
    public String showProduct() {
    	List<Product> datas = productManager.showProduct();
    	if(datas.size()>0) {
    		for (Product product : datas) {
				System.out.println(product.getPname());
			}
    	}
    	return SUCCESS;
    };
    
    
    /** 
    * @Title: delProduct 
    * @Description: 删除商品
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws 
    */
    public String delProduct() {
    	
    	return SUCCESS;
    
    }
    
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
