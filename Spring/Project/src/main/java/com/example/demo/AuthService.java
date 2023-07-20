package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AuthService {
	@Autowired
    AuthRepo userRepository;

    public Authentication registerUser(Authentication user) {
        // Implement registration logic, including password hashing and validation
        // Save the user to the repository
        return userRepository.save(user);
    }

    public Authentication findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
