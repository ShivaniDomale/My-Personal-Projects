package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orderitems")
public class Order_Items {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oiid;
	private int quantity;
	
	//@Column(name = "pid", insertable = false, updatable = false)
	
	//one to many relationship withh order//
	@OneToMany
	@JoinColumn(name = "oiid", referencedColumnName = "oiid")
	private List<orders> order_list;
	
	///one to one relationship with product//
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "oiid", referencedColumnName = "pid")
	private Product product;

	

	@Override
	public String toString() {
		return "Order_Items [oiid=" + oiid + ", quantity=" + quantity + ", order_list=" + order_list + ", product="
				+ product + "]";
	}



	public Order_Items(int oiid, int quantity, List<orders> order_list, Product product) {
		super();
		this.oiid = oiid;
		this.quantity = quantity;
		this.order_list = order_list;
		this.product = product;
	}



	public int getOiid() {
		return oiid;
	}



	public void setOiid(int oiid) {
		this.oiid = oiid;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public List<orders> getOrder_list() {
		return order_list;
	}



	public void setOrder_list(List<orders> order_list) {
		this.order_list = order_list;
	}



	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



	public Order_Items() {
		super();
		// TODO Auto-generated constructor stub
	}
}
