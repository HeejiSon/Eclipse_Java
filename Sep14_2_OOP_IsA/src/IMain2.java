// 쇼핑몰 - '상품'에 대한 정보를 게시하고 싶어요
// 상품 : 신발, 컴퓨터, 노트북, ...
public class IMain2 {
	// 상품 Class : 속성(name, price), 기본생성자, 생성자 오버로딩, 정보출력
	public static void main(String[] args) {
		// 신발(이름, 가격, 사이즈) 객체 생성해서 출력
		Shoes s = new Shoes("나이키 에어포스", 110000, 240);
		s.printInfo();
		System.out.println("====================");
		// 컴퓨터(이름, 가격, cpu, ram, hdd) 객체 생성해서 출력
		Computer c = new Computer("삼성컴퓨터", 984000, "i7", 16, 512);
		c.printInfo();
		System.out.println("====================");
		// 노트북(이름, 가격, cpu, ram, hdd, 무게, 배터리지속시간) 객체 생성해서 출력
		Laptop l = new Laptop("Gram", 100000, "i5", 16, 512, 680, 24);
		l.printInfo();
	}
}
