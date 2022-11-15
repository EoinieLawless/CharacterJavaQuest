package characterCreator;

import java.util.*;

public class JourneyQuest {
	int locationEvent;
	String locationEventWord;
	
	
	Scanner console = new Scanner(System.in);
	
	//constructor
	public JourneyQuest()
	{
		super();
		locationEventWord = getlocationEvent();

	}
	 
	//Methods
	
	public String getlocationEvent()
	{
		System.out.println("-----------------------------------------------");
		System.out.println("\nYou Enter Into the Quest With Three Options -\n\n-A Nearby Village (1)\n\n-A Far away cave (2)\n\n-Ah forget a quest, I wanna go fishing (3) \n");
		System.out.println("-----------------------------------------------");
		locationEvent = console.nextInt(); 
		
		if(locationEvent == 1) {
			locationEventWord = ("Village");
		}
		else if(locationEvent == 2){
			locationEventWord = ("Cave");
		}
	    else if(locationEvent == 3){
	    	locationEventWord = ("Fishing...");
		}
			
		return locationEventWord;
		 
	} 
	//********************************************************	
	
		
	public String toString()
	{
		String str;
		
		str = super.toString();

		
		str +="You have chosen: " +locationEventWord + "\n";
		return str;
	}

}
