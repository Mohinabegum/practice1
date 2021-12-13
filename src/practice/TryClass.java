package practice;

public class TryClass {

	public static void main(String[] args) {
		GetsetMethod myobj=new GetsetMethod();
		myobj.setName("MOHINA");
		myobj.setAge(32);
		myobj.setDesig("DEVELOPER");
		myobj.setSalary(500000);
		System.out.println(myobj.getName());
		System.out.println(myobj.getAge());
		System.out.println(myobj.getDesig());
		System.out.println("$"+myobj.getSalary());
		
		

	}

}
