package characterCreator;

import java.util.*;

public abstract class HeroDetails {
	
	//Hero details 
	
	String name;
	String race;
	int strength;
	int intel;
	int chr;
	
	
	
	Scanner console = new Scanner(System.in);
	
	//constructor	
		HeroDetails()
		{
			name = getName();
			race= getRace();
			strength = getStrength();
			intel = getIntelligence();
			chr = getCharisma();
		}
		
	// methods
	//**************************************	
		public String getName()
		{
			System.out.println("What is your name? ");
			name = console.nextLine();
			System.out.println("\nPerfect name for a Hero!\n" );
			  
			return name;
		}
	//*****************************************	
		public String getRace()
		{
			System.out.println("What is your Race?(Ogre,Human,Lizrad... ");
			race= console.nextLine();
			  
			return race;
		}
		
	//************************************************		
		  	  
		public int getStrength()
		{
			System.out.println("What is your Strength out of 10? (e.g. 5/10) ");
		    strength = console.nextInt(); 
		    if (strength > 10) {
		    	System.out.println("\nWow, You could probably fight Chuck Norris!!\n");
		    }
			  
			return strength;
		}
	//************************************************		
	  	  
		public int getIntelligence()
		{
			System.out.println("What is your Intelligence out of 10? (e.g. 5/10) ");
		    intel = console.nextInt(); 
		    if (intel > 10) {
		    	System.out.println("\nAre you Albert Einstein???\n");
		    }
			  
			return intel;
		}
	//************************************************		
	  	  
		public int getCharisma()
		{
			System.out.println("What is your Charisma out of 10? (e.g. 5/10) ");
		    chr = console.nextInt(); 
		    if (chr > 10) {
		    	System.out.println("Wooh wooh, smooth talker! \n");
		    }
			  
			return chr;
		}
		
	//************************************************
		
		public String toPrintFile()
		{
			String str1;
			
			str1 ="\t" +  name+ "\t" +race+ "\t"+strength+ "\t"+intel+ "\t"+chr+ "\t" ;
			
			return str1;
		}
			
	//**************************************
		public String toString()
		{
			String str;
			str = "\nName: "+name +"\n";
			str +="Race: "+race + "\n";
			str +="Strength: "+strength + "\n";
			str +="Intelligence: "+intel + "\n";
			str +="Charisma: "+chr + "\n";
				 	
			return str;
		}

}
