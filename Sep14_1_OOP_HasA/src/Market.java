
public class Market {
	String name;
	String location;
	Plate market;
	
	public Market() {
		// TODO Auto-generated constructor stub
	}

	public Market(String name, String location, Plate market) {
		super();
		this.name = name;
		this.location = location;
		this.market = market;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(location);
		market.printInfo();
	}
}
