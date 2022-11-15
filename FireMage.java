package characterCreator;

public class FireMage extends Mage {
	
String fireWand;
	
	
	//constructor
	public FireMage()
	{
		super();
		fireWand = getFireWand();
		
	}
	
	//------------------------------------
	
	public String getFireWand() 
	{
		console.nextLine();
		System.out.println("Whats the name of your wand? ");
		fireWand = console.nextLine(); 
		
		if(fireWand.equals("wand") ) {
			System.out.println("How orignal... \n");
		}
		
		System.out.println("                          /\\");
		System.out.println("                         /  \\");
		System.out.println("                        |    |");
		System.out.println("                      --:'''':--");
		System.out.println("                        :'_' :");
		System.out.println("                        _:'':\\___");
		System.out.println("         ' '      ____.' :::     '._");
		System.out.println("        . *=====<<=)           \\    :");
		System.out.println("         .  '      '-'-'\\_      /'._.'");
		System.out.println("                          \\====:_ ");
		System.out.println("                         .'     \\");
		System.out.println("                        :       :");
		System.out.println("                       /   :    \\");
		System.out.println("                      :   .      '.");
		System.out.println("                      :  : :      :");
		System.out.println("                      :__:-:__.;--'");
		System.out.println("                      '-'   '-'");
		
		return fireWand;
	}
	
	//------------------------------------
	
		public String toPrintFile()
		{
			String str1;
			
			str1 = super.toPrintFile();
			str1 +=   fireWand+ "\t";
			 
			 return str1;
		}


	//------------------------------------
		
		public String toString()
		{
			String str;
			
			str = super.toString();

			str +="Name of Wand: " +fireWand + "\n";
			return str;
		}

}
