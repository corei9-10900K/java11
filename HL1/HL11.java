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
	
	static int fibonacci(int t)
	{
		c = 0;
		int previous = 0;
		int next = 1;
		int sum = 0;
		for(int i = 2; i <= t; i++) // i = i + 1
		{
			sum = previous + next;
			previous = next;
			next = sum;
			c = c + 1;
		}
		return sum;
	}
	
	static int fact(int n)
	{
		c = 0;
		int f = 1;
		for(int i = 2; i <= n; i++)
		{
			c++;
			f = f * i;
		}
		return f;
	}
	
	
	
	// DO THE FOLLOWING
	public static void main(String[] args)
	{
		c = 0;
		System.out.println();
		System.out.println("\"Hello\"");
		System.out.println( "\n8! = " + fact(8) );
		System.out.println( c + " loops\n" );
		
		c = 0;
		System.out.println();
		System.out.println("\"Hello\"");
		System.out.println( "\n8! = " + factorial(8) );
		System.out.println( c + " recursive calls\n" );
		c = 0;
		
		System.out.println( "Fibonacci(8) = " + fibo(8) );
		System.out.println( c  + " recursive calls" );
		
		System.out.println( "Fibonacci(8) = " + fibonacci(8) );
		System.out.println( c  + " loops" );
		
	}
}

