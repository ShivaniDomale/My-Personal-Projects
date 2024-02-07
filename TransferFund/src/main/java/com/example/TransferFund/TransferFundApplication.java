package com.example.TransferFund;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example.TransferFund")
@EnableJpaRepositories(basePackages = "com.example.TransferFund.repository")
@EntityScan(basePackages = "com.example.TransferFund.bean")
public class TransferFundApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransferFundApplication.class, args);
		System.out.println("Server up..!");
	}

}
