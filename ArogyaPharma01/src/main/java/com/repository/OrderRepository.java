package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.orders;

@Repository
public interface OrderRepository extends JpaRepository<orders, Integer>{

}
