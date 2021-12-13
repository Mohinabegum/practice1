package practice;

public class OuterEx {
	

		public static void main(String[] args) {
			
			OuterClass outerObj=new OuterClass();
			
			OuterClass.InnerClass innerObj=outerObj.new InnerClass();
			
			System.out.println(innerObj.y+ outerObj.x);
		}

	}


