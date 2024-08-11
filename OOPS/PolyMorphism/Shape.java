package PolyMorphism;

public class Shape {
	public void area(double radius) {
		double area = Math.PI*Math.pow(radius, 2);
		System.out.println("Area of Circle : "+area);
	}
	
	public void area(int side) {
		int area = side * side;
		System.out.println("Area of Square : "+area);
	}
	
	public void area(int len , int wid) {
		int area = len * wid;
		System.out.println("Area of Rectangle : "+area);
	}
}
