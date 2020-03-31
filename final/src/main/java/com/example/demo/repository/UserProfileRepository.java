package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.UserProfileModel;

public interface UserProfileRepository extends JpaRepository<UserProfileModel, Long> {
	
	public UserProfileModel findByUserName(String UserName);
	
}
