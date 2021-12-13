package practice;

import java.util.ArrayList;

public class MyArrayClass {

	public static void main(String[] args) {
		ArrayList<String>cars=new ArrayList();
		cars.add("BMW");
		cars.add("FERRARI");
		cars.add("PORSCHE");
		cars.add("CAMRY");
		cars.add("SIENNA");
		System.out.println(cars);
		
		System.out.println(cars.get(0));
		
		System.out.println(cars.set(2, "OPEL"));
		
		System.out.println(cars.size());
		
		for (int i = 0; i < cars.size(); i++) {
		      System.out.println(cars.get(i));
		      
		      
		}
		
		for (String i : cars) {
		      System.out.println(i);
		    }


		
		

	}

}
