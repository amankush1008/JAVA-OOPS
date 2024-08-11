package StaticKeyword;

class Emp{
	private int age;
	private String name;
	private static String company="Flipkart";
	
	public Emp(int age,String name) {
		this.age=age;
		this.name=name;
	}
	
	public void display() {
		System.out.println("Age :"+age+", Name: "+name+", Company: "+company);
	}
	
	public static void showCompany() {
		System.out.println("Company is : "+company);
	}
	
}
public class StaticDemo2 {
	public static void main(String[] args) {
		
		Emp.showCompany();
		Emp e= new Emp(23,"Aman");
		Emp f= new Emp(21,"Shivam");
		Emp g= new Emp(27,"Ankush");
		
		e.display();

	}
}
