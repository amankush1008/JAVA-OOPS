package Association;


class College{
	
	private String name;
	private int estYear;
	
	private final Department dept;
	
	public College(String name,int estYear,String deptName,String hodName) {
		this.name=name;
		this.estYear=estYear;
		dept=new Department(deptName,hodName);
		
	}
	
	private class Department{
		private String deptName;
		private String hodName;
		
		public Department(String deptName,String hodName) {
			this.deptName=deptName;
			this.hodName=hodName;
		}
		
		public String toString() {
			return "Department Name : "+this.deptName+", HOD Name : "+this.hodName;
		}

	}
	public void showDetails() {
		System.out.println("College Name :"+this.name+", Establisment Year : "+this.estYear);
		System.out.println("Department Details : "+dept);
	}
}
public class DemoComposition {
	public static void main(String[] args) {
		College abc= new College("Galgotias College",2011,"CSE","Mukesh Kumar");
		
		abc.showDetails();
	}
}
