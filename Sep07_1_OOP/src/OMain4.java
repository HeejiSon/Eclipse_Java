// 실행용 class : 프로그램 실행을 위한 main() method를 제공하는 역할

public class OMain4 {
	public static void main(String[] args) {
		// Student 클래스로 객체 하나 불러와서 끝
		
		Student s1 = new Student();
		
		s1.studentId = 123;
		s1.studentName = "손희지";
		s1.studentPhone = "010-5915-9619";
		s1.studentAge = 23;
		s1.studentAddress ="청주";
		System.out.println(s1);
		System.out.println("s1이 Student 객체를 참조");
		s1.showStudentInfo();
		System.out.println("-----------------");
		Student s2 = new Student();
		s2.studentId = 3214;
		s2.studentName = "김길동";
		System.out.println(s2);
		System.out.println("s2이 Student 객체를 참조");
		s2.showStudentInfo();

	}
}
