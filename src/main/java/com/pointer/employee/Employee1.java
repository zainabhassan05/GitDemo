package com.pointer.employee;

import java.util.List;

public class Employee1 {
	
	private String name;	
	private Integer age;	
	private List<String> hobbies = null;	
	private String officialname;
	
	public String getName() {
		return name;
	}
		
	public void setName(String name) {
		this.name = name;
	}
		
	public Integer getAge() {
		return age;
	}
		
	public void setAge(Integer age) {
		this.age = age;
	}
		
	public List<String> getHobbies() {
		return hobbies;
	}
		
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
		
	public String getOfficialname() {
		return officialname;
	}
		
	public void setOfficialname(String officialname) {
		this.officialname = officialname;
	}
	@Override
	public String toString() {
		return "Employee1 [name: "+name+", age: "+age+", hobbies: "+hobbies+", official name: "+officialname+"]";
	}
}