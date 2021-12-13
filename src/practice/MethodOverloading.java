package practice;

public class MethodOverloading {
	
	static int Method(int a,int b) {
		return(a*b);
	}
		
static double Method(double a,double b) {
		return(a/b);
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 int num1=Method(10,10);
	 double num2=Method(1.6,5.5);
	 System.out.println("int:"   +num1  );
     System.out.println("double:" +num2);
	}

}
