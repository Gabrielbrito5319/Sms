package com.example.demo.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.sun.istack.NotNull;
//literalmente a conversa salva ! quando um quiser sair da conversa n apaga nada.
@Entity
@Table(name = "chat")
public class ChatModel {
	
	@NotNull
	private ArrayList<SmsModel> conversation;
	
	@NotNull
	@Column(name = "user")
	private UserModel user;
	
	@NotNull
	@Column(name = "contact")
	private UserModel contact; //ip do remetente final
	
	
	public ChatModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<SmsModel> getConversation() {
		return conversation;
	}
	public void setConversation(ArrayList<SmsModel> conversation) {
		this.conversation = conversation;
	}
	public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}
	public UserModel getContact() {
		return contact;
	}
	public void setContact(UserModel contact) {
		this.contact = contact;
	}
	
}
