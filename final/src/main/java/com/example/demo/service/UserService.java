package com.example.demo.service;

import java.util.List;

import com.example.demo.model.UserModel;
import com.example.demo.model.UserProfileModel;

public interface UserService {
	
	public List<UserModel> listUsers();
	
	public void addUser(UserModel user);
	
	public UserModel updateUser(UserModel user);
	
	public void deleteUser (Long id);
	
	public UserModel addProfile(UserProfileModel profile, long id);

	public UserModel findByUserName (String UserName);

	public UserModel findByEmail (String email);
	
	
}
