
// UP & DOWN! (1 ~ 100)

// Referee / Friend / Me
// 게임을 주도적으로 끌고갈 인물이 누구인지 ? -> 거기에 계산을!
// 등장인물 모두 등장!
// 		심판과 친구는 이미 나와있다고 가정 -> 심판이 나를 불러내는 상황
//		심판 => 친구에게 답을 요구 : 종이에 답을 적어서 제출
//		심판 => 나에게 답을 요구 : 말로 대답하게 하면서 숫자를 하나 말하라고
//		판정 
//		맞출 때 까지 진행 => 몇 번째 시도만에 정답을 맞추는지

// 
public class OMain {
	public static void main(String[] args) {
		Referee r = new Referee();
		Friend f = new Friend();

		r.start(f);
		
	}
}
