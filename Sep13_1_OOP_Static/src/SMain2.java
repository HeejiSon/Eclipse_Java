// 계산기
// 		정수 2개 넣으면 그 합을 출력하는 기능
//		Calculator라는 클래스를 하나 만들어서
public class SMain2 {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.sum(10, 20, 30); 	// static X
		c.sum(10, 20); 		// static O << error는 아니지만 비추
		//////////////////////////////////////////
//		Calculator.sum(10, 20, 30);	// static X << error
		Calculator.sum(10, 20);		// static O -> (객체부른것보다) memory 덜 쓰고 해결
		
		// 같은 맥락으로 Java의 내장 클래스 중 하나인 Math
		 System.out.println(Math.PI); // 이런 것 역시 객체를 만들지 않고 사용한 경우!
		 double s = Math.sqrt(10);
		 System.out.println(s);
	}

}
