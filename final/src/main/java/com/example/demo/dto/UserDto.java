package com.example.demo.dto;
//model resotorio service dto

import java.util.ArrayList;
import java.util.Date;

import com.example.demo.model.UserModel;

public class UserDto {

	//PQ DTO N PEGA TUDO ?@
	
	private String firstName;
	
	private String lastName;
	
	private Date dateOfBirth;
	
	ArrayList<UserModel> contacts;
	
	private String address;
	
	private String email;
	
	private String password;
	
	private boolean status;

	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public ArrayList<UserModel> getContacts() {
		return contacts;
	}

	public void setContacts(ArrayList<UserModel> contacts) {
		this.contacts = contacts;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}
