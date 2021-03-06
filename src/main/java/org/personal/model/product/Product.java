package org.personal.model.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.personal.base.model.BaseModel;

@Entity
public class Product extends BaseModel{
	
	private static final long serialVersionUID = -2686927131251401171L;
	
	@Id
    @GeneratedValue(generator = "pid")
    @GenericGenerator(name = "pid", strategy = "native")
    private int pid;// 商品ID
    
	@Column(length = 100)
    private String pname;// 商品名称
    
	@Column
	private double price;// 商品价格
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
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

}
