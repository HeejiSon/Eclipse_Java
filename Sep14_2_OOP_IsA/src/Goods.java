
public class Goods {
	String name;
	int price;
	
	public Goods() {
		// TODO Auto-generated constructor stub
	}

	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
	}
}
