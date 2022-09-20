// 커피
// 커피이름, 가격
// 출력
// 하나는 그냥, 다른 하나는 생성자오버로드 사용해서

public class CMain2 {
	public static void main(String[] args) {
		Coffee c1 = new Coffee();
		c1.name = "아메리카노";
		c1.price = 3500;
		c1.printInfo();
		System.out.println("===============");
		Coffee c2 = new Coffee("카페라떼", 4000);
		c2.printInfo();
	}
	
}
