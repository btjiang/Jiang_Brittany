public class Magpie2
{
	/** Get a default greeting @return a greeting*/
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/** getResponse() method
	 * ===========================================
	 * 	Gives a response to a user statement
	 *  @param statement (the user statement)
	 * 	@return a response based on the rules given */
	public String getResponse(String statement)
	{
		String response = "";
		statement = statement.trim();
		 if (statement.length() == 0)
		 {
			 return "Say Something, please.";
		 }

		/** To be completed in Exercise_02:
		 * 	Modify the following code to use the findKeyword
		 * 	Method (details in "Exercise_02" below. */
		
		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		/** Exercise_03(Final)
		 * ==================================================
		 * Create additional code (another else if) that
		 * responds "Tell me more about your pet" if the
		 * user mentions the word cat, dog, fish, or turtle
		 * in their statement.
		 *
		 * Create addtional code (another else if) that
		 * responds "He sounds like a pretty dank teacher"
		 * if you mention "Robinette" in your statement */
		
		else if(findKeyword(statement, "cat")>= 0||findKeyword(statement, "dog") >= 0
			||findKeyword(statement, "fish") >= 0||findKeyword(statement, "turtle")>= 0)
			{
				response = "Tell me more about your pet";
			}
			
		else if(findKeyword(statement, "Robinette")>= 0)
		{
			response = "He sounds like a pretty dank teacher";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/** Ex_02: The findKeyword() Method...
	 * ========================================================= */
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim().toLowerCase();
		goal = goal.toLowerCase();
		int psn = phrase.indexOf(goal, startPos);
		while(psn >= 0)
		{
			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn-1, psn);
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1);
			}
			
			if (before.compareTo("a")<0||before.compareTo("z")>0&&after.compareTo("a")<0||after.compareTo("z")>0)
			{
				return psn;
			}
			psn = phrase.indexOf(goal, psn + 1); 
		}
			
		return -1;

	}

	/** Override - this method is used if there are only 2 parameters...*/
	private int findKeyword(String statement, String goal)
	{
		//set startPos to 0 if not specified
		return findKeyword(statement, goal, 0);
	}

	/** getRandomResponse() method
	 * =============================================================*/
	/** Pick a default response to use if nothing else fits.
	 * 	@return a non-committal string*/
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
	}
}
