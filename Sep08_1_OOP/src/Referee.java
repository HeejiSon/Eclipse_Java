
public class Referee {
	// 나 부르기
	// main method에서 불렀다면 : Me m = new Me();
		public Me callMe() {
			System.out.println("Referee : 야! ");
			System.out.println("Me : 등장!!");
			return new Me();
		}
		
		// 친구에게 답 요구
		public int askFriAns(Friend f) {
			return f.writeFriAns();
		}
		
		// 나에게 답 요구
		public int askMyAns(Me mm) {
			int myAns = mm.tellMyAns();
			if (myAns < 1 || myAns > 100) {	// 범위 밖의 수를 입력하면
				System.out.println("다시 말해볼래 ? ");
			}
			// 범위 안에 있는 숫자 입력하면 그 숫자를 return 그렇지 않으면 현재 method 다시 호출
			return (myAns >= 1 && myAns <= 100) ? myAns : askMyAns(mm);
		}
		
		// 판정(맞출 때까지)
		public boolean judge(int answer, int myAnswer) {
			if (answer == myAnswer) {  // 친구와 내 답이 같다면
				System.out.println("...!!!");
			} else if (answer > myAnswer) {	// 친구 답이 내 답보다 크다면
				System.out.println("UP!!");
			} else {	// 그 이외의 모든 것(친구 답이 내 답보다 작다면)
				System.out.println("DOWN!!");
			}
			return (answer == myAnswer); // == << 연산자: 답이 true, false 둘 중 하나! >> 논리
		}
		
		// 시도 횟수 출력
		public void countTry(int turn) {
			System.out.println("==========================");
			System.out.printf("%d번 시도만에 정답!\n", turn);
			System.out.println("==========================");
		}
		
		// start() 반복문 돌려서 맞췄을 때 반복문 끝나게
		
		public void start(Friend f) {
			Me mm = callMe(); // Me mm == new Me(); >> new Me() 대신 그것을 담은 method 호출
			int answer = askFriAns(f);
			int myAnswer = askMyAns(mm);
			boolean endGame = false;
			// 방법 2
			int turn = 1;
			while(true) {
				myAnswer = askMyAns(mm);
				endGame = judge(answer, myAnswer);
				if(endGame) {
					countTry(turn);
					break;
				}
				turn ++;
			}
		}
//			방법 1
//			for (int turn = 1; true; turn++) {
//				myAnswer = askMyAns(mm);
//				endGame = judge(answer, myAnswer);
//				if(endGame) {	// endGame = true 여야만 if문이 활성화!
//					countTry(turn);
//					break;
//					
//				}
			
		
}
