package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productcategory")
public class ProductCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pcid;
	private int pid;
	private String categoryname;
	public int getPcid() {
		return pcid;
	}
	public void setPcid(int pcid) {
		this.pcid = pcid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	@Override
	public String toString() {
		return "ProductCategory [pcid=" + pcid + ", pid=" + pid + ", categoryname=" + categoryname + "]";
	}
	public ProductCategory(int pcid, int pid, String categoryname) {
		super();
		this.pcid = pcid;
		this.pid = pid;
		this.categoryname = categoryname;
	}
	public ProductCategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
