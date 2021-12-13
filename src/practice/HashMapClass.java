package practice;

import java.util.HashMap;

public class HashMapClass {

	public static void main(String[] args) {
		HashMap<String,String> capitalCities=new HashMap <String,String>();
		
		capitalCities.put("ENGLAND","LONDON");
		capitalCities.put("GERMANY","BERLIN");
		
		//System.out.println(capitalCities);
		System.out.println(capitalCities.get("ENGLAND"));

		System.out.println(capitalCities.remove("GERMANY"));
		
		capitalCities.clear();
		
		System.out.println(capitalCities);
}
}