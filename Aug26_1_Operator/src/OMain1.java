import java.util.Scanner;

public class OMain1 {	
	public static void main(String[] args) {
		// 이름을 입력 받을 거예요
		// 그 이름이 '홍길동'이랑 같은지 true / false
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = k.next();
		
		// ** String 같은 지 비교할 때 ==(같다) 사용 불가!
				//		대상의 값 자체를 비교하기 위해서 .equals()사용
		// boolean hong = (name == "홍길동");
		// System.out.printf("이름이 홍길동입니까? %b", hong);
		
		boolean b2 = name.equals("홍길동");
		System.out.println(b2);
		
		// RAM 저장공간
		// stack  : 프로그램이 끝나면 자동으로 정리
		//			아래에서 부터 차곡차곡 쌓임
					
		// heap	  : 프로그램이 끝나도 남아있음 ( 수동정리가 필수 )
		//			컴퓨터가 적당하다 싶은 위치에 그냥 만들어버림
		
		// 연산자
		//		단항 연산자 : a++, a--, !a
		//		이항 연산자 : a+b, a > b
		//		삼항 연산자 
		//			조건을 따져서 값을 대입할 때 사용
		//			조건문으로 대체 가능, 문법이 길어져
		//			모 아니면 도를 나타낼 때 유용하게 사용
		
		//나이 값을 입력받기
		System.out.print("나이 : ");
		int age = k.nextInt();
		
		// 나이가 20살 이상이면 '안녕하세요' / 아니면 'NAGA!'
		String result = (age >= 20) ? "안녕하세요" : "NAGA!";
		System.out.println(result);
		/*String result2 = (name.equals("홍길동")) ? "1강의장" : "NAGA!";
		String result3 = (age % 2 == 0) ? "1강의장" : "2강의장";*/
		
		String result2 = (age % 2 == 0) || name.equals("홍길동") ? "1강의장" : "2강의장";
		
		// 상자 하나에 축구공 6개가 들어감
		// 공의 개수를 입력받아서
		System.out.print("공의 개수 : ");
		int ball = k.nextInt();
		
		// 공을 모두 담을 상자의 개수가 몇 개 인지 출력
		int box = (ball % 6 == 0 ? ball / 6 : ball / 6 + 1);
		System.out.printf("상자의 개수 %d개 ", box );

		
		
		
	}

}
