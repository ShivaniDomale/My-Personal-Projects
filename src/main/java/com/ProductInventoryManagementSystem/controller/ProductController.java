package com.ProductInventoryManagementSystem.controller;

import com.ProductInventoryManagementSystem.service.ProductService;
import com.ProductInventoryManagementSystem.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	
	/*APIs that are working properly in postman!
	 * 
	 * Save
	 * Get All
	 * Get By ID
	 * Put - Update
	 * Delete
	 * 
	 * All done!
	*/
    @Autowired
    private ProductService productService;
    
    @GetMapping("/all")
    public List<Product> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return products;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}
