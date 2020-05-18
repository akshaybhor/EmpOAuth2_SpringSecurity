package com.example.secureapp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
	
	User findbyUsername(String username);

}
