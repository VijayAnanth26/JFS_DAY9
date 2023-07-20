package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepo extends JpaRepository<Authentication, Long> {
	    Authentication findByEmail(String email);

}
