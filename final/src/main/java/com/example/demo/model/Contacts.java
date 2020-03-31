package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "contacts")
public class Contacts implements Serializable{

	private long id;
	private String nameContact;
	private String phoneNumber;
	private UserProfileModel user;
	public Contacts() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column (name= "namecontact")
	public String getNameContact() {
		return nameContact;
	}
	public void setNameContact(String nameContact) {
		this.nameContact= nameContact;
	}
	
	@Column (name = "user")
	public UserProfileModel getUser() {
		return user;
	}
	public void setUser(UserProfileModel user) {
		this.user = user;
	}
	
	
	
}
