package com.son.ecp915.human;

// Encapsulation (캡슐화)
//		멤버변수에 접근할 수 있는 통로!를 만들어서 그 통로에 안전장치를 하는 개념
//		즉! 외부에 노출할 필요가 없는 정보들을 캡슐처럼 감싸서 '은닉'하는 기능

public class Human {
	// 멤버변수들의 외부 노출을 제한하기 위한 private
	private String name;
	private int age;
	private double weight;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
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
		if (age < 0) {
			age *= -1; // age = age * -1
		}
		this.age = age;
	}

}
