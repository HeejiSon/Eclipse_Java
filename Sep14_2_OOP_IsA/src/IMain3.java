
public class IMain3 {
	public static void main(String[] args) {
		
		// 홍길동, 17살, 신논현고등학교, 1학년 ->출력
		Student s = new Student("홍길동", 17, "신논현고등학교", 1);
		s.printInfo();
		System.out.println("==============");
		// 김길동, 21살, 신논현대학교, 2학년 ->출력
		Student s2 = new Student("김길동", 21, "신논현대학교", 2);
		s2.printInfo();
		System.out.println("===============");
		// 고길동, 22살, 육군, 상병 ->출력
		Army a = new Army("고길동", 22, "육군", "상병");
		a.printInfo();
		System.out.println("===============");
		Pen p = new Pen();
		System.out.println("=======1=======");
		Pen p2 = new Pen("빨강");
		System.out.println("=======2=======");
		Pen p3 = new Pen("모나미", 300, "검정");
		System.out.println("=======3=======");
		Mask m = new Mask("패션마스크", 1000);
		
	}
}
