package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Customerfeedback;
import com.repository.CustomerFeedbackRepository;

@Service
public class CustomerFeedbackService {

	@Autowired
	CustomerFeedbackRepository custoomerFeedbackRepository;



	public String GiveFeedback(Customerfeedback feedback) {
		Optional<Customerfeedback> op = custoomerFeedbackRepository.findById(feedback.getFid());
		if(op.isPresent()) {
			return "Feedback Already Available";
		}
		else {
			custoomerFeedbackRepository.save(feedback);
			return "Feedback Stored Succesfully...";
		}
	}

	
}
