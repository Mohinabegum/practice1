package practice;

public class ThrowError {
	
	static void CheckAge(int age) {
		if(age<18) {
			
			throw new ArithmeticException("Access Denied:you must be atleast 18 years old.");
		}
			else {
				System.out.println("Access Granted:you are old enough.");
				
			}
		}
	

	public static void main(String[] args) {
		
		//CheckAge(15);
		

	CheckAge(22);


	}

}
