package Lecture1;

public class Account {
	private int accid;
	private String name;
	private double balance;
	
	//Default Constructor
	public Account() {
		System.out.println("Default Constructor Called");
	}
	
	//Parametrized Constructor
	public Account(int accid,String name,double balance ) {
		this.accid=accid;
		this.name=name;
		this.balance=balance;
		
		System.out.println("Parametrized Constructor Called");

	}
	
	
	public void showAccount() {
		System.out.println("Id : "+accid);
		System.out.println("Name : "+name);
		System.out.println("Balance :"+balance);
	}
}
