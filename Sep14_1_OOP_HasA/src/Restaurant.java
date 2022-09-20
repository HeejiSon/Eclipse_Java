
public class Restaurant {
	String name;
	String place;
	String number;
	Person who;
	
	public Restaurant() {
		// TODO Auto-generated constructor stub
	}

	public Restaurant(String name, String place, String number, Person who) {
		super();
		this.name = name;
		this.place = place;
		this.number = number;
		this.who = who;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(place);
		System.out.println(number);
		who.printInfo();
	}
}
