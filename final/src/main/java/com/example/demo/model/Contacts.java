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
	private UserProfileModel owner;
	private UserProfileModel friend;
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
	
	@Column (name = "owner")
	public UserProfileModel getOwner() {
		return owner;
	}
	public void setOwner(UserProfileModel owner) {
		this.owner = owner;
	}
	@Column (name = "friend")
	public UserProfileModel getFriend() {
		return friend;
	}
	public void setFriend(UserProfileModel friend) {
		this.friend = friend;
	}
	
	
	
}
