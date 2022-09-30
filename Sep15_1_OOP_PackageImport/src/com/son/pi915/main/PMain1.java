package com.son.pi915.main;

import com.son.pi915.product.Computer;

public class PMain1 {
	// Product라는 Class를 생성해서 name, price >> 출력할 수 있도록 method 생성까지
	// Computer라는 Class라는 생성해서
	// 매직스테이션, 800000, i5-1234, 8, 500 >> 출력
	public static void main(String[] args) {
		Computer c = new Computer("매직스테이션", 800000, "i5-1234", 8, 500);
		c.printInfo();
		System.out.println("================");
		com.son.pi915.product.Scanner s = new com.son.pi915.product.Scanner("멀티 익스프레스", 500000);
		s.printInfo();
	}
}
