import java.util.Random;
import java.util.Scanner;

// Up & Down 게임
// 1 ~ 100 까지의 숫자 랜덤으로
// 컴퓨터 vs 나 => 같은 숫자 내면 종료
// 숫자가 나보다 낮으면 Down!
// 숫자가 나보다 높으면 Up!
// 몇 턴만에 정답을 찾았는데
// 반복문(for) 조건문(if)

public class RMain1 {
	public static void main(String[] args) {
		Random r = new Random();
		int num = new Random().nextInt(100) + 1;
		
		Scanner k = new Scanner(System.in);
			

		int Mynum = 0;
		// 반복횟수 알 수 없을 때 방법
		
		for (int turn = 1; true; turn++) { 
			System.out.print("숫자를 입력해주세요 : ");
			Mynum = k.nextInt();
			
			if(num == Mynum) {		
				System.out.printf("정답입니다!! %d번\n", turn);
				break;

			} else if(num < Mynum){
				System.out.println("DOWN!");
				
			} else {
				System.out.println("UP!");
				
			}
			System.out.println("---------------");
		}
		
	}
}
