package characterCreator;

public class Ninja extends Warrior {
	
	int swordtype;
	String sword;
	
	//constructor
	public Ninja()
	{
		super();
		sword = getSword();

		
	}
	
	//------------------------------------

	public String getSword() 
	{
		
		System.out.println("What Sword/weapon would you like? Katana(1), Dagger(2)");
		swordtype = console.nextInt();   
		
		if (swordtype == 1) {
			sword =("Katana");
		}
		
	    else if(swordtype == 2){
	    	sword = ("Dagger");
	    	
		}
		 System.out.println("  / \\");
			System.out.println("  | |");
			System.out.println("  |.|");
			System.out.println("  |.|");
			System.out.println("  |:|      __");
			System.out.println(",_|:|_,   /  )");
			System.out.println("  (Oo    / _I_");
			System.out.println("  +\\ \\  || __|");
			System.out.println("     \\ \\||___|");
			System.out.println("        \\ /.:.\\-\\         (Hes a ninja knight)");
			System.out.println("         |.:. /-----\\");
			System.out.println("         |___|::oOo::|");
			System.out.println("         /   |:<_T_>:|");
			System.out.println("        |_____\\ ::: /");
			System.out.println("         | |  \\ \\:/");
			System.out.println("         | |   | |");
			System.out.println("         \\ /   | \\___");
			System.out.println("         / |   \\_____\\");
			System.out.println("         `-'");	

		
		return sword;
	}
	
	//------------------------------------
	
		public String toPrintFile()
		{
			String str1;
			
			str1 = super.toPrintFile();
			str1 +=  sword+ "\t";
			 
			 return str1;
		}


		//------------------------------------			
		public String toString()
		{
			String str;
			
			str = super.toString();

			str +="Type of weapon: " +sword + "\n";
			return str;
		}
	
	

}
