package practice;

public class Car {
	
	static void mymethod() {
		System.out.println("My car is Maroon");
	}
	
	public void carmethod() {
		System.out.println("My car has six seats");
		System.out.println("seats are amazing");
		
	}
	
	public void speedmethod(int Maxspeed, int Accel) {	
		System.out.println("Maxspeed is:" +Maxspeed +" Accelration of Car is : "+Accel);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mymethod();
		Car myobj=new Car();
		myobj.carmethod();
		myobj.speedmethod(400, 150 );
		

	}

}
