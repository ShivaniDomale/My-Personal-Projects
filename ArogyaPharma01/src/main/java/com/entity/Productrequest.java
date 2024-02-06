package com.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Productrequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int requestnumber;
	private String Pharmacyaddress;
	private int riid;

	public Productrequest(int requestnumber, String pharmacyaddress, int riid) {
		super();
		this.requestnumber = requestnumber;
		Pharmacyaddress = pharmacyaddress;
		this.riid = riid;
	}

	@Override
	public String toString() {
		return "Productrequest [requestnumber=" + requestnumber + ", Pharmacyaddress=" + Pharmacyaddress + ", riid="
				+ riid + "]";
	}

	public int getRequestnumber() {
		return requestnumber;
	}



	public void setRequestnumber(int requestnumber) {
		this.requestnumber = requestnumber;
	}



	public String getPharmacyaddress() {
		return Pharmacyaddress;
	}



	public void setPharmacyaddress(String pharmacyaddress) {
		Pharmacyaddress = pharmacyaddress;
	}



	public int getRiid() {
		return riid;
	}



	public void setRiid(int riid) {
		this.riid = riid;
	}



	public Productrequest() {
		super();
		// TODO Auto-generated constructor stub
	}
}
