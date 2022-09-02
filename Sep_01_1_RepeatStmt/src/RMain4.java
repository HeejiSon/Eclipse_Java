import java.util.Random;

public class RMain4 {
	public static void main(String[] args) {
		
		// 1 ~ 10 사이의 랜덤한 숫자
		// 5번 반복하는 동안 랜덤한 숫자가 뽑히게
		
		Random r = new Random();
		int num = 0;
		
		for (int i = 0; i < 5; i++) {
			num = r.nextInt(10) + 1;
			System.out.printf("%d\n", num);
		}
		System.out.println("---------------");
		
		// 1 ~ 10 사이의 랜덤한 숫자
		// 반복 계속 하는 동안 랜덤한 숫자가 뽑히다가 숫자 9가 나오면 반복문 종료
		
		int x = 0;
		
		for (int i = 0; true; i++) {
			x = r.nextInt(10) + 1;
			if(x == 9) {
//				System.out.println(x);
//				System.out.println("9가 나와서 종료합니다.");
				break;
			}
				System.out.println(x);
			
		}
		
		// for문 : 조건이 명확할 때 주로 사용 (반복 횟수가 정해져 있을 때)
		// while문 : 조건을 먼저 검사
		//			 조건이 true(참)인 동안에 계속 반복해서 수행 부분을 실행시키는
		//			 멈추는 법 1 : 실행부분에서 조건을 거짓(false)로 만들거나
		//			 멈추는 법 2 : break; 명령어로 반복문을 종료시키거나
		//			 무한대로 반복하고 싶을 때 while(true)
		
		// while : 	반복 횟수를 정확히 알 수 없을 때,
		//			특별한 조건에서 멈춰야 하는 경우에 주로 사용
		
//		while (조건식) {
//			내용
//		}
		
		// 한번도 반복을 하지 않을 수도 있음
		int y = r.nextInt(10) + 1;	// 랜덤한 정수를 먼저 한 번 뽑고
		while (y != 9) {			// y의 값이 9가 아니면
			System.out.println(y);	// 콘솔에 y의 값 출력해주고
			y = r.nextInt(10) + 1;	// 다시 랜덤한 정수를 한번 뽑아서 while문 진행
		}
		// do - while (거의 안씀) : 실행부터 하고 그 다음에 조건을 검사
		//							 한번은 반복을 보장!
		
		do {
			System.out.println(y);	
			y = r.nextInt(10) + 1;
		}while (y != 9);
		
		System.out.println("---------------");
		// 1 + 2 + 3 + ... + 10 = ?			-> for문
		// 1 + 2 + 3 + ... + n <= 100		-> while문
		// 1 ~ n 번째까지 더했을 때 100이 넘어가면 반복문이 종료되게
		// 총 합은 / n의 값은 몇인지
		
		// for
		int sum = 0;
		int num1 = 0;
//		for (int i = 1; i < 11; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//		System.out.println("---------------");
		
		// while
		while (sum < 100) { //sum이 100보다 작아야 반복문이 계속 돌 수 있음
			num1 ++;
			System.out.println("현재 num 변수에 있는 값 : " + num1);
			sum += num1;
			System.out.println("현재 숫자까지 더한 값 : " + sum);
		}
		System.out.printf("n의 값 : %d\n", num1);
		System.out.printf("총 합 : %d\n", sum);
		System.out.println("---------------");
		
		// 1000 이하의 숫자 중에서
		// 가장 큰 15의 배수는?
		
		int num2 = 1000;
		
		while (num2 % 15 > 0) { 	// 조건에 부합하는 동안은 계속 돌아라
								// num2가 15로 나눴을 때의 나머지가 0이 아닌 동안 -> 0이면 멈춰라
			num2 --;
			System.out.println("현재 num2에 있는 값 : "+ num2);
		}
		System.out.println("최종 num2 값 : "+ num2);
	}
}
