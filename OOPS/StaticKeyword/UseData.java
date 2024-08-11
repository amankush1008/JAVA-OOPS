package StaticKeyword;

class Data{
	
	static int a=10;
	static {
		System.out.println("First Static blocked called.."+a);
	}
	static {
		System.out.println("Second Static blocked called..");
	}
	static {
		System.out.println("Third Static blocked called..");
	}
	
	public Data() {
		System.out.println("Constructor called..");
	}
}	

public class UseData {
	public static void main(String[] args) {
		Data d2=new Data();
		Data d1=new Data();
		

//		System.out.println("Helo");	
	
	}
}
