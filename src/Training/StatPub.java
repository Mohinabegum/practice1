package Training;

public class StatPub {

	int abc = 3000;
	static void sMethod() {
		System.out.println("Static Method call directly without creating an object");
	}
	
	public void pMethod() {
		System.out.println("Public Method call by creating an object");
	}
	
	public void alyMethod() {
		System.out.println("Code Lab Tranining");
	}
	
	public static void main(String[] args) {
	
		StatPub myobj=new StatPub ();	
	
		myobj.pMethod();
		System.out.println(myobj.abc);
		myobj.alyMethod();
		
		sMethod();
		

	}

}
