package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Product;
import com.entity.ProductCategory;
import com.service.ProductService;

@RestController
@RequestMapping("Product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
	
//	@PostMapping(value = "StoreProduct",consumes = MediaType.APPLICATION_JSON_VALUE)
//	public String storeProduct(@RequestBody Product p) {
//		return productService.storeProduct(p);
//	}
//	
//	@PutMapping(value = "updateProduct",consumes = MediaType.APPLICATION_JSON_VALUE)
//	public String updateProduct(@RequestBody Product product) {
//		return productService.updateProductDetails(product);
//	}
	
	//1.The pharmacist wants to check availability of medicines and other pharmacy products. 
	@GetMapping(value = "findAllProduct",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> findAllProduct() {
		return productService.getAllProductDetails();
	}
	
	//2.The pharmacist also wants to receive notifications regarding low stock products @ out of stock products every day.
	@GetMapping(value = "OutOfStock",produces = MediaType.APPLICATION_JSON_VALUE)
	public String OutOfStock() {
		return null;
	}
	
	//3.The pharmacist needs to generate bills for every order.
	@GetMapping(value = "GetTotalPrice",produces = MediaType.APPLICATION_JSON_VALUE)
	public int GetTotalPrice() {
		return 0;
	}
	
	//4.	The pharmacist need check online orders from customers and generate bill and deliver products through delivery boys. 
	@GetMapping(value = "CheckOrders",produces = MediaType.APPLICATION_JSON_VALUE)
	public int CheckOrders() {
		return 0;
	}
	
	//5.After delivery, the pharmacist should update and confirm the delivery.
	
	//6.The pharmacist also wants to get list of customer details, order details and available stock details. 
	

	
	
	
}
