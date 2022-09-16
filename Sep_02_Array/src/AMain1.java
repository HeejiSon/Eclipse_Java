
// 변수
//		변수 1 - 데이터 1

// 배열(Array) "[]"
//		변수 1 = 데이터 n

// 배열 : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것!
//			배열 안에 있는 각각의 데이터를 [요소]라고 부름
//			이 요소마다 붙여진 일련 번호가 있는데 이는 각 요소를 구분하는데 사용
//					-> 인덱스(index) :  시작은 0부터!

// 배열 생성
//		자료형[] 변수명; // 배열선언
//		변수명 = new 자료형[배열의 길이 개수] // 변수 생성
//			=> 자료형[] 변수명 = new 자료형[배열의 길이 개수];
public class AMain1 {
	public static void main(String[] args) {
		int [] eng = new int[3];
		eng[0] = 100;
		eng[1] = 70;
		eng[2] = 50;
		for (int i = 0; i < eng.length; i++) {
			System.out.println(eng[i]);
		}
		System.out.println("----------------------");
		int[] math = new int[] {10, 30, 60}; // 꼭 알아두기!
		for (int i = 0; i < math.length; i++) {
			System.out.println(math[i]);
		}
		System.out.println("----------------------");
		int[] kor = {20, 40, 60}; // 약식!
		for (int i = 0; i < kor.length; i++) {
			System.out.println(kor[i]);
		}
		System.out.println("----------------------");
		int a = 10;
		int[] b = {10, 20};
		System.out.println(a);
		System.out.println(b);
//		b[2] = 200;
//		System.out.println(b[2]);
		
		int[][] score = {{30, 40}, {50, 60}, {70, 80}}; // 2차원 배열... 거르세요!
		System.out.println(score);			// 주소값(전체에 대한)
		System.out.println(score[1]);		// 주소값(1번째 학생에 대한)
		System.out.println(score[1][0]);	// 1번째 요소 안의 0번째 요소 자체
	}

}
