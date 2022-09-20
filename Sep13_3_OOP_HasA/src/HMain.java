// OOP
//		static - 고오오오오오오오오오급
//		constructor(생성자)
//		객체간의 관게
//		A has a B : 사람 has a 핸드폰
//		A is a B : 개 is a 동물
public class HMain {
	public static void main(String[] args) {
		// 사탕 객체를 불러옵니다.
		// 이름이 청포도, 맛이 청포도맛인 사탕의 정보 출력
		Candy c = new Candy("청포도", "청포도맛");
		c.printInfo();
		System.out.println("===============");
		Company com = new Company("롯데", "잠실", 100);
		com.printInfo();
		// 청포도 사탕을 롯데에서 만들었다?
		// Candy class쪽에 멤버변수가 하나 추가되어야한다.
		c.brand = com;
		// 청포도 사탕의 제조사의 정보를 출력
		c.brand.printInfo();
		System.out.println("===============");
		
		// 회사객체 하나 더 불러오기
		// 삼성, 수원, 300명이 다니는 회사의 정보를 출력
		Company com1 = new Company("삼성", "수원", 300);
		com1.printInfo();
		System.out.println("===============");
		
		// CPU가 i7-1234, RAM이 32GB, HDD 500GB인 삼성컴퓨터
		// 컴퓨터 / 회사 정보까지
		Computer com2 = new Computer("i7-1234", 32, 500, com1);
		com2.printInfo();
		
		
	}

}
