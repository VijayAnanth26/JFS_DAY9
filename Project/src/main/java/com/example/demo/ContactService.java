package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
	@Autowired
	ContactRepo Repo;
	public String updateDetails(Contact a) {
		Repo.save(a);
		return "Updated";
	}
	public String deletedetails(Long id) {
		Repo.deleteById(id);
		return "Deleted";
	}
}
