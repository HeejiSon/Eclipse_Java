// 생성자(Java)
//		1. 클래스에 생성자가 하나도 없으면
//			Java 컴파일러가 생성자를 만들어줌
//		2. 하위 클래스 객체 만들면 (Pen)
//			상위 클래스 기본생성자(Product)를
//			자동 호출

public class Pen extends Goods2{
	String color;
	
	public Pen() {
		
	}

	public Pen(String color) {
		super(); // 2. 를 명시한 것(없어도 무방)
		this.color = color;
	}

	public Pen(String name, int price, String color) {
		super(name, price);	// 2.가 발동하지 않음
							// Goods(이름, 가격)
							// super(파라미터)를 가진 생성자를 생성시
							// 기본 생성자가 생기지 않기 때문에
							// 상위 클래스 기본 생성자 사용이 불가능
		this.color = color;
	}

}
