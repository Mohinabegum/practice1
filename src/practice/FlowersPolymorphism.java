package practice;

public class FlowersPolymorphism {

	public void flower() {
		System.out.println("bloom");
	}
}
        class rose extends FlowersPolymorphism{
	
	      public void flower(){
		      int rose = 3;
		      int qty= 50;
		      int tot = rose * qty;
	    	  System.out.println("rose is red "+ "Quantity of Rose: " +tot) ;
		       
	}
        }
	   class Tulip extends FlowersPolymorphism{
		  public void flower() {
			    System.out.println("Tulip is pink");
		}
	}
	
