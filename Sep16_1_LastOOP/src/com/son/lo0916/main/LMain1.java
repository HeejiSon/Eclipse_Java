package com.son.lo0916.main;

import com.son.lo0916.avengers.Ironman;
import com.son.lo0916.person.Person;
import com.son.lo0916.planet.Planet;

public class LMain1 {
	public static void main(String[] args) {
		// 게임 개발 중!
		// 행성(이름, 크기, 보이는지 안보이는지 여부
		// 사람 (이름)
		
		// Parameter에 이름만 넣도록 생성자 overloding
		// 이름이 지구 인 행성 하나 생성(행성이름)
		Planet e = new Planet("지구");;
		// 이름이 ???인 사람 하나 생성(사람이름)
		Person p = new Person("손희지");
		
		// 지구라는 행성에 사람을 입주
		e.add(p);
		
		// 사수 : interface
		// interface는 부사수 제어용
		// attack(); 추상 메소드를 만들어서 -> 구현해봐
		// 아이언맨 - attack(); 반드시 필요하니까 구현해봐
		
		// 아이언맨 객체 - attack(); 기능 구현하기
		Ironman i = new Ironman();
		// 사람이 아이언맨을 본인 전담 영웅으로 픽
		p.pick(i);
		
		//사람이 도와달라고 소리침!
		p.helpAAAAaa();
		
		// 아래 두개는 콘솔에 안보임!
		// 이 행성 사이즈 1000으로 수정!
		e.setSize(1000);
		// 이 행성을 보이게 수정!
		e.setVisivle(true);
		
	}
}
