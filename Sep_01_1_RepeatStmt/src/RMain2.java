
// 초시계
//	일자 	시	분	초
//	1초마다 값이 증가
// 	[Day00] 00:00:00
//	[Day00] 00:00:01 << 실행 후 1초 뒤 콘솔창 내용

// 하루 = 24시간
// 1시간 = 60분
// 1분 = 60초
// for문 속에 for문 >> for문이 총 4개
// 60초가 되면 1분이라고 바뀌게 - 2중 for문

public class RMain2 {
	public static void main(String[] args) throws InterruptedException {
		for (int day = 0; true; day++) {
			for (int hour = 0; hour < 24; hour++) {
				for (int minute = 0; minute < 60; minute++) {
					for (int second = 0; second < 60; second++) {
						System.out.printf("[Day %02d] %02d : %02d : %02d\n",day, hour, minute, second);
						Thread.sleep(1000);
					}
				}
			}
		}
	}
}

