import java.util.Random;
import java.util.Scanner;

// 함수명 abc순으로 구분해서 순차적으로 놔야 함
// 단축키 바꾸는 법: window -> prefeerences -> general -> keys
// 함수 전체 접기(collapesee all) : ctrl + shift + (numpad) / (binding) -> ctrl + shift + p
// 함수 전체 열기(expand all) : ctrl + shift + (numpad) * (binding) -> ctrl + shift + l

// 1. 로또 번호는 총 6개 번호 지정 (1 ~ 45), 중복 X
// 2. 6개 일치 : 1등 / 5개 일치 : 2등/ 4개 일치 : 3등 그외는 꽝으로
// 3. 내가 로또번호(배열) 입력, 자동으로 로또번호(배열)가 나오게(Scanner, Random)
// 4. for문을 이용해서 두 배열 일치 값 개수를 확인하고 등수를 출력

public class PMain3 {
	// 함수 이용
	// 로또번호 6개 입력 -> 1 ~ 45 사이가 아니면 다시 함수 호출(삼항연산자)
	// 랜덤으로 6개 뽑게 ->까지
	public static int getNum() {
		Scanner k =  new Scanner(System.in);
		int num = k.nextInt();
		if (num < 0 || num > 45) {
			System.out.println("다시 입력 : ");
		}
		return (num >= 1 && num <= 45) ? num : getNum();
	}
	public static int[] getNums() {
		int[] myLotto = new int[6];
		for (int i = 0; i < myLotto.length; i++) {
			System.out.printf("%d번째 숫자 입력 : ", i + 1);
			myLotto[i] = getNum();
		}
		return myLotto;
	}
	public static void printMyLotto(int[] myLotto) {
		System.out.println("나의 답!");
		for (int i : myLotto) {
			System.out.print("[" + i + "]");
		}
		System.out.println();
		System.out.println("=========================");
	}
	public static int[] getLotto() {
		int[] lottoNum = new int[6];
		Random r = new Random();
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = r.nextInt(45) + 1;
			// 같은 배열을 두번 돌리는것
			// 겉의 for문과 안의 for문을 숫자 하나하나 모든 경우의 수로 비교
			for (int j = 0; j < i; j++) {
				// System.out.println("i : " + lottoNum[i] + " j : " + lottoNum[j]);
				if(lottoNum[i] == lottoNum[j]) {
					i--;
				}
			}
			//System.out.println("***************************");
		}
		return lottoNum;
	}
	public static void printLottoNum(int[] lottoNum) {
		System.out.println("로또 넘버 : ");
		for(int i : lottoNum) {
			System.out.print("[" + i + "]");
		}
		System.out.println();
		System.out.println("=========================");
	}
	// 내가 입력한 번호와 로또번호가 같은지 비교하는 함수
	// 몇개가 맞는지 카운트를 하기 위한 변수 << 번호가 같을 때 마다 하나씩 카운트가 올라가게!
	public static int checkNum(int[] myLotto, int[] lottoNum) {
		int count = 0;
		for (int i = 0; i < lottoNum.length; i++) {
			for (int j = 0; j < myLotto.length; j++) {
				if(lottoNum[i] == myLotto[j]) {
					count++;
				}
			}
		}
		return count;
		
	}
	// 결과 프린트 하는 함수
	// 몇개 맞춰서 1등
	public static void printResult(int count) {
		System.out.printf("%d개 맞춰서...", count);
		if(count == 6) {
			System.out.println("1등!");
		} else if (count == 5) {
			System.out.println("2등");
		} else if (count == 4) {
			System.out.println("3등");
		} else {
			System.out.println("꽝!");
		}
	}
	
	public static void main(String[] args) {
		int[] myLotto = getNums();
		printMyLotto(myLotto);
		int[] lottoNum = getLotto();
		printLottoNum(lottoNum);
		int count = checkNum(myLotto, lottoNum);
		printResult(count);
	}
}
