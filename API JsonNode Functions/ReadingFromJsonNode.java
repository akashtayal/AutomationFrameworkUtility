package com.learning.api.jsonnode;

import java.util.Iterator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class ReadingFromJsonNode {

	String str;
	/*
	 * 			It is very useful when you don't know the about Json what it looks like.
	 * 			
	 * 			Add operations as per your need.
	 */
	public void traverseJson(JsonNode node) {
		
		if(node.isArray()) {
			ArrayNode arrayNode = (ArrayNode) node;			
			for(int index=0;index<arrayNode.size();index++) {
				traverseJson(arrayNode.get(index));
			}	
		}
		else if(node.isObject()) {
			Iterator<String> fieldNames= node.fieldNames();
			
			while(fieldNames.hasNext()) {
				str = fieldNames.next();
				System.out.println(str);  // -------Printing the Field --------- // 
				traverseJson(node.get(str));
			}
		}
		else {
			System.out.println(node.asText()); // ------Printing the field values--------//
		}
		
	}
	
	
}
