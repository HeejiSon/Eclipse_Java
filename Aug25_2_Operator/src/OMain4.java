import java.util.Scanner;

public class OMain4 {

	public static void main(String[] args) {
		// 놀이공원 관리자
		//		-> A라는 놀이기구를 타도 되는지 여부 판정해주는 프로그램
		// 나이가 10살이 넘는 사람만 탈 수 있음 => age > 10
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("나이 : ");
		double age = k.nextDouble();
		
		System.out.print("키 : ");
		double height = k.nextDouble();
		
		System.out.println("----------------");
		System.out.printf("키 : %.1fcm, 나이는 %d살\n ", height, age);
		
		boolean ride1 = (age > 10);
		System.out.printf("ride1 탑승 가능? : %b\n", ride1);
		
		// 나이가 5살 미만만 탈 수 있음
		boolean ride2 = (age < 5);
		System.out.printf("ride2 탑승 가능? : %b\n", ride2);
		
		// 나이가 20살 이상만 탈 수 있음
		boolean ride3 = (age >= 20);
		System.out.printf("ride3 탑승 가능? : %b\n", ride3);
		
		// 키가 150 초과만 탈 수 있음
		boolean ride4 = (height > 150);
		System.out.printf("ride4 탑승 가능? : %b\n", ride4);
		
		// 키가 180 미만만 탈 수 있음
		boolean ride5 = (height < 180);
		System.out.printf("ride5 탑승 가능? : %b\n", ride5);
		
		// 나이가 1살만 아니면 탈 수 있음
		boolean ride6 = (age != 1);
		System.out.printf("ride6 탑승 가능? : %b\n", ride6);
		
		// 나이가 홀수인 사람만 탈 수 있음
		boolean ride7 = (age % 2 == 1);
		// boolean ride7 = (age % 2 != 0);
		System.out.printf("ride7 탑승 가능? : %b\n", ride7);
		
		// 업그레이드 !!
		
		// 	~고 (and) 	: &&
		// 	~거나(or) 	: || (shift + \)
		// 	XOR			: (eXclusive OR) -> 두 입력이 서로 다를 때 '1' 결과 값을 출력
		// 	NOT			: ! => 결과를 뒤집는 용도
		
		// 배경지식) true : 1 / false : 0
		// A && B : A도 참, B도 참 => 최종적으로 참
		// 	앞이 거짓이라면 뒤에 조건은 고려할 필요가 없음
		// 	참이 될 확률이 상대적으로 낮은 조건을 앞으로 배치
		
		// A || B : A가 참이거나, B가 참이거나, 둘다 참이거나 -> OK
		
		// ex) 나이가 3살이 넘고, 키가 2m가 넘어야 탈 수 있음
		// 확률이 적은 조건을 앞에 두어서 처음부터 걸러지게
		
		// A ^ B : A가 참이거나, B가 참이거나 둘 중 하나만 참이어야한다.
		
		// boolean ride8 = ((height > 200) && (age > 3));
		boolean ride8 = (((height / 100) > 2) && (age > 3));
		System.out.printf("ride8 탑승 가능? : %b\n", ride8);
		
		// 키가 1.9m가 넘거나, 나이가 50미만이면 탈 수 있음
		boolean ride9 = (((height / 100)> 1.9) && (age < 50));
		System.out.printf("ride9 탑승 가능? : %b\n", ride9);
		
		// 나이가 10 초과, 40 미만이면 탈 수 있음
		boolean ride10 = ((age > 10) && (age < 40));
		System.out.printf("ride10 탑승 가능? : %b\n", ride10);
		
		// 나이가 10살 이상이던지, 키가 1.5m 이상이던지 하나만 성립
		boolean ride11 = ((age >= 10) ^ ((height / 100)>= 1.5));
		System.out.printf("ride11 탑승 가능? : %b\n", ride11);
		
		// ride8을 탈 수 없는 사람만 탈 수 있고
		// ride8을 탈 수 있는 사람은 탈 수 없음
		boolean ride12 = !ride8;
		System.out.printf("ride12 탑승 가능? : %b\n", ride12);
		
		
		
		
		
		

	}

}
