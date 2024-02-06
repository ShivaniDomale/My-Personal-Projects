package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Customers;
import com.repository.CustomerFeedbackRepository;
import com.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	CustomerFeedbackRepository feedbackrepository;

	public String registerCustomerDetails(Customers customer) {
		Optional<Customers> result = customerRepository.findById(customer.getCid());
		customerRepository.save(customer);
		if(result.isPresent()) {
			return "Account already present";
		}else {
			System.out.println(customer.toString());
			customerRepository.save(customer);
			return "Account created succesfully!!";
		}
	}

	//check only customer-id and password
	public String loginCustomer(Customers customer) {
		Optional<Customers> result = customerRepository.findById(customer.getCid());
		if(result.isPresent()) {
			Customers ll = result.get();
			if(ll.getPassword().equals(customer.getPassword())) {
				return "successfully login";
			}else {
				return "Something went wrong";
			}
		}else {
			return "Account does not exists";
		}
	}
}
