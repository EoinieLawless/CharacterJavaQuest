package characterCreator;

public class Mage extends HeroDetails{
	
	int numberOfSpells;
	int spells;
	
	
	//constructor
	public Mage()
	{
		super();
		numberOfSpells = getNumberOfSpells();
		spells = getSpells();
	}
	 
	//Methods
	
	public int getNumberOfSpells()
	{
		System.out.println("How many Spells do you know? ");
		numberOfSpells = console.nextInt(); 
		
		if(numberOfSpells < 10) {
			
			System.out.println("Still a novice I see... ");
		}
		
		else if(numberOfSpells > 10) {
			
			System.out.println("Wow, you must be a genius of yours arts!!\n ");
		}
		 
		return numberOfSpells;
	} 
	//********************************************************	
	
	public int getSpells()
	{
		System.out.println("How many spells can you cast per day? ");
		spells = console.nextInt(); 

		if(spells < 5) {
			
			System.out.println("You might wanna Practice more...\n ");
		}
		
		return spells;
	}
	
	
	// ******************************************
	public String toPrintFile()
	{
		String str1;
		
		str1 = super.toPrintFile();
		str1 +=   numberOfSpells+ "\t" +spells+ "\t"   ;
		 
		return str1;
	}


	//************************************************************			
	public String toString()
	{
		String str;
		
		str = super.toString();

		str +="Spells known: " +numberOfSpells + "\n";
		str +="Spells cast per day: " +spells + "\n";
		return str;
	}


}
