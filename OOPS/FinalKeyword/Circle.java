package FinalKeyword;

public class Circle {
	private int rad;
	private final double pi;
	
	
	public Circle() {
		pi=3.14;
	}
	public void show() {
		System.out.println("Radius : "+rad);
		System.out.println("Pi is "+pi);
	}
}
