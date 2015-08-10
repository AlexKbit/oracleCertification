package com.mytest.dto;

public class User {

	private int id;
	private String name;
	private String surname;
	private String password;
	private String email;
	
	public User(String name, String surname, String password, String email) {
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.email = email;
	}
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
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
	
	public String toString() {
		return "[" + id + "]" + name + "|" + surname + "|" + email +"| ["+password+"]";
	}
	
	public static User create(String name, String surname, String password, String email) {
		return new User(name, surname, password, email);
	}
	
	
}
