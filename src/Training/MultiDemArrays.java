package Training;

public class MultiDemArrays {

	public static void main(String[] args) {
		
		int[][] sum = {{10,20,30,40,50},{60,70,80,90}, {100, 200, 300, 400}, {1000, 10000, 100000}};
		
		System.out.println(sum[2][2]);
		
		String[] empName = {"Mohina", "Muneera", "Aly", "Mir"};
		int[] salary = {6000, 7500, 9000};
		
		System.out.println("Employee Name: " + empName[0] );
		System.out.println("Salary       : " + salary[1]);
		System.out.println("Employee Name: " + empName[1] );
		System.out.println("Salary       : " + salary[2]);
		System.out.println("Employee Name: " + empName[2] );
		System.out.println("Salary       : " + salary[0]);
		
		
	}

}
