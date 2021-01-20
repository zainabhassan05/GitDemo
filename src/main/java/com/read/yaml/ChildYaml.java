package com.read.yaml;

public class ChildYaml {
	
	String name;
	String city;
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public String toString() {
		return "Child [name=" +name+", City=" +city+"]";
	}
}
