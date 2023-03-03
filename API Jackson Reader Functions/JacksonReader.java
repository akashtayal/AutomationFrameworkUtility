package com.learning.api.jackson;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonReader {
	
	/*
	String json2 ="{ \"userName\" : \"akashtayal999\", \"firstName\" : \"akash\",\"lastName\" : \"tayal\", \"address\": { \"houseNo\": 5,\"streetName\": \"avantika\"  } }";
	*/
	
	/*
	 *
	 Sample Json created for Example
	 {
	"userName": "testuser",
	"firstName": "akash",
	"lastName": "tayal",
	"phoneNo":[	{
			"number": 9899456123
	}, 	{
			"number": 9899454123
	}	],
	"emailID": "akashtayal999@gmail.com",
	"address": {
		"houseNo": 23,
		"streetName": "kamla, road",
		"city":"kavinagar",
		"state": "uttar pradesh",
		"pin":201002
		
	}	
}
	 */
	
	
	public Object readJsonFromStringJson(String json, Class classVar) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, false);
		
		return objectMapper.readValue(json, classVar);
		
	}

	
	public Object readJsonFromFile(File file, Class classVar) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, false);
		
		return objectMapper.readValue(file, classVar);
		
	}

	public Object readJsonFromFilePath(String filePath, Class classVar) throws JsonParseException, JsonMappingException, IOException {
		
		File file = new File(filePath);
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, false);
		
		return objectMapper.readValue(file, classVar);
		
	}
	
	//Refer to the file attached AllUserDetails.json
	public Object[] readJsonArrayToObjectArray(File file, Class classVar) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, false);
		
		return objectMapper.readValue(file, classVar.arrayType());
		
	}
	
	//Refer to the file attached UserDetails.json
		public Map<String,Object> readJsonArrayToMap(File file) throws JsonParseException, JsonMappingException, IOException {
			
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			objectMapper.configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, false);
			return objectMapper.readValue(file, new TypeReference<Map<String,Object>>() {});
			
			
		}
	
}
