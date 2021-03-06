package com.example.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name = "profile")
public class UserProfileModel implements Serializable{
	
	private long id;
	private String userName;
	private String phoneNumber;
	private byte[] image;
	private List<Contacts> contats;
	private List<MessageModel> message;
	private List<Stories> stories;	
	private UserModel user;
	private boolean status;


	
	
	public UserProfileModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Id
	@Column (name= "id")
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	@NotNull
	@Size(max = 100)
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	@NotNull
	@Size(max = 13)
	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@OneToOne
	@MapsId // estou utizando o ID do user como ID de profile
	public UserModel getUser() {
		return user;
	}


	public void setUser(UserModel user) {
		this.user = user;
	}

	@Column(name= "image")
	public byte[] getImage() {
		return image;
	}


	public void setImage(byte[] image) {
		this.image = image;
	}

	@OneToMany(mappedBy = "userprofile", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	public List<Contacts> getContats() {
		return contats;
	}

	public void setContats(List<Contacts> contats) {
		this.contats = contats;
	}

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	public List<MessageModel> getMessage() {
		return message;
	}


	public void setMessage(List<MessageModel> message) {
		this.message = message;
	}

	@OneToMany(mappedBy = "userprofile", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	public List<Stories> getStories() {
		return stories;
	}


	public void setStories(List<Stories> stories) {
		this.stories = stories;
	}

	@Column(name = "status")
	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}
	public void addContact(Contacts contact) {
		contats.add(contact);
	}
	
}
