package characterCreator;

import java.util.Random;
import java.util.Scanner;

public class Cave {
	
	Scanner console = new Scanner(System.in);
	String caveWay; 
	int value;
	String position;
	int method;
	
public Cave() {
	super();
	method = getMethod();
}
	
	public int getMethod() 
	{
	
	do {
	System.out.println("-----------------------------------------------");
	System.out.println("        _    .  ,   .           .");
	System.out.println("    *  / \\_ *  / \\_      _  *        *   /\\'__        *");
	System.out.println("      /    \\  /    \\,   ((        .    _/  /  \\  *'.");
	System.out.println(" .   /\\/\\  /\\/ :' __ \\_  `          _^/  ^/    `--.");
	System.out.println("    /    \\/  \\  _/  \\-'\\      *    /.' ^_   \\_   .'\\  *");
	System.out.println("  /\\  .-   `. \\/     \\ /==~=-=~=-=-;.  _/ \\ -. `_/   \\");
	System.out.println(" /  `-.__ ^   / .-'.--\\ =-=~_=-=~=^/  _ `--./ .-'  `-");
	System.out.println("/        `.  / /       `.~-^=-=~=^=.-'      '-._ `._        _   .  ,   .           .");
	System.out.println("\nYou Enter the Cave -\n");
	System.out.println("\n The further in and in...The darker it gets");
	System.out.println("\n You happen upon Two ways split in the middle");
	System.out.println("\n - 'The left is dark, too dark to see ahead..To dark to see ahead...' -\n");
	System.out.println("\n - 'The right is lit with small illuminous mushrooms..' -\n");
	System.out.println("\n - 'DO you take the left (L) or the right (R)' -\n");
	caveWay = console.nextLine();
	caveWay = caveWay.toUpperCase();
    }while ((!(caveWay.equals("L")))&&(!(caveWay.equals("R"))));//checks for correct input

	if (caveWay.equals("L")) {
		
		System.out.println("\nYou Enter the Left Way -\n");
		System.out.println("\n As you walk, you notice a large drop to your right\n");
		System.out.println("   =/\\                 /\\=");
		System.out.println("    / \\'._   (\\_/)   _.'/ \\       (_                   _)");
		System.out.println("   / .''._'--(o.o)--'_.''. \\       /\\                 /\\");
		System.out.println("  /.' _/ |`'=/ ^ \\='`| \\_ `.\\     / \\'._   (\\_/)   _.'/ \\");
		System.out.println(" /` .' `\\;-,'\\___/',-;/` '. '\\   /_.''._'--('.')--'_.''._\\");
		System.out.println("/.-'       `\\(-V-)/`       `-.\\  | \\_ / `;=/ ^ \\=;` \\ _/ |");
		System.out.println("             ^   ^               \\/  `\\__|`\\___/`|__/`  \\/");
		System.out.println("                                  `       \\(/|\\)/       `");
		        
		System.out.println("\n Its filled with bats, so i think you made the right choice");
		System.out.println("\n AS you continue the two ways meet again..");
		System.out.println("\n --Then you hear a migthy Roar!!");
		
		System.out.println("\n");
		System.out.println("------------------------------------------\n");
		System.out.println("        ,      \\    /      ,        ");
		System.out.println("       / \\     )\\__/(     / \\      ");
		System.out.println("      /   \\   (_\\  /_)   /   \\     ");
		System.out.println(" ____/_____\\___\\@  @/___/_____\\_____");
		System.out.println("|              |\\../|               |");
		System.out.println("|               \\VV/                |");
		System.out.println("|        A DRAGON APPEARED!!        |");
		System.out.println("|___________________________________|");
		System.out.println(" |   /\\ /      \\\\      \\ /\\      |  ");
		System.out.println(" |  /  V        ))       V   \\   |  ");
		System.out.println(" |/     `       //        '     \\|  ");
		System.out.println(" `              V                ''  ");
		System.out.println("------------------------------------------\n");
		System.out.println("\n");
		
		do
		{
		System.out.println("OH NO!!!! ");
		System.out.println("Rolling the dice is out of 16.. rolling below an 8, you will fail...");
		System.out.println("Do you wish to fight it, by rolling the dice??(Y) [press Q to run away!!]");
						position = console.nextLine();
						position = position.toUpperCase();
			
		}while ((!(position.equals("Y")))&&(!(position.equals("Q"))));//checks for correct input
						
						
		
			if  (position.equals ("Y"))
			{	
				RandomDice rd1 = new RandomDice();
				System.out.println(rd1.toString());
				
	        }
		
		
	}
 
	else if (caveWay.equals("R")) {
		System.out.println("\nYou Enter the Left Way -\n");
		System.out.println("\n As you walk, You feel the air start to change\n");
		System.out.println("   =/\\                 /\\=");
		System.out.println("    / \\'._   (\\_/)   _.'/ \\       (_                   _)");
		System.out.println("   / .''._'--(o.o)--'_.''. \\       /\\                 /\\");
		System.out.println("  /.' _/ |`'=/ ^ \\='`| \\_ `.\\     / \\'._   (\\_/)   _.'/ \\");
		System.out.println(" /` .' `\\;-,'\\___/',-;/` '. '\\   /_.''._'--('.')--'_.''._\\");
		System.out.println("/.-'       `\\(-V-)/`       `-.\\  | \\_ / `;=/ ^ \\=;` \\ _/ |");
		System.out.println("             ^   ^               \\/  `\\__|`\\___/`|__/`  \\/");
		System.out.println("                                  `       \\(/|\\)/       `");
		        
		System.out.println("\n A HUGE SWARM OF BATS APPEAR");
		System.out.println("\n DO YOU SURVIVE?!?!");
		System.out.println("\nYour chances of living is 75% -\n");
		

		Random random = new Random();

		value = random.nextInt(16);
		
		value +=1;
		
		if (value <= 12) {
			
			System.out.println("You luckily fought of the bats!!");
			System.out.println("\n AS you continue the two ways meet again..");
			System.out.println("\n --Then you hear a migthy Roar!!");
			
			System.out.println("\n");
			System.out.println("------------------------------------------\n");
			System.out.println("        ,      \\    /      ,        ");
			System.out.println("       / \\     )\\__/(     / \\      ");
			System.out.println("      /   \\   (_\\  /_)   /   \\     ");
			System.out.println(" ____/_____\\___\\@  @/___/_____\\_____");
			System.out.println("|              |\\../|               |");
			System.out.println("|               \\VV/                |");
			System.out.println("|        A DRAGON APPEARED!!        |");
			System.out.println("|___________________________________|");
			System.out.println(" |   /\\ /      \\\\      \\ /\\      |  ");
			System.out.println(" |  /  V        ))       V   \\   |  ");
			System.out.println(" |/     `       //        '     \\|  ");
			System.out.println(" `              V                ''  ");
			System.out.println("------------------------------------------\n");
			System.out.println("\n");
			
			do
			{
			System.out.println("OH NO!!!! ");
			System.out.println("Rolling the dice is out of 16.. rolling below an 8, you will fail...");
			System.out.println("Do you wish to fight it, by rolling the dice??(Y) [press Q to run away!!]");
							position = console.nextLine();
							position = position.toUpperCase();
				
			}while ((!(position.equals("Y")))&&(!(position.equals("Q"))));//checks for correct input
							
							
			
				if  (position.equals ("Y"))
				{	
					RandomDice rd1 = new RandomDice();
					System.out.println(rd1.toString());
					
		        }
			
		}
		
		else {
			
			System.out.println("The bats swarmed, there was too many...You were defeated");
         
		}
		
		
		
		
		}
	
	return method;
	
		}
	public String toString()
	{
		String str;
		
		str = super.toString();

		str ="An End of a Journey.....";
		
		return str;
	
	
	
	
	}
	

}
