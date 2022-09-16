import java.util.Scanner;

// pp(Procedural Programming, 절차지향프로그래밍)
// oop

// 콘솔창에 숫자를 입력받도록
// 그 숫자의 약수를 구해서 출력하는 프로그램 6의 약수 (1, 2, 3, 6) / 음수를 무시!
// 숫자를 입력할 때 마다 계속 해당하는 숫자의 약수를 보여주다가
// 입력창에 0쓰면 프로그램 종료하게 (0쓰기 전까지는 무한반복)
// 배열 사용 X!!

public class PMain1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int num = 0;
		
		while(true) {
			System.out.print("숫자입력(0은 종료) : ");
			num = k.nextInt();
			if (num == 0) {
				System.out.println("종료합니다");
				break;
			}
			System.out.printf("[%d]의 약수는 : ", num);
			for (int i = 1; i < num; i++) {
				if(num % i == 0) {
					System.out.printf("%d ", i);
				}
			}
			System.out.println();
		}
	}
}
