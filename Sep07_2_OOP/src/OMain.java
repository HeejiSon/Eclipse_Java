// coder : 개발자
// Programmer : Coder + 설계!

// OOD(Object Oriented Design) - 객체 지향 디자인
//			실생활을 디자인하자~

// BMI테스트 : 병원 / 의사 / 환자

public class OMain {
	
	// 병원
	public static void main(String[] args) {
		// 의사 불러오기 -> 이름 , 나이를 입력 -> 출력
		Doctor doc = new Doctor();
		doc.name = "김닥터";
		doc.age = 38;
		doc.printDoctor();
		
		// 환자(이름, 나이)
		Guest g = new Guest();
		g.name = "홍길동";
		g.age = 19;
		g.printGuest();
		
//		doc.callGuest(g);
		doc.start(g);
		
		
	}
}
