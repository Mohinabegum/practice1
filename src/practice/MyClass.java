package practice;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//int myint=25;                 //Wide typecasting(automatically)
		//double mydouble=myint;
		
		//System.out.println(myint);
		//System.out.println(mydouble);
		
		
		double mydouble=50;            ///Narrow type casting(manually)
		int myint=(int) mydouble;
		
		
		System.out.println(mydouble);
		System.out.println(myint);

	}

}
