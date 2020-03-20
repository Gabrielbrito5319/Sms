package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table (name= "menssage")
public class MessageModel implements Serializable {
	
	
	private long id;
	private UserProfileModel sender;
	private UserProfileModel receiver;
	private String text;
	private Date creationdate;
	private boolean statusSender;
	private boolean statusReceive;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sender", nullable = false)
	public UserProfileModel getSender() {
		return sender;
	}
	public void setSender(UserProfileModel sender) {
		this.sender = sender;
	}
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "receiver", nullable = false)
	public UserProfileModel getReceiver() {
		return receiver;
	}
	public void setReceiver(UserProfileModel receiver) {
		this.receiver = receiver;
	}
	
	@Column(name= "text")
	@NotNull
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	@Column(name= "statusSender")
	@NotNull
	public boolean isStatusSender() {
		return statusSender;
	}
	public void setStatusSender(boolean statusSender) {
		this.statusSender = statusSender;
	}
	@Column (name= "statusReceiver")
	@NotNull
	public boolean isStatusReceive() {
		return statusReceive;
	}
	public void setStatusReceive(boolean statusReceive) {
		this.statusReceive = statusReceive;
	}
	@PrePersist
	public void prePersist() {//Este metodo acontece quando esta classe é criada e ela esta instanciando uma data
		creationdate = new Date();
	}
	
}
