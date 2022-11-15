package characterCreator;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class CreationOptions {
	
	public static void main(String args[])throws FileNotFoundException 
	{
		
		Scanner console = new Scanner(System.in);
		
		//output files for Characters made 
		PrintWriter outFileW = new PrintWriter("Warrior.txt");
		PrintWriter outFileK = new PrintWriter("knight.txt");
		PrintWriter outFileA = new PrintWriter("archer.txt");
		PrintWriter outFileN = new PrintWriter("ninja.txt");
		PrintWriter outFileM = new PrintWriter("mage.txt");
		PrintWriter outFileIM = new PrintWriter("iceMage.txt");
		PrintWriter outFileFM = new PrintWriter("fireMage.txt");
		PrintWriter outFileS = new PrintWriter("support.txt");
		PrintWriter outFileAL = new PrintWriter("alchemist.txt");
		PrintWriter outFileMH = new PrintWriter("mageHealer.txt");
		PrintWriter outFileRD = new PrintWriter("randomDice.txt");

		
		String position;
		int error=0; //counts error exceptions
		int location;
		int supportVillage = 0;
		
		
		//pre-while loop test
		do
		{
			System.out.println("			-------------------------------------------");
			System.out.println("			|                                         |");
			System.out.println("			|  WELCOME TO THE CREATOR Character MENU  |");
			System.out.println("			|                                         |");
			System.out.println("			-------------------------------------------\n");	
			System.out.println("Are you a Warrior(W), Mage(M) or Support(S)? [press Q to quit questionaire] ");
			position = console.nextLine();
			position = position.toUpperCase();
		}while ((!(position.equals("W")))&&(!(position.equals("M")))&&(!(position.equals("S")))&&(!(position.equals("Q"))));//checks for correct input
		
		while(!(position.equals ("Q")))
		{
			//what kind of warrior
		
			if  (position.equals ("W"))
			{	
				System.out.println("Are you a Knight(K), Archer(A) or Ninja (N) ? ");
				position = console.nextLine();
				position = position.toUpperCase();
				 
				 try
				 {
				
					 if (position.equals("K") )
					 {
						
						HeroDetails k1 = new Knight();
						System.out.println(k1.toString());
						outFileK.print ( k1.getClass().getName());
						outFileK.println (k1.toPrintFile());
						 
						  
					 }
					 else if (position.equals("A") )
					 {
						 HeroDetails a1 = new Archer();
						 System.out.println(a1.toString());
						 outFileA.print ( a1.getClass().getName());  
						 outFileA.println (a1.toPrintFile());
					 }
					 
					 else if (position.equals("N") )
					 {
						 HeroDetails n1 = new Ninja();
						 System.out.println(n1.toString());
						 outFileN.print (n1.getClass().getName());  
						 outFileN.println (n1.toPrintFile());
					 }

					 else
					 {
						 System.out.println("Wrong letter input");
					 }
				 }
				 
				 catch(LossesException ex1)
				 {
					 System.out.println("There are more losses than battles fought!\nPlease re-enter Character design.\n.");
					 error++;
				 }
			}
			
				 
				 		
				if  (position.equals ("M"))
				{	
					System.out.println("Are you an Ice Mage(IM) or Fire Mage(FM) ? ");
					position = console.nextLine();
					position = position.toUpperCase();
					 
					 try
					 {
					
						 if (position.equals("IM") )
						 {
							HeroDetails im1 = new IceMage();
							System.out.println(im1.toString());
							outFileK.print (im1.getClass().getName());
							outFileK.println (im1.toPrintFile());						  
						 }
						 else if (position.equals("FM") )
						 {
							 HeroDetails fm1 = new FireMage();
							 System.out.println(fm1.toString());
							 outFileA.print (fm1.getClass().getName());  
							 outFileA.println (fm1.toPrintFile());
						 }
						 

						 else
						 {
							 System.out.println("Wrong letter input");
						 }
						 
					 }	
					 
					 catch(LossesException ex2)
					 {
						 System.out.println("I dont know how you messed this up.\n.");
						 error++;
					 }
			}
				
				
				
				if  (position.equals ("S"))
				{	
					supportVillage = 1;
					System.out.println("Are you an Alchemist(AL) or MageHealer (MH) ? ");
					position = console.nextLine();
					position = position.toUpperCase();
					 
					 try
					 {
					
						 if (position.equals("AL") )
						 {
							
							HeroDetails al1 = new Alchemist();
							System.out.println(al1.toString());
							outFileK.print (al1.getClass().getName());
							outFileK.println (al1.toPrintFile());
							 
							  
						 }
						 else if (position.equals("MH") )
						 {
							 HeroDetails mh1 = new MageHealer();
							 System.out.println(mh1.toString());
							 outFileA.print (mh1.getClass().getName());  
							 outFileA.println (mh1.toPrintFile());
						 }
						 
	
						 else
						 {
							 System.out.println("Wrong letter input");
						 }
					 }
				 
			 catch(HealException ex1)
			 {
				 System.out.println("You Cant Be a Healer And Not Heal!\nPlease re-enter Character design.\n.");
				 error++;
			 }			 
			 
		}
			
			if(error==0)
			{
				//The Quest
				do
				{
					
					System.out.println("-----------------------------------------------");
					System.out.println("\nYou Enter Into the Quest With Three Options -\n\n-A Nearby Village (1)\n\n-A Far away cave (2)\n\n-Ah forget a quest, I wanna go fishing (3)\n\n-Quit Quest (4) \n");
					System.out.println("-----------------------------------------------");
					location = console.nextInt(); 
					
					
				}while ((!(location == 1))&&(!(location == 2))&&(!(location == 3))&&(!(location == 4)));//checks for correct input
								
				while(!(location == 4))
					
					if (location == 1)
					{	
				
						if(supportVillage == 0) {
						Village v1 = new Village();
						System.out.println(v1.toString());
						}
						
						else if(supportVillage == 1) {
						VillageSupport vs1 = new VillageSupport();
						System.out.println(vs1.toString());
						}
						
						else {
							System.out.println("Village isnt found");
						}
						System.out.println("-----------------------------------------------");
						System.out.println("\nYou return to the beginning, where now? -\n\n-The Village again.. (1)\n\n-The Far away cave (2)\n\n-Ah forget a quest, I wanna go fishing (3)\n\n-Quit Quest (4) \n");
						System.out.println("-----------------------------------------------");
						location = console.nextInt(); 
					}
					
					else if (location == 2)
					{	
						Cave c1 = new Cave();
						System.out.println(c1.toString());
						break;
					}
					
					else if (location == 3)
					{	
						System.out.println("-----------------------------------------------");
						System.out.println(" ");
						System.out.println("      /`·.¸");
						System.out.println("    /¸...¸`:·");
						System.out.println(" ¸.·´  ¸   `·.¸.·´)");
						System.out.println(": © ):´;      ¸  {");
						System.out.println(" `·.¸ `·  ¸.·´\\`·¸)");
						System.out.println("     `\\\\´´\\¸.·´");
						System.out.println("Ummmm....You went fishing...GO EXPLORE!");
						System.out.println("-----------------------------------------------");
						System.out.println("\nYou return to the beginning, where now? -\n\n-The Village (1)\n\n-The Far away cave (2)\n\n-Fishing....again... (3)\n\n-Quit Quest (4) \n");
						System.out.println("-----------------------------------------------");
						location = console.nextInt(); 
						
			        }
				
				System.out.println("\n\nYou have Finished the Quest!\n\nCreate a new character?\n");
			}
			
			
			do
			{
				System.out.println("Are you a Warrior(W), Mage(M) or Support(S)? [press Q to quit questionaire] ");
				position = console.nextLine();
				position = position.toUpperCase();
				error=0; 
				
			}while ((!(position.equals("W")))&&(!(position.equals("M")))&&(!(position.equals("S")))&&(!(position.equals("Q"))));
		 

				
				 
			}
		 outFileW.close();
		 outFileK.close();
		 outFileA.close();
		 outFileN.close();
		 outFileM.close();
		 outFileIM.close();
		 outFileFM.close();
		 outFileS.close();
		 outFileAL.close();
		 outFileMH.close();
		 outFileRD.close();

		}
	}
	
	


