package com.son.ab915.animal;

// 종, 나이
public abstract class Animal {
	private String kind;
	private int age; 
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String kind, int age) {
		super();
		this.kind = kind;
		this.age = age;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println(kind);
		System.out.println(age);
	}
	
	// abstract 메소드 : 미완성된 메소드(내용이 없음)
	// 하위클래스에서 반드시!! 오버라이딩을 통해 넣어주어야함
	
	// abstract 메소드가 하나라도 있으면
	// abstract Class 이거나 interface여야 함!
	public abstract void roar(); 
		
	
	
}
