package practice;

public class CommentVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int EmployeeId=123;
		String Name="Mohina";
		String Designation="Engineer";
		
		
		System.out.println("EmployeeId:"+EmployeeId);
		
		System.out.println("Name:"+Name);
		
		System.out.println("Designation:"+Designation);
		int Salary=100000;
		System.out.println("Salary:"+Salary);
		int Inc=2000;
		System.out.println("Inc:"+Inc);
		int Ftax=100;
		System.out.println("Ftax:"+Ftax);
		int Ins=100;
		System.out.println("Ins:"+Ins);
		int TotalSalary=Salary+Ins-Ftax-Ins;
		System.out.println(TotalSalary);
		
		
		

	}

}
