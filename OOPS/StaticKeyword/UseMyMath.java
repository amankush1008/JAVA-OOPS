package StaticKeyword;

class MyMath{
	public static int add(int a,int b) {
		return a+b;
	}
}

public class UseMyMath {
	public static void main(String[] args) {
		MyMath m1= new MyMath();
		System.out.println(m1.add(43, 20));
		
		
		//using static  -- bec no instance variable
		System.out.println(MyMath.add(442, 0323));
	}

}
