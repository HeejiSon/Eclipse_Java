import java.util.Scanner;

// 거스름돈 계산해주는 프로그램
// 함수사용

// 구매한 물건의 가격 : 3,250
// 내가 낸 돈 : 10,000

// 거스름돈 ; 6,750원
//		50000 	: 0
//		10000 	: 0
//		5000 	: 1
//		1000 	: 1
//		500 	: 1
//		100 	: 2
//		50 		: 1
//		10 		: 0
public class PMain4 {
	
	// 물건 가격 입력하는 함수
	public static int getPrice() {
		Scanner k = new Scanner(System.in);
		System.out.print("물건 가격 : ");
		int price = k.nextInt();
		return price;
	}
	// 낸 돈 입력하는 함수
	public static int payMoney(int price) {
		Scanner k = new Scanner(System.in);
		System.out.print("내가 낸 돈 : ");
		int money = k.nextInt();
		if (money < price) {
			System.out.println("돈이 부족합니다. 그 돈으로 못 사요!");
		}
		return (money >= price) ? money : payMoney(price);
	}
	
	// 거스름돈 계산하는 함수
	public static int getChange(int price, int money) {
		return money - price;
	}
	
	// 위 세 개 출력하는 함수
	public static void printChange(int price, int money, int change) {
		System.out.println("===========================");
		System.out.printf("물건 가격 : %d원\n", price);
		System.out.printf("내가 낸돈 : %d원\n", money);
		System.out.printf("거스름 돈 : %d원\n", change);
		System.out.println("===========================");
	}
	
	// 거스름돈을 화폐에 따라 어떻게 줄건지 ! - 배열 >> for 내가 가진 돈이 나누어 떨어지는지
	public static void printChange(int change) {
		/*int[] currency = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		for (int i = 0; i < currency.length; i++) {
			if(change >= currency[i]) {
				System.out.printf("%d원 권 : %d개\n", currency[i],(change / currency[i]));
				change %= currency[i]; // change를 currency[i]로 나눈 나머지를 다시 change에 넣겠다.
			}
		}*/
		int currency2 = 100000;
		while (true) {
			currency2 /= 2; // currency 를 나누기 2한 몫을 currency2에 다시 담는 것
			if (change >= currency2) {
				System.out.printf("%d원 권 : %d개\n", currency2, (change / currency2));
				change %= currency2;
			}
			currency2 /= 5;
			if (change >= currency2) {
				System.out.printf("%d원 권 : %d개\n", currency2, (change / currency2));
				change %= currency2;
			}
			if (currency2 == 10) {
				break;
			}
			
		}
	}
	
	// main 함수에 다른 함수들 담아서 실행되게
	// 리턴을 받았다 -> 반수에 담아서 함수 호출
	// 리턴 안 받았다 -> 그냥 함수명만 호출
	
	public static void main(String[] args) {
		int price = getPrice();
		int money = payMoney(price);
		int change = getChange(price, money);
		printChange(price, money, change);
		printChange(change);
	}
}
