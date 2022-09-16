
// 가위바위보
// 1. 등장인물 누구? -> 나 / 컴퓨터 / 심판
//					 -> 다같이 한자리에 있음
//					 -> 심판에게 룰북 (가위바위보 표시한 것) << 멤버 변수
// 2. 각 객체들이 가지고 있는 속성(멤버변수)? 행동(메소듣)?
// 3. 질때 까지 몇승/ 몇무 했는지 까지 카운트가 되도록
public class OMain {
	public static void main(String[] args) {
		Referee r = new Referee();
		Me mm = new Me();
		Computer c = new Computer();
		r.start(c, mm);

	}
}
