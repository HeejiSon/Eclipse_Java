// 신발
//		이름 : ???
//		사이즈 : 240
//		가격 : 110000
//		브랜드 : 나이키
//		정보출력
//		이름 : ???
//		사이즈 : 240
//		가격 : 210000
//		브랜드 : 나이키
//		정보출력
public class CMain {
	public static void main(String[] args) {
		Shoes s1 = new Shoes();
		s1.name = "조던 1";
		s1.size = 240;
		s1.price = 250000;
		s1.printInfo();
		System.out.println("===============");
		Shoes s2 = new Shoes();
		s2.name = "덩크";
		s2.size = 240;
		s2.price = 249000;
		s2.printInfo();
		System.out.println("===============");
		s1.test(s2.name);
		System.out.println("===============");
		Shoes s3 = new Shoes("나이키 신발", 240, 5500);
		s3.printInfo();
		System.out.println("===============");
		// 생성자오버로딩 사용해서 신발객체 하나 더 만들기
		Shoes s4 = new Shoes("나이키 신상신발", 240, 50000);
		s4.printInfo();
	}

}
