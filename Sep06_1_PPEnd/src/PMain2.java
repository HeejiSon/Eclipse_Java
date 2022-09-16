import java.util.Random;
import java.util.Scanner;

public class PMain2 {
	public static void main(String[] args) {
		
//		int a[] = null;
//		System.out.println("-------------------");
//		for (int i = 0; i < args.length; i++) {
//			System.out.println(a[i] + " ");
//		}
//		System.out.println();
//		
//		int b[] = new int[] {2, 3, 4, 5, 10};
//		int sum = 0;
//		
//		sum += b[0];
//		sum += b[1];
//		sum += b[2];
//		sum += b[3];
//		sum += b[4];
//		
//		System.out.println(sum);
//		System.out.println("-------------------");
//		int ssum = 0;
//		for (int i = 0; i < b.length; i++) {
//			ssum += b[i];
//		}
//		System.out.println(ssum);
//		
		// 5개 과목 점수를 저장할 수 있는 배열 score 선언 및 생성!
		int score[] = new int [5];
		
		// score에 있는 각 요소를 0 ~ 100 사이의 랜덤한 숫자로 값을 넣어주기
		Random r = new Random();
		for (int j = 0; j < score.length; j++) {
			score[j] = r.nextInt(101);
		}
		
		// score 속에 있는 각 요소를 출력
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		
		System.out.println();
		// score 속 요소의 총 합
		int sum1 = 0;
		for (int i = 0; i < score.length; i++) {
			sum1 += score[i];
		}
		System.out.println(sum1);
		System.out.println("---------------------");
		
		// 총 합을 이용하여 평균
		double avg = 0;
		avg = (double) sum1 / score.length;
		System.out.println("평균 : " + avg);
		
		// 최대값, 최소값 구하기!
		int max = 0;
		int min = 100;

		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min)
				min = score[i];
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("----------------");
		
		// 문자 10개 저장할 수 있는 배열을 선언하고 10개를 입력받아 그 문자를 출력
		Scanner k = new Scanner(System.in);
		String[] s = new String[10];
		for (int i = 0; i < s.length; i++) {
			System.err.print("뭐여 : ");
			s[i] = k.next();
		}
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
	}
}
