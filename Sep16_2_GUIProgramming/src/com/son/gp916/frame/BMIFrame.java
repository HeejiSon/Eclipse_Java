package com.son.gp916.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class BMIFrame implements ActionListener{
	private JTextField htf;
	private JTextField wtf;
	private JLabel rlb;
	
	public BMIFrame() {
		// TODO Auto-generated constructor stub
	}

	public BMIFrame(JTextField htf, JTextField wtf, JLabel rlb) {
		super();
		this.htf = htf;
		this.wtf = wtf;
		this.rlb = rlb;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 계산
		// String -> double
		System.out.println("계산");
		// String으로 받아온 숫자를 형변환을 통해 double 그릇에 넣은 것
		double h = Double.parseDouble(htf.getText());
		double w = Double.parseDouble(wtf.getText());
		h /= 100;
		double bmi = w / (h * h);
		String result = "저체중";
		if (bmi >= 40) {
			result = "고도비만";
		} else if (bmi >= 35) {
			result = "중증도비만";
		} else if (bmi >= 30) {
			result = "경도비만";
		} else if (bmi >= 25) {
			result = "과체중";
		}	else {
			result = "정상";
		}
		// String.format() = System.out.printf();
		String finalResult = String.format("BMI는 %.2f%%고, 당신은 [%s]입니다.", bmi, result);
		rlb.setText(finalResult);
	}
}
