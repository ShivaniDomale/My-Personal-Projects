package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
//	public String storeProduct(Product p) {
//		Optional<Product> op = productRepository.findById(p.getProductid());
//		if(op.isPresent()) {
//			return "Product ID already available....";
//		}else {
//			productRepository.save(p);
//			return "Product details stored successfully";
//		}
//	}
	
	public List<Product> getAllProductDetails() {
		return productRepository.findAll();
	}
	
	
//	public String updateProductDetails(Product pr) {
//		Optional<Product> op = productRepository.findById(pr.getProductid());
//		if(op.isPresent()) {
//			Product p = op.get();
//			p.setPrice(pr.getPrice());
//			p.setProductquantity(pr.getProductquantity());
//			p.setProductname(pr.getProductname());
//			p.setPcid(pr.getPcid());
//			productRepository.saveAndFlush(p);
//			return "Product details updated successfully";
//		}else {
//			return "Product not exists";
//		}
//	}
}
