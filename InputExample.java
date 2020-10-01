/*
 * Example to input an integer (with a prompt)
 * 
 */
public class InputExample
{
	
	public static void main (String[] args)
	{
		IBIO.output("===========");
		int age = IBIO.inputInt("How old are you? ");
		IBIO.output("So you are " + age + " years old.");
	}
}

/*

How old are you? 17
So you are 17 years old.

*/
