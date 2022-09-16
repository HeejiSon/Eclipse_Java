
public class WhatIsValue {
	//알고 싶은 자료형의 기본값을 멤버변수로 만들어서 -> main에서 부르기
	
	// 기본형 -  정수
	byte byteField;
	short shortField;
	int intField;
	long longField;
	
	// 기본형 - 논리, 문자
	boolean booleanField;
	char charField; // 기본형이 띄어쓰기!
	
	// 기본형 - 실수
	float floatField;
	double doubleField;
	
	// 참조형 - 문자열, 배열
	String stringField;
	int[] arrayField;
	
	// 출력하는 메소드 생성
	public void printInfo() {
		System.out.println("byte : "+ byteField);
		System.out.println("short : " + shortField);
		System.out.println("int : " + intField);
		System.out.println("long : " + longField);
		System.out.println("boolean : " + booleanField);
		System.out.println("char : " + charField);
		System.out.println("float : " + floatField);
		System.out.println("double : " + doubleField);
		System.out.println("string : " + stringField);
		System.out.println("Array : " + arrayField);
	}
}
