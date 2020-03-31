package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Contacts;
import com.example.demo.model.MessageModel;
import com.example.demo.model.Stories;
import com.example.demo.model.UserProfileModel;

public interface ProfileService {
	
public List<UserProfileModel> listUsers();
	
	
	public UserProfileModel updateUserProfile (UserProfileModel user);
	
	public void deleteUserProfile (Long id);

	public UserProfileModel fingByUserName (String UserName);
	
	public List<Contacts> listContacts (Long id);
	
	public Contacts addContact (long id, Contacts contato);
	
	public void deleteContact (String numero);
	
	public List<Stories> listStories (long id);
	
	public void deleteAllStoris (UserProfileModel profile);
	
	public List<MessageModel> listAllMessage (long id);
	
	public List<MessageModel> listChatMessage (long idUser, long idContact);
	
	public MessageModel sendMessage (long idSender, long idReceiver);
	
	public void deleteAllMessage (long id);
	
	public void deleteOneMessage (long idUser, MessageModel message);
	

}
