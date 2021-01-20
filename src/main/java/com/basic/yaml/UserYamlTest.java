package com.basic.yaml;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
//import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class UserYamlTest {
	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
		ReadUser user=null;
		File file = new File("./files/read_user_jackson.yaml");
		try {
			// in Snakeyaml similar method loadAs = readValue
			user = objectMapper.readValue(file, ReadUser.class);		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
		}
		System.out.println(user.getAge());
		System.out.println(user.getName());
		System.out.println(user.getAddress());
		System.out.println(user.getAddress().get("city"));
		System.out.println(user.getRoles());
		System.out.println(user.getRoles().get(0));
		
	}
	

}
