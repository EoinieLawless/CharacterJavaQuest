package characterCreator;



public class MageHealer extends Support{
	
String HealWand;

	
	
	//constructor
	public MageHealer()
	{
		super();
		HealWand = getHealWand();
		
	}
	
	//------------------------------------
	
	public String getHealWand() 
	{
		console.nextLine();
		System.out.println("Whats the name of your wand? ");
		HealWand = console.nextLine(); 
		
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
		
		return HealWand;
	}
	
	//------------------------------------
	
		public String toPrintFile()
		{
			String str1;
			
			str1 = super.toPrintFile();
			str1 +=   HealWand+ "\t";
			 
			 return str1;
		}


	//------------------------------------
		
		public String toString()
		{
			String str;
			
			str = super.toString();

			str +="Name of Wand: " +HealWand + "\n";
			return str;
		}


}
