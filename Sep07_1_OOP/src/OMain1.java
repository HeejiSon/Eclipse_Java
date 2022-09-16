
// 알고리즘의 시대 X -> 유지보수의 시대 O

// 절차지향 프로그래밍 (Procedural Programming)
//		프로그래밍을 할 때 순서대로 잘 써서 결과를 잘 내자!
//		변수 생성하는 것도 하나 아끼고, 코드를 최대한 효율적으로 짰음!

// 객체지향 프로그래밍 (Objeect - Oriented Programming)
//		실생활을 묘사하자
//		소스보기가 더 편함
//		유지보수에 용이
//		장점 : 코드의 재사용성, 유지보수에 용이, 대규모 프로젝트에 적합
public class OMain1 {
	public static void main(String[] args) {
		// 우리 학원 건물 뒤에 카페가 하나 잇음
		// 그 카페의 정보를 표현
		
		// 카페 이름 : 발도스
		String name = "발도스";
		
		// 카페 위치 : 우리학원 뒤
		String location = "우리 학원 뒤";
		
		// 카페 거리 : 64.7m
		double distance = 64.7;
		System.out.println(name);
		System.out.println(location);
		System.out.println(distance);
		System.out.println("-----------------------");
		// OOP로 발도스를 표현
		// 객체(Object) : 실생활에 존재하는 모~~~~~~~~~~~든 것! ( = 인스턴스(Instance))
		// 붕어빵을 만들려면 붕어빵 틀이 필요!
		// 객체를 만들려면 'Class' 라는 것이 필요!
		// 객체를 사용해서 하나의 완성품을 만들어내는 것이 프로그램
		
		Cafe c = new Cafe(); // 새로운 카페 하나 생성!
		c.name = "발도스";
		c.location = "우리학원 뒤";
		c.distance = 64.7;
		System.out.println(c.name);
		System.out.println(c.location);
		System.out.println(c.location);
	}
}
