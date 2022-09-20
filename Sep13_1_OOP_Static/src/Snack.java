// 	4. static 빌드업
//		멤버 변수 : 객체의 속성 -> main에서는 (객체.속성)으로 표현
//								this : 지금 해당하는 '이' 객체를 뜻함(생략가능)

//	5. 이 세상의 모든 과자를 손희지가 만든다고 하면?
//		이 때 사용하는 것이 ** static ** 멤버변수
//			- 객체를 따로 만들지 않아도 사용 가능한 정보
//				-> 클래스명.xxx로 사용
//			- 객체들의 공통 속성
//				-> 객체 여러개 찍어낻도 static멤버변수는 하나만!
//				-> 메모리 절약 0

// 12. static final 멤버변수 
//		수정불가 -> 상수화! (값을 절대 변경하지 않겠다!)
//		static final 자료형 변수명(대문자로 / 문화) = 내용;
////////////////////////
// 17. static 메소드
//		메모리가 절약됨 -> 암튼 됨!
//		객체가 없어도 사용 가능하다!
//			static이 아닌 멤버에는 접근 불가능

public class Snack {
	// 2. 속성 만들기
	String name;
	double weight;
	int price;
	
	// 6. 아랫줄 작성
	
//	static String manufacturer = "손희지";
	// 13. 그래서 이 6.의 내용을 13.처럼 바꿀거야 >> 상수화
	static final String MANUFACTURER = "손희지";
	
	// 3. 해당 과자의 정보를 출력하는 메소드
	public void printInfo() {
		System.out.printf("과자이름 : %s\n", this.name);
		System.out.printf("중량 : %.1fg\n", weight);
		System.out.printf("가격 : %d원\n", price);
		// 7. 아랫줄 작성
//		System.out.printf("생산자 : %s\n", manufacturer);
		// 14. 7.도 아래로 다시 고쳐주기 -> main으로 돌아가기
		System.out.printf("생산자 : %s\n", MANUFACTURER);
	}
	
	public static void printTaste() {
		System.out.println(MANUFACTURER);
//		System.out.println(name);  // -> static이 아닌 멤버변수에는 error
		System.out.println("크~ JMT!!");
		System.out.println("=====================");
	}
}
