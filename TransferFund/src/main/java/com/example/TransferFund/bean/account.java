package com.example.TransferFund.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class account {
	
	@Id
	int id;
	int balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public account(int id, int balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "account [id=" + id + ", balance=" + balance + "]";
	}
	
}
