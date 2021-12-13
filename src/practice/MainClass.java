package practice;

public class MainClass {

	public static void main(String[] args) {
		
		PrivateClass myPrivate=new PrivateClass();
		
		PrivateClass.InnerClass myInner=myPrivate.new InnerClass();
		
		System.out.println(myPrivate.x+myInner.y);

	}

}
