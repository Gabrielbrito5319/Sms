package com.example.demo.mapper;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.example.demo.dto.UserDto;
import com.example.demo.model.UserModel;
import com.example.demo.model.UserProfileModel;

@Component
public class ModelMapperComponent {

	public static final ModelMapper modelMapper= new ModelMapper();
	
	@PostConstruct
	private void configureMapper() {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        
        modelMapper.addMappings(
                new PropertyMap<UserModel, UserDto>(){
                	 @Override
                     protected void configure() {
                     	skip().setId(source.getId());
                     	map().setFirstName(source.getFirstName());
                     	map().setLastName(source.getLastName());	
                    	map().setDateOfBirth(source.getDateOfBirth());	
                        map().setAddress(source.getAddress()); 
                        map().setStreet(source.getStreet()); 
                        map().setCity(source.getCity()); 
                        map().;
                         country;
                    	 email;	
                    	 password;	
                    	 status;
                    	 profile;
                     	map().setEmail(source.getEmail());
                     	map().setName(source.getName());
                     	map().setUsername(source.getUsername());
                     	when(Conditions.isNotNull()).map().getUserProfileDto().setId(source.getProfileImageModel().getId());
                     	when(Conditions.isNotNull()).map().getUserProfileDto().setImage(source.getProfileImageModel().getImage());
                     	map().setPassword(null);
                     	skip().setContacts(null);
                     	skip().setMessages(null);
                     	skip().setStories(null);
                     }
                });
}
