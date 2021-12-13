package Training;

public class Vehicle {

	String model = "Aston Martin";
	public void honk() {
		System.out.println("Peep Peep");
	}
}	

	class Car extends Vehicle {
	private String color = "Black";
	private int year = 2020;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	}

