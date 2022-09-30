package com.son.fp915.main;

import com.son.fp915.register.Academy;
import com.son.fp915.register.Student;

// 학원에서 학생을 상담한 후에 해당 커리큘럼 대기자로 등록하려고함
// 학생의 정보 이름 / 나이
// 등록한 순을 번호 부여하고 싶은데 어떻게 해야할까?

// Factory Pattern

// 객체가 필요없다 : static method 기반
// 객체가 있기는 해야 함
// 		하나 : Singleton 패턴
//		여러개 : Factory 패턴 (대량생산, 자동화)
//				 나머지 : 지금까지 우리가 배운거!


public class Main {
	public static void main(String[] args) {
		Academy ac = new Academy();
		
////		Student s = ac.consult("홍길동", 20);
//		s.printInfo();
//		System.out.println("==============");
//		Student s2 = ac.consult("김길동", 30);
//		s2.printInfo();
//		System.out.println("==============");
//		Student s3 = ac.consult("이길동", 25);
//		s3.printInfo();
//		System.out.println("==============");
	}
}
