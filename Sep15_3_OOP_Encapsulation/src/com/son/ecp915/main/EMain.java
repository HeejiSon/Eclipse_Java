package com.son.ecp915.main;

import javax.swing.JFrame;

import com.son.ecp915.coffee.Coffee;
import com.son.ecp915.human.Human;

public class EMain {
	public static void main(String[] args) {
		// 커피
		Coffee c = new Coffee("아메리카노", 3200);
		c.printInfo();
		System.out.println("================");
		Human h = new Human();
		// h.name = "손희지"; 		// private으로 접근을 제한해서 여기서는 사용불가
		h.setName("손희지");
		h.setAge(-100);
//		System.out.println(h.age);  // private으로 접근을 제한해서 여기서는 사용불가
		System.out.println(h.getAge());
		
		// 타이틀이 ㅋㅋㅋ인 JFrame
		JFrame f = new JFrame("ㅋㅋㅋ");
		// 사이즈를 300, 500
		f.setSize(300,500);
		// 타이틀을 ㅎㅎㅎ로 수정
		f.setTitle("ㅎㅎㅎ");
		// 보이게 하기 위한
//		f.show(); << 이제 더이상 사용하지 않는 코드
//		f.setVisible(true);
		f.setVisible(false);
	}
}
