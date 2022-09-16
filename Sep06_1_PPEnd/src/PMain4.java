import java.util.Random;
import java.util.Scanner;

// 컴퓨터와 가위바위보하기
// 사고력?!
// 숫자로 가위 1, 바위 2, 보 3
public class PMain4 {
	// 숫자로 가위 1, 바위 2, 보 3 인 것을 알려주는 함수
	public static void print(String h[]) {
		System.out.println("====================");
		for (int i = 1; i < h.length; i++) {
			System.out.printf("(%d) %s\n", i, h[i]);
		}
		System.out.println("====================");

	}
	// 컴퓨터가 랜덤으로 숫자 뽑도록
	public static int comFire() {
		Random r = new Random();
		int ch = r.nextInt(3) + 1;
		return ch;	
	}
	
	// 내가 숫자 낼 수 있도록
	private static int userFire() {
		Scanner k = new Scanner(System.in);
		System.out.print("뭐 낼래 ? : ");
		int uh = k.nextInt();
		return (uh >= 1 && uh <= 3) ? uh : userFire();
	}
	
	// 승무패 가르기
	public static int judge(int c, int u) {
		int t = u - c;
		// 가위(1) 바위 (2) > 내가 > 1
		if (t == 0) {
			System.out.println("무승부");
			return 0;
		} else if (t == 1 || t == -2) {
			System.out.println("나의 승리");
			return 1;
		} else{
			System.out.println("패배");
			return -123123;
		}
	}
	
	// 내가 낸거, 컴퓨터가 낸 거 뭔지 보여주는 함수
	public static void printHand(int u, int c, String[] h) {
		System.out.printf("내가 낸 거\t : %s\n", h[u]);
		System.out.printf("컴퓨터가 낸 거\t : %s\n", h[c]);
	}
	
	// main함수에서 실행이 가능하게 >> 몇 연승 했는지(지면 프로그램 반복이 종료되도록)
	public static void main(String[] args) {
		String hand[] = {"ㅋ", "가위", "바위", "보"};
		print(hand);
//		System.out.println(comFire());  확인용
		
		int computer = 0;
		int user = 0;
		int win = 0;
		int j = 0;
		
		while (true) {
			computer = comFire();
			user = userFire();
			printHand(user, computer, hand);
			j = judge(computer, user);
			if (j == -123123) {
				System.out.printf("%d연승\n", win);
				break;
			}
			win += j;
		}
	}
}
