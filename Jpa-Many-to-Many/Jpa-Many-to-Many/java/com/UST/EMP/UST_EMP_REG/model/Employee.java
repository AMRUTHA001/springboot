package com.UST.EMP.UST_EMP_REG.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//import javax.persistence.Entity;


@Entity
public class Employee {
	@Id
	private String name;
	private String email;
	private int experience;
	private String Developer;
	
	public Employee() {
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getDeveloper() {
		return Developer;
	}
	public void setDeveloper(String developer) {
		Developer = developer;
	}
	

}
