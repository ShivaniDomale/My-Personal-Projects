package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Customerfeedback;
import com.entity.Customers;
import com.repository.CustomerFeedbackRepository;
import com.service.CustomerFeedbackService;
import com.service.CustomerService;

@RestController
@RequestMapping("Customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@Autowired
	CustomerFeedbackService customerFeedbackService;
	
	//7.Customer can register online and make order through pharmacy website.
	@PostMapping(value = "RegisterNewCustomer", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String RegisterNewCustomer(@RequestBody Customers customer){
		return customerService.registerCustomerDetails(customer);
	}
	
	@PostMapping(value = "CustomerLogin", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String CustomerLogin(@RequestBody Customers customer) {
		return customerService.loginCustomer(customer);
	}
	
	//8.Customer can also write there feedback about the service provided by pharmacy.
	@PostMapping(value = "GetFeedback",produces = MediaType.APPLICATION_JSON_VALUE)
	public String GetFeedback(@RequestBody Customerfeedback feedback) {
		return customerFeedbackService.GiveFeedback(feedback);
	}
	
}
