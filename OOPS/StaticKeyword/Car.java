package StaticKeyword;

public class Car extends Vehicle {
	public Car() {
		super("Four Wheeler");
		System.out.println("Car Called..");
	}
	public void reverse() {
		System.out.println("Reversing...");
	}
}
