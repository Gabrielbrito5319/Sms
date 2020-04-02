package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.UserModel;
import com.example.demo.model.UserProfileModel;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	public void checkExistencia(UserModel user) {
		if(userRepository.findByEmail(user.getEmail())!= null){
			throw
		}
	}
	@Override
	public List<UserModel> listUsers() {
		if (userRepository.findAll().size()== 0) {
			return null;
		}
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void addUser(UserModel user) {
		// TODO Auto-generated method stub
		//validar se ja existe
		//validar se ele tem algo vazio
		
		userRepository.save(user);
	}

	@Override
	public void updateUser(UserModel user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub

	}


	@Override
	public UserModel fingByUserName(String UserName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserModel addProfile(UserProfileModel profile, long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
