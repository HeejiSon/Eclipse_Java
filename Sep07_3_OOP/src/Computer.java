import java.util.Random;

public class Computer {
	Random cpu = new Random();
	int coin = 20;
	// ** 공통 : 재료가 필요한지, 재료로 쓰일 건지!
	
	// 1. 몇개로 할지 묻고 받은 대답을 변수에 담기
	// 변수에 담을 대답(동전의 개수)이 2개 이상 20개 미만이어야 하며 그렇지 않으면 재귀호출
	public int askHowManyCoin(User u) {
		System.out.print("몇개로 할래? (2개 이상 20개 이하) : ");
		// int startCoin이라는 변수에 User클래스에서 가지고 온 대답 method 담기
		int startCoin = u.answerHowManyCoin();
		if (startCoin < 2 || startCoin > 20) {	// 범위를 벗어난 대답이 있을 때 아래가 뜨게
			System.out.println("다시 입력해!!");
		}
		// 범위 내 대답이면 startCoin을 retrun 시키고 그렇지 않으면 지금 method 재귀호출
		return (startCoin >= 2 && startCoin <= 20) ? startCoin : askHowManyCoin(u);
	}
	
	// 2. 컴퓨터가 위의 메소드에서 받은 동전의 개수를 범위로 해서 랜덤하게 섞기
	public int shakeCoin(int userCoin) {
		return cpu.nextInt(userCoin) + 1; // 1,2
	}
	
	// 3. 섞은 동전이 짝인지 홀인지 판단하기
	public String judgeCoin(int shakeCoin) {
		// String what = (shakeCoin % 2 == 0) ? "짝" : "홀";
		// return what;
		// 컴퓨터가 뽑은 동전의 개수를 2로 나눈 나머지가 0과 같다면 (짝수라면) 짝 아니면 홀
		return (shakeCoin % 2 == 0) ? "짝" : "홀";
		
	}
	
	// 4. 유저가 홀, 짝 대답하게 하고 그 외의 말을 쓰면 다시 묻게 하기(재귀호출)
	public String askHJ(User u) {
		System.out.print("홀? 짝? : ");
		String userAns = u.answerHJ();
		return (userAns.equals("홀") || userAns.equals("짝")) ? userAns :askHJ(u);
	}
	
	// 5. 정답인지 오답인지 판단하기
	private String getResult(String comAns, String userAns) {
		// 재료로 start에서 가져온 comAns와 userAns를 비교해서
		return userAns.equals(comAns) ? "정답" : "오답";
	}
	
	// 6. 컴퓨터가 몇개의 동전을 뽑았으며, 짝인지 홀인지 판단하기
	public void printResult(int shakeCoin, String result, String comAns) {
		System.out.printf("동전은 %d개를 뽑았고, %s여서 너는 %s이야!\n", shakeCoin, comAns, result);
	}
	
	// 0. 실행하기
	public void start(User u) {
		int userCoin = askHowManyCoin(u);
//		System.out.println(userCoin);  // 확인용
		int shakeCoin = shakeCoin(userCoin);
//		System.out.println(shakeCoin); // 확인용
		String comAns = judgeCoin(shakeCoin);
//		System.out.println(comAns);
		String userAns = askHJ(u);
//		System.out.println(userAns);
		String result = getResult(comAns, userAns);
//		System.out.println(result);
		printResult(shakeCoin, result, comAns);
	}
}
