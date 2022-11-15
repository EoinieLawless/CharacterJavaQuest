package characterCreator;

public class Support extends HeroDetails {
	
	int peopleHealed;
	int healPerTime;
	int healNumPerDay;
	int supportVillage = 1;
	
	//constructor
	public Support()
	{
		super();
		peopleHealed = getPeopleHealed();
		healPerTime = getHealPerTime();
		healNumPerDay = getHealNumPerDay(healPerTime, peopleHealed);

	}
	 
	//Methods
	
	public int getPeopleHealed()
	{
		System.out.println("How many people can you heal at once? ");
		peopleHealed = console.nextInt(); 
		 
		return peopleHealed;
	} 
	//********************************************************	
	
	public int getHealPerTime()
	{
		System.out.println("How many times a day can you heal?? ");
		healPerTime = console.nextInt();  
		return healPerTime;
	}
	
	// ******************************************
	
	public int getHealNumPerDay(int sHealPerTime, int sPeopleHealed )throws HealException
	{
		
		healNumPerDay = healPerTime *peopleHealed;
		
		if (healNumPerDay <= 0)
		{
			throw  new HealException("What's the point of being a healer if you cant HEAL!!");
		}
		 	  
	  return healNumPerDay;
	}
	
	
	// ******************************************
	public String toPrintFile()
	{
		String str1;
		
		str1 = super.toPrintFile();
		str1 +=   healPerTime+ "\t" +peopleHealed+ "\t"   ;
		 
		return str1;
	}


	//************************************************************			
	public String toString()
	{
		String str;
		
		str = super.toString();

		str +="Number of people able to heal at once: " +peopleHealed + "\n";
		str +="Number of times able to heal per Day: " +healPerTime + "\n";
		str +="Capable amount of heals per person in day: " +healNumPerDay + "\n";
		return str;
	}


}
