// public / static : 좀 더 나중에
// void : 자료형...(리턴타입) - 리턴할 게 없다~
// main : 함수명

// Parameter : String[] args
// 		외부에서 값을 받아오기 위해 사용하는게 파라미터
//		args라는 문자열을 배열로 사용하겠다

public class AMain2 {
	public static void main(String[] arg) throws InterruptedException {
		for (int i = 0; i < arg.length; i++) {
			System.out.println(arg[i]);
		}
		Thread.sleep(10000);
	}
}
