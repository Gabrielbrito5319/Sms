package com.example.demo.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ModelMapperComponent {

	public static final ModelMapper modelMapper= new ModelMapper();
}
