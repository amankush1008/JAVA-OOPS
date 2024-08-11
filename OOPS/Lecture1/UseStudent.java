package Lecture1;

public class UseStudent {
	public static void main(String[] args) {
		Student s;
		s=new Student();
		s.setStudent("Aman Kuswaha", -424, 89.3);
		s.showStudent();
		
		System.out.println();
		Student p;
		p = new Student();
		p.setStudent("Yuvraj", 430, 70.9);
		p.showStudent();
		
	}

}
