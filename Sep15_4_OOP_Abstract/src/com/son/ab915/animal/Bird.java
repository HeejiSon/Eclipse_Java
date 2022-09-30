package com.son.ab915.animal;

import com.son.ab915.bite.Bite;

// 상속 : 클래스끼리 다중상속이 X (1 대 1)

public class Bird extends Animal implements Bite{ /* , fly, eat, ... */
	private int wing;
	
	// 생성자 
	public Bird() {
		// TODO Auto-generated constructor stub
	}

	public Bird(String kind, int age, int wing) {
		super(kind, age);
		this.wing = wing;
	}
	
	@Override
	public void roar() {
		System.out.println("짹짹");
	}
	
	@Override
	public void bite() {
		System.out.println("새는 부리로 사람을 찢어!");
		
	}
}
