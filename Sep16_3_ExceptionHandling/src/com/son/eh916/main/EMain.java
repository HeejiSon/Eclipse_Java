package com.son.eh916.main;

import java.util.Scanner;

public class EMain {
	// 프로그램 실행 => 콘솔창에 빨간 글씨로 ~~~ 나오는 거
	
	// error
	//		한국어 -번역-> 	영어
	//		사과			apple
	//		띵퀭			???
	//		Java의 문법에 맞지 않게 사용해서 컴파일(Complie)이 불가능한 상태
	//		개발자 잘못!
	//		완성본이 나오지 않음
	
	// warning
	//		노란줄 나오는 것
	//		코드가 지저분하다는 뜻
	//		개발자 잘못!
	//		컴파일이 가능 -> 완성본은 나옴(실행하는데 문제가 없음)
	//		이클립스가 자체적으로 잔소리하는 느낌
	//		ex) Scaneer객체 만든 후에 해당 기능을 닫지 않았을 때
	
	// exception
	//		프로그램은 100% 완성!
	//		실행할 때 뭔가 외부적인 요인에 의해 동작이 제대로 이루어지지 않는 상태
	//		개발자 잘못은 아니
	// 		개발자 입장 -> 개발자가 상황을 예측해서 대책은 세워놓자~
	
	public static void main(String[] args) {
		// x : ?, y : ? 입력받아서
		//	사칙연산 정수로만 해서 <<
		Scanner k = new Scanner(System.in);
		System.out.print("x : ");
		int x = k.nextInt();
		System.out.print("y : ");
		int y = k.nextInt();
		System.out.println("---------");
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		//System.out.println(x / y);
		// 만약 y값에 0을 넣으면?
		
//		// Exception처리 방법
//		try {
////		 	일단 이 부분 실행 - (내용)
//		} catch (예외유형명 변수명) {
////			try쪽을 실행하다가 해당 유형의 예외가 발생하면 이 부분실행
////			만약, 예외없이 정상ㅈ적으로 실행됐을 경우, catch부분은 그냥 지나치고
////			그 다음 소스를 실행
//		} catch(예외유형명 변수명) {
//			...
//		} finally {
//			정상적으로 프로그램이 실행이 됐던지,
//			에외가 터졌던지 상관없이 실행
//			return 보다 먼저 실행
//		}
//		try {
//			int d = x / y;
//			System.out.println(d);
//			System.out.println(ar[x]);
//		} catch(ArithmeticException ae) {
//			System.out.println("아 0으로 어떻게 나누냐고~");
//		} catch(IndexOutOfBoundsException e) {
//			System.out.println("아~ 배열 인덱스 범위가 넘었다고~~");
//		}
		try {
			int d = x / y;
			System.out.println(d);
			int[] ar = {1, 2, 3};
			System.out.println(ar[x]);
		} catch(Exception e) { // 모든 Exception을 다 잡아준다
			System.out.println("예외떴죠?");
			e.printStackTrace(); // 상황 출력(개발자용)
		} finally {
			System.out.println("아엌");
		}
	}
}
