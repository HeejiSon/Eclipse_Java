// 라이브러리용 class (API : Application Program Interface)
//				: 다른 class에서 사용할 목적
// 프로그램에서 사용되는 class가 여러개!, 단 하나 빼고는 다 라이브러리용
//				: 제외된 하나의 class : 실행용(Main)
public class Student {
	
	// 멤버변수 (Member Variable) / 필드 (Field)
	//			: 객체의 데이터가 저장되는 곳
	//			: 변수와 상당히 비슷하지만 변수는 아님
	//		- 변수 : 생성자, 메소드 안에서만 사용
	//				 생성자, 메소드 실행이 종료되면 함께 자동으로 종료!
	//		- 필드 : 생성자, 메소드 안에서 사용이 가능
	//				 객체가 소멸되지 않는 한 객체와 함께 공존!
	
	// 초기값을 지정하지 않은 멤버변수 : 객체 생성시 자동으로 기본 초기값을 지정
	int studentId; // 학생 id
	String studentName; // 학생이름
	String studentPhone; // 학생 전화번호
	int studentAge; // 학생 나이
	String studentAddress; // 학생 주소
	
	// method(메소드) : 객체의 동작에 해당하는 실행블록
	//			중괄호가 블록을 의미 >> 이름을 붙인 것이 method명(동사스럽게 지어야)
	//			객체 간의 데이터 전달 수단
	public void showStudentInfo() {
		System.out.println(studentName + " " + studentId);
	}
	
}
