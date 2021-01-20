package com.pointers.yaml;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Person {

	private String firstname;
	private String lastname;
	private Integer age;
	private String rating;
	private Double marks;
	private String brithday;
	private Boolean male;
	private int favNum;
	private List<String> hobbies = null;
	private List<String> movies = null;
	private List<Friend> friends = null;
	private String summary;
	private String signature;
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Double getMarks() {
	return marks;
	}
		
	public void setMarks(Double marks) {
		this.marks = marks;
	}
		
	public String getBrithday() {
		return brithday;
	}
		
	public void setBrithday(String brithday) {
		this.brithday = brithday;
	}
		
	public Boolean getMale() {
		return male;
	}
		
	public void setMale(Boolean male) {
		this.male = male;
	}
		
	public int getFavNum() {
		return favNum;
	}
		
	public void setFavNum(int favNum) {
		this.favNum = favNum;
	}
		
	public List<String> getHobbies() {
		return hobbies;
	}
		
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
		
	public List<String> getMovies() {
		return movies;
	}
		
	public void setMovies(List<String> movies) {
		this.movies = movies;
	}
		
	public List<Friend> getFriends() {
		return friends;
	}
		
	public void setFriends(List<Friend> friends) {
		this.friends = friends;
	}
		
	public String getSummary() {
		return summary;
	}
		
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	public String getSignature() {
		return signature;
	}
		
	public void setSignature(String signature) {
		this.signature = signature;
	}	

}
