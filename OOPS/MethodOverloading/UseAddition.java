package MethodOverloading;

public class UseAddition {
	public static void main(String[] args) {
		Addition obj= new Addition();
		
		System.out.println(obj.add(8.2, 2.0));
		System.out.println(obj.add(12, 27));
		System.out.println(obj.add("Good ", "Morning"));
		
		System.out.println(obj.add(23, 20, 320, 370));
		
		obj.show(32, "Ankush");
		obj.show("Aman", 34);
	}
}
