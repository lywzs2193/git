package org.dubbo.model;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5849444511168572401L;

	private int age;
	private String name;
	private String sex;
	
	public User() {
		
	}
	
	public User(int age, String name, String sex) {
		super();
		this.age = age;
		this.name = name;
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return "姓名："+ this.name + "," + this.sex + "," + this.age;
	}
}
