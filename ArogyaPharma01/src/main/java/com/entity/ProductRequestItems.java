package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productrequestitems")
public class ProductRequestItems {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int riid;

	@OneToOne
	@JoinColumn(name = "riid", referencedColumnName = "pid")
	private Product product;
	
	@OneToMany
	@JoinColumn(name = "riid", referencedColumnName = "riid")
	private List<Productrequest> produstequestlist;
	
	public ProductRequestItems(int riid, Product product, List<Productrequest> produstequestlist) {
		super();
		this.riid = riid;
		this.product = product;
		this.produstequestlist = produstequestlist;
	}



	@Override
	public String toString() {
		return "ProductRequestItems [riid=" + riid + ", product=" + product
				+ ", produstequestlist=" + produstequestlist + "]";
	}



	public int getRiid() {
		return riid;
	}



	public void setRiid(int riid) {
		this.riid = riid;
	}

	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



	public List<Productrequest> getProdustequestlist() {
		return produstequestlist;
	}



	public void setProdustequestlist(List<Productrequest> produstequestlist) {
		this.produstequestlist = produstequestlist;
	}

	public ProductRequestItems() {
		super();
		// TODO Auto-generated constructor stub
	}
}
