import java.util.Scanner;

public class OMain2 {
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		// 비만도 측정
		// 1. 키, 몸무게를 받는 변수
		System.out.print("키 : ");
		double height = k.nextDouble();
		
		System.out.print("몸무게 : ");
		double weight = k.nextDouble();
		
		// 2. 표준체중 구하기 : (키 - 100) * 0.9
		double avg = (height - 100) * 0.9;
		System.out.printf("표준체중 : %.1f\n", avg);
		
		// 3. 비만도 구하기 : (몸무게 / 표준체중) * 100
		double bmi = weight / avg * 100;
		System.out.printf("비만도 : %.1f\n",bmi);
		
		// 4. 비만도가 120초과면 "비만" 그렇지 않으면 "정상"
		System.out.printf(bmi > 120 ? "비만" : "정상");
	} 
}
