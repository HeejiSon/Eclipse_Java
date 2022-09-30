package com.son.ab915.Avengers;

public abstract class Avengers {
	private String name;
	private int age;
	
	
	public Avengers() {
		// TODO Auto-generated constructor stub
	}


	public Avengers(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}
	
	public abstract void attack(); // 추상메소드 > class도 추상클래스가 되어야함
}
