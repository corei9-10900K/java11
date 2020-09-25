public class HL11
{
	static int c = 0;
	
	static int factorial(int n)
	{	
		if(n == 0)
		{	return 1;
		} else {
			c = c + 1;
			return n * factorial(n-1);
		}
	}
	
	static int fibo(int t)
	{	
		if(t == 0)
        {	return 0;
		} else if(t == 1)
		{   return 1;
		} else {
			c = c + 1;
			return fibo(t-2) + fibo(t-1);
		}
	}
	
	// DO THE FOLLOWING
	public static void main(String[] args)
	{
		System.out.println( "\n8! = " + factorial(8) );
		System.out.println( c + " recursive calls\n" );
		c = 0;
		
		System.out.println( "Fibonacci(8) = " + fibo(8) );
		System.out.println( c  + " recursive calls" );
		
	}
}

