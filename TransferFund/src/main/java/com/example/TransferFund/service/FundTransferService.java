package com.example.TransferFund.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TransferFund.bean.account;
import com.example.TransferFund.repository.AccountRepository;

@Service
public class FundTransferService
{
	@Autowired
	AccountRepository ar;

	public String Amountdeposit (int withdrawFrom, int DepositTo, int amount)
	{
		Optional<account> op = ar.findById(withdrawFrom);
		Optional<account> op1 = ar.findById(DepositTo);

		account ac = op.get();
		account ac1 = op1.get();

		int totalbalance = ac.getBalance()-amount;
		int updatedbalance = ac1.getBalance()+amount;

		ac.setBalance(totalbalance);
		ac1.setBalance(updatedbalance);

		ar.save(ac);
		ar.save(ac1);
		return "Transfer successful.";
	}

	public int findbalance(int accno) {
		int amount = ar.findbalance(accno);
		System.out.println(amount);
		return amount;
	}
	
	public int updateBalance(int accno, int amount) {
		ar.updatebalance(amount, accno);
		return 0;
	}
}