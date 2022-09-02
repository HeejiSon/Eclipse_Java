import java.util.Scanner;

public class RMain5 {
	public static void main(String[] args) {
		// 반복문이 10번 -> 1번 돌 때 마다 안녕하세요 1번, 안녕하세요 2번, 안녕하세요 3번...
		// 갑자기 숫자 5가 마음에 안들어... -> i 변수가 5번째일때만 빼고 반복문 돌리고 싶다
		for (int i = 0; i < 10; i++) {
			if(i == 5) {
				continue;	// 강제반복 -> 조건이 있으면 그 부분 무시하고 다음으로 넘어감
//				break;  	// (공식적) 반복문이 끝!
//				return;		// (비공식적) , 함수가 끝, 어쨋든 반복문이 깨지긴 함 !
			}
			System.out.println(i);
			System.out.println("안녕하세요 1번");
			System.out.println("안녕하세요 2번");
			System.out.println("안녕하세요 3번");
		}
		// 반복 10번 -> 반복문 변수 i가 짝수면 무시하고 다음 숫자로 넘어가도록
		// 콘솔에는 해당 반복 횟수가 찍히게 !
		
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				continue;	
			} else {
				System.out.println(i);
			}
		}
		System.out.println("=============");
		// 콘솔에 입력 받을 것
		// 내용 : ㅣㄴ아러쟈ㅣ러ㅐㅈㄷㄹ
		// 내용 : ㅎㅇ
		//			ㄴ 치면 반복문이 종료되게!
		
		Scanner k = new Scanner(System.in);
		String s = null;
		
		while(true) {
			System.out.print("내용 : ");
			s = k.next();
			System.out.println("=============");
			System.out.println(s);
			System.out.println("=============");
			if (s.equals("ㅎㅇ")) {
				System.out.println("반복문 끝!");
				break;
			}
		} 
		
	}
}
