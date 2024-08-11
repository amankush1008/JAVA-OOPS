package StaticKeyword;

public class Vehicle {
	
	public Vehicle(String type) {
		System.out.println("Parametrized Constructor Vehicle Called.."+type);
	}
	
//	public Vehicle() {
//		System.out.println("Non Parametrized Constructor Vehicle Called..");
//	}
	public void start() {
		System.out.println("Staring...");
	}
	public void accelerate() {
		System.out.println("Accelerating...");
	}
	
	public void turnLeft() {
		System.out.println("turnLeft...");
	}
	public void turnRight() {
		System.out.println("turnRight...");
	}
}
