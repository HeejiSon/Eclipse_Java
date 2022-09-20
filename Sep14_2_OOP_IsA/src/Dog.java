
public class Dog extends Animal{
	String location;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String sort, int age, String location) {
		super(sort, age);
		this.location = location;
	}
	// ctrl + space로 자동완성 틀어서 method 오버라이딩을 진행!
	
	@Override // 상속받아온 method의 기능을 바꾸겠다
	public void printInfo() {
		// override의 조건 : 상속받은 class에서 사용한 method와 이름이 같아야!
		// 상위 클래스.printInfo() >> 상위클래스에 있는 해당하는 method 가져오기
		super.printInfo();
		System.out.println(location);
	}
	// vs
	//		Overloading
	//			method를 만들 때 같은 기능이라면 메소드명을 같게!
	//			파라미터의 자료형이 다르거나
	//			파라미터의 개수가 달라야함!
}
