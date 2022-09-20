// 객체간의 관계
//		A has a B : 사람 has a 핸드폰
//		A is a B  : 고양이 is a 동물

// A has a B : 포함관계
public class HMain {
	public static void main(String[] args) {
		// 이름이 김엘레강스, 남자, 핸드폰 번호가 010-1234-5678인 사람
		// 출력
		Person p = new Person("김엘레강스", "남자", "010-1234-5678");
		p.printInfo();
		System.out.println("===================");
		// 신논현포차, 신논현역, 02-2222-3333, 김엘레강스의 식당
		// 출력(식당 주인의 정보)
		Restaurant r = new Restaurant("신논현포차", "신논현역", "02-2222-3333", p);
		r.printInfo();
		System.out.println("===================");
		Menu m = new Menu("왕치즈계란말이", 22000, r);
		m.printInfo();
		System.out.println("===================");
		Menu m2 = new Menu("석쇠불고기", 25000, r);
		m2.printInfo();
		System.out.println("===================");
		
		// 석쇠, 5000원 석쇠불고기를 담는 접시
		// 관련된 정보 전체 출력
		Plate plate = new Plate("석쇠", 5000, m2);
		plate.printInfo();
		System.out.println("===================");
		
		// 가락시장, 송파구, 석쇠를 구매한 시장
		// 관련된 정보 전체 출력
		Market mar = new Market("가락시장", "송파구", plate);
		mar.printInfo();
		System.out.println("===================");
		
		// 존 킴, 가락시장을 좋아하는 상인
		// 관련된 정보 전체 출력
		Merchant mer = new Merchant("존킴 ", mar);
		mer.printInfo();
		System.out.println("===================");
		
		// 존킴의 이름만 출력
		System.out.println(mer.name);
		System.out.println("===================");
		
		// 존킴이 좋아하는 시장 정보 전체 출력
		mer.mar.printInfo();
		System.out.println("===================");
		
		// 존킴이 좋아하는 시장은 어디에? 출력
		System.out.println(mer.mar.location);
		System.out.println("===================");
		
		// 존킴이 좋아하는 시장에서 산 접시 전체정보
		mer.mar.market.printInfo();
		System.out.println("===================");
		
		// 존킴이 좋아하는 시장에서 산 접시 가격
		System.out.println(mer.mar.market.price);
		System.out.println("===================");
		
		// 존킴이 좋아하는 시장에서 산 접시에 담긴 메뉴 정보
		mer.mar.market.bulgogi.printInfo();
		System.out.println("===================");
		
		// 존킴이 좋아하는 시장에서 산 접시에 담긴 메뉴 가격
		System.out.println(mer.mar.market.bulgogi.price);
		System.out.println("===================");
		
		// 존킴이 좋아하는 시장에서 산 접시에 담긴 메뉴를 판 식당 연락처
		System.out.println(mer.mar.market.bulgogi.where.number);
		System.out.println("===================");
		// 존킴이 좋아하는 시장에서 산 접시에 담긴 메뉴를 판 식당 주인 연락처
		System.out.println(mer.mar.market.bulgogi.where.who.phone);
		System.out.println("===================");
		// 계란말이를 파는 사람의 연락처
		System.out.println(r.who.phone);
	}
}
