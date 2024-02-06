package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.ProductRequestItems;

@Repository
public interface ProductRequestItemsRepository extends JpaRepository<ProductRequestItems, Integer>{

}
