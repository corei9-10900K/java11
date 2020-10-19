/*
 * simple class that counts the number of digits of
 * a number (integer) that has been input
 * 
 */
public class DigitCount
{
	
	public static void main (String[] args)
	{
		int n = IBIO.inputInt("Enter an int: ");
		int digits = 0;
/*
		for(int i = n; i > 0; i=i/10)
		{	digits++;
		}
*/
		// using a while loop instead
		digits = 0;
		int number = n;
		while(number > 0)
		{
			digits++; // digits = digits + 1;
			number = number / 10;
		}
			
		System.out.printf("%,d has %d digits.", n, digits);
	}

}
