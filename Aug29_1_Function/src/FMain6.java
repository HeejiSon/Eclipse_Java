import java.util.Scanner;

// 비만도 검사 프로그램(함수.ver)

// 키, 몸무게 입력받기 가능
// 표준체중 = (키 - 100) * 0.9
// 비만도  = (몸무게 / 표준체중) * 100
// 비만도 120이 넘으면 '비만', 그렇지 않으면 '안 비만'

public class FMain6 {
	
	// 지금 하는 함수가 다른데서 쓰이는지 여부 확인
	
	// 비만도 검사 시작! 함수
	public static void start() {
		System.out.println("비만도 검사 시작!");
	}
	
	// 키를 입력받는 함수
	public static double getHeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("키 : ");
		double height = k.nextDouble();
		return height;  // 다른데서 재료로 가져다 쓰기 위해
	}
	
	// 몸무게를 입력받는 함수
	public static double getWeight() {
		System.out.print("몸무게 : ");
		return new Scanner(System.in).nextDouble();
	}
	
	// 키를 넣으면 표준 체중을 구해주는 함수
		public static double calcStdWeight(double h) {
			// double stdWeight = (h- 100) * 0.9;
			// return stdWeight; 
			// -> 내용 동일
			return (h - 100) * 0.9;
			
		}
	
	// 실제 체중과 표준 체중을 넣으면 비만도를 구해주는 함수
	public static double calcBimando(double w, double std) {
		double bimando = (w / std) * 100;
		return bimando;

	}
	
	// 비만인지 안 비만인지 판정해주는 함수
	public static String judgeBimando(double b) {
		String result = (b > 120) ? "비만" : "안 비만";
		return result;
	}
	
	
	// 결과를 출력해주는 함수
	public static void printResult(double h, double w, double s, double b, String r) {
		System.out.println("++++++++++++++++++++++");
		System.out.printf("키 : %.1fcm\n", h);
		System.out.printf("몸무게 : %.1fkg\n", w);
		System.out.printf("표준체중 : %.1fkg\n", s);
		System.out.printf("비만도 : %.1f\n", b);
		System.out.printf("당신은 [%s]입니다\n",r);
		System.out.println("++++++++++++++++++++++");
	}
	
	
	// 함수를 호출하는 부분
	public static void main(String[] args) {
		start();
		double h = getHeight();
		double w = getWeight();
		double stdWeight = calcStdWeight(h);
		double bimando = calcBimando(w, stdWeight);
		String result = judgeBimando(bimando);
		printResult(h, w, stdWeight, bimando, result);
		
		
	}

}
