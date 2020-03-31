package com.example.demo.dto;

import java.util.Date;

import com.example.demo.model.UserProfileModel;

public class MessageDto {
	private long id;
	private UserProfileDto sender;
	private UserProfileDto receiver;
	private String text;
	private Date creationdate;
	private boolean statusSender;
	private boolean statusReceive;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public UserProfileDto getSender() {
		return sender;
	}
	public void setSender(UserProfileDto sender) {
		this.sender = sender;
	}
	public UserProfileDto getReceiver() {
		return receiver;
	}
	public void setReceiver(UserProfileDto receiver) {
		this.receiver = receiver;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getCreationdate() {
		return creationdate;
	}
	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}
	public boolean isStatusSender() {
		return statusSender;
	}
	public void setStatusSender(boolean statusSender) {
		this.statusSender = statusSender;
	}
	public boolean isStatusReceive() {
		return statusReceive;
	}
	public void setStatusReceive(boolean statusReceive) {
		this.statusReceive = statusReceive;
	}
	
	
}
