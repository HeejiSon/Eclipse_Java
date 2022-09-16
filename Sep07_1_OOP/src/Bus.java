// function - Java에는 function이라는 용어가 없음! - 클래스 밖에서 만든 것을 function이라고 한다.
// method	- Class속에서 만든 것 (Class에 종속적인 함수 라고 표현)
//			  지금까지 써온 것들.. 다 method였던 것!

// class : 객체를 찍어내는 틀 (ex: 붕어빵 틀, 도장, 포장지)
public class Bus {
	// 멤버변수 (member variable) - 속성 ( = attribute, field, ... )
	//							  - 객체의 data가 저장되는 공간
	//							  - Class에 포함되는 변수 (Variable)
	// 버스 노선번호, 차종, 버스회사, 기사님이름, 출발점 => 출력
	int no;
	String brand;
	String company;
	String driver;
	String startPoint;
	
	public void printInfo() {
		// this : 자기 자신 (this : 생략가능 0)
		System.out.println(this.no);
		System.out.println(this.brand);
		System.out.println(company);
		System.out.println(driver);
		System.out.println(startPoint);
	}
	
	// member method(멤버 메소드) - 액션, 프로그램 상 필요한 기능
	//							  - 객체의 동작에 해당하는 실행 블록
	
	private void go() {
		System.out.println("부릉부릉~");
	}
}
