package com.open.ebanking.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author orsys
 *
 */

@Entity
public class Client {

	@Id     
	@GeneratedValue(strategy = GenerationType.AUTO)     
	private long id; 
	//declaration des attributs
	private String name;     
	private String email;	
	private int age;
	private String sex;
	
	
	
	//declaration des methodes
	public long getId() {
		return id;
	
}
	/**
	 * 
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex; 
	}
	
	
	
	
	
	
	
	
}
