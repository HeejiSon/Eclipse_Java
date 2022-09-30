package com.son.fp915.register;

public class Academy {
	private int studentCount;
	
	public Student consult(String name, int age) {
		studentCount++;
		Student s = new Student(studentCount, name, age);
		return s;
		
	}
}
