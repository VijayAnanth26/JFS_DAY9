package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Authentication {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String username;
	    private String email;
	    private String phoneno;
	    private String password;
		public Authentication(Long id, String username, String email, String phoneno, String password) {
			super();
			this.id = id;
			this.username = username;
			this.email = email;
			this.phoneno = phoneno;
			this.password = password;
		}
		public Authentication() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhoneno() {
			return phoneno;
		}
		public void setPhoneno(String phoneno) {
			this.phoneno = phoneno;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
}
