import java.util.Random;

public class Computer {
//	랜덤으로 숫자뽑기
	Random r = new Random();
	
	public int fire() {
		return r.nextInt(3) + 1;
	}
}
