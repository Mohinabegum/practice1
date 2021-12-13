package practice;

public class IfelseMethod {
	
	static void checkAge(int age) {
		
		if(age<18) {
			System.out.println("sorry access denied");
		}else {
			System.out.println("access granted");
			
		}
				
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//checkAge(21);	
		checkAge(11);
	}

}
