package spring.durgesh.lifecycle;

public class Samosa {
	int price;

	
	public Samosa() {
		super();
	}

	public Samosa(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("init method");
	}
	public void distroy() {
		System.out.println("distoy method");
		
	}

}
