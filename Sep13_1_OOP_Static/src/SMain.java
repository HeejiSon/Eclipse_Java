// 20. 설명
//		1) 기계어 상태의 코드가 stack영역에 깔림
// 		2) static 멤버변수들이 static영역에 배치
//		3) JVM이 SMain.main(...); 를 호출
//		4) 실행

public class SMain {
	// 1. snack 이라는 과자 객체를 만들어보자
	// 과자이름, 중량, 가격까지 -> Snack.java
	public static void main(String[] args) {
		// 8. 일단 현재까지 main에는 과자 객체가 없는 상태
		//		과자이름? -> 모름
		//		과자무게? -> 모름
		//		과제가격? -> 모름
		//		과자생산자? -> 손희지
//		System.out.println(Snack.manufacturer);
		// 15. 이 부분도 (상수화 한 static final로) 다시 고쳐주기
		System.out.println(Snack.MANUFACTURER);
		// 19. static method 불러오기
		Snack.printTaste();
		System.out.println("===============");
		// 9. 과자 객체 하나 만들기
		Snack s = new Snack();
		s.name = "홈런볼";
		s.weight = 80.3;
		s.price = 1500;
		s.printInfo();
		System.out.println("===============");
		// 10. 과자 객체 하나 더 만들기
		Snack s1 = new Snack();
		s1.name = "포카칩";
		s1.weight = 75.6;
		s1.price = 2000;
		s1.printInfo();
		// 일단 생산자는 손희지가 맞다
		System.out.println("===============");
		// 11. 근데 생산자의 값을 바꿔보자!
//		s1.manufacturer = "방찬우";
//		s1.printInfo();
		// 뭐야? 바뀌는데? 생산자는 다 손희지라며?
		// 다시 Snack으로 넘어가서
		// 16. 다시 생산자의 값을 바꿔보자!
//		s1.MANUFACTURER = "방찬우";
		// error가 나는 것을 확인할 수 있음! -> 다시 주석처리
//		s1.printInfo();
	}
	
	
}
