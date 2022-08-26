import java.util.Scanner;

public class KMain2 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		// 반지름의 길이를 입력받아서 원의 면적 계산하기!
		// 원의 면적 = 원주율(3.14) * 반지름 * 반지름
		System.out.print("원의 반지름 : ");
		double radius = keyboard.nextDouble();
		System.out.printf("원의 면적 : %.1f\n",3.14*radius*radius);
		// Math.pow() : 거듭제곱 구하는 방법
		// Math.pow(5, 2) : 5의 2제곱
		System.out.println(Math.PI * Math.pow(radius, 2));
		
		// 가로, 세로 길이 입력 받아서 사각형 면적 계산하기 ( 가로 * 세로 )
		System.out.print("가로 : ");
		double width = keyboard.nextDouble();
		System.out.print("세로 : ");
		double height = keyboard.nextDouble();
		System.out.printf("사각형 면적 : %.1f\n",width*height);
		
	}

}
