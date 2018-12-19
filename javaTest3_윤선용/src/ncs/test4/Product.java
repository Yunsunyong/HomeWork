package ncs.test4;

public class Product {
	private String name;
	private int price;
	private int quntity;
	
	public Product() {}
	public Product(String name, int price, int quntity) {
		this.name = name;
		this.price = price;
		this.quntity = quntity;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setQuntity(int quntity) {
		this.quntity = quntity;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getQuntity() {
		return quntity;
	}
	
	public String information() {
		return "상품명 : " + this.name + "\n가격 : "
				+ this.price + "원\n수량 : " + this.quntity;
	}
}
