package Training;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.add("Honda");
	    cars.add("Mercedes");
	    System.out.println(cars);
	    cars.set(4, "Jeep");
//	    cars.remove(4);
	    System.out.println(cars.get(4));
	    System.out.println(cars.size());


	}

}
