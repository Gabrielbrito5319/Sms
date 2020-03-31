package com.example.demo.dto;

import java.util.Date;

import com.example.demo.model.UserProfileModel;

public class ContactsDto {
	
	private long id;
	private UserDto profile; //id do profile
	private boolean status;
	private Date creation;
	private String message;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public UserDto getProfile() {
		return profile;
	}
	public void setProfile(UserDto profile) {
		this.profile = profile;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Date getCreation() {
		return creation;
	}
	public void setCreation(Date creation) {
		this.creation = creation;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
