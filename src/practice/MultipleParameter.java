package practice;

public class MultipleParameter {
	
	static void MyFruit(String Name,int cost) {
		
		System.out.println(Name +" "+"is yellow and "+cost);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFruit("Banana",120);
		MyFruit("Mango",180);

	}

}
