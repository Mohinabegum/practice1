package Training;

public class ForLoop {

	public static void main(String[] args) {
		for (int i = 0; i <= 50; i= i + 10) {
			  System.out.println(i);
			}

		for (int j = 0; j < 10; j++) {
			  if (j == 4) {
			   //System.out.println("My favourite number is " +j);
				   continue;
			  }
			  System.out.println(j);
			}

	}

}
