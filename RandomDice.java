package characterCreator;

import java.util.Random;



public class RandomDice {
	
	int value;
	String outcome;
	
	public RandomDice()
	{
		super();
		outcome= getOutcome();
		
	}
	
	
	public String getOutcome()
	{
			

		Random random = new Random();

		value = random.nextInt(16);
		
		value +=1;
		
		if (value >= 8) {
			
		this.outcome = ("You Beat the Dragon!!!!!!");
			
		}
		
		else {
			
			this.outcome = ("The Dragon Ate you...it was a really big dragon...");
		}
		
		
		return outcome;
		
	}
	
    public String toString()
	{
		String str;
		
		str = super.toString();

		str ="Roll of dice is: " + value + "\n";
		str +="------------------------------------\nThe outcome is: "+ outcome + "\n-----------------------------------\n";
		return str;
	}

}
