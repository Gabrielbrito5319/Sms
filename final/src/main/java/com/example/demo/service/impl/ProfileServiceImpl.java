package com.example.demo.service.impl;

import java.util.List;

import com.example.demo.model.Contacts;
import com.example.demo.model.MessageModel;
import com.example.demo.model.Stories;
import com.example.demo.model.UserProfileModel;
import com.example.demo.service.ProfileService;

public class ProfileServiceImpl implements ProfileService {

	@Override
	public List<UserProfileModel> listUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserProfileModel updateUserProfile(UserProfileModel user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserProfileModel deleteUserProfile(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserProfileModel fingByUserName(String UserName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contacts> listContacts(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contacts addContact(Contacts contato) {
		// TODO Auto-generated method stub
		return null;
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