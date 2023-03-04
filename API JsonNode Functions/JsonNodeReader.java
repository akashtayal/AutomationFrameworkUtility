package com.learning.api.jsonnode;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonNodeReader {

	public JsonNode readJsonFromString(String json) throws IOException {

		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readTree(json);
	}
	
	public JsonNode readJsonFromFile(File file) throws IOException {

		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readTree(file);
	}



}
