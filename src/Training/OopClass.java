package Training;

public class OopClass {

	int x = 30;
	int y = 20;
	String fname = "Mohina";
	String desig = "Java Developer";
	double salary;
	
	
		
	
	
	
	public static void main(String[] args) {
		
		
		
		OopClass mObj = new OopClass();
		
		OopClass zObj = new OopClass();
		
		OtherClass mohObj = new OtherClass();
		
		
		System.out.println(mObj.x +  mObj.y);
		System.out.println(mObj.x * mObj.y);
		
		zObj.x = 100;
		zObj.y = 200;
		mObj.x = 55;
		System.out.println(zObj.x + zObj.y);
		mohObj.greeting = "Good Night";
		System.out.println(mohObj.greeting);
	}

}
