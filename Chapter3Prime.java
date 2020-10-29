
public class Chapter3Prime
{
	
	public static void main(String[] args)
	{
		int divisor = 1;
		int number  = IBIO.inputInt("Enter a number: ");
		
		do
		{
			divisor++;
		} while( number % divisor != 0 );
		System.out.println( number + " is divisible by " + divisor );
		
	}
}

/*

Enter a number: 7
7 is divisible by 7

Enter a number: 9
9 is divisible by 3

*/
