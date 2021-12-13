package Training;

public class CallPerson {

	public static void main(String[] args) {
		
		Student alyObj = new Student();
		
		alyObj.fname = "Muneera";
		System.out.println(alyObj.fname);
		System.out.println(alyObj.age);
		System.out.println(alyObj.graduationYear);
		alyObj.study();
	}

}
