package com.basic.yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class BasicYaml {
	
	public static void main(String[] args) throws FileNotFoundException {
		BasicYaml obj = new BasicYaml();
		obj.stringToMap();
		obj.multipleStringLinestoMap();
		obj.yamlFileToMap();
	}
	
	public void stringToMap() {
		Yaml yaml = new Yaml();
		String str = "Hello: 25";
		// in one line it converts string into hashmap directly by load method
		Map<String, Integer> myMap = yaml.load(str); 
		Integer x = myMap.get("Hello");
		System.out.println(x);
	}	
	
	public void multipleStringLinestoMap() {
		Yaml yaml = new Yaml();
		//Read String as an Object
		String str = "name: Joe\n"+"phone: 111-111-1111\n"+"address: New York\n";
		Object obj = yaml.load(str);
		//Object type as a LinkedHashMap by default it convert to Linkedhashmap
		System.out.println("Object Type: "+obj.getClass());
		//Converting Object into Map
		Map<String,String> myMap = (Map<String,String>) obj;
		System.out.println("Name: "+myMap.get("name"));
		System.out.println(myMap);		
	}
	public void yamlFileToMap() throws FileNotFoundException {
		
		Yaml yaml = new Yaml();
		String filePath = "./files/basic.yaml";
		Map<String,String> myMap = yaml.load(new FileInputStream(new File(filePath)));
		System.out.println("Name: "+myMap.get("name"));
		System.out.println(myMap);
		
	}

}
