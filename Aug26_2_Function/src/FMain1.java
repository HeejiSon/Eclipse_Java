
public class FMain1 {
	
	// 1. 함수를 만들어두고
	
	// public static 리턴타입 함수명(파라미터, 파라미터, ...){
	//		내용
	//		return
	// }
	
	// 리턴타입 : 반환시킬 값(main으로 보낼 값)의 자료형
	//		함수 내에서 식이 완성되고, main으로 반환활 결과값에 대한 자료형
	//		return을 통해 반환을 함
	
	// 함수명 :  말 그대로 함수의 이름
	//		1. 숫자로 시작하면 에러
	//		2. 특수문자, 띄어쓰기 사용하면 에러
	//		3. 자바문법(예약어) 사용하면 에러
	//		4. 함수명을 봗도 무슨 기능을 하는지 알기 쉽게 
	//		5. 첫 시작은 소문자로
	//		6. 가독성을 위해 뱀체, 낙타체
	
	// 파라미터(인자, parameter) : 함수 실행하는데 필요한 재료 가지고 올 때
	// 필요한 만큼 가져다가 사용하되, 자료형에 맞춰 사용해야 함!
	
	public static void printMyThink() {
		System.out.println("빨리 6시 됐으면 좋겠다!");
		System.out.println("내일이면 주말이다");
	}
	
	public static void introduce() {
		System.out.println("이름 : 손희지");
		System.out.println("핸드폰 : 010-5915-9619");
		System.out.println("사는 곳 : 청주");
	}
	
	// 정수 두개를 넣으면 사칙연산 결과를 계산해서 출력해주는 함수
	public static void calculate(int a, int b) {
		int plus = a + b;
		int minus = a - b;
		int multiply = a * b;
		double divide = a / (double) b;
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(multiply);
		System.out.println(divide);
	}
	
	// JVM이 해당 파일을 실행할 때 main을 자동적으로 호출
	// main도 사실 함수의 일종!

	public static void main(String[] args) {
		printMyThink();
		System.out.println("--------------");
		introduce();
		System.out.println("--------------");
		calculate(20, 10);
	}
}
