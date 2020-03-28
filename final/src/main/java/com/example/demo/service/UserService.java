package com.example.demo.service;

import java.util.List;

import com.example.demo.model.UserModel;

public interface UserService {
	
	public List<UserModel> listUsers();
	
	public void addUser(UserModel user);
	
	public void updateUser(UserModel user);
	
	public void deleteUser (Long id);
	
	public UserModel addProfile(UserModel user);

	public UserModel fingByUserName (String UserName);
}
