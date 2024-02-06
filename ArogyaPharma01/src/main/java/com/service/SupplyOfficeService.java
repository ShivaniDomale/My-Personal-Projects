package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.ProductRequestItemsRepository;

@Service
public class SupplyOfficeService {
	
	@Autowired
	ProductRequestItemsRepository productRequestItemsRepository;
	
	
}
