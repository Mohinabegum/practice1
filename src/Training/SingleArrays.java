package Training;

public class SingleArrays {

	public static void main(String[] args) {
		
				
		String[] cars = {"Volvo", "BMW", "Honda", "Cadilac", "camry"};
		
		int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80};
		
		cars[32] = "Mercedes";
		
		numbers[4]=500;
		
		cars[1] = "Audi";
		
		System.out.println(cars[3]);
		
		System.out.println(numbers[4]);
		
		System.out.println(cars[1]);
		
		System.out.println(cars.length);
		System.out.println(numbers.length);
	}

}
