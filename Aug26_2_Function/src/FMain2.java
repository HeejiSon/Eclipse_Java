
public class FMain2 {
	
	public static void test(int b) {
		int a = 123;
		System.out.println(b);
		System.out.println(a + b);
		
	}

	public static void main(String[] args) {
		int a = 10;	// 지역 변수
		int b = 20;
		int c = 30;
		
		// 같은 함수내에서 같은 이름으로 변수명 생성 못함
		
		test(c);
	}
}
