package com.ProductInventoryManagementSystem.repository;

import com.ProductInventoryManagementSystem.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
