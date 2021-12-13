package Training;

public class OkClass {

	public static void main(String[] args) {
		
		OopClass myobj=new OopClass();
		OtherClass aObj = new OtherClass();
		
		myobj.desig = "Full Stack";
		System.out.println(myobj.fname);
		System.out.println(myobj.desig);
		myobj.salary = 12000;
		System.out.println(myobj.salary);
		myobj.salary=16000;
		System.out.println(myobj.salary);
		
		myobj.fname="muneera";
		System.out.println(myobj.fname);
		aObj.greeting = "Good Evening";
		System.out.println(aObj.greeting);
		
		
	}

}
