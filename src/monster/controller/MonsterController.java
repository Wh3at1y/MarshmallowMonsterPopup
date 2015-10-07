package monster.controller;

import monster.view.MonsterDisplay;
import marshmallow.monster.MarshmallowMonster;

public class MonsterController
	{
		
		private boolean continueOn;
		private MonsterDisplay popUp;
		private MarshmallowMonster displayMonster;
		
		private int userConfirm;
		
		public MonsterController()
		{
			continueOn = false;
			popUp = new MonsterDisplay();
			
			String defaultName = "Brettly";
			String defaultEyes = "3";
			String defaultNose = "1";
			String defaultLegs = "2";
			String defaultHair = "100";
			String defaultBellyButton = "true";
			
			displayMonster = new MarshmallowMonster(defaultName, defaultEyes, defaultNose, defaultLegs, defaultHair, defaultBellyButton);
		}
		
		public void start()
		{
			
			userConfirm = popUp.getUserConfirm("Ready to start the Monster Project?");
			
			if(userConfirm == popUp.yesOption())
				{
					popUp.displayDefault(displayMonster.toString());
					askQuestions();
					popUp.showSomething(displayMonster.toString());
				}
			else
				{
					System.exit(0);
				}
			
		}
		
		private void askQuestions()
		{
			String newMonsterName = popUp.getUserInput("Enter your Monster's new name."); displayMonster.setMonsterName(newMonsterName);
			String newMonsterEyes = popUp.getUserInput("Enter " + newMonsterName + "'s amount of eyes."); displayMonster.setMonsterEyes(newMonsterEyes);
			String newMonsterNose = popUp.getUserInput("Enter " + newMonsterName + "'s amount of noses."); displayMonster.setMonsterEyes(newMonsterNose);
			String newMonsterLegs= popUp.getUserInput("Enter " + newMonsterName + "'s amount of legs."); displayMonster.setMonsterEyes(newMonsterLegs);
			String newMonsterHair = popUp.getUserInput("Enter " + newMonsterName + "'s amount of hairs."); displayMonster.setMonsterEyes(newMonsterHair);
			int newMonsterBellyButton = popUp.getUserConfirm("Does " + newMonsterName + " have a belly button?"); displayMonster.setBellyButton(newMonsterBellyButton);
			
			if(newMonsterBellyButton == popUp.yesOption())
			{
				String bellyButtonString = " and has a belly button.";
			}
			else
			{
				
			}
		}
		
	}
