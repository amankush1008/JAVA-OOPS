package AbstractKeyword;

class A{
	public static void show() {
		System.out.println("In Show of A");
	}
}

class B extends A{
	public static void show() {
		System.out.println("In Show of B");
	}
}

public class Demo {
	public static void main(String[] args) {
		A obj = new B();
		obj.show();
	}
}
