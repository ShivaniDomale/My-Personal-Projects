package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Productrequest;

@Repository
public interface ProductRequestRepository extends JpaRepository<Productrequest, Integer>{

}
