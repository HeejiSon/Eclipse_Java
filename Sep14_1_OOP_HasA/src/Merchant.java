
public class Merchant {
	String name;
	Market mar;
	
	public Merchant() {
		// TODO Auto-generated constructor stub
	}

	public Merchant(String name, Market mar) {
		super();
		this.name = name;
		this.mar = mar;
	}
	
	
	public void printInfo() {
		System.out.println(name);
		mar.printInfo();
	}
}
