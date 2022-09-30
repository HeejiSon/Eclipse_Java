package com.son.ab915.Avengers;

import com.son.ab915.drive.Drive;
import com.son.ab915.smoke.Smoke;

public class Ironman extends Avengers implements Smoke, Drive{
	private int property;
	
	public Ironman() {
		// TODO Auto-generated constructor stub
	}
	
	public Ironman(String name, int age, int property) {
		super(name, age);
		this.property = property;
	}
	
	public int getProperty() {
		return property;
	}
	public void setProperty(int property) {
		this.property = property;
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(property);
	}
	
	@Override
	public void attack() {
		System.out.println("빔~");
	}
	@Override
	public void smoke() {
		System.out.println("흡연");
	}
	@Override
	public void drive() {
		System.out.println("운전");
		
	}
	
}
