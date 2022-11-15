package characterCreator;

public class Knight extends Warrior{
	
	int princessesSaved;
	
	
	//constructor
	public Knight()
	{
		super();
		princessesSaved = getPrincessesSaved();
		
	}
	
	//------------------------------------
	
	public int getPrincessesSaved() 
	
	{

		System.out.println("How many Princesses have you saved? ");
		princessesSaved = console.nextInt();  
		
		
		
		 System.out.println("  / \\");
			System.out.println("  | |");
			System.out.println("  |.|");
			System.out.println("  |.|");
			System.out.println("  |:|      __");
			System.out.println(",_|:|_,   /  )");
			System.out.println("  (Oo    / _I_");
			System.out.println("  +\\ \\  || __|");
			System.out.println("     \\ \\||___|");
			System.out.println("        \\ /.:.\\-\\");
			System.out.println("         |.:. /-----\\");
			System.out.println("         |___|::oOo::|");
			System.out.println("         /   |:<_T_>:|");
			System.out.println("        |_____\\ ::: /");
			System.out.println("         | |  \\ \\:/");
			System.out.println("         | |   | |");
			System.out.println("         \\ /   | \\___");
			System.out.println("         / |   \\_____\\");
			System.out.println("         `-'");
			
		return princessesSaved;
	}
	
	//------------------------------------
	
		public String toPrintFile()
		{
			String str1;
			
			str1 = super.toPrintFile();
			str1 +=   princessesSaved+ "\t";
			 
			 return str1;
		}


	//------------------------------------
		
		public String toString()
		{
			String str;
			
			str = super.toString();

			str +="Number of Princesses Saved: " +princessesSaved + "\n";
			return str;
		}

}
