package Training;

public class Animal {
	public void animalSound() {
		System.out.println("Animal makes sound");
	}

}

class Cat extends Animal {
	public void animalSound() {
		System.out.println("Cat: Meow Mewo");
		System.out.println("I love cats");
	}
}

class Dog extends Animal {
	public void animalSound() {
		System.out.println("Dog : Bow Bow");
	}
}