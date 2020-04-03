package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.exceptions.BadRequestException;
import com.example.demo.exceptions.NotFoundException;
import com.example.demo.model.UserModel;
import com.example.demo.model.UserProfileModel;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	public void checkExistencia(UserModel user) {
		if(userRepository.findByEmail(user.getEmail())!= null){
			throw new BadRequestException("Usuario ja existente");
		}
	}
	
	public void checkCamposObrigatorios(UserModel user) {
		if(user.getFirstName().isEmpty()) {
			throw new BadRequestException("Primeiro nome não informado");
		}
		if(user.getEmail().isEmpty()) {
			throw new BadRequestException("Email não informado");
		}
		if(user.getPassword().isEmpty()) {
			throw new BadRequestException("Senha não informada");
		}
		if(user.getState().isEmpty()) {
			throw new BadRequestException("Estado não informado");
		}
		if(user.getCity().isEmpty()) {
			throw new BadRequestException("Cidade não informada");
		}
		if(user.getStreet().isEmpty()) {
			throw new BadRequestException("Nome da rua não informada");
		}
		if(user.getDateOfBirth()==null) {
			throw new BadRequestException("Data de nascimento não informada");
		}
	}
	
	@Override
	public List<UserModel> listUsers() {
		if (userRepository.findAll().size()== 0) {
			throw new NotFoundException("Não existem usuarios cadastrados");
			
		}
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void addUser(UserModel user) {
		// TODO Auto-generated method stub
		checkExistencia(user);//validar se ja existe
		checkCamposObrigatorios(user);//validar se ele tem algo vazio
		userRepository.save(user);
	}

	@Override
	public UserModel updateUser(UserModel user) {
		// TODO Auto-generated method stub
		checkCamposObrigatorios(user);
		if(userRepository.findById(user.getId())!=null) {
			return userRepository.save(user);
		}else {
			throw new NotFoundException("usuario não cadastrado");
		}
		

	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		if(userRepository.findById(id)!=null) {
			userRepository.deleteById(id);
		}
		throw new BadRequestException("usuario não existe");
	}


	@Override
	public UserModel findByUserName(String UserName) {
		// TODO Auto-generated method stub
		
		return null;
	}
	
	@Override
	public UserModel findByEmail(String email) {
		// TODO Auto-generated method stub
		if(userRepository.findByEmail(email)==null) {
			throw new NotFoundException("Usuario não existe");
		}
		return userRepository.findByEmail(email);
	}

	

	@Override
	public UserModel addProfile(UserProfileModel profile, long id) {
		// TODO Auto-generated method stub
		
		return null;
	}

	
}
