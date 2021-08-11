package com.consumeAPI.main;

import java.io.File;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.consumeAPI.main.model.UserModel;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class ConsumeRestApplication {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		SpringApplication.run(ConsumeRestApplication.class, args);
	}
	
}
