import java.util.Scanner;

//지역변수(local Variable)
//		   메소드 속에서 만든 변수
//		   그 행동을 하는 동안만 필요한 임시변수
// 메소드 파라미터(Parameter) : 그 행동을 하는데 필요한 재료
// 리턴되는 값(return) : 그 행동을 한 후의 결과물. 결과물을 다른데서 재료로 사용할 때
// 멤버변수(member Variable) : 그 객체의 속성

public class Doctor {
	String name;
	int age;
	
	public void printDoctor() {
		System.out.println("< 의사 >");
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	// 환자 불러오기
	//		재료 : 불러올 대상
	public void callGuest(Guest g) {
		System.out.printf("의사 : %s씨 이쪽으로 오세요~\n", g.name);
	}
	
	// 키 묻기(cm)
	// 재료(Parameter) 	: 물어볼 대상
	// 결과(Return)		: 손님의 키
	// 키 : 1 ~ 300 이하
	
	public double askHeight(Guest g) {
		System.out.print("키(cm) : ");
		double h = g.answerHeight();
		if (h >= 1 && h <= 300) {
			System.out.printf("아, 키가 %.1fcm...\n", h);
			System.out.println("=============");
		} else if (h < 1 || h > 300) {
			System.out.println("==============");
			System.out.println("다시 말씀해주세요");
			System.out.println("==============");
		}
		// bmi 계산용 키(m)로 아예 바꿔서 리턴 시키는 방법
		return (h >= 1 && h <= 300) ? h / 100 : askHeight(g);
	}
	// BMI 계산 : 몸무게 / (키(m) * 키(m))
	// 재료가 필요한지, 재료로 쓰일건지 여부파악
	public double askWeight(Guest g) {
		System.out.print("몸무게(kg) : ");
		double w = g.answerWeight();
		System.out.printf("아, 몸무게가 %.1fkg...\n", w);
		return w;
	}
	
	public double calcBMI(Guest g) {
		return g.weight / (g.height * g.height);
	}
	
	//판정해서 결과내기
	// 18.5 미만 : 저체중
	// 18.5 이상 : 정상
	// 25 이상 : 과체중
	// 30 이상 : 경도비만
	// 35 이상 : 중증도비만
	// 40 이상 : 고도비만
	public String judgeBMI(Guest g) {
		if (g.bmi >= 40) {
			return "고도비만";
		} else if (g.bmi >= 35) {
			return "중증도비만";
		} else if (g.bmi >= 30) {
			return "경도비만";
		} else if (g.bmi >= 25) {
			return "과체중";
		} else if (g.bmi >= 18.5) {
			return "정상";
		} else {
			return "저체중";
		}
	}
	public void tellResult(Guest g) {
		System.out.printf("%s씨는 키가 %.1fcm, 몸무게가 %.1fkg...\n", g.name, g.height * 100, g.weight);
		System.out.printf("체질량 지수(BMI) : %.1f%%\n", g.bmi);
		System.out.printf("%s씨의 결과는 %s입니다.",g.name, g.bmiResult);
	}
	public void start(Guest g) {
		callGuest(g);
		g.height = askHeight(g);
		System.out.println(g.height);
		g.weight = askWeight(g);
		System.out.println(g.weight);
		g.bmi = calcBMI(g);
		g.bmiResult = judgeBMI(g);
		tellResult(g);
	}
}
