package org.personal.action;

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
	
	private String pname;
    private double price;
    
    /**
     * 保存商品操作
     *
     * @return
     */
    public String saveProduct() {
         
        Product product = new Product(pname, price);
        productManager.saveProduct(product);
         
        this.addActionMessage("保存成功...");
        return SUCCESS;
         
    }

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    
    @Override
    public void validate() {
    	 if(pname == null || "".equals(pname.trim())) {
             this.addFieldError("pname", "商品名称不能为空");
         }
    }

}
