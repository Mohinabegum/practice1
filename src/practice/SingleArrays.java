package practice;

public class SingleArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]countries= {"INDIA","FRANCE","GERMANY","USA"};
		      int[]values= {10,20,30,40};
		System.out.println(countries[2]);
		      System.out.println(values[0]);
		      
		 System.out.println(countries.length);
		      System.out.println(values.length);
		
		
		countries[3]="UAE";
        System.out.println(countries[3]);
        
        for (String i : countries) {
        	  System.out.println(i);
        }
       
	}

}
