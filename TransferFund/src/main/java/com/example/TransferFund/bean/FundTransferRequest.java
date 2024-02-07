package com.example.TransferFund.bean;

public class FundTransferRequest {
	private int withdrawFrom;
	private int depositTo;
	private int amount;
	public int getWithdrawFrom() {
		return withdrawFrom;
	}
	public void setWithdrawFrom(int withdrawFrom) {
		this.withdrawFrom = withdrawFrom;
	}
	public int getDepositTo() {
		return depositTo;
	}
	public void setDepositTo(int depositTo) {
		this.depositTo = depositTo;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	
}
