import java.util.Scanner;

// 재귀적 호출(recursive call)
//		함수 안에서 자기자신 ( 그 함수 )를 또 호출 -> 반복

// main에서 게속 함수를 호출한다?  : 느린작업

public class FMain2 {
	
	// 비밀번호 입력 : 대소문자 구분, 특수문자 넣고, 숫자도 혼용, 8글자 이상~
	// console에 정수를 입력받는 함수 => 0 ~ 100까지
	public static int getNum() {
		Scanner k = new Scanner(System.in);	
		System.out.print("0 ~ 100까지만 쓰세요 : ");
		int a = k.nextInt();
		// 삼항연산자 :  (조건식) ?  부합하면 : 부합하지 않으면
		return ((a >= 0) && (a <= 100)) ? a : getNum();
	}
	
	// (3보다 작은) 정수를 하나 입력받는 함수
	// 3이상인 정수를 적었을 때 다시 입력하게(recursive)
	public static int getNum2() {
		Scanner k = new Scanner(System.in);
		System.out.print("3보다 작은 정수를 입력하세요 ");
		int a = k.nextInt();
		return (a < 3) ? a : getNum2();
	}
	
	
	// 홀수만 입력받는 함수
	public static int hole() {
		Scanner k = new Scanner(System.in);
		System.out.print("홀수만 입력하세요 ");
		int a = k.nextInt();
		return (a % 2 == 1) ? a : hole();
	}
	
	public static void main(String[] args) {
		// getNum();
		getNum2();
		hole();
	}

}
