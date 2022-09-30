package com.son.eh916.calculate;

public class Calculate {
//	1. 여기서 아예 끝장을 보자
//		정상적으로 가격
	public static int divide(int price, int weight) {
		try {
			int d = price / weight;
			return d;
		}catch(Exception e) {
			System.out.println("으엑");
			return -9999;
		} finally {
			System.out.println("ㅋㅋㅋㅋㅋㅋㅋ");
		}
	}
//	2. 미루기 : throws -> try보다 더 주력!
	// divide2를 호출한 쪽에서 해결해라!
	public static int divide2(int price, int weight) throws Exception{
		int d = price / weight;
		return d;
	}
}
