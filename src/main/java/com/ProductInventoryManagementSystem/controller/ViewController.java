package com.ProductInventoryManagementSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
	
    @GetMapping("/")
    public String homePage() {
        return "index"; // This will return index.html from src/main/resources/templates/
    }
}
