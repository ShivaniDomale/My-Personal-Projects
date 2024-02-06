package com.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.orders;
import com.repository.OrderItemsRepository;
import com.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	OrderItemsRepository orderItemsRepository;
	
	public String storeOrderDetails(orders order)
	{
		Optional<orders>op = orderRepository.findById(order.getOid());
		if(op.isPresent())
		{
			return "order exist";
		}else
		{
			LocalDate returnvalue  = (LocalDate.now()).plusDays(5);
			order.setOrderdate(LocalDate.now());
			
			order.setDeliverydatetime(returnvalue);
			orderRepository.save(order);
			
			return "Orders Added";
		}
	}
}
