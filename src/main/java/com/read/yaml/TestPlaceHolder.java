package com.read.yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.yaml.snakeyaml.Yaml;

public class TestPlaceHolder {
	
	public static void main(String[] args) {
		String path = "./files/child.yml";
		Yaml yaml = new Yaml();
		Placeholder placeholder = null;
		try {
			// Instead of converting to Map object here convert it to Class Object
			// Reference of Placeholder class
			placeholder=yaml.loadAs(new FileReader(new File(path)), Placeholder.class);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(placeholder);
		System.out.println(placeholder.getChild().get(1).getCity());
		
	}

}
