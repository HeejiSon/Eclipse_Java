
public class Menu {
	String menu;
	int price;
	Restaurant where;
	
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public Menu(String menu, int price, Restaurant where) {
		super();
		this.menu = menu;
		this.price = price;
		this.where = where;
	}
	
	public void printInfo() {
		System.out.println(menu);
		System.out.println(price);
		where.printInfo();
	}
	
}
