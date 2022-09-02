import java.util.Scanner;

// while문 - switch case

// 누구:
//		매니저
//				시스템관리
//				학생관리
//				수업관련 업무
//		강사
//				학생관리
//				수업관련 업무
//		학생
//				수업관련 업무
//		"누구 : " 반복하다가 누구 : 끝 이라고 입력하면 프로그램이 종료(반복이 끝나게)

public class RMain6 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		String who = "";
		
		a : while(true) {
			System.out.print("누구 : ");
			who = k.next();
			switch (who) {
			case "매니저":
				System.out.println("시스템관리");			
			case "강사":
				System.out.println("학생관리");
			case "학생":
				System.out.println("수업관련 업무");
				break;
			case "끝":
//				break; 	// switch case도 break를 사용하기 때문에 이렇게만 하면 가까운 switch를 종료
				break a; // break뒤에 반복문의 이름을 붙이면 반복문이 종료!
			}
//			if(who.equals("끝")) {
//				System.out.println("프로그램 종료");
//				break;
//			}
		}
	}
}
