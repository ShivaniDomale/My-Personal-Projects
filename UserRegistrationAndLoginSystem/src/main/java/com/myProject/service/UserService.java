package com.myProject.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myProject.entity.User;
import com.myProject.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public void registerUser(User user) {
        // Check if the email already exists
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email already registered");
        }
        userRepository.save(user);
    }

    public User loginUser(String email, String password) {
        // Find user by email
        Optional<User> userOptional = userRepository.findByEmail(email);

        // Check if user exists and the password matches
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            if (user.getPassword().equals(password)) { // Compare plain-text passwords
                return user; // Return authenticated user
            }
        }
        return null; // Authentication failed
    }

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
    }

}
