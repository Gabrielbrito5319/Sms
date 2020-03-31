package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Contacts;
import com.example.demo.model.MessageModel;
import com.example.demo.model.Stories;
import com.example.demo.model.UserProfileModel;
import com.example.demo.repository.ContactsRepository;
import com.example.demo.repository.MessageRepository;
import com.example.demo.repository.StoriesRepository;
import com.example.demo.repository.UserProfileRepository;
import com.example.demo.service.ProfileService;

public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private UserProfileRepository profileRepository;
	
	@Autowired
	private ContactsRepository contactsRepository;
	
	@Autowired
	private StoriesRepository storiesRepository;
	
	@Autowired
	private MessageRepository messageRepository;
	
	@Override
	public List<UserProfileModel> listUsers() {
		// TODO Auto-generated method stub
		
		return profileRepository.findAll();
	}

	@Override
	public UserProfileModel updateUserProfile(UserProfileModel user) {
		String userName = user.getUserName();
		profileRepository.findByUserName(userName);
		profileRepository.save(user);
		return null;
	}

	@Override
	public void deleteUserProfile(Long id) {
		// TODO Auto-generated method stub
		 profileRepository.deleteById(id);
	}

	@Override
	public UserProfileModel fingByUserName(String UserName) {
		// TODO Auto-generated method stub
		return profileRepository.findByUserName(UserName);
	}

	@Override
	public List<Contacts> listContacts(Long id) {
		// TODO Auto-generated method stub
		UserProfileModel profile = profileRepository.findById(id).get();
		return profile.getContats();
		
	}

	@Override
	public Contacts addContact(long id, Contacts contato) {
		// TODO Auto-generated method stub
		UserProfileModel profile = profileRepository.findById(id).get();
		 Arraylist<Contacts> contatos =profile.getContats();
		 
		;
	}
	
	@Override
	public void deleteContact(String numero) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Stories> listStories(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllStoris(UserProfileModel profile) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<MessageModel> listAllMessage(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MessageModel> listChatMessage(long idUser, long idContact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MessageModel sendMessage(long idSender, long idReceiver) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllMessage(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteOneMessage(long idUser, MessageModel message) {
		// TODO Auto-generated method stub

	}

	
}
