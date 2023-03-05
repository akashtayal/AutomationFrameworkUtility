package com.learning.api.jsonparser;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class JsonParserRead {
	
	//List all token
	public void parsingJson(File file) throws JsonParseException, IOException {
		
		JsonFactory factory = new JsonFactory();
		JsonParser parser   = factory.createParser(file);
		JsonToken token;
		while(!parser.isClosed()) {
			token = parser.nextToken();
			System.out.println("JsonToken ="+ token);
		}
	}
	
	
	public void  parsingJsonPrintValues(File file) throws JsonParseException, IOException {
		
 		JsonFactory factory = new JsonFactory();
		JsonParser parser   = factory.createParser(file);
		JsonToken token;
		while(!parser.isClosed()) {
			
			token = parser.nextToken();
		
		if(token!=null) {	
			if(JsonToken.FIELD_NAME.equals(token)) {
				System.out.print("\n"+parser.getCurrentName() + " : " );
			}
			else {
				switch(token) {
				case VALUE_FALSE:
					System.out.print(parser.getBooleanValue());
					break;
				case VALUE_TRUE:
					System.out.print(parser.getBooleanValue());
					break;
				case VALUE_NUMBER_INT:
					System.out.print(parser.getLongValue());
					break;
				case VALUE_STRING:
					System.out.print(parser.getValueAsString());
					break;
				default:						
				}
			}
		}
		}
	}

}
