package practice;

abstract class Animal {

	public abstract void Animalsound();
	
	public void sleep() {
	
System.out.println("sleep:Zzzz");

}
	
}

 class Cat extends Animal{
	
public void Animalsound() {
	
System.out.println("cat says Meow Meow");
		
	}
	
}
