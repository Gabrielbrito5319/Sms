package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Stories implements Serializable{
	
	private long id;
	private UserProfileModel profile; //id do profile
	private boolean status;
	private Date creation;
	private String message;
	
	public Stories() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "profileId", nullable = false)
	public UserProfileModel getProfile() {
		return profile;
	}

	public void setProfile(UserProfileModel profile) {
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
