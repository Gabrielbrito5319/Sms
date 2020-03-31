package com.example.demo.dto;
//model resotorio service dto

import java.util.ArrayList;
import java.util.Date;

import com.example.demo.model.UserModel;
import com.example.demo.model.UserProfileModel;

public class UserDto {
	
	private long id;	
	private String firstName;	
	private String lastName;	
	private Date dateOfBirth;	
	//ArrayList<UserModel> contacts;
	private String address;
    private String street;
    private String city;
    private String state;
    private String country;
	private String email;	
	private String password;	
	private boolean status;
	private UserProfileDto profile;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
	public UserProfileDto getProfile() {
		return profile;
	}
	public void setProfile(UserProfileDto profile) {
		this.profile = profile;
	}
	
	
	
	
	
}
