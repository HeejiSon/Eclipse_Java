package com.son.sp915.main;

import com.son.sp915.bf.Bf;

// 원하는 객체 하나 생성
//		이름, 나이, 별명
//		출력

public class Main {
	public static void main(String[] args) {
		// 객체 불러와서 출력
//		Bf bf = new Bf("방찬우", 26, "방찬깅");
//		bf.printInfo();
//		System.out.println(bf);
//		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
//		Bf bf2 = new Bf("방찬우", 26, "방찬깅");
//		bf.printInfo();
//		System.out.println(bf2);
		Bf bf = Bf.getBf();
		bf.printInfo();
		System.out.println(bf);
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		Bf bf2 = Bf.getBf();
		bf2.printInfo();
		System.out.println(bf2);
		
	}
}
