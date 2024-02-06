package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.orders;
import com.service.OrderService;

@RestController
@RequestMapping("Orders")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping(value = "storeOrderDetails", consumes  = MediaType.APPLICATION_JSON_VALUE)
	public String storeOrderDetails(@RequestBody orders o) {
		System.out.println(o);
		return orderService.storeOrderDetails(o);
	}
}
