package StaticBlock;

public class UseAccount {
	public static void main(String[] args) {
		Account a1=new Account(212,"Aman",872);
		a1.show();
		Account a3=new Account(112,"Yuvraj",872);
		Account a2=new Account(103,"Siddharth",872);

		a2.show();
		a3.show();
	}
}
