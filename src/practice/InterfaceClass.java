package practice;

interface pet {
	
	public void amimalSound();
	
	public void sleep();	

}

 class Dog implements pet{

	@Override
	public void amimalSound() {
		System.out.println("Dog says:woof,woof");
		
	}

	@Override
	public void sleep() {
		System.out.println("zzzZzz");
		
	}
	
}