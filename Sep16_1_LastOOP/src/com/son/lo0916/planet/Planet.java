package com.son.lo0916.planet;

import com.son.lo0916.person.Person;

public class Planet {
	private String name;
	private int size;
	private boolean visivle;
	
	public Planet() {
		// TODO Auto-generated constructor stub
	}
	
	public Planet(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isVisivle() {
		return visivle;
	}

	public void setVisivle(boolean visivle) {
		this.visivle = visivle;
	}

	public void add(Person p) {
		System.out.printf("%s에 %s 이/가 입주!", name, p.getName());
	}
}
