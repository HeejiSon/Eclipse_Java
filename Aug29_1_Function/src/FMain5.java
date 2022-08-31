import java.util.Scanner;

public class FMain5 {
	
	public static void printMul(double a, double b) {
		double bigger = (a > b) ? a : b;
		bigger *= 100; 
		//System.out.printf("실수 두 개 중 더 큰 숫자는 %.1f 다.", (a > b) ? a : b);
		System.out.println(bigger);
	}
	
	public static int printBig(int a, int b) {
		int big = (a > b) ? a : b;
		
		return big * 1000;
	}
	public static void main(String[] args) throws InterruptedException {
		printMul(5.7, 2.3);
		int lala = printBig(8, 23);
		Thread.sleep(lala);
	}
}
