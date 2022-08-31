
public class FMain3 {
	// 오버로딩(Overloading) **고~~~~~~급 기술**
	//		함수명은 같게, 파라미터(재료)는 다르게 하는 기술
	//		main에서 함수를 호출 할 때 어떤 값을 넣었느냐에 따라 다른 함수가 불러짐
	
	//	* 같은 자료형을 쓰더라도 파라미터의 개수가 다르면 오버로딩 0
	//	* 파라미터의 개수가 같더라도 다른 자료형을 쓰면 오버로딩 0
	
	// 파라미터(재료)에 아무것도 넣지 않으면 ... 을 출력
	public static void test() {
		System.out.println("...");
	}
	
	// 함수명 : test() ,  파라미터에 정수 1개 넣으면 윽! 출력
	
	public static void test(int a) {
		System.out.println("윽!");
	}
	
	// 함수명 : test() ,  파라미터에 문자열 1개 넣으면 으아악! 출력
	
	public static void test(String a) {
		System.out.println("으아악!");
	}
	
	// 함수명 : printSum(), 정수 2개 넣으면 그 합을 출력해주는 함수
	
	public static void printSum(int a, int b) {
		System.out.println(a + b);
	}
	
	// 함수명 : printSum(), 정수 3개 넣으면 그 합을 출력해주는 함수
	public static void printSum(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	// 함수명 : printSum(), 실수 3개 넣으면 그 합을 출력해주는 함수
	public static void printSum(double a, double b, double c) {
		System.out.println(a + b + c);
	}
	
	public static void main(String[] args) {
		test();
		test(0);
		test("안녕");
		printSum(6, 10);
		printSum(6, 10, 20);
		printSum(5.5, 6.4, 7.85);
	}
	
	

}
