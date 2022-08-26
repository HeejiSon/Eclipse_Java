
public class VMain1 {

	public static void main(String[] args) {

		// 어제 먹은 점심식사 메뉴 이름
		// 가격
		// 칼로리 (소수점)
		// 평점 (소수점)
		// 나중에 또 먹을건지 : true, false

		String menu = "오레오오즈";
		int price = 0;
		double cal = 200.3;
		double score = 4.8;
		boolean later = true;

		System.out.printf("어제 먹은 점심식사 메뉴 이름 : %s\n", menu);
		System.out.printf("가격 : %d원\n", price);
		System.out.printf("칼로리 : %.1f\n", cal);
		System.out.printf("평점 : %.1f점\n", score);
		System.out.printf("나중에 또 먹을건지 : %b", later);

	}

}
