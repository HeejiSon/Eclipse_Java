package com.son.am915.dog;

// Access Modifier : 접근 제어자
//			멤버변수 또는 클래스에서 사용
//			외부에서 (멤버변수나 클래스에) 접근하지 못핟도록 제한하는 역할
public class Dog {
							// 접근범위
		public int a;		// 접근 제한 없음
		protected int b;	// 같은 패키지 내 or 다른 패키지라면 그 하위클래스
		/*default*/ int c;	// (default: 아무것도 쓰지 않으면) 같은 패키지 내
		private int d;		// 클래스 내부에서만 O / 외부에서는 사용 X
}
