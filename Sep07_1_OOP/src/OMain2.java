// Java : 객체지향 하기에 최적화 된 언어 (구조가)
// Python : Hybrid 한 객체지향 언어(구조가)
public class OMain2 {
	public static void main(String[] args) {
		// 버스를 Java로 표현해보자 -> 표현하고 싶은 것이 생기면! 항상! 클래스를! 새로! 만들기!
		// 버스 노선번호, 차종, 버스회사, 기사님이름, 출발점 => 출력
		// int, double, String, ... XXX : << 설명하기 어려움!
		// 주석을 달 필요가 없음 >> 뭘 표현하고 싶은지 알 수 있기 때문
		
		// b : 객체, instance라고 부름
		Bus b = new Bus();
		b.no = 7;
		b.brand = "현대";
		b.company = "자유여객";
		b.driver = "손희지";
		b.startPoint = "김포공항";
//		System.out.println(b.no);
//		System.out.println(b.brand);
		b.printInfo();
		System.out.println("-----------------------");
		
		Phone p = new Phone();
		p.model = "아이폰 13";
		p.Com = "애플";
		p.price = 1000000;
		
		p.printInfo();
		p.sound();
		
		Phone p2 = p;
		System.out.println(p2);
		p2.price = 150000;
		p2.printInfo();
		System.out.println("------");
		p.printInfo();		// p2에서 가격을 150000원으로 변경 -> p2 = p1라서 공유 됨
	}
}
