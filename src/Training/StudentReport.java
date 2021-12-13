package Training;

public class StudentReport {

	public static void main(String[] args) {
		
		int rollNo = 219;
		String stuName = "Mohina Begum";
		String standard = "7th Standard";
		int eng = 75;
		int maths = 79;
		int science = 82;
		int total = eng  + maths + science;
		char gradeA = 'A';
		char gradeB = 'B';
		char gradeC = 'C';
		
		
		System.out.println("\tStudent Report Card");
		System.out.println("\t*******************\n");
		System.out.println("Roll Number : " +rollNo);
		System.out.println("Student Name: " +stuName);
		System.out.println("Standard    : " +standard);
		System.out.println("English     : " +eng);
		System.out.println("Mathematics : " +maths);
		System.out.println("Science     : " +science);
		System.out.println("=======================");
		System.out.println("Total Marks : " +total);
		System.out.println("Grade       : " +gradeA);
		System.out.println("-----------------------");
		
		
	}

}
