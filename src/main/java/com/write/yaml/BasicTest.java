package com.write.yaml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.yaml.snakeyaml.Yaml;

public class BasicTest {
	
	public static Student createStudent() {
		Student student = new Student();
		student.setLearn("Learning English");
		student.setAge(20);
		student.setInnovation("Yes they do");
		student.setSmile("Yes they can Smile");
		student.setBestCreature(true);
		return student;
	}
	public static void main(String[] args) {
		Student student = createStudent();
		Yaml yaml = new Yaml();
		String dataFile = "./files/student.yaml";
		String strFile = System.getProperty("user.dir")+dataFile;
		try {
			// dump method dump/write the whole student object into file
			yaml.dump(student, new FileWriter(new File(strFile)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
	}
}
