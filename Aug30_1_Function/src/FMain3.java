import java.util.Scanner;

public class FMain3 {
	
	// 1씩 증가하는 등차수열 :
	// 4를 입력하면 : 1 + 2 + 3 + 4
	// 1부터 해당하는 숫자까지 다 더한 값을 구해주는 함수
	public static int add(int x) {
		// 삼항 연산자 이용
		int answer = (x == 1) ? 1 : (x + add(x - 1));
		return answer;
	}
	
	// factorial
	//	6! = 720 (6*5*4*3*2*1)
	
	// 정수를 하나 넣으면 factorial 값 구하는 함수
	public static int factorial(int x) {
		// 삼항 연산자 이용
		int answer = (x == 1) ? 1 : (x * factorial(x - 1));
		return answer;
	}

	public static void main(String[] args) {
		int a = add(5);
		System.out.println(a);
		int b = factorial(4);
		System.out.println(b);
	}
}
