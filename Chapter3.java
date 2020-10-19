public class Chapter3
{
	
	public static void main (String[] args)
	{
		int number;
		// do-while loop: post-check; do first, then repeat
		// if the expression is true
		do
		{
			number = IBIO.inputInt("Enter a number: "); //looped
		} while(number >= 100);
		IBIO.output("Thanks!");
		
		// while loop: pre-check; repeat only if the condition
		// is true; if the condition is false, stop/do NOTHING
		number = IBIO.inputInt("Enter a number: ");;
		while(number >= 100)
		{
			number = IBIO.inputInt("ERROR-Enter a number: "); //looped
		} 
		IBIO.output("Thanks!");
		
	}
}

