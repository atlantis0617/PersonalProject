package org.personal.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.personal.model.product.Product;
import org.personal.service.product.ProductManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("prototype")
public class ProductAction extends ActionSupport implements RequestAware{

	private static final long serialVersionUID = -5340942082278906806L;
	
	@Autowired
    private ProductManager productManager;
	
	private Product product;
	
	private Map<String, Object> request; 
    
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
        return "add";
    }
    
    public String showProduct() {
//    	HttpServletRequest request = ServletActionContext.getRequest();
    	List<Product> datas = productManager.showProduct();
    	if(datas.size()>0) {
    		request.put("pros", datas);
    	}
    	return "show";
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

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

}
