package characterCreator;

public class Archer extends Warrior {
	
	int bowtype;
	String bow;
	
	//constructor
	public Archer()
	{
		super();
		bow = getBow();
		
	}
	
	//------------------------------------	
	public String getBow() 
	{
		
		System.out.println("What bow would you like? Longbow(1), Shortbow(2)");
		bowtype = console.nextInt();  
		
		if(bowtype == 1) {
			bow = ("Longbow");
		}
	    else if(bowtype == 2){
			bow = ("Shortbow");
		}
		System.out.println("\n>>>>>>>_____________________\\`-._");
		System.out.println(">>>>>>>                     /.-'\n");
			
		
		return bow;
	}
	
	//------------------------------------
	
		public String toPrintFile()
		{
			String str1;
			
			str1 = super.toPrintFile();
			str1 +=  bow+ "\t";
			 
			 return str1;
		}


	//------------------------------------		
		public String toString()
		{
			String str;
			
			str = super.toString();

			str +="Type of bow: " +bow + "\n";
			return str;
		}

}
