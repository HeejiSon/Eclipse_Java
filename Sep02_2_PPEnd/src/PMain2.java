import java.util.Scanner;

// 연산자
//		shift 연산자
//		6 << 1
//			앞에 숫자 이진수로 바꿔서
//			왼쪽의 숫자 만큼 왼쪽으로 밀고, 빈칸에는 0을 채워넣기
//			그렇게 만든 수를 다시 십진수로 바꿈

public class PMain2 {
	public static void main(String[] args) {
		// 카페 << 주차장, Wifi, 24시간
		// 24시간 	: 1 << 0 = 1
		// 주차장 	: 1 << 1 = 2
		// Wife 	: 1 << 2 = 4
		// 흡연식	: 1 << 3 = 8
		int button = 7;
		if(button >= (1 << 3)) { // 8
			button -= (1 << 3);
			System.out.println("흡연실");
		}
		if(button >= (1 << 2)) { // 4
			System.out.println("Wifi");
			button -= (1 << 2);
		}
		if(button >= (1 << 1)) { // 2
			System.out.println("주차장");
			button -= (1 << 1);
		}
		if(button >= (1 << 0)) { // 1
			System.out.println("24시간");
			button -= (1 << 0);
		}
		System.out.println(button);
		System.out.println("----------------");
		Scanner k = new Scanner(System.in);
		System.out.print("번호 : ");
		int button2 = k.nextInt();
		String[] option = {"24시간", "주차장", "Wife", "흡연실"};
		for (int i = option.length - 1 ; i >= 0; i--) {
			if(button2 >= (1 << i)) {
				System.out.println(option[i]);
				button2 -= (1 << i);
			}
			System.out.println(i + "]" + button2);
		}
		System.out.println(button2);
		
	}
}
