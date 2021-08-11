package com.consumeAPI.main.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.consumeAPI.main.model.UserModel;
import com.consumeAPI.main.service.ServiceLayer;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class HomeController {
	
	@Autowired
	ServiceLayer serviceLayer;
	
	@GetMapping("/data")
	@ResponseBody
	public UserModel[] allData() throws JsonParseException, JsonMappingException, IOException {
		return serviceLayer.getallData();
	}
}
