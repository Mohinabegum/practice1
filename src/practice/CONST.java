package practice;

public class CONST {
	int Modelyear;
	String Modelname;
	int Noofseats;
	String colorofcar;
	
	public CONST(int year,String name,int seats,String color ) {
	
		 Modelyear=year;
		 Modelname=name;
		 Noofseats=seats;
		 colorofcar=color;
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CONST mycar=new CONST(2021,"Sienna",8,"Maroon");
		System.out.println("Modelyear:"+mycar.Modelyear+"\n"+"Modelname:"+mycar.Modelname+"\n"+"Noofseats:"+mycar.Noofseats+"\n"+"colorofcar:"+mycar.colorofcar);
			
		}

	}


