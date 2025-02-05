package com.myProject.UserRegistrationAndLoginSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.myProject.entity")
@EnableJpaRepositories(basePackages = "com.myProject.repository") // Enable scanning for JPA repositories
@ComponentScan(basePackages = {
    "com.myProject.controller", 
    "com.myProject.service", 
    "com.myProject.repository",
    "com.myProject.entity"
})
public class UserRegistrationAndLoginSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationAndLoginSystemApplication.class, args);
	}

}
