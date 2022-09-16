
public class Referee {
	// 룰북 << 멤버 변수
	String[] ruleBook = new String[] {"", "가위", "바위", "보"};
	
	// 1. 룰북을 콘솔에 보여주는 메소드 ex) 1.가위...
	public void readRuleBook() {
		System.out.println("==================");
		for (int i = 0; i < ruleBook.length; i++) {
			System.out.printf("%d. %s\n", i, ruleBook[i]);
		}
		System.out.println("==================");
	}
	// 2. 컴퓨터의 결정
	public int askAns(Computer c) {
//		int comAns = c.fire();
//		return comAns;
		return c.fire();
	}
	// 3. 나의 결정
	// parameter가 위의 컴퓨터의 결정과 다르기 때문에 오버로딩 가능!
	public int askAns(Me mm) {
		System.out.print("뭐 낼래? : ");
		int meAns = mm.fire();
		return (meAns >= 1 && meAns <= 3) ? meAns : askAns(mm);
	}
	
	// 4. 누가 뭐냈는지 출력
	public void printHand(int comAns, int meAns) {
		System.out.printf("컴퓨터는 : %s\n", ruleBook[comAns]);
		System.out.printf("나는 : %s\n", ruleBook[meAns]);
	}
	
	// 5. 판정하기
	public boolean judgeWin(int comAns, int meAns, Me mm) {
		int result = meAns - comAns;
		if (result == 0) {
			System.out.println("비겼다!");
			mm.draw++;
		} else if (result == -1 || result == 2) {
			System.out.println("패배!");
		} else {
			System.out.println("승리!");
			mm.win++;
		}
		return (result == -1 || result == 2);	
	}
	
	// 6. 결과 ex) 3승 5무
	public void sayIWin(Me mm) {
		System.out.printf("경기결과 >> %d승 %d무\n",mm.win, mm.draw);
	}
	
	// 0. start() << 반복문!
	public void start(Computer c, Me mm) {
		readRuleBook();
		int comAns;
		int meAns;
		while(true) {
			comAns = askAns(c);
			meAns = askAns(mm);
			printHand(comAns, meAns);
			System.out.println("=====================");
			if(judgeWin(comAns, meAns, mm)) {
				sayIWin(mm);
				break;
			}
			System.out.println("=====================");
		}
		
	}
}
