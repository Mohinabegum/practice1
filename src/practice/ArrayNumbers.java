package practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayNumbers {

	public static void main(String[] args) {
		
		ArrayList<Integer>myNumber=new ArrayList();
		myNumber.add(122);
		myNumber.add(111);
		myNumber.add(13);
		myNumber.add(51);
		System.out.println(myNumber);
		
Collections.sort(myNumber);
		for(int i:myNumber) {
			System.out.println(i);
		}
	}

}
