
public class FMain2 {
	
	public static void test(int q) {
		System.out.println(q); // (blue)
		// 자료형 없이 변수명만 사용하는 경우 : 값을 바꾼다(값이 변한다)
		q = 20; //재료로 들어온 int q가 얼마가 됐든, 해당 줄에서 값이 20으로 바뀌도록
		System.out.println(q); // (blue)
	}


	public static void main(String[] args) {
		int q = 10;  // q : 지역변수
		System.out.println(q); // q(red)
		System.out.println("-------------"); //red : 10
		test(q);
		System.out.println("-------------");
		System.out.println(q);
		

	}

}
