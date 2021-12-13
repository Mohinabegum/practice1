package practice;

import java.util.HashSet;

public class HasshSet {

	public static void main(String[] args) {

		HashSet<String> cars=new HashSet<String>();
		
		cars.add("VOLVO");

		cars.add("BMW");
		
		cars.add("VOLKSWAGEN");
		
	System.out.println(cars);
		
		System.out.println(cars.contains("BMW"));
		
		System.out.println(cars.contains("MAZDA"));
		
		System.out.println(cars.contains("VOLSWAGEN"));
		
		System.out.println(cars.remove("VOLKSWAGEN"));
		
		//System.out.println(cars.clear());
	}
	

}
