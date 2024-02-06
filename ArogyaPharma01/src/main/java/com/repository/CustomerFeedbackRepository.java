package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Customerfeedback;

@Repository
public interface CustomerFeedbackRepository extends JpaRepository<Customerfeedback, Integer>{

}
