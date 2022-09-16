import java.util.Scanner;

public class PMain2 {
	public static void main(String[] args) {
		// 1을 입력하면 학생 수 값을 입력받을 수 있도록
		// 2를 입력하면 각 학생들의 점수를 입력받을 수 있도록
		// 3을 입력하면 학생들의 점수 리스트 출력 가능 (ex : 1번 학생 점수 - 50점)
		// 4를 입력하면 최고점수와 평균점수를 분석해서 출력할 수 있도록
		// 5를 입력하면 프로그램이 종료
		
		Scanner k =  new Scanner(System.in);
		int selectNo = 0;
		int stu = 0;
		int[] scores = null;
		
		a : while (true) {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("[1 : 학생 수 | 2 : 점수 입력 | 3 : 점수 리스트 | 4 : 분석 | 5 : 종료");
			System.out.println("--------------------------------------------------------------------");
			System.out.print("번호 입력 >> ");
			selectNo = k.nextInt();
			switch (selectNo) {
			case 5:
				System.out.println("종료합니다");
				System.out.println("--------------------------------------------------------------------");
				break a;
			case 1:
				System.out.print("학생 수 : ");
				stu = k.nextInt();
				scores = new int[stu]; // 배열의 범위를 학생 수 만큼으로 지정
				break;
			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("%d번 학생 점수 : ",i + 1);
					scores[i] = k.nextInt();
				}		
				break;
			case 3:
				int index = 1;
				for (int i :scores) {
					System.out.printf("%d번 학생 점수 ㅣ %d점\n", index++, i);
				}	// index++ = index += 1 => index + 1
				break;
			case 4:
				int max = 0;
				int sum = 0;
				double avg = 0;
				for (int i : scores) {
					sum += i;
					// i가 max보다 크면 i를 max에 담고 그렇지 않으면 max 값 그대로 유지
					max = (max < i) ? i : max;
				}
				avg = (double) sum / scores.length;
				System.out.printf("총 합 :  %d\n", sum);
				System.out.printf("평균 점수 : %.2f\n", avg);
				System.out.printf("최고 점수 : %d\n", max);
				break;

			}
		}
	}
}
