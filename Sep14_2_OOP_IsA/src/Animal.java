// 아무것도 상속을 받지 않는 Class의 경우 [extends Object]가 생략된 것
// Animal is a Object(자바객체) 
public class Animal {
	String sort;
	int age;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String sort, int age) {
		super();
		this.sort = sort;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println(sort);
		System.out.println(age);
	}
}
