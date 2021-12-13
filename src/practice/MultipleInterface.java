package practice;

interface FirstInterface {
	
	public void animal();
	
}
interface SecondInterface{
	
	public void animalsounds();

	
}
	
class Democlass implements FirstInterface, SecondInterface{

	@Override
	public void animalsounds() {
	System.out.println("cat,dog,tiger,lion");
		
	}

	@Override
	public void animal() {
		System.out.println("meow,woof,roar");
	}

}