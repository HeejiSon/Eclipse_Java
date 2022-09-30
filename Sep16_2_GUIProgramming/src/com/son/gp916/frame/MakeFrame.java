package com.son.gp916.frame;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// JFrame : Swing에서 윈도우를 나타내는 Class
//		JPanel(보조프레임), JButton(버튼), JLabel(라벨), JTextField(글자입력)
// layout:
//		flowLayout : 가운데 정렬
//		BorderLayout : Frame 형식
//		GridLayout : 격자형태
//		setLocation, setBounds : 임의 위치 지정

public class MakeFrame extends JFrame{
	JPanel pl;
	public MakeFrame() {
		setSize(500,500); // frame size
		setTitle("GUI연습"); // frame title
		pl = new JPanel(); // panel 하나 생성
		pl.setLayout(new FlowLayout()); // 가운데 정렬
		for (int i = 1; i < 11; i++) {
			pl.add(new JButton("버튼" + i)); // pl안에 button생성
		}
		add(pl); // JPanel을 JFrame 안에 넣기
		setVisible(true); // JFrame이 보이도록! (반대 : false)
	}
}
