package Training;

public class MethodParameter {

	
	static void paraMethod(String fname, int empId, String desig) {
		System.out.println("\nEmployee Id is :" +empId +"\n" + "Employee Name: - " +fname +" Mohammed" +  "\nDesignation is : " +desig);
		
	}
	
	static int testMethod (int sum) {
		return 5 + sum;
		
	
		
	}
	
	public static void main(String[] args) {
		
		paraMethod("Aly", 568, "Engineer");
		paraMethod("Asif", 457, "Developer");
		paraMethod("Vasi", 365, "Accountant" );
		paraMethod("Muneera", 235, "Software Engineer");
		paraMethod("Mohina" , 124, "Java Developer");
		
		System.out.println(testMethod(30));

	}

}
