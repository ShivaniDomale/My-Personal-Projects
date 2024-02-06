package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Supplyoffice;

@Repository
public interface SupplyOfficeRepository extends JpaRepository<Supplyoffice, Integer>{

}
