public class stuff {

	private int findKeyword(String statement, String goal, int startPos)
	{
	String phrase = statement.trim();
	int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
	while (psn >= 0)
	{
	String before = " ", after = " ";
	if (psn > 0)
	{
		before = phrase.substring (psn - 1, psn).toLowerCase();
	}
	if (psn + goal.length() < phrase.length())
	{
	after = phrase.substring(psn + goal.length(),
	psn + goal.length() + 1).toLowerCase();
	}
	/* determine the values of psn, before, and after at this point in the method. */
	if (before.equals (" ")  &&  after.equals(" "))
	{
		return psn;
	}
		psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
	}
	return -1;
	}
}
	



