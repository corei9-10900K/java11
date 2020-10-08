public class Fibonacci
{
	
	public static void main (String[] args)
	{
		int n = IBIO.inputInt("N = ");
		int f = 0;
		int s = 1;
		int t = f + s;
		
		while( t <= n )
		{
			if( t <= n )
			{
				IBIO.out( t + " " );
			}
			f = s;
			s = t;
			t = f + s;
		}
	}
}

