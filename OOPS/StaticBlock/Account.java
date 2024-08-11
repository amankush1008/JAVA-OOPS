package StaticBlock;

import java.util.Scanner;

public class Account {
	private int accid;
	private String name;
	private double balance;
	
	private static double rateOfInt;
	
	static {
		System.err.println("Static blocked called");
		System.out.println("Enter Rate of Interest :");
		Scanner sc=new Scanner(System.in);
		rateOfInt=sc.nextDouble();
	}
	public Account(int accid,String name, double balance) {
		this.accid=accid;
		this.name=name;
		this.balance=balance;
	}
	
	public void show() {
		System.out.println("Account id : "+accid);
		System.out.println("Account Name : "+name);
		System.out.println("Account Balance : "+balance);
		System.out.println("Rate of Interest : "+rateOfInt);


	}

}
