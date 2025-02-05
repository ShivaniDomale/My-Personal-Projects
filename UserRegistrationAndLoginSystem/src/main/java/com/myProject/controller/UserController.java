package com.myProject.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.myProject.entity.User;
import com.myProject.service.UserService;


@Controller
@SessionAttributes("loggedInUser")  // Store logged-in user in the session
public class UserController {
	
	@Autowired
    private UserService userService;

	  @GetMapping("/register")
	    public String showRegistrationForm(Model model) {
	        model.addAttribute("user", new User());
	        return "register";
	    }

	    @PostMapping("/register")
	    public String register(@ModelAttribute User user, Model model) {
	        try {
	            userService.registerUser(user);
	            return "redirect:/login"; // Redirect to login page after successful registration
	        } catch (Exception e) {
	            model.addAttribute("errorMessage", "Registration failed: " + e.getMessage());
	            return "register"; // Stay on the registration page and show an error message
	        }
	    }

	    @GetMapping("/login")
	    public String showLoginForm() {
	        return "login"; // Just return the login form
	    }

	    @PostMapping("/login")
	    public String login(@ModelAttribute("user") User user, HttpSession session) {
	        // Call your login logic here
	        User validUser = userService.loginUser(user.getEmail(), user.getPassword());
	        if (validUser != null) {
	            // Store the valid user in the session
	            session.setAttribute("loggedInUser", validUser);
	            return "redirect:/adminIndex";
	        }
	        return "redirect:/login?error=true";
	    }
    
    @GetMapping("/test")
    public String testPage() {
        return "adminIndex";
    }
}
