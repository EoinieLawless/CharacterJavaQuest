package characterCreator;

public class Warrior extends HeroDetails {
	
		int numberOfBattles;
		int numberOfBattlesWon;
		int battleslost;
		
		
		//constructor
		public Warrior()
		{
			super();
			numberOfBattles = getNumberOfBattles();
			numberOfBattlesWon = getNumberOfBattlesWon();
			battleslost= getBattleslost(numberOfBattles, numberOfBattlesWon);
		}
		 
		//Methods
		
		public int getNumberOfBattles()
		{
			System.out.println("How many battles have you fought? ");
			numberOfBattles = console.nextInt(); 
			 
			return numberOfBattles;
		} 
		//********************************************************	
		
		public int getNumberOfBattlesWon()
		{
			System.out.println("How many battles have you won? ");
			numberOfBattlesWon = console.nextInt();  
			return numberOfBattlesWon;
		}
		
		// ******************************************
		
		public int getBattleslost(int sNumberOfBattles, int sNumberOfBattlesWon )throws LossesException
		{
			
			battleslost = numberOfBattles - numberOfBattlesWon;
			
			if (battleslost<0)
			{
				throw  new LossesException("You dare lie!!! You cant win more battles then you've fought!");
			}
			
			
			
			 
				  
		  return battleslost;
		}
		
		
		// ******************************************
		public String toPrintFile()
		{
			String str1;
			
			str1 = super.toPrintFile();
			str1 +=   numberOfBattles+ "\t" +numberOfBattlesWon+ "\t"   ;
			 
			return str1;
		}


		//************************************************************			
		public String toString()
		{
			String str;
			
			str = super.toString();

			str +="Battles fought: " +numberOfBattles + "\n";
			str +="Battles Won: " +numberOfBattlesWon + "\n";
			str +="Battles Lost: " +battleslost + "\n";
			return str;
		}

}
