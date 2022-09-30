package com.son.ab915.main;

import com.son.ab915.Avengers.Avengers;
import com.son.ab915.Avengers.Ironman;
import com.son.ab915.animal.Animal;
import com.son.ab915.animal.Bird;

// 다형성(Polumorphism)
//  Poly(많은) + Morph(모양)
// 	상위타입 변수에 하위타입 객체를 담는 것이 가능하다!
//	같은 형태지만 다른 기능이 가능(Overriding과 밀접한 관련)

public class AMain3 {
	public static void main(String[] args) {
		// 아이언맨 담는 그릇 i에 아이언맨 만들어 놓음
		Ironman i = new Ironman ("a", 10, 123456);
		// 어벤져스 담는 그릇 a에 아이언맨 만들어 놓는 것이 가능!
		Avengers a = new Ironman("b", 20, 321321);
		Bird b = new Bird("a", 10, 20);
		Animal aa = new Bird("b", 10, 20);
	}
}
