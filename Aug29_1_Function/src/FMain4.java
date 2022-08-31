import java.util.Scanner;

// public static A  B (C){
//		내용
//		return a'
// }

// A  : [리턴타입] main으로 보낼만한(main에서 활용할 만한) 것이 있을 때 그 변수명에 해당하는
//		자료형(함수에서 작업한 결과를 호출한 쪽으로 보낼 때)

// B  :	[함수명] 어떤 기능을 포함하고 있는지 파악이 대충이라도 가능하게 -> 동사느낌
// C  : [파라미터] main에서 가져와서 활용할 만한 것(재료)가 있을 때
//		(함수를 호출하는 쪽(main)에서 함수쪽으로 데이터를 보낼 때)
// a  : [리턴] main으로 보내고 싶은(함수를 호출한 쪽으로 보내고 싶은) 것의 변수명

public class FMain4 {
	
	public static void momsCall() {
		 System.out.println("딸~");
		 System.out.println("돈 줄테니까");
		 System.out.println("마트 가서");
		 System.out.println("라면이랑");
		 System.out.println("계란 한판 사고");
		 System.out.println("남은 돈 가져와");
		 System.out.println("-----------------");
	}
	 
	public static int takeMoney() {
		Scanner k = new Scanner(System.in);		// console창에 입력 받을 준비
		System.out.print("엄마가 준 돈 : ");	// console창에 쓸 자리 만들기
		int money = k.nextInt();				// console에 입력받은 값 담을 변수 생성
		System.out.printf("엄마가 %,d원을 주셨다!\n", money);
		System.out.println("------------------");
		return money;
		// 리턴을 할 money의 자료형이 int이므로 리턴타입도 int
	}
	 
	 // 엄마가 준 돈 -  물건 산 가격 =  거스름돈
	public static void calculate(int m) { // 재료가 필요
		 int ramyeon = 2000;
		 int eggs = 5500;
		 int snack = 1000;
		 
		 int restMoney = m - (ramyeon + eggs + snack);
		 // System.out.println("심부름 하면 " + restMoney + "원이 남네...");
		 System.out.printf("심부름 하면 %,d원이 남네\n", restMoney);
	}
	 
	//
	public static int doBbingddang(int m) {
		int ramyeon = 2000;
		int eggs = 5500;
		int snack = 1000;
		int bbingddang = 1000;
		
		int lastMoney = m - (ramyeon + eggs + snack + bbingddang);
		return lastMoney;
	}
	 
	 public static void main(String[] args) {
		momsCall();
		int money = takeMoney();
		calculate(money);
		int lastMoney = doBbingddang(money);
		System.out.println(lastMoney);
	}
	 
	 // main함수는 코드를 최대한 짧게 구성하는 것이 원칙
	 // 기능별로 묶어서 함수라는 것을 사용!
	 // 기능을 나눠서 효율적으로 사용!

	 // 1. 보기편하게
	 //	2. 오류 발견이 편하게
	 // 3. 역할 나눔
	 // 4. 다른 곳(다른 함수)에서 활용도 가능
	 
}
