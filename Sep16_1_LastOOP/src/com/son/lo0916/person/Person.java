package com.son.lo0916.person;

import com.beaver.aug181.avengers.Avengers;

public class Person {
	private String name;
	private Avengers hero;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name) {
		super();
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void pick(Avengers a) {
		hero = a;
		System.out.println("등장!");
	}

	public void helpAAAAaa() {
		hero.attack();
	}
}
