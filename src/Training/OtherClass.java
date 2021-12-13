package Training;

public class OtherClass {
	
	String greeting = "Good Morning";

	public static void main(String[] args) {
		
		OtherClass alyObj = new OtherClass();
		OopClass muneeraObj = new OopClass();
		
		System.out.println(muneeraObj.fname);
		System.out.println("Designation : " +muneeraObj.desig);
		System.out.println(muneeraObj.desig );
		muneeraObj.fname = "Muneera";
		System.out.println(muneeraObj.fname);
		muneeraObj.fname = "Aly";
		System.out.println(muneeraObj.fname);
		System.out.println(alyObj.greeting);
	}

}
