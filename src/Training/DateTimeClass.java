package Training;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeClass {

	public static void main(String[] args) {
		
		LocalDate myObj = LocalDate.now();
		System.out.println(myObj);
		
		LocalTime tmObj = LocalTime.now();
		
		System.out.println(tmObj);
		
		LocalDateTime dtObj = LocalDateTime.now();
		
		System.out.println(dtObj +"\n");
				
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm ");

	    String formattedDate = dtObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);


	}

}
