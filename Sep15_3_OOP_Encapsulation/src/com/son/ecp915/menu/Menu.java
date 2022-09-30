package com.son.ecp915.menu;

// 정리!

// 단축키
//		설정 : 메뉴탭의 Window - Preferences - 왼쪽 상단에 General - keys
//		- 	생성자오버로딩 	: generate constuctor using field : ctrl + shift + space
//		- 	getters/setters : generate ~ getters and setters : ctrl + shift + z
public class Menu {
//	1. 멤버변수 (이름, 가격)
	private String name;
	private int price;
	
//	2. 기본생성자
	public Menu() {
		// TODO Auto-generated constructor stub
	}
	
//	3. 생성자 오버로딩
	public Menu(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
//	4. getters / setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
