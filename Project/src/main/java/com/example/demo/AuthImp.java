package com.example.demo;

public interface AuthImp {
	Authentication registerUser(Authentication user);
    Authentication findUserByEmail(String email);
}
