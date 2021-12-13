package practice;

abstract class person {
	
	public String fname="Mohina";
	public int id=101;
	public abstract void study();
	
	
	 class Student extends person{
		
		public int graduationyear=2010;
		
		public void study() {
			System.out.println("hii");
		}
	}
	
		
	
	
}
