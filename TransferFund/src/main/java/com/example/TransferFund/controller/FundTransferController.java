package com.example.TransferFund.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.TransferFund.bean.account;
import com.example.TransferFund.repository.AccountRepository;
import com.example.TransferFund.bean.FundTransferRequest;
import com.example.TransferFund.service.FundTransferService;

@RestController
public class FundTransferController {

	@Autowired
	FundTransferService FTservice;
	
	@Autowired
	AccountRepository accountRepository;

	private final int MAX_TXN_AMOUNT = 10000;
	private final int MIN_TXN_AMOUNT = 100;

	@PostMapping(value = "/fundtransfer", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> fundTransfer(@RequestBody FundTransferRequest fund) {
		Optional<account> op1 = accountRepository.findById(fund.getWithdrawFrom());
		Optional<account> op2 = accountRepository.findById(fund.getDepositTo());

		if (fund.getAmount() > MAX_TXN_AMOUNT) {
			String responseMessege = "Amount more than allowed maximum: " + MAX_TXN_AMOUNT;
			return new ResponseEntity<>(responseMessege, HttpStatus.BAD_REQUEST);
		}
		if (fund.getAmount() < MIN_TXN_AMOUNT) {
			String responseMessege = "Amount less than allowed minimum: " + MIN_TXN_AMOUNT;
			return new ResponseEntity<>(responseMessege, HttpStatus.BAD_REQUEST);
		}
		if (op1.isEmpty()) {
			String responseMessege = "Invalid account: " + fund.getWithdrawFrom();
			return new ResponseEntity<>(responseMessege, HttpStatus.BAD_REQUEST);

		}
		if (FTservice.findbalance(fund.getWithdrawFrom()) < fund.getAmount()) {
			String responseMessege = "Insufficient balance.";
			return new ResponseEntity<>(responseMessege, HttpStatus.BAD_REQUEST);
		}
		if (op2.isEmpty()) {
			String responseMessege = "Invalid account: " + fund.getDepositTo();
			return new ResponseEntity<>(responseMessege, HttpStatus.BAD_REQUEST);

		}
		String result = FTservice.Amountdeposit(fund.getWithdrawFrom(), fund.getDepositTo(), fund.getAmount());
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
