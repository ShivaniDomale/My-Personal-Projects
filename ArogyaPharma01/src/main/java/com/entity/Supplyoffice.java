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

@Entity
public class Supplyoffice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int soid;
	private int requestnumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "soid", referencedColumnName = "requestnumber")
	private Productrequest productrequest;
	
	

	@Override
	public String toString() {
		return "Supplyoffice [soid=" + soid + ", requestnumber=" + requestnumber + ", productrequest=" + productrequest
				+ "]";
	}



	public Supplyoffice(int soid, int requestnumber, Productrequest productrequest) {
		super();
		this.soid = soid;
		this.requestnumber = requestnumber;
		this.productrequest = productrequest;
	}



	public int getSoid() {
		return soid;
	}



	public void setSoid(int soid) {
		this.soid = soid;
	}



	public int getRequestnumber() {
		return requestnumber;
	}



	public void setRequestnumber(int requestnumber) {
		this.requestnumber = requestnumber;
	}



	public Productrequest getProductrequest() {
		return productrequest;
	}



	public void setProductrequest(Productrequest productrequest) {
		this.productrequest = productrequest;
	}



	public Supplyoffice() {
		super();
		// TODO Auto-generated constructor stub
	}
}
