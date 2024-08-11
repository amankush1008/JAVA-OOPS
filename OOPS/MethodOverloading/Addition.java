package MethodOverloading;

public class Addition {
	
	//changing data types
	public int add(int a,int b) {
		return a+b;
	}
	
	//Number of parameter
	public int add(int a,int b,int c,int d) {
		return a+b+c+d;
	}
	public double add(double a,double b) {
		return a+b;
	}
	
	//changing data types
	public String add(String a,String b) {
		return a+b;
	}
	
	//order of arguemnt
	
	public void show(int age,String name) {
		System.out.println("Age : "+age);
		System.out.println("Name :"+name);
	}
	
	public void show(String name,int age) {
		System.out.println("Name :"+name);
		System.out.println("Age : "+age);

	}
	
}
