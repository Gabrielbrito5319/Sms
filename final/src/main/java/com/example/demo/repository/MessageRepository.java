package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.MessageModel;

public interface MessageRepository extends JpaRepository<MessageModel, Long>{
	
	
}
