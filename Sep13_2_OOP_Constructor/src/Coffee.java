
public class Coffee {
	String name;
	int price;
	
	public Coffee() {
		// 객체의 값을 초기화 하는 목적
	}
	
	public Coffee(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.printf("커피이름 : %s\n", name);
		System.out.printf("커피가격 : %d\n", price);
	}

}
