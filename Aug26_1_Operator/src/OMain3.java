import java.util.Random;
import java.util.Scanner;

public class OMain3 {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		// 1. 랜덤으로 뽑을 준비 필요
		Random r = new Random();
		// 2. 1 ~ 10 사이의 숫자가 랜덤으로 하나 뽑히게
		int number = r.nextInt(10) + 1; // 1 ~ 10
		System.out.println(number);
		
		// 3. 뽑은 숫자가 짝수 "짝", 홀수 "홀"
		String answer1 = (number % 2 == 0) ? "짝" : "홀";
		//System.out.println(number % 2 == 0 ? "짝" : "홀");
		
		// 4. 콘솔에 짝, 홀 하나 쓰도록
		System.out.printf("짝 , 홀 : ");
		String answer = k.next();
		
		// 5. 삼항연산자로 정답 or 땡 구분
		System.out.println(answer.equals(answer1) ? "정답" : "땡");
	}
}
