// Java GUI 프로그램(Graphic User Interface)
//		AWT, Swing, JavaFx

// AWT : 자바 초창기에 나온 GUI 라이브러리
//		운영체제(OS)에 따라 모양이 전부 달랐음, 종류도 상당히 제한적

// Swing : AWT 다음으로 나온 라이브러리
//		윈도우 프로그램 - 자바로 X : 느림, 더 최적화된 C언어 라인이 있음
//		윈도우 프로그램 잘 안만듦 ... -> 앱 / 웹 쪽으로 넘어가는 추세
//			- 결론적으로 별로

// JavaFX : Swing의 느린 처리속도를 개선해서 출시한 버전
			
package com.son.lo0916.main;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.son.lo0916.avengers.Hulk;

public class LMain2 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("지구");
		JButton jb = new JButton("손희지");
		jf.add(jb);
		
		// 헐크 Class - actionPerformed()[추상메소드]가 반드시 필요!
		
		// 헐크 생성
		Hulk h = new Hulk();
		
		// 정지희가 전담영웅으로 헐크를 골랐음
		// 도움 요청!
		jb.addActionListener(h);
		
		// 크기, 눈에 보이게
		jf.setSize(500,500);
		jf.setVisible(true);
	}
}
