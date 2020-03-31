package com.example.demo.dto;

import java.util.ArrayList;
import java.util.Date;

import com.example.demo.model.MessageModel;
import com.example.demo.model.Stories;
import com.example.demo.model.UserModel;
import com.example.demo.model.UserProfileModel;

public class UserProfileDto {
	
	private long id;
	private String userName;
	private String phoneNumber;
	private String image;
	private ArrayList<ContactsDto> contats;
	private ArrayList<MessageDto> message;
	private ArrayList<StoriesDto> stories;	
	private UserDto user;
	private boolean status;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public ArrayList<ContactsDto> getContats() {
		return contats;
	}
	public void setContats(ArrayList<ContactsDto> contats) {
		this.contats = contats;
	}
	public ArrayList<MessageDto> getMessage() {
		return message;
	}
	public void setMessage(ArrayList<MessageDto> message) {
		this.message = message;
	}
	public ArrayList<StoriesDto> getStories() {
		return stories;
	}
	public void setStories(ArrayList<StoriesDto> stories) {
		this.stories = stories;
	}
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}
