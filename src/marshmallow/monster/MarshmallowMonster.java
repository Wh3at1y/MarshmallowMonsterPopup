package marshmallow.monster;

public class MarshmallowMonster
	{

		private String monsterName;
		private String monsterEyes;
		private String monsterNose;
		private String monsterLegs;
		private String monsterHair;
		private int bellyButton;
		
		public MarshmallowMonster(String monsterName, String monsterEyes, String monsterNose, 
				String monsterLegs, String monsterHair, String bellyButton) 
		{ this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterEyes = monsterNose;
		this.monsterEyes = monsterLegs;
		this.monsterEyes = monsterHair;
		this.monsterEyes = bellyButton; }
		
		
		//GETTERS
		public String getMonsterName(String monsterName) 
		{ return monsterName; }
		
		public String getMonsterEyes(String monsterEyes) 
		{ return monsterEyes; }
		
		public String getMonsterNose(String monsterNose) 
		{ return monsterNose; }
		
		public String getMonsterLegs(String monsterLegs) 
		{ return monsterLegs; }
		
		public String getMonsterHair(String monsterHair) 
		{ return monsterHair; }
		
		public int getBellyButton(int bellyButton) 
		{ return bellyButton; }
		
		
		//SETTERS
		public void setMonsterName(String monsterName) 
		{ this.monsterName = monsterName; }
		
		public void setMonsterEyes(String monsterEyes) 
		{ this.monsterEyes = monsterEyes; }
		
		public void setMonsterNose(String monsterNose) 
		{ this.monsterNose = monsterNose; }
		
		public void setMonsterLegs(String monsterLegs) 
		{ this.monsterLegs = monsterLegs; }
		
		public void setMonsterMonsterHair(String monsterHair) 
		{ this.monsterHair = monsterHair; }
		
		public void setBellyButton(int bellyButton) 
		{ this.bellyButton = bellyButton; }
		
		
		public String toString()
		{
			String monsterInfo = "The monster's name is " + monsterName + ". " + monsterName + " has " + monsterEyes + " eyes, "
		+ monsterNose + " nose, " + monsterLegs + " legs, " + monsterHair + " hair, and " + bellyButton;
			
			return monsterInfo;
		}
		
	}
