
public class VMain1 {
	public static void main(String[] args) {
		// 컴퓨터의 장치
		// CPU / RAM / HDD/ GPU
		
		// CPU : 연산장치(Intel ; i5-xxxx, i7-xxxx/ AMD : RyzenX)
		// HDD(SSD) : 파일 형태로 저장(장치) -> 영구 저장
		// RAM : 변수 형태로 저장(장치) -> 임시 저장
		// GPU : 그래픽처리용(CPU + HDD + RAM)
		
		// data 임시보존 -> RAM에 변수로 저장!
		// data 영구보존 -> HDD에 파일로 저장!
		
		//syso로 글자 or 숫자를 출력 -> 휘발성(1회용)
		System.out.println("ㅋㅋㅋ");
		// 이런거 계산하다가 이 결과 값이 한 100줄 뒤에 필요하다면?
		
		// 변수 (Variable) : 변하는 수, data들을 저장하는 공간
		// data를 담는 [그릇]
		
		// 변수 문법 (어떻게 사용하는지)
		//	1. 변수 선언(만들기) - Ram에 공간확보를 한 후에 data를 담을 수 있는 공간을 만든다.
		// (자료형 변수명;)의 형태를 [변수를 '선언'했다]라고 표현
		// (그릇종류 그릇이름;)
		// %d -> 정수 -> 자료형 -> int
		int a; // a라는 변수를 선언했다
				// 정수를 담는 그릇이름이 a다.
		String b; 	// b라는 문자열을 담는 변수를 선언했다
					// 문자열을 담는 그릇 이름을 b라고 한다

		//	2. 변수 초기화
		//		변수 그릇에 값을 넣어주어야 하는데...
		//	자료형 변수명 = 값;의 형태로 표현
		//	- 자료형 : 변수가 어떤 값으로 저장할지에 대한 그 형태
		//	- 변수명 : 변수 이름
		//	String b; 	: 문자열(String)을 담는 그릇 b
		//	int a;		: 정수(int)를 담는 그릇 a
		
		//	3. 변수명 짓는 규칙
		// - 숫자로 시작하면 에러
		// int i = 10;
		// int 1 = 10; >> error
		// int i2 = 10;
		// - 특수문자, 띄어쓰기가 들어가면 에러
		// String s = "ㅋㅋ";
		// String ★ = "ㅋㅋ"; >> error
		// String s s="ㅋㅋ"; >> error
		
		// - 변수명을 봐도 뭐가 들었는지 알 수 있게
		// - 가독성을 위해 띄어쓰기가 필요한 경우
		// 띄어쓰기 대용품
		//	1. 뱀체 -> 아래 하이픈
		int price_of_computer = 900000;
		//	2.낙타체 -> 띄어쓰기 바로 다음 글자를 대문자로
		int priceOfComputer = 900000;
		//  한글 사용은 금지
		
		////////////////////////////////////////////////
		// 변수 만들었을 때의 '='에 대해 한번 살펴보자!
		// = : 대입연산자
		// A = B
		// 현실) A와 B는 같다
		// 프로그래밍 전반> A에 B라는 값을 넣어라!
		// 우항의 값을 좌항에 넣어라
		
		// 자료형
		//	bit : data를 나타내는 최소 단위
		//		Binary Digit(이진수)
		//			모든 데이터가 0, 1의 조합으로 구성
		//			이 때, 0과 1의 값이 하나의 Bit가 된다.
		
		// 기본형
		// -정수
		//		byte 	: -128 ~ 127
		//		short 	: 약 -3만 ~ 3만
		//		int 	: 약 -21억 ~ 21억
		//		long	: int의 범위를 벗어나는 범위
		// byte aa = 8;
		// System.out.println(aa);
		int aa = 128;
		System.out.println(aa);
		
		// -실수
		// 		float
		//		double
		//		다른언어 : float / Java한정 : double
		double asdf = 1.78;
		// -문자
		//		char
		// -논리
		//		boolean : 참 / 거짓
		
		// 참조형
		// 기본형이 아니면 전부다 참조형!
		// -문자열
		//		String : 문자열(여러글자)를 저장, 앞글자 S 대문자!
		
		//char vs String
		char c = 'ㅋ'; // -> 작은 따옴표 사용, 한글자 담을 수 있음
		String ss = "ㅋㅋㅋㅋㅋㅋㅋㅋㅋ";
		
		// 6층 -> 변수 선언하고 -> 변수 초기화
		// 6 -> 정수 -> (자료형이) int
		int floor;
		floor = 6;
		
		// 손가락 10개 -> 변수 선언하고 -> 변수 초기화
		// 정수 (int)를 담을 수 있는 finger라는 이름을 가진 변수 그릇
		int finger;
		finger = 10;
		
		// num이라는 int 그릇에 10이라는 값을 넣는 것
		// int num;
		// num = 10;
		// 변수 선언과 동시에 값 설정
		int num = 10;
		// int num2 = "10";
		
		// 지하철 9호선 -> 정수형(자료형)
		// 지하철 9호선 -> 실수형(자료형)
		
		int subway = 9;
		double subway2 = 9;
		System.out.println(subway2);
		
		// 자료형 변수명 = 값; => 변수가 새로 생성됐다
		int naming = 123;
		System.out.println(naming);
		// naming이라는 이름을 가진 int 변수 만들기 + naming에 123넣기
		
		//naming 변수 그릇에 123 -> 12로 고치고 싶다
		// 수정 -> 변수명 = 값;
		naming = 12;
		System.out.println(naming);
		
		
		
		
		
		
		
		
	}

}
