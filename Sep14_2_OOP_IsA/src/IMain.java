// 객체간의 관계
//		A is a B : Cat is a Animal
public class IMain {
	public static void main(String[] args) {
		
		Cat c = new Cat();
		c.printInfo();
		System.out.println("----------------");
		Dog d = new Dog("포메", 3, "친구집");
		d.printInfo();
	}
}
