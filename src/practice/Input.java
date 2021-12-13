package practice;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter Name,Age,Salary:");
		
		String userName=myObj.nextLine();
		
		int age=myObj.nextInt();
		double salary=myObj.nextDouble();
		//System.out.println("Enter username");
		System.out.println("Username is:"  +userName);
        System.out.println("Age:" +age);
        System.out.println("salary is:" +salary);
	}

}
