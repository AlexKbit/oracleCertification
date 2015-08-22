package com.mytest.dto;

public class User implements Comparable<User>{

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
	
	public static User create(Integer id, String name, String surname, String password, String email) {
		User user = new User(name, surname, password, email);
		user.setId(id);
		return user;
	}
	
	@Override
	public boolean equals(Object object) {
		if (object == null) return false;
		if (object.hashCode() != this.hashCode()) return false;
		if (object == this) return true;
		User user = (User) object;
		
		return user.id == this.id && this.email.equals(user.email)
				&& this.name.equals(user.name) && this.password.equals(user.password)
				&& this.email.equals(user.email);	
	}
	
	@Override
	public int hashCode() {
		return id + name.length() + surname.length() + password.length();		
	}

	@Override
	public int compareTo(User o) {
		if (this.id == o.id)
			return 0;
		if (this.id > o.id)
			return 1;
		else
			return -1;		
	}
	
}
