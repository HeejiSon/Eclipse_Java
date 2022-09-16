import java.util.Scanner;

// 함수.ver
	// 1을 입력하면 학생 수 값을 입력받을 수 있도록
	// 2를 입력하면 각 학생들의 점수를 입력받을 수 있도록
	// 3을 입력하면 학생들의 점수 리스트 출력 가능 (ex : 1번 학생 점수 - 50점)
	// 4를 입력하면 최고점수와 평균점수를 분석해서 출력할 수 있도록
	// 5를 입력하면 프로그램이 종료

public class PMain3 {
	
	// 첫 시작부분 함수
	public static void start() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("[1 : 학생 수 | 2 : 점수 입력 | 3 : 점수 리스트 | 4 : 분석 | 5 : 종료");
		System.out.println("--------------------------------------------------------------------");	
	}
	// 선택한 메뉴 번호 받아오는 함수
	public static int getSelectNo() {
		Scanner k =  new Scanner(System.in);
		System.out.print("번호 입력 >> ");
		int selectNo = k.nextInt();
		return selectNo;
	}
	
	// 학생수 값 받아오는 함수
	public static int getStudentNum() {
		Scanner k =  new Scanner(System.in);
		System.out.print("학생 수 : ");
		int studentNum = k.nextInt();
		
		return studentNum;
	}
	
	// 학생 개개인의 점수 받아오는 함수 (0 ~ 100 사이 점수)
	public static int getScore() {
		Scanner k =  new Scanner(System.in);
		int score = k.nextInt();
		if (score > 100) {
			System.out.println("점수는 100점을 넘을 수 없습니다.");
			System.out.print("다시 입력 : ");
		} else if (score < 0) {
			System.out.println("점수는 0점보다 낮을 수 없습니다.");
			System.out.print("다시 입력 : ");
		}
		return (score >= 00 && score <= 100) ? score : getScore();
	}	
	// 받아온 점수를 배열에 입력하는 함수
	public static int[] getScore(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d번 학생 점수 입력 : ", i + 1);
			scores[i] = getScore();
		}
		return scores;
	}
	
	// 학생들 점수 출력하는 함수
	public static void printScore(int[] scores) {
		int index = 1;
		for (int i : scores) {
			System.out.printf("%d번] 학생 점수 : %d\n", index++, i);
			
		}
	}
	
	// 총점, 최고점수, 평균점수 출력하는 함수
	public static void printstust(int[] scores) {
		int sum = 0;
		int max = 0;
		double avg = 0;
		for (int i : scores) {
			sum += i;
			max = (max < i) ? i : max;
		}
		avg = (double) sum / scores.length;
		System.out.printf("총 점 : %d\n", sum);
		System.out.printf("평균 : %.2f\n", avg);
		System.out.printf("최고점수 : %d\n", max);
	}
	
	// 종료 메시지 뜨는 함수
	public static void end() {
		System.out.println("종료합니다");
		System.out.println("--------------------------------------------------------------------");
	}
	
	// 전체 프로그램이 돌아갈 기능 함수
	public static void activate() {
		// 리턴받는 함수를 받아올 때에는 변수를 새로 만들어서 저장해야 하는데
		// 반복문 안에서는 변수 새로 생성하는 것을 지양하기 때문에
		// 반복문 밖에서 변수 초기화를 시키고, 반복문 안에서는 값 변경만 이루어지도록!
		int selectNo = 0;
		int studentNum = 0;
		int[] scores = null;
		while(true) {
			start();
			selectNo = getSelectNo();
			if (selectNo == 5) {
				end();
				break;
			} else if (selectNo == 1) {		
				studentNum = getStudentNum(); 	// 학생의 수를 리턴받아서 studentNum에 저장
				scores = new int[studentNum];	// 저장한 학생의 수를 배열의 크기로 지정
			} else if (selectNo == 2) {
				getScore(scores);
			} else if (selectNo == 3) {
				printScore(scores);
			}  else if (selectNo == 4) {
				printstust(scores);
			} else {
				System.out.println("입력이 잘못되었습니다.");
				System.out.println("다시 입력하세요.");
			}
		}
	}
	public static void main(String[] args) {
		activate();
	}
}
