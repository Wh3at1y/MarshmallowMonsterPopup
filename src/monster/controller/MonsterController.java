package monster.controller;

import monster.view.MonsterDisplay;
import marshmallow.monster.MarshmallowMonster;

public class MonsterController
	{
		
		private boolean continueOn;
		private MonsterDisplay popUp;
		private MarshmallowMonster defaultMonster;
		
		private int userConfirm;
		
		public MonsterController()
		{
			continueOn = false;
			popUp = new MonsterDisplay();
			
			defaultMonster = new MarshmallowMonster();
			
			String monsterName;
			String monsterEyes;
			String monsterNose;
			String monsterLegs;
			String monsterHair;
			String bellyButton;
		}
		
		public void start()
		{
			
			userConfirm = popUp.getUserConfirm("Ready to start the Monster Project?");
			
			if(userConfirm == popUp.yesOption())
				{
					popUp.showSomething("Here is the default monster. " + defaultMonster.toString());
					askQuestions();
				}
			else
				{
					System.exit(0);
				}
			
		}
		
		private void askQuestions()
		{
			String newMonsterName = popUp.getUserInput("Enter your Monster's new name.");
		}
	}
