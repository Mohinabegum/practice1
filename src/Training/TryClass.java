package Training;

import java.util.*;



public class TryClass {

	public static void main(String[] args) {
		
		GetSetMethod myObj = new GetSetMethod();
		
		myObj.setName("Mohina");
		System.out.println(myObj.getName());
		myObj.setAge(32);
		System.out.println(myObj.getAge());
		myObj.setSalary(10000);
		myObj.setDesig("DEVELOPER");
		System.out.println(myObj.getSalary());
		System.out.println(myObj.getDesig());

		
		
	}

}
