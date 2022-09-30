package com.son.ab915.main;

import com.son.ab915.animal.Bird;

// Abstraction(추상화) : 공통의 속성이나 기능을 묶어서 이름을 붙이는 것!
public class AMain {
	public static void main(String[] args) {
		Bird b = new Bird("새", 93, 3);
		b.printInfo();
		b.roar();
		b.bite();
	}
}
