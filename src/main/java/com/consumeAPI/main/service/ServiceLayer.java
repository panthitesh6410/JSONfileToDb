package com.consumeAPI.main.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.consumeAPI.main.model.UserModel;
import com.consumeAPI.main.repository.UserRepo;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ServiceLayer {
	
	@Autowired
	UserRepo repo;
	
	// FETCHING DATA FROM JSON FILE -
	public UserModel[] getallData() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		UserModel[] users = objectMapper.readValue(new File("src/main/resources/data.json"), UserModel[].class);
		
		// TO SAVE THIS JSON DATA FROM FILE INTO MYSQL DB...
		for(UserModel u: users) {
			repo.save(u);
		}
		
		return users;
	}
	
}
