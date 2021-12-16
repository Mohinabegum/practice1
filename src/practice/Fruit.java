package practice;

public class Fruit {
	public void apple() {
		System.out.println("apple is red");
	}
	
}
class kiwi extends Fruit{
	private String color="kiwi is Green";
	private int price1ofkiwi=  3;
	private int price2ofapple=  2;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice1ofkiwi() {
		return price1ofkiwi;
	}
	public void setPrice1ofkiwi(int price1ofkiwi) {
		this.price1ofkiwi = price1ofkiwi;
	}
	public int getPrice2ofapple() {
		return price2ofapple;
	}
	public void setPrice2ofapple(int price2ofapple) {
		this.price2ofapple = price2ofapple;
		
		
		//first commit
	}
	
}
