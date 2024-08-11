package Lecture1;

public class Product {
	private int id;
	private String name;
	private double price;
	
	
	//Constructor
	
	public Product(int id, String name, double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	//Setter : Set the value
//	public void setId(int id) {
//		if(id<=0) {
//			System.out.println("id cannot be 0");
//			return;
//		}
//		this.id=id;
//	}
	
	
	
//	public void setPrice(double price) {
//		if(price<=0) {
//			System.out.println("price must be positive");
//			return;
//		}this.price=price;
//	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	//Getter : get the value
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
}
