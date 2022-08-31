import java.util.Random;
import java.util.Scanner;

// 	public static A B (C) 
// 		내용
//		return
// 	}

// A (return type) 	: 	해당 함수에서 작업한 결과를 호출한 쪽 (main함수)으로 보낼 때,
//					 	작업한 결과의 자료형

// B (함수형)		: 	기능이 어떤건지 대충이라도 보이도록, 동사스러운 작명, 낙타체 or 뱀체

// C (parameter)	:	함수를 호출하는 쪽(main 함수)에서 해당 함수쪽으로 데이터를 보낼 때
//						(자료형 변수명, 자료형 변수명, ...)

// return : 리턴 줄 아래에는 어떤 코드를 작성해도 나오지 않음
//			무조건 함수의 마지막 줄이어야만!
public class FMain1 {
	
	public static String getName() {
		Scanner k = new Scanner(System.in);	
		System.out.print("이름 : ");
		String name = k.next();
		return name;
	}
	
	// 랜덤한 정수를 하나 구하는 함수(정수의 범위는 따로 지정하지 않음)
	public static int random() {
		return new Random().nextInt();
	}
	
	// 두 정수를 더한 값을 구해서 출력하는 함수(변수X, syso)
	public static void printInt(int a, int b) {
		System.out.println(a + b);

	}
	
	public static void main(String[] args) {
		// getName();
		int a = random();
		int b = random();
		printInt(a, b);
	}
}
