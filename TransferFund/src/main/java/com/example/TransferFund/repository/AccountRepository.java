package com.example.TransferFund.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.TransferFund.bean.account;

@Repository
public interface AccountRepository extends JpaRepository<account, Integer> {
	
	@Query(value="select a.balance from account_details a where a.accno = ?1",nativeQuery = true)
	 int findbalance(int accno);
		
	@Modifying
	@Transactional
	@Query(value="UPDATE account_details a SET a.balance =?1 WHERE a.accno=?2",nativeQuery = true)
	 void updatebalance(int balance,int accno);
}