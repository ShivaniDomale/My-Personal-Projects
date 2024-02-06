package com.entity;

import java.util.List;

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
@Table(name="customers")
public class Customers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String customeremailid;
	private String customername;
	private char gender;
	private int contact;
	private String password;
	private int oid;
	
	@OneToOne
	@JoinColumn(name = "cid", referencedColumnName = "fid")
	private Customerfeedback feedback;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCustomeremailid() {
		return customeremailid;
	}
	public void setCustomeremailid(String customeremailid) {
		this.customeremailid = customeremailid;
	}
	public Customerfeedback getFeedback() {
		return feedback;
	}
	public void setFeedback(Customerfeedback feedback) {
		this.feedback = feedback;
	}
	
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customers(int cid, String customeremailid, String customername, char gender, int contact, String password,
			int oid, Customerfeedback feedback) {
		super();
		this.cid = cid;
		this.customeremailid = customeremailid;
		this.customername = customername;
		this.gender = gender;
		this.contact = contact;
		this.password = password;
		this.oid = oid;
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		return "Customers [cid=" + cid + ", customeremailid=" + customeremailid + ", customername=" + customername
				+ ", gender=" + gender + ", contact=" + contact + ", password=" + password + ", oid=" + oid
				+ ", feedback=" + feedback ;
	}
	
	
}
