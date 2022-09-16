import java.util.Scanner;

public class PMain1 {
	public static void main(String[] args) {
		// 주사위 두 개를 던졌을 때 주사위 눈의 합이 6이 되는 모든 경우의 수를 출력
		// 주사위 두 개 << 반복문
		// 합 << 조건문 주 + 주2 = 7
		
		
		for (int num = 1; num < 7; num++) {
			for (int num2 = 1; num2 < 7; num2++) {
//				System.out.println(num + " " + num2); // 모든 경우의 수
				if(num + num2 == 6) {
					System.out.println(num + " " + num2);
				}
			}
		}
		System.out.println("------------------------");
		// 방정식 : 2x + 4y = 50
		// x, y는 양의 정수 범위는 x, y 모두 0 ~ 30까지
		
		
		for (int x = 1; x < 31; x++) {
			for (int y = 1; y < 31; y++) {
				if (x * 2 + 4 * y == 50) {
					System.out.println("x : "+ x + ", y : " + y);
				}
			}
		}
		System.out.println("------------------------");
		// console에 두 개의 양의 정수 (시작, 끝) 입력 받아서 그 범위 내에 포함하는 모든 숫자를 곱하기
		Scanner k = new Scanner(System.in);
		
		System.out.print("숫자 1 : ");
		int a = k.nextInt();
		System.out.print("숫자 2 : ");
		int b = k.nextInt();
		int sum = 1;
		if (a < b) {
			for (int i = a; i < b + 1; i++) {
				sum *= i;
			}
		} else if (a > b) {
			for (int i = b; i < a + 1; i++) {
				sum *= i;
			}
		}
		System.out.println(sum);
		System.out.println("------------------------");
		
		// 1 + 2 + 3 + 4 + 5 + ... + 10
		// 1 + ( 1 + 2 ) + ( 1 + 2 + 3 ) + ... + (1 + 2 + ... + 9 + 10)
		// 중첩 for 문 (이중 for문)
		// 1 ~ 3
		// 1 + 2
		// 1 + 2 + 3
		int sum2 = 0;
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.println("j의 값 : " + j);
				sum2 += j;
				System.out.println("안쪽 반복문 합의 과정 "+sum2);
			}
			System.out.println(sum2);
			System.out.println("------------");
		}
		System.out.println(sum2);
		System.out.println("------------------------");
//		1 + (-2) + 3 + (-4) + ... 몇까지 더해야 총 합이 150이상이 나올 지
//		while문으로 계속 돌리다가 조건에 부합하면 while문이 깨지도록!
//		조건 : 홀수 짝수
//		숫자가 계속 늘어나야... int num = 0; 초기값 정하고 -> num++;
		int num = 0;
		int sum3 = 0;
		while (true) {
			num ++;
			if(num % 2 == 1) { 	// num이 홀수면 (num을 2로 나눈 나머지가 1이면)
				sum3 += num;		
			} else {			// 홀수가 아니면 (짝수면)
				sum3 -= num;
			}
			System.out.println("현재 숫자 : " + num);
			System.out.println("현재 총합 : " + sum3);
			if(sum3 >= 150) {
				break;
			}
			System.out.println("--------------------");
		}
		System.out.println("최종 숫자 : " + num);
	}
}
