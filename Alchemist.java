package characterCreator;


public class Alchemist extends Support{
	
int potion;

	
	
	//constructor
	public Alchemist()
	{
		super();
		potion = getPotion();
		
	}
	
	//------------------------------------
	
	public int getPotion() 
	{
		System.out.println("How many potions do you carry? ");
		potion = console.nextInt(); 
		
		System.out.println("--------------------");
		System.out.println("|    __      __    |");
		System.out.println("|  /    \\  /    \\  |");
		System.out.println("|  |     \\/     |  |");
		System.out.println("|   \\          /   |");
		System.out.println("|     \\      /     |");
		System.out.println("|       \\  /       |");
		System.out.println("|        \\/        |");
		System.out.println("|                  |");
		System.out.println("--------------------");
		 
		return potion;
	}
	
	//------------------------------------
	
		public String toPrintFile()
		{
			String str1;
			
			str1 = super.toPrintFile();
			str1 +=   potion+ "\t";
			 
			 return str1;
		}


	//------------------------------------
		
		public String toString()
		{
			String str;
			
			str = super.toString();

			str +="Amount of Potions: " +potion + "\n";
			return str;
		}

}
