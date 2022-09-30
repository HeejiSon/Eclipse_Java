package com.son.eh916.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.son.eh916.calculate.Calculate;

public class EMain3 {
	public static void main(String[] args) {
		// txt 파일을 받ㄷ아와서 뭔가 할건데.. 만약에! 
		// 그 텍스트 파일을 지웠거나, 없는 파일이라면?
//		FileReader fr;
//		try {
////			fr = new FileReader("C:\\Son_Java/text.txt");
//			System.out.println(fr.read());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		// 가격 / 무게(g)를 정수로 입력받아서
		// g당 가격이 얼마인지 구해서 main에 출력
		// 가격, 무게 입력받기, 결과출력 => main에서
		// g당 가격이 얼마인지 계산하는 기능 => Class만들어서
		
		Scanner k =  new Scanner(System.in);
		System.out.print("가격(원) : ");
		int price = k.nextInt();
		System.out.print("무게(g) : ");
		int weight = k.nextInt();
		System.out.println("-----------------");
		int z = Calculate.divide(price, weight);
		System.out.printf("g 당 가격은 %d원\n", z);
		
		try {
			int z2 = Calculate.divide2(price, weight);
			System.out.printf("g 당 가격은 %d원\n", z2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 2번째 -> 해당 함수 호출한 쪽에서 해결해라!
		//		main이 아닌 다른 method에서 try-catch사용은 월권0
		//		try-catch는 main method에서만 사용!
		//	main아닌 곳에서는 throws를 더 많이 사용한다
	
		
	}

}
