import java.util.Random;
import java.util.Scanner;

// 홀짝게임 함수.ver

public class FMain7 {
	
	// 랜덤한 동전 개수 가져오기
	public static int shakeCoin() {
		return new Random().nextInt(10)+1;
	}
	
	
	//  홀? 짝? 질문을 해서 내가 console에 입력하게 하기
	public static String askUserAns() {
		System.out.print("홀? 짝? : ");
		return new Scanner(System.in).next();
	}
	
	// 랜덤한 동전 개수가 홀수면 "홀", 짝수면 "짝"이 되도록 하기
	
	public static String getAnswer(int coin){
		String answer = (coin % 2 == 0) ? "짝" : "홀";
		return answer;
		
	}
	
	// 내가 입력한 것과, 랜덤한 동전 개수가 홀, 짝인지를 비교해서 정답 / 땡 처리
	public static String getResult(String userAns, String answer) {
		String result = (userAns.equals(answer)) ? "정답" : "땡";
		return result;
	}
	
	// 동전이 몇 개인지, 내가 입력한 답?, 결과가 뭔지? 출력
	
	public static void printResult(int coin, String userAns, String answer, String result) {
		System.out.printf("동전은 %d개\n", coin);
		System.out.printf("내가 입력한 답 : %s\n", userAns);
		System.out.printf("결과가 %s이라서 [%s]!!", answer, result);
		
	}
	
	public static void main(String[] args) {
		int coin = shakeCoin();
		String userAns = askUserAns();
		String answer = getAnswer(coin);
		String result = getResult(userAns, answer);
		printResult(coin, userAns, answer, result);
		
	}
}
