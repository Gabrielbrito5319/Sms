package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.UserModel;


public interface UserRepository extends JpaRepository<UserModel, Long> {

	
	UserModel findByEmail(String email);
	UserModel findByFirstName(String userName);
}
