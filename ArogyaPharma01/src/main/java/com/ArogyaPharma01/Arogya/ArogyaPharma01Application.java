package com.ArogyaPharma01.Arogya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.entity")
@EnableJpaRepositories(basePackages = "com.repository")
public class ArogyaPharma01Application {

	public static void main(String[] args) {
		SpringApplication.run(ArogyaPharma01Application.class, args);
		System.out.println("Server up!...");
	}

}
