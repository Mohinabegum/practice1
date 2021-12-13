package practice;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		
		Pattern pattern=Pattern.compile("JAVAPROGRAM",Pattern.CASE_INSENSITIVE);
		
		Matcher matcher=pattern.matcher("JAVAPROGRAM");
		
		Boolean matchfound= matcher.find();
		
		if(matchfound) {
			
			System.out.println("MATCH FOUND");
		}
			else {
				System.out.println("MATCH NOTFOUND");
			
		}
		

	}

}
