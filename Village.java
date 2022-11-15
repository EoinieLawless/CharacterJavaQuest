package characterCreator;


public class Village {
	int villageChoice;
	

	
	//constructor
	public Village()
	{
		super();
		villageChoice = getvillageChoice();
		
	}
	
	//------------------------------------	
	public int getvillageChoice() 
	{
		
	
		
		System.out.println("-----------------------------------------------");
		System.out.println("\nYou Enter the village -\n");
		System.out.println("                                                          |>>>");
		System.out.println("                   _                      _                |");
		System.out.println("    ____________ .' '.    _____/----/-\\ .' './========\\   / \\");
		System.out.println("   //// ////// /V_.-._\\  |.-.-.|===| _ |-----| u    u |  /___\\");
		System.out.println("  // /// // ///==\\ u |.  || | ||===||||| |T| |   ||   | .| u |_ _ _ _ _ _");
		System.out.println(" ///////-\\////====\\==|:::::::::::::::::::::::::::::::::::|u u| U U U U U");
		System.out.println(" |----/\\u |--|++++|..|'''''''''''::::::::::::::''''''''''|+++|+-+-+-+-+-+");
		System.out.println(" |u u|u | |u ||||||..|              '::::::::'           |===|>=== _ _ ==");
		System.out.println(" |===|  |u|==|++++|==|              .::::::::.           | T |....| V |..");
		System.out.println(" |u u|u | |u ||HH||         \\|/    .::::::::::.");
		System.out.println(" |===|_.|u|_.|+HH+|_              .::::::::::::.              _");
		System.out.println("                __(_)___         .::::::::::::::.         ___(_)__");
		System.out.println("---------------/  / \\  /|       .:::::;;;:::;;:::.       |\\  / \\  \\-------");
		System.out.println("______________/_______/ |      .::::::;;:::::;;:::.      | \\\\_______\\\\________");
		System.out.println("|       |     [===  =] /|     .:::::;;;::::::;;;:::.     |\\ [==  = ]   |");
		System.out.println("|_______|_____[ = == ]/ |    .:::::;;;:::::::;;;::::.    | \\[ ===  ]___|____");
		System.out.println("     |       |[  === ] /|   .:::::;;;::::::::;;;:::::.   |\\ [=  ===] |");
		System.out.println("_____|_______|[== = =]/ |  .:::::;;;::::::::::;;;:::::.  | \\[ ==  =]_|______");
		System.out.println(" |       |    [ == = ] /| .::::::;;:::::::::::;;;::::::. |\\ [== == ]      |");
		System.out.println("_|_______|____[=  == ]/ |.::::::;;:::::::::::::;;;::::::.| \\[  === ]______|_");
		System.out.println("   |       |  [ === =] /.::::::;;::::::::::::::;;;:::::::.\\ [===  =]   |");
		System.out.println("___|_______|__[ == ==]/.::::::;;;:::::::::::::::;;;:::::::.\\[=  == ]___|_____");
		System.out.println("\n As you walk through you notice a lack of energy");
		System.out.println("\n You see the people shuffling, as if none have slept for days");
		System.out.println("\n In the main market, a large stall with dozens of people lying");
		System.out.println("\n You enter and see doctors all around");
		System.out.println("\n - 'Sir, You cant be in here, These people are sick' -\n");
		System.out.println("\n - unfortunately, theres nothing you can do....  -\n");
		System.out.println("-----------------------------------------------");
		
		
		return villageChoice;
	}
	
	//------------------------------------
		
		public String toString()
		{
			String str;
			
			str = super.toString();

			str ="You Leave the village...";
			return str;
		}
		
		
}
