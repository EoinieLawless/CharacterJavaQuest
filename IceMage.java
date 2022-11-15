package characterCreator;

public class IceMage extends Mage{
	
String iceWand;
	
	
	//constructor
	public IceMage()
	{
		super();
		iceWand = getIceWand();
		
	}
	
	//------------------------------------
	
	public String getIceWand() 
	{
		console.nextLine();
		System.out.println("Whats the name of your wand? ");
		iceWand = console.nextLine(); 
		
		if(iceWand.equals("wand") ) {
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
		
		return iceWand;
		
	}
	
	//------------------------------------
	
		public String toPrintFile()
		{
			String str1;
			
			str1 = super.toPrintFile();
			str1 +=   iceWand+ "\t";
			 
			 return str1;
		}


	//------------------------------------
		
		public String toString()
		{
			String str;
			
			str = super.toString();

			str +="Name of Wand: " +iceWand + "\n";
			return str;
		}

}
