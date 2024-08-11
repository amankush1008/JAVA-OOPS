package Lecture1;

public class Student {
	
	//Encapsulation 
	private String name;
	private int rno;
	private double per;
	
	public void setStudent(String name,int rno,double per) {
		if(rno <=0) {
			System.out.println("Roll No Cannot be negative");
		}
		else {
			this.rno=rno;

		}
		this.name=name;
		this.per=per;
	}
	
	public void showStudent() {
		System.out.println("Name : "+name);
		System.out.println("Roll : "+rno);
		System.out.println("Percentage : "+per);
	}

}
