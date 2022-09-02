import java.util.Random;

public class RMain3 {
	public static void main(String[] args) {

		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if(i % 6 == 0) {
				sum += i;
				System.out.println("현재 숫자(6의 배수) : " + i);
				System.out.println("현재까지의 합 : " + sum);
				System.out.println("-----------------");
			}
			System.out.println("현재 숫자 : " + i);
			System.out.println("현재까지의 합 : " + sum);
			System.out.println("-----------------");
		}
		System.out.println("총 합 : " + sum);
		System.out.println("-----------------");
		
		// 4x + 5y = 60이 되는 해(정수)를 모두 구해서
		// (x, y)의 형태로 출력
		// x, y는 둘다 1 ~ 10 이하(10 포함)의 정수만
		
		for (int x = 1; x < 11; x++) {
			for (int y = 1; y < 11; y++) {
				if((4 * x) + (5 * y) == 60) {
					System.out.printf("(%d, %d)\n", x, y);
					//System.out.println("(" + x + "," + y + ")");
				}
			}
		}
	}
}
