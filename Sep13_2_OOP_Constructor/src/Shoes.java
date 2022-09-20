// 생성자(Constructor)
//		객체가 만들어질 때 뭔가 작업을 해야 하는데...
//		=> 생성자 만들기 !
//		리턴이 없고, 메소드 명이 클래스 명과 동일!

public class Shoes {
	String name;
	int size;
	int price;
	static final String BRAND = "나이키";
	
	public Shoes() {
		
	}
	
	// 생성자 오버로딩()
	public Shoes(String name, int size, int price) {
		super(); // 
		this.name = name;
		this.size = size;
		this.price = price;
	}
	
	
	public void printInfo() {
		System.out.printf("모델명 : %s\n",name);
		System.out.printf("사이즈 : %d\n",size);
		System.out.printf("가격 : %d\n",price);
		System.out.printf("브랜드 : %s\n",BRAND);
	}
	

	public void test(String name) {
		// 멤버변수명과 파라미터명이 같다면?
		//		this. 을 붙이면 무조건 멤버변수
		//		붙이지 않으면 가장 가까이 있는 것
		
		System.out.println(name);
		System.out.println(this.name);
	}
}
