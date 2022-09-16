import java.util.Scanner;

// 환자
// 이름, 나이, 키, 몸무게, bmi, bmiResult
public class Guest {
	
	Scanner mouth = new Scanner(System.in);
	String name;
	int age;
	double height;
	double weight;
	double bmi;
	String bmiResult;
	
	public void printGuest() {
		System.out.println("< 손님 >");
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	public double answerHeight() {
		return mouth.nextDouble();
	}
	
	public double answerWeight() {
		return mouth.nextDouble();
	}
}
