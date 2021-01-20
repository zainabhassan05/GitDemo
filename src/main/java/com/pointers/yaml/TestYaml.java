package com.pointers.yaml;

import java.io.File;
import java.io.IOException;

import org.yaml.snakeyaml.Yaml;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class TestYaml {

	public static void main(String[] args) {
		
		ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
		PlaceHolder placeHolder = null;
		File file = new File("./files/person.yaml");
		try {
			placeHolder = objectMapper.readValue(file, PlaceHolder.class);		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(placeHolder.getPerson().getFirstname());
		System.out.println(placeHolder.getPerson().getSignature());
		System.out.println(placeHolder.getPerson().getFavNum());
		System.out.println(placeHolder.getPerson().getHobbies());
		System.out.println(placeHolder.getPerson().getMovies().get(0));
		System.out.println(placeHolder.getPerson().getFriends());
		System.out.println("Friend: "+placeHolder.getPerson().getFriends().get(0).getName());
		System.out.println(placeHolder.getPerson().getSummary());
	}
}
