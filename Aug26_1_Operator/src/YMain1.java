import java.util.Scanner;

public class YMain1 {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		// 1. 오늘 기분 어떠신지?
		System.out.print("오늘 기분 어떠신지? : ");
		String feeling = k.next();
		
		// 2. 오늘의 컨디션 점수? - 정수
		System.out.print("오늘의 컨디션 점수? : ");
		int con = k.nextInt();
		
		// 3. 대중교통 몇 번 갈아탔는지 - 정수
		System.out.print("대중교통 몇 번 갈아탔는지? : ");
		int tran = k.nextInt();
		
		// 4. 어젯밤에 푹 주무셨는지(true / false)
		System.out.print("어젯밤에 푹 주무셨는지? : ");
		boolean yes = k.nextBoolean();
		
		// 5. 몇 시간 정도 주무셨는지 ( 8.0시간 )
		System.out.print("몇 시간 정도 주무셨는지? : ");
		double sleep = k.nextDouble();
		
		////////////////////////
		//printf 출력
		
		System.out.println("////////////////////////");
		System.out.printf("오늘 기분 어떠신지? : %s\n", feeling);
		System.out.printf("오늘의 컨디션 점수? : %d점\n", con);
		System.out.printf("대중교통 몇 번 갈아탔는지? : %d번\n", tran);
		System.out.printf("어젯밤에 푹 주무셨는지? : %b\n", yes);
		System.out.printf("몇 시간 정도 주무셨는지? : %.1f시간", sleep);
	}

}
