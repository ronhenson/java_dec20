package com.ss.dec10;



public class Person {
	private String firstName;
	private String lastName;
	private Integer age;
	private Boolean veteran;
	
	public Person(String firstName, String lastName, Integer age, Boolean veteran) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.veteran = veteran;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getVeteran() {
		return veteran;
	}

	public void setVeteran(Boolean veteran) {
		this.veteran = veteran;
	}
	
	
	
	
	
}
