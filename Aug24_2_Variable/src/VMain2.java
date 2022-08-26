
public class VMain2 {

	public static void main(String[] args) {
		
//		// name이라는 변수에 여러분의 핸드폰 이름
//		String name = "아이폰 13";
//		// price라는 변수에 핸드폰 가격(대충)
//		int price = 1000000;
//		// brand라는 변수에 핸드폰 회사
//		String brand = "애플";
//		// weight라는 변수에 핸드폰 무게 (소수점)
//		double weight = 130.6;
//		// 논리 - 중고나라에 팔 수 있는지? (true / false)
//		boolean recycle = true;
//		
//		// 변수를 syso 할 때는 따옴표 없이 변수명만
//		System.out.println(name);
//		
//		System.out.printf("핸드폰 이름 : %s\n", name);
//		System.out.printf("핸드폰 가격 : %d\n", price);
//		System.out.printf("핸드폰 회사 : %s\n", brand);
//		System.out.printf("핸드폰 무게 : %.1fg\n", weight);
//		System.out.printf("핸드폰 중고 : %b\n", recycle);
		
		//////////////////////////////////////////////
		// 이름 , 오늘 날짜(년도-월-일), 사는 곳 (지역), 시력, java 경험 유무
		// 각각 변수 만든 후 -> printf로 표현
		
		String my_name = "손희지";
		int year = 2022;
		int month = 8;
		int day = 24;
		String home = "청주";
		// 핸드폰 번호
		double eye = 0.5;
		boolean java = true;
		
		System.out.printf("이름 : %s\n", my_name);
		System.out.printf("오늘 날짜(년도-월-일) : %d-%d-%d\n", year, month, day);
		System.out.printf("사는 곳 (지역) : %s\n", home);
		System.out.printf("시력 : %.1f\n", eye);
		System.out.printf("java 경험 유무 : %b\n", java);
		
		
	}

}
