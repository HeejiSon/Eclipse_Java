import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class PMain1 {
	public static void main(String[] args) {
		// 10개 숫자를 입력받아서 (console에 내가 쓴다)
		// 하나의 배열에 담고 -> 그대로 출력
		
		/* int[] num = new int[10];
		Scanner k = new Scanner(System.in);
		int t = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d번째 숫자 : ", i + 1);
			t = k.nextInt();
			num[i] = t;
		}
		for (int i : num) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("------------------"); */
		
		// 10개의 숫자를 랜덤으로 뽑아서 (1 ~ 100)
		// 배열에 담고 -> 그대로 출력!
		
		int[] num2 = new int[10];
		Random r = new Random();
		int t1 = 0;
		for (int i = 0; i < num2.length; i++) {
			t1 = r.nextInt(100) + 1;
			num2[i] = t1;
		}
		for (int i : num2) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("------------------");

		// 배열 num2로 받아온 최대값, 최소값 구하기 -> 출력
		// 옮겨담기 개념은 bubble sort와 비슷
		// 임시변수그릇 하나 만들었었음
		// 최대값 용 임시변수 : 배열의 0번째 숫자가 최대값이라고 가정
		// 최소값 용 임시변수 : 배열의 0번째 숫자가 최소값이라고 가정
		
		int max = num2[0];		// 배열의 0번째 숫자가 최대값이라고 가정
		int min = num2[0];		// 배열의 0번째 숫자가 최소값이라고 가정
		for (int i = 0; i < num2.length; i++) {
			if(min > num2 [i]) {		// min의 숫자보다 num2[i]번째의 숫자가 더 작다면
				min = num2[i];			// min그릇에 num2[i]번째의 숫자를 옮겨담기
			} else if (max < num2[i]) {	// max의 숫자보다 num2[i]번째의 숫자가 더 크다면
				max = num2[i];			// num2[i]번째의 숫자를 max 그릇에 옮겨담기
			}
			System.out.println("지금 turn" + i + "] 비교 숫자: " + num2[i]);
			System.out.println("현재 min : " + min);
			System.out.println("현재 max : " + max);
			System.out.println("------------------");
		}
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
		
	}
}
