package com.example.EmployeeSecurityJwt.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_tb1")
public class User {
	@Id
	private int id;
	private String username;
	private String password;
	private String email;
	private String phnnumber;
	public User(int id, String username, String password, String email, String phnnumber) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phnnumber = phnnumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return username;
	}
	public void setName(String name) {
		this.username = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhnnumber() {
		return phnnumber;
	}
	public void setPhnnumber(String phnnumber) {
		this.phnnumber = phnnumber;
	}
	public User() {
		
	}

}
