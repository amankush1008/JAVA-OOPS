package Lecture1;

public class UseProduct {
	public static void main(String[] args) {
		Product p1=new Product(121,"Maggi",23);
		
		//Setter
		
		//getter
		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getPrice());
		
		p1.setName("Yippie Maggi");
		System.out.println("After Name Changed");
		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getPrice());


	}
}
