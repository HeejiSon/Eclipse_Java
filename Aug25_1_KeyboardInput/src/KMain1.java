import java.util.Scanner;

public class KMain1 {

	public static void main(String[] args) throws InterruptedException {
		
//		Scanner : Java에 내장되어 있는 기능 중 하나!
//		이 기능을 사용하기 위해서 'import'라는 것이 사용됨
		
//		Scanner : 화면(console)으로부터 데이터를 입력 받는 기능
		
//		Scanner기능 사용을 위해 꼭 해야하는 한 줄
		
		Scanner keyboard = new Scanner(System.in);
		
//		콘솔창에 뭘 입력해야 하는지 써줘야한다.
		// 1. 뭔가 입력을 우리가 받을 것
		// 2. 입력받은 내용 변수에 담기
		// 3. 변수 내용 출력하기
		
		// 이름
		System.out.print("이름 : "); 		
		String name = keyboard.next();  	
											
		
		// 키
		System.out.print("키 : ");
		double height = keyboard.nextDouble();
		
		
		// 신발 사이즈
		System.out.print("신발 사이즈 : ");
		int size = keyboard.nextInt();
		
		
		// 여행가고 싶은 지역 
		System.out.print("여행가고 싶은 지역 : ");
		String trip = keyboard.next();
		;
		
		// 좋아하는 숫자
		System.out.print("좋아하는 숫자 : ");
		int num = keyboard.nextInt();
		
		
		// 지금 놀고싶은지 여부
		System.out.print("지금 놀고싶은지 여부 : ");
		boolean now = keyboard.nextBoolean();
		
		System.out.println("==============================");
		System.out.printf("이름 : %s\n", name);	
		System.out.printf("키 : %.1f\n",height);
		System.out.printf("신발 사이즈 : %d\n", size);
		System.out.printf("여행가고 싶은 지역 : %s\n", trip);
		System.out.printf("좋아하는 숫자 : %d\n", num);
		System.out.printf("지금 놀고싶은지 여부 : %b\n", now);
		System.out.println("==============================");
		
		System.out.println(size + num);
		// bat(배치) 파일 생성
		System.out.print("끄고 싶으면 아무거나 입력 : ");
		
		String quit = keyboard.next();
		keyboard.close(); // scanner 기능 멈춤
		
		Thread.sleep(1000); // 1초
		System.out.print(".");
		Thread.sleep(1000); // 1초
		System.out.print(".");
		Thread.sleep(1000); // 1초
		System.out.print(".");
		Thread.sleep(1000);
		System.out.println("프로그램을 종료합니다.");
		Thread.sleep(500); // 0.5초
		System.out.println("진짜 안녕!!");
		Thread.sleep(500); // 0.5초
		
	}

}
