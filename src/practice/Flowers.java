package practice;

public class Flowers {

	public static void main(String[] args) {
		
		
		FlowersPolymorphism myobj=new FlowersPolymorphism();
		FlowersPolymorphism roseobj=new rose();
		FlowersPolymorphism Tulipobj=new Tulip();
		
		
		myobj.flower();
		roseobj.flower();
		Tulipobj.flower();
		
		
	}

}
