package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts, Long>{

}
