package Training;

public class TryCatchExample {

	public static void main(String[] args) {

		try {
		      int[] myNumbers = {1, 2, 3, 4, 5, 6, 7};
		      System.out.println(myNumbers[5]);
		    } catch (Exception e) {
		      System.out.println("Please input value between 0 to 6");
		    }
		finally {
			System.out.println("Thank you for your input!");
		}


	}

}
