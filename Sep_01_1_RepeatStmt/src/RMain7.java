import java.util.Scanner;

//  ATM 기능을 하는 프로그램
//	1을 고르면 입금 / 2를 고르면 출금 / 3을 고르면 잔고확인 / 4를 고르면 프로그램 종료(break)
//	입금, 출금의 돈의 값은(금액) 입력 받을 것
// 	반복문 : while
// 	조건문 : if, switch-case
public class RMain7 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		// int choice = 0;
		int a = 0;
		
		int money = 0;
		int plusMoney = 0;
		int minusMoney = 0;
		int choice = 0;
		
		a : while(true) {
			System.out.println("--------------------------");
			System.out.println("1. 입금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------");
			System.out.print("선택 >> ");
			choice = k.nextInt();
			switch (choice) {
			case 4:
				System.out.println("프로그램 종료!");
				break a;
			case 3:
				System.out.printf("잔고 > %d원\n", money);
				break; // break를 걸지 않으면 아래 case에 있는 부분도 전부 진행되므로 필수!
			case 1:
				System.out.print("예금액 > ");
				plusMoney = k.nextInt();
				System.out.printf("%d원을 예금합니다\n", plusMoney);
				money += plusMoney;
				break;
			case 2:
				System.out.println("출금액 > ");
				minusMoney = k.nextInt();
				if (money >= minusMoney) { // 지갑에 있는 돈이 더 많으면
					System.out.printf("%d원을 출금합니다\n", minusMoney);
					money -= minusMoney;
				} else {
					System.out.println("너는 그만큼을 가지고 있지 않아");
				}
				break;
			}
			
//			if (choice == 4) {
//				System.out.println("프로그램 종료!");
//				break;
//			} else if (choice == 3){
//				System.out.printf("잔고 > %d원\n", money);
//			} else if (choice == 1) {
//				System.out.println("예금액 > ");
//				plusMoney = k.nextInt();
//				System.out.printf("%d원을 예금합니다\n", plusMoney);
//				money += plusMoney;
//			} else if (choice == 2) {
//				System.out.println("출금액 > ");
//				minusMoney = k.nextInt();
//				System.out.printf("%d원을 출금합니다\n", minusMoney);
//				money -= minusMoney;
//			}
			
			
//			switch (choice) {
//			case 1:
//				System.out.print("입금액 : ");
//				a = k.nextInt();
//				System.out.println(a + "원을 입금합니다.");
//				money = money + a;
//				break;
//			case 2:
//				System.out.print("출금액 : ");
//				a = k.nextInt();
//				System.out.println(a + "원을 출금합니다.");
//				money = money - a;
//				break;
//			case 3:
//				System.out.println("잔고확인 : " + money + "원");
//				break;
//			case 4:
//				break a;
//			}
		}
	}
}
