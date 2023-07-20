package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController 
public class AuthController {
	@Autowired
    AuthService userService;

    @PostMapping("/register")
    public ResponseEntity<Authentication> registerUser(@RequestBody Authentication user) {
        // Validate the user data and register the user
        Authentication registeredUser = userService.registerUser(user);
        return ResponseEntity.ok(registeredUser);
    }

}
