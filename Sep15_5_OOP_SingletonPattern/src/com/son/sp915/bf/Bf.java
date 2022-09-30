package com.son.sp915.bf;

public class Bf {
	private String name;
	private int age;
	private String nickname;
	
	private static final Bf BF = new Bf("방찬우", 26, "방찬깅");
	
	public Bf() {
		// TODO Auto-generated constructor stub
	}

	public Bf(String name, int age, String nickname) {
		super();
		this.name = name;
		this.age = age;
		this.nickname = nickname;
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

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public static Bf getBf() {
		return BF;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(nickname);
	}
}
