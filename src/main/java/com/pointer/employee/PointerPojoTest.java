package com.pointer.employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.yaml.snakeyaml.Yaml;

public class PointerPojoTest {

	public static void main(String[] args) throws IOException {
		
		Yaml yaml = new Yaml();
		String file = "./files/pointer.yml";
		PointerPojo obj= yaml.loadAs(new FileReader(new File(file)), PointerPojo.class);
		System.out.println(obj.getEmployee1().getOfficialname());
		System.out.println(obj.getEmployee1().toString());
		System.out.println(obj.toString());
	}
}
