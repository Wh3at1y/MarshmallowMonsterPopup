package monster.view;

import javax.swing.JOptionPane;

public class MonsterDisplay
	{
		public String getUserInput(String userInput)
		{
			String answer = "";
			
				answer = JOptionPane.showInputDialog(null, userInput);
			
			return answer;
		}
		
		public int getUserConfirm(String userInput)
		{
			int userConfirm = 0;
			
				userConfirm = JOptionPane.showConfirmDialog(null,  userInput);
				
			return userConfirm;
		}
		
		public void showSomething(String userInput)
		{
			JOptionPane.showMessageDialog(null, userInput);
		}
		
		public int yesOption()
		{
			int userAnswer = 0;
			
				userAnswer = JOptionPane.YES_OPTION;
				
			return userAnswer;
		}
		
		public int noOption()
			{
				int userAnswer = 0;
				
					userAnswer = JOptionPane.NO_OPTION;
					
				return userAnswer;
			}
		
		public void displayDefault(String info)
		{
			showSomething("Default monster info: " + info);
		}
	}
