package Training;



public class CarDealer {

	public static void main(String[] args) {
		
		
		Car myObj = new Car();
				
		System.out.println(myObj.model);
		System.out.println(myObj.getColor());
		System.out.println(myObj.getYear());

		myObj.honk();
	}

}
