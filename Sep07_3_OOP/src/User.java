import java.util.Scanner;

public class User {
	Scanner mouth = new Scanner(System.in);
	
	public int answerHowManyCoin() {	// 동전 개수 답하기 용(int)
		return mouth.nextInt();
	}
	
	public String answerHJ() {			// 홀짝 여부 답하기용(String)
		return mouth.next();
	}
}
