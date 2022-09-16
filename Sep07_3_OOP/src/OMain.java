
// 홀짝 맞추기!
// 컴퓨터 vs 유저

// 시작
// 컴퓨터가 동전을 가지고있고(20개)
// 컴퓨터가 유저에게 동전 중에 몇개로 할지 물어봅니다
// 유저가 동전 개수를 답하고
// 컴퓨터가 그 개수 안에서 짤짤이를 합니다
// 유저에게 홀 / 짝 물어보고
// 유저가 대답
// 유저가 대답한게 정답인지 아닌지 판단

public class OMain {
	public static void main(String[] args) {
		Computer c = new Computer();
		User u = new User();
		c.start(u);
	}
}
