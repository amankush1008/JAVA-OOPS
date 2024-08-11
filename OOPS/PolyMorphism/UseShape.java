package PolyMorphism;

public class UseShape {
	public static void main(String[] args) {
		Shape obj = new Shape();
		obj.area(5);
		obj.area(4.0);
		obj.area(4, 12);
		
	}
}
