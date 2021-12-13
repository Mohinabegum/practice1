package Training;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
	    
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter Your Name");

	    String userName = myObj.nextLine();  // Read user input
	    System.out.println("Enter your salary ");
	    double salary = myObj.nextDouble();
	   System.out.println("Enter you Mobile no: ");
	    long mobile = myObj.nextLong();
	    
	    System.out.println("Employee Name is : " + userName);  // Output user input
	    System.out.println("Salary is  "+salary);
	    System.out.println("Your Contact No is : " +mobile);


	}

}
