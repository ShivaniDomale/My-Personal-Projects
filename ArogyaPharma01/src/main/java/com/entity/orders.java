package com.entity;

import java.time.LocalDate;
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
public class orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
	private LocalDate orderdate;
	private LocalDate deliverydatetime;
	private int numberofitems;
	private int oiid;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "oid", referencedColumnName = "aid")
	private Address add;
	
	@OneToMany
	@JoinColumn(name = "oid", referencedColumnName = "oid")
	private List<Customers> ListOfOrder;
	
	
	
	
	public int getOid() {
		return oid;
	}



	public void setOid(int oid) {
		this.oid = oid;
	}



	public LocalDate getOrderdate() {
		return orderdate;
	}



	public void setOrderdate(LocalDate orderdate) {
		this.orderdate = orderdate;
	}



	public LocalDate getDeliverydatetime() {
		return deliverydatetime;
	}



	public void setDeliverydatetime(LocalDate deliverydatetime) {
		this.deliverydatetime = deliverydatetime;
	}



	public int getNumberofitems() {
		return numberofitems;
	}



	public void setNumberofitems(int numberofitems) {
		this.numberofitems = numberofitems;
	}



	public int getOiid() {
		return oiid;
	}



	public void setOiid(int oiid) {
		this.oiid = oiid;
	}



	public Address getAdd() {
		return add;
	}



	public void setAdd(Address add) {
		this.add = add;
	}



	public List<Customers> getListOfOrder() {
		return ListOfOrder;
	}



	public void setListOfOrder(List<Customers> listOfOrder) {
		ListOfOrder = listOfOrder;
	}


	public orders(int oid, LocalDate orderdate, LocalDate deliverydatetime, int numberofitems, int oiid,
			Address add, List<Customers> listOfOrder) {
		super();
		this.oid = oid;
		this.orderdate = orderdate;
		this.deliverydatetime = deliverydatetime;
		this.numberofitems = numberofitems;
		this.oiid = oiid;
		this.add = add;
		ListOfOrder = listOfOrder;
	}



	@Override
	public String toString() {
		return "orders [oid=" + oid + ", orderdate=" + orderdate + ", deliverydatetime=" + deliverydatetime
				+ ", numberofitems=" + numberofitems +  ", oiid=" + oiid + ", add=" + add
				+ ", ListOfOrder=" + ListOfOrder + "]";
	}



	public orders() {
		super();
	}
}
