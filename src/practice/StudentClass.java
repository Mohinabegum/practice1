package practice;

public class StudentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Title      =  "     ReportCard";
		String SchoolName   ="DLS";
		String StudentName  ="Mohinabegum";
		String Htno = "PQ123Y";
		int RollNumber      =786;
		int English         =51;
		int Mathematics     =61;
		int Science         =41;
		int Social          =81;
		int Hindi           =91;
		int Total           =RollNumber+English+ Mathematics+Science+Social+Hindi;
		char Grade          ='A';
		String Result       ="PASS";		
		
		Title = "Student Report Card";
		
		System.out.println("**********************");
		System.out.println(Title);
		System.out.println("**********************");
		System.out.println("Hall Ticket No  = " + Htno);
		System.out.println("SchoolName      = "+SchoolName );
		System.out.println("StudentName     = "+StudentName );
		System.out.println("RollNumber      = "+ RollNumber);
		System.out.println("English         = "+English  );
		System.out.println("Mathematics     = "+ Mathematics);
		System.out.println("Science         = "+ Science);
		System.out.println("Social          = "+Social );
		System.out.println("Hindi           = "+ Hindi );
		System.out.println("----------------------");
		System.out.println("Total           -> "+ Total );
		System.out.println("");
		System.out.println("Grade         =         "+Grade);
		System.out.println("Result        =         "+Result);
		
		
		
		
		
		

	}

}
