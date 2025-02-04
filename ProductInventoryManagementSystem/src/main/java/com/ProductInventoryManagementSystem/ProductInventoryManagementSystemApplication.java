package com.ProductInventoryManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.ProductInventoryManagementSystem.entity")
@EnableJpaRepositories(basePackages = "com.ProductInventoryManagementSystem.repository")
@ComponentScan(basePackages = {
    "com.ProductInventoryManagementSystem.controller", 
    "com.ProductInventoryManagementSystem.service"
})
public class ProductInventoryManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductInventoryManagementSystemApplication.class, args);
	}

}
