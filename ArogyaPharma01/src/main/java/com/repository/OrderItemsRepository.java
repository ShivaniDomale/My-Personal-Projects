package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Order_Items;

@Repository
public interface OrderItemsRepository extends JpaRepository<Order_Items, Integer>{

}
