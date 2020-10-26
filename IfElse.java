
public class IfElse
{
	
	public static void main (String[] args)
	{
		int a = IBIO.inputInt("Enter a number: ");
		int b = IBIO.inputInt("Enter a number: ");
		int c = IBIO.inputInt("Enter a number: ");
		int min = a;
		
		if(a < b && a < c)
			min = a;
		else if(b < a && b < c)
			min = b;
		else if(c < a && c < b)
			min = c;
		
		IBIO.output("Minimum  = " + min );
		
			
	}
}

