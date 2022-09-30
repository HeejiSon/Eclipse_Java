package com.son.ab915.main;

import com.son.ab915.Avengers.Avengers;
import com.son.ab915.Avengers.Ironman;

// 어벤져스 클래스(패키지 Avengers)
//		이름, 나이 속성
//		공격하기 기능
public class AMain2 {
	public static void main(String[] args) {
		// Avengers로부터 상속받은
		// 클래스명은 모르느
		// 내부에 만들어놓은 클래스
		
		// 익명 내부 클래스(anonymous inner class)
		Avengers a = new Avengers() {  // 중괄호 사이의 부분이 클래스 부분
			
			@Override
			public void attack() {
				System.out.println("거미줄 발사~");
				
			}
		};
		a.printInfo();
		a.attack();
		
		System.out.println("================");
		Ironman i = new Ironman("스타크", 40, 23076215);
		i.printInfo();
		i.attack();
		i.smoke();
		i.drive();
	}
}
