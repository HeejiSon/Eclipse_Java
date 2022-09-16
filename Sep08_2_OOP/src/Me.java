import java.util.Scanner;

public class Me {
//  가위바위보 중 하나를 내야 함
	Scanner k = new Scanner(System.in);
	int win;
	int draw;
//  이겼을 때 카운트 할 용
//	비겼을 때 카운트 할 용
//	졌을 때 카운트 할 용 -> 지는 순간 게임 끝! (카운트 할 필요가 X)
	public int fire() {
		return k.nextInt();
	}
}
