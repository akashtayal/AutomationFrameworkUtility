package com.learning.api.jsonnode;

import java.util.Iterator;
import java.util.Map.Entry;

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
			if(node != null && (!node.isNull()))   // Null check. If node has null values it will not print.
				System.out.println(node.asText()); // ------Printing the field values--------//
		}

	}


	public void readingFieldNameAndValuesFromJsonNode(JsonNode node ) {

		Iterator<Entry<String,JsonNode>> it = node.fields();
		while(it.hasNext()) {

			Entry<String,JsonNode> entry = it.next();
			System.out.println(entry.getKey()+ "  : " + entry.getValue());
		}
	}

	public void readingFieldValueFromJsonNode(JsonNode node ) {

		Iterator<String> it = node.fieldNames();
		while(it.hasNext()) {
			String field= it.next();
			System.out.println(node.get(field));
		}
	}
	
	public String getJsonNodeFieldAtPath(JsonNode node, String path) {
		
		String str;
		str = node.at(path).asText();
		
		if(str.isEmpty() || str==null)
			return "";
		else 
			return str;
	
		
	}

}
