// 	클라이언트가 캐릭터 생성 기능을 만들어달라고 요구 -> 만드는데 성공!
//		건네주는 방법?
//	결론 : 	.java파일 말고 .jar파일로 건네줘야!
//			.java : 소스까지 공개!
//			.jar  : 소스 공개 X + 그 기능만 전달
//	JAR(Java Archive, 자바 아카이브)파일
//		: 기계어 상태로 바꿔서 압축을 해놓은 상태

//	한국어 - 번역(개발)-> .java로 저장
//	(저장할때)	.java -번역(Compile)-> .class파일(기계어, 바이트코드)을 자동으로 생성
//	.class파일 -실행->

// 	우리가 만든 코드는 .java파일로 저장되고
// 	이 때 compile이라는 작업을 통해 .class파일, 즉 기계어로 변환되어 자동으로 생성
//	실행될 때는 .class파일의 형태로 JVM에서 가동되는 형태

//	.java파일 : 사람이 보려고 만든 것
//	.class파일 : 실제로 자바에서 구동하는 것!

//	왜 굳이? 기계어 / 바이트코드로 변환해서 돌리는 걸까?
//		- 바이트 코드를 사용하면 실행이 빠름
//		- 코드를 노출하게 되면 이게 무슨 프로그램인지 알 수 있으므로  '보안'상의 이유로!
//	-> 다른 사람에게 기능을 넘겨줄 때 소스를 알려주지 말고, 그 기능만 사용하게 하자!
//	-> .java파일 말고 .jar파일로!!
//	JavaDoc
//		JavaDoc의 역할 : 제품 설명서!
//			우리가 만든 프로그램을 보기 쉽게 HTML형식, 우리가 알고있는 WEB형식으로 만들어서
//			보기 편하게 문서화 시킨 것!

//	JavaDoc의 특징
//		- 주석은 /** (내용) */
//		- 주석의 안쪽 내용은 크게 2가지로 나뉨
//		  설명문
//			주석의 시작에서 첫번째 태그 섹션까지의 부분
//			설명문은 HTML로 설명이 되어있기 때문에 단순히 주석 작성 당시에
//			엔터를 쳐서 줄을 바꿨다고 하더라도
//			그대로 옆으로 이어져서 출력
//			엔터를 의미하는 줄바꿈 처리를 <p>로 작성
//		  태그 섹션
//			첫번째 문자가 '@'로 시작
//			- @author : 이 프로그램의 작성자, 기본값으로는 Windows계정 ID
//			- @version : 말 그대로 이 프로그램의 버전
//			- @param : 파라미터에 대한 설명을 할 때 사용
//			- @throws : 예외처리에 대한 설명
//			- @return : method가 void가 아닌 반환값이 있을 때 그것에 대한 설명



/**
 * 
 * @author pc
 * @version 1.1.14
 * <p>
 * 게임 캐릭터의 정보를 가지고 있는 클래스
 * 
 */
public class GameCharacter {
	
	String nickname;
	int level;
	String job;
	String weapon;
	
	/**
	 * 게임 캐릭터를 생성합니다.
	 * <p> 기본 무기는 목검, 기본 직업은 초보자 입니다.
	 * @param nickName 캐릭터의 이름; 길이는 3자 이상 10자 이하여야만 합니다.
	 * @throws IllegalArgumentException 캐릭터의 nickName 길이가 정해진 범위를 벗어나면 발생합니다.
	 * 
	 */
	public GameCharacter(String nickName) {
		this.level = 1;
		this.job = "초보자";
		this.weapon = "목검";
		if (nickName.length() < 2 || nickName.length() > 11) {
			throw new IllegalArgumentException("캐릭터의 이름은 3자 이상 10자 이하 입니다.");
		}
		this.nickname = nickName;
	}
	
	public void levelUp() {
		this.level++;
	}
	/**
	 * 캐릭터의 직업을 변경합니다.
	 * @param job 캐릭터의 변경할 직업
	 * @throws IllegalArgumentException 캐릭터의 레벨이 10을 넘지 않으면 발생합니다.
	 */
	
	public void setJob(String job) {
		if (this.level < 10) {
			throw new IllegalArgumentException("캐릭터의 레벨이 10을 넘지 않습니다.");
		}
		this.job = job;
	}
	
	/*
	 * 생성된 캐릭터의 status값을 보여주는 method 입니다.
	 */
	
	public void printInfo() {
		System.out.printf("닉네임 : %s\n", this.nickname);
		System.out.printf("레벨 : %d\n", level);
		System.out.printf("직업 : %s\n", job);
		System.out.printf("무기 : %s\n", weapon);
	}
}


