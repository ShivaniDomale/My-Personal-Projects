package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customerfeedback {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fid;
	private String fback;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFback() {
		return fback;
	}
	public void setFback(String fback) {
		this.fback = fback;
	}
	@Override
	public String toString() {
		return "customerfeedback [fid=" + fid + ", fback=" + fback + "]";
	}
	public Customerfeedback(int fid, String fback) {
		super();
		this.fid = fid;
		this.fback = fback;
	}
	public Customerfeedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
