package com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String productname;
	private int price;
	private int productquantity;
	private int pcid;
	
	@OneToMany
	@JoinColumn(name = "pid", referencedColumnName = "pid")
	private List<ProductCategory> product_list;

	
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productname=" + productname + ", price=" + price + ", productquantity="
				+ productquantity + ", pcid=" + pcid + ", product_list=" + product_list + "]";
	}



	public Product(int pid, String productname, int price, int productquantity, int pcid,
			List<ProductCategory> product_list) {
		super();
		this.pid = pid;
		this.productname = productname;
		this.price = price;
		this.productquantity = productquantity;
		this.pcid = pcid;
		this.product_list = product_list;
	}



	public int getPid() {
		return pid;
	}



	public void setPid(int pid) {
		this.pid = pid;
	}



	public String getProductname() {
		return productname;
	}



	public void setProductname(String productname) {
		this.productname = productname;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getProductquantity() {
		return productquantity;
	}



	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}



	public int getPcid() {
		return pcid;
	}



	public void setPcid(int pcid) {
		this.pcid = pcid;
	}



	public List<ProductCategory> getProduct_list() {
		return product_list;
	}



	public void setProduct_list(List<ProductCategory> product_list) {
		this.product_list = product_list;
	}



	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
}
